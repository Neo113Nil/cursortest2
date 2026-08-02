package ru.ok.android.api.core;

/* compiled from: ApiConfigProvider.kt */
/* loaded from: classes9.dex */
public interface ApiConfigProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: ApiConfigProvider.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ApiConfigProvider wrap(ApiConfig apiConfig) {
            return new SimpleApiConfigProvider(apiConfig);
        }
    }

    static ApiConfigProvider wrap(ApiConfig apiConfig) {
        return Companion.wrap(apiConfig);
    }

    ApiConfig getApiConfig();
}
