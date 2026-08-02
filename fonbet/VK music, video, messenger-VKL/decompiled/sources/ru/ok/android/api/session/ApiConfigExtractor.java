package ru.ok.android.api.session;

import ru.ok.android.api.core.ApiConfig;

/* compiled from: ApiConfigExtractor.kt */
/* loaded from: classes9.dex */
public interface ApiConfigExtractor<T> {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final ApiConfigExtractor<Object> NO_OP = new ApiConfigExtractor<Object>() { // from class: ru.ok.android.api.session.ApiConfigExtractor$Companion$NO_OP$1
        @Override // ru.ok.android.api.session.ApiConfigExtractor
        public ApiConfig extractApiConfig(ApiConfig apiConfig, Object obj) {
            return apiConfig;
        }
    };

    /* compiled from: ApiConfigExtractor.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    ApiConfig extractApiConfig(ApiConfig apiConfig, T t);
}
