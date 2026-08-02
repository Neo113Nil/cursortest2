package ru.ok.android.api.core;

/* compiled from: SimpleApiConfigProvider.kt */
/* loaded from: classes9.dex */
public final class SimpleApiConfigProvider implements ApiConfigProvider {
    private final ApiConfig apiConfig;

    public SimpleApiConfigProvider(ApiConfig apiConfig) {
        this.apiConfig = apiConfig;
    }

    @Override // ru.ok.android.api.core.ApiConfigProvider
    public ApiConfig getApiConfig() {
        return this.apiConfig;
    }
}
