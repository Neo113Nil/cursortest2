package ru.ok.android.sdk.api.deprecated;

import ru.ok.android.api.debug.ApiRequestDebugger;
import ru.ok.android.api.http.HttpApiClient;
import ru.ok.android.sdk.api.ExternApiConfigProvider;
import ru.ok.android.sdk.api.OkApiHolder;

/* compiled from: DeprecatedOkApiHolderImpl.kt */
/* loaded from: classes9.dex */
public final class DeprecatedOkApiHolderImpl implements OkApiHolder {
    private final HttpApiClient apiClientEngine;
    private final ExternApiConfigProvider apiConfigProvider;
    private final DeprecatedSimpleApiClient simpleApiClient;

    public DeprecatedOkApiHolderImpl(ExternApiConfigProvider externApiConfigProvider, DeprecatedSimpleApiClient deprecatedSimpleApiClient, HttpApiClient httpApiClient) {
        this.apiConfigProvider = externApiConfigProvider;
        this.simpleApiClient = deprecatedSimpleApiClient;
        this.apiClientEngine = httpApiClient;
    }

    @Override // ru.ok.android.sdk.api.OkApiHolder
    public void clearSession() {
        this.apiConfigProvider.clearSession();
        this.simpleApiClient.markSessionExpired();
    }

    @Override // ru.ok.android.sdk.api.OkApiHolder
    public void setRequestDebugger(ApiRequestDebugger apiRequestDebugger) {
        HttpApiClient httpApiClient = this.apiClientEngine;
        if (httpApiClient != null) {
            httpApiClient.setRequestDebugger(apiRequestDebugger);
        }
    }
}
