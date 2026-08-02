package ru.ok.android.api.session;

import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.core.ApiConfigProvider;

/* compiled from: ApiConfigStore.kt */
/* loaded from: classes9.dex */
public interface ApiConfigStore extends ApiConfigProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: ApiConfigStore.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final AtomicApiConfigStore create(ApiConfig apiConfig) {
            return AtomicApiConfigStore.Companion.create(apiConfig);
        }
    }

    /* compiled from: ApiConfigStore.kt */
    public interface Updater {
        ApiConfig invoke(ApiConfig apiConfig);
    }

    static AtomicApiConfigStore create(ApiConfig apiConfig) {
        return Companion.create(apiConfig);
    }

    @Override // ru.ok.android.api.core.ApiConfigProvider
    ApiConfig getApiConfig();

    void setApiConfig(ApiConfig apiConfig);

    default ApiConfig updateApiConfig(Updater updater) {
        ApiConfig invoke = updater.invoke(getApiConfig());
        setApiConfig(invoke);
        return invoke;
    }
}
