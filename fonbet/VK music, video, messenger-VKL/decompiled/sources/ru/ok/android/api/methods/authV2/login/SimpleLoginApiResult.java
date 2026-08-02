package ru.ok.android.api.methods.authV2.login;

/* compiled from: LoginApiResult.kt */
/* loaded from: classes9.dex */
public final class SimpleLoginApiResult implements LoginApiResult {
    private final String sessionKey;
    private final String sessionSecret;
    private final String userId;

    public SimpleLoginApiResult(String str, String str2, String str3) {
        this.userId = str;
        this.sessionKey = str2;
        this.sessionSecret = str3;
    }

    @Override // ru.ok.android.api.methods.authV2.login.LoginApiResult
    public String getSessionKey() {
        return this.sessionKey;
    }

    @Override // ru.ok.android.api.methods.authV2.login.LoginApiResult
    public String getSessionSecret() {
        return this.sessionSecret;
    }

    @Override // ru.ok.android.api.methods.authV2.login.LoginApiResult
    public String getUserId() {
        return this.userId;
    }
}
