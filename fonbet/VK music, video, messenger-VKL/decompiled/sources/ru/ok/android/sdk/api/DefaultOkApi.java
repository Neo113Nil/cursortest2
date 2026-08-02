package ru.ok.android.sdk.api;

import java.util.List;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.http.DnsOverHttpApiEndpointProvider;
import ru.ok.android.api.http.HttpApiClient;
import ru.ok.android.api.rx.core.RxApiClient;
import ru.ok.android.sdk.api.OkApi;
import ru.ok.android.sdk.api.dns.dns.ConfigurationUriProvider;
import ru.ok.android.sdk.api.session.ApiSessionStore;
import ru.ok.android.sdk.api.token.ApiTokenInfoProvider;
import xsna.r7o0;

/* compiled from: DefaultOkApi.kt */
/* loaded from: classes9.dex */
public final class DefaultOkApi extends OkApi {
    private final ApiClient apiClient;
    private final ApiAppKeyProvider appKeyProvider;
    private final ApiDeviceIdProvider deviceIdProvider;
    private final OkApiHolder okApiHolder;
    private final List<OkApiInterceptor> okApiInterceptors;
    private final RxApiClient rxApiClient;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultOkApi(OkApi.Builder builder, ApiSessionStore apiSessionStore, ApiTokenInfoProvider apiTokenInfoProvider, ApiAppKeyProvider apiAppKeyProvider, List<? extends OkApiInterceptor> list) {
        super(builder);
        this.appKeyProvider = apiAppKeyProvider;
        this.okApiInterceptors = list;
        this.deviceIdProvider = builder.getDeviceIdProvider();
        ExternApiConfigProviderImpl externApiConfigProviderImpl = new ExternApiConfigProviderImpl(apiSessionStore, getAppKeyProvider());
        builder.getSslProvider();
        HttpApiClient httpApiClient = new HttpApiClient(new r7o0());
        httpApiClient.setRequestDebugger(builder.getApiRequestDebugger());
        httpApiClient.setEndpointProvider(new DnsOverHttpApiEndpointProvider(new ConfigurationUriProvider(externApiConfigProviderImpl), DnsOverHttpApiEndpointProvider.CacheStrategy.TTL, DnsOverHttpApiEndpointProvider.FallbackStrategy.FOREVER));
        SimpleApiClient simpleApiClient = new SimpleApiClient(httpApiClient, externApiConfigProviderImpl, apiTokenInfoProvider, builder.getDeviceIdProvider(), getOkApiInterceptors());
        this.okApiHolder = new OkApiHolderImpl(externApiConfigProviderImpl, simpleApiClient, httpApiClient);
        this.apiClient = simpleApiClient;
        this.rxApiClient = new RxApiClient(simpleApiClient);
    }

    @Override // ru.ok.android.sdk.api.OkApi
    public ApiClient getApiClient() {
        return this.apiClient;
    }

    @Override // ru.ok.android.sdk.api.OkApi
    public ApiAppKeyProvider getAppKeyProvider() {
        return this.appKeyProvider;
    }

    @Override // ru.ok.android.sdk.api.OkApi
    public ApiDeviceIdProvider getDeviceIdProvider() {
        return this.deviceIdProvider;
    }

    @Override // ru.ok.android.sdk.api.OkApi
    public OkApiHolder getOkApiHolder() {
        return this.okApiHolder;
    }

    @Override // ru.ok.android.sdk.api.OkApi
    public List<OkApiInterceptor> getOkApiInterceptors() {
        return this.okApiInterceptors;
    }

    @Override // ru.ok.android.sdk.api.OkApi
    public RxApiClient getRxApiClient() {
        return this.rxApiClient;
    }

    @Override // ru.ok.android.sdk.api.OkApi
    public OkApi.Builder newBuilder() {
        return copyFromActual(new OkApi.Builder());
    }
}
