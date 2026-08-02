package ru.ok.android.api.methods.authV2.login;

import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.session.ApiConfigExtractor;

/* compiled from: LoginApiExtractor.kt */
/* loaded from: classes9.dex */
public final class LoginApiExtractor implements ApiConfigExtractor<LoginApiResult> {
    public static final LoginApiExtractor INSTANCE = new LoginApiExtractor();

    private LoginApiExtractor() {
    }

    @Override // ru.ok.android.api.session.ApiConfigExtractor
    public ApiConfig extractApiConfig(ApiConfig apiConfig, LoginApiResult loginApiResult) {
        String userId = loginApiResult.getUserId();
        if (userId == null && (userId = apiConfig.getUserId()) == null) {
            throw new IllegalArgumentException("userId null");
        }
        return apiConfig.withUser(userId, loginApiResult.getSessionKey()).withSession(loginApiResult.getSessionKey(), loginApiResult.getSessionSecret());
    }
}
