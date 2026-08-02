package ru.ok.android.api.session;

import ru.ok.android.api.core.ApiConfig;

/* compiled from: SimpleApiConfigStore.kt */
/* loaded from: classes9.dex */
public final class SimpleApiConfigStore implements ApiConfigStore {
    private ApiConfig apiConfig;

    public SimpleApiConfigStore(ApiConfig apiConfig) {
        this.apiConfig = apiConfig;
    }

    @Override // ru.ok.android.api.session.ApiConfigStore, ru.ok.android.api.core.ApiConfigProvider
    public ApiConfig getApiConfig() {
        return this.apiConfig;
    }

    @Override // ru.ok.android.api.session.ApiConfigStore
    public void setApiConfig(ApiConfig apiConfig) {
        this.apiConfig = apiConfig;
    }
}
