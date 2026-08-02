package ru.ok.android.api.methods.auth.logoutAll;

import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.session.ApiConfigExtractor;

/* compiled from: LogoutAllApiExtractorV1.kt */
/* loaded from: classes9.dex */
public final class LogoutAllApiExtractorV1 implements ApiConfigExtractor<LogoutAllApiResultV1> {
    public static final LogoutAllApiExtractorV1 INSTANCE = new LogoutAllApiExtractorV1();

    private LogoutAllApiExtractorV1() {
    }

    @Override // ru.ok.android.api.session.ApiConfigExtractor
    public ApiConfig extractApiConfig(ApiConfig apiConfig, LogoutAllApiResultV1 logoutAllApiResultV1) {
        String userId = apiConfig.getUserId();
        if (userId != null) {
            return apiConfig.withUser(userId, logoutAllApiResultV1.getAuthToken());
        }
        throw new IllegalArgumentException("no session");
    }
}
