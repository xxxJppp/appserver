package cn.wildfirechat.app;


import cn.wildfirechat.app.pojo.ConfirmSessionRequest;
import cn.wildfirechat.app.pojo.CreateSessionRequest;

public interface Service {
    RestResult sendCode(String mobile);
    RestResult login(String mobile, String code, String clientId);

    RestResult pwdlogin(String name, String password, String clientId);

    RestResult createPcSession(CreateSessionRequest request);
    RestResult loginWithSession(String token);

    RestResult scanPc(String token);
    RestResult confirmPc(ConfirmSessionRequest request);

    RestResult createUser(String name, String password);

    RestResult updatePwd(String userId, String oldpassword, String password);
}
