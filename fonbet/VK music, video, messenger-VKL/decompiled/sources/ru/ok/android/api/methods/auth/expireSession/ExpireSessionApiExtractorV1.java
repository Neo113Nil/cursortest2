package ru.ok.android.api.methods.auth.expireSession;

import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.session.ApiConfigExtractor;

/* compiled from: ExpireSessionApiExtractorV1.kt */
/* loaded from: classes9.dex */
public final class ExpireSessionApiExtractorV1 implements ApiConfigExtractor<Object> {
    public static final ExpireSessionApiExtractorV1 INSTANCE = new ExpireSessionApiExtractorV1();

    private ExpireSessionApiExtractorV1() {
    }

    @Override // ru.ok.android.api.session.ApiConfigExtractor
    public ApiConfig extractApiConfig(ApiConfig apiConfig, Object obj) {
        return apiConfig.withoutUser().withoutSession();
    }
}
