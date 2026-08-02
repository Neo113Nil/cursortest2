package ru.ok.android.sdk.api;

import ru.ok.android.api.debug.ApiRequestDebugger;
import ru.ok.android.api.http.HttpApiClient;

/* compiled from: OkApiHolderImpl.kt */
/* loaded from: classes9.dex */
public final class OkApiHolderImpl implements OkApiHolder {
    private final HttpApiClient apiClientEngine;
    private final ExternApiConfigProvider apiConfigProvider;
    private final SimpleApiClient simpleApiClient;

    public OkApiHolderImpl(ExternApiConfigProvider externApiConfigProvider, SimpleApiClient simpleApiClient, HttpApiClient httpApiClient) {
        this.apiConfigProvider = externApiConfigProvider;
        this.simpleApiClient = simpleApiClient;
        this.apiClientEngine = httpApiClient;
    }

    @Override // ru.ok.android.sdk.api.OkApiHolder
    public void clearSession() {
        this.apiConfigProvider.clearSession();
        this.simpleApiClient.markSessionExpired();
    }

    @Override // ru.ok.android.sdk.api.OkApiHolder
    public void setRequestDebugger(ApiRequestDebugger apiRequestDebugger) {
        this.apiClientEngine.setRequestDebugger(apiRequestDebugger);
    }
}
