package ru.ok.android.api.methods.authV2.anonymLogin;

import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.session.ApiConfigExtractor;

/* compiled from: AnonymLoginApiExtractor.kt */
/* loaded from: classes9.dex */
public final class AnonymLoginApiExtractor implements ApiConfigExtractor<AnonymLoginApiResult> {
    public static final AnonymLoginApiExtractor INSTANCE = new AnonymLoginApiExtractor();

    private AnonymLoginApiExtractor() {
    }

    @Override // ru.ok.android.api.session.ApiConfigExtractor
    public ApiConfig extractApiConfig(ApiConfig apiConfig, AnonymLoginApiResult anonymLoginApiResult) {
        return apiConfig.withoutUser().withSession(anonymLoginApiResult.getSessionKey(), anonymLoginApiResult.getSessionSecret());
    }
}
