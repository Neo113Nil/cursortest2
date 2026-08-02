package ru.ok.android.api.methods.users.changePassword;

import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.session.ApiConfigExtractor;

/* compiled from: ChangePasswordApiExtractorV1.kt */
/* loaded from: classes9.dex */
public final class ChangePasswordApiExtractorV1 implements ApiConfigExtractor<ChangePasswordApiResultV1> {
    public static final ChangePasswordApiExtractorV1 INSTANCE = new ChangePasswordApiExtractorV1();

    private ChangePasswordApiExtractorV1() {
    }

    @Override // ru.ok.android.api.session.ApiConfigExtractor
    public ApiConfig extractApiConfig(ApiConfig apiConfig, ChangePasswordApiResultV1 changePasswordApiResultV1) {
        String userId = apiConfig.getUserId();
        if (userId == null) {
            throw new IllegalArgumentException("no session");
        }
        String authToken = changePasswordApiResultV1.getAuthToken();
        if (authToken == null && (authToken = apiConfig.getAuthToken()) == null) {
            throw new IllegalArgumentException("no session");
        }
        return apiConfig.withUser(userId, authToken);
    }
}
