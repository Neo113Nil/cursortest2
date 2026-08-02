package ru.ok.android.sdk.api.deprecated;

import java.util.List;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.http.DnsOverHttpApiEndpointProvider;
import ru.ok.android.api.http.HttpApiClient;
import ru.ok.android.api.rx.core.RxApiClient;
import ru.ok.android.sdk.api.ConfigurationStore;
import ru.ok.android.sdk.api.OkApi;
import ru.ok.android.sdk.api.OkApiHolder;
import ru.ok.android.sdk.api.OkApiInterceptor;
import ru.ok.android.sdk.api.TokenProvider;
import ru.ok.android.sdk.api.dns.dns.ConfigurationUriProvider;
import xsna.r7o0;

/* compiled from: DeprecatedDefaultOkApi.kt */
/* loaded from: classes9.dex */
public final class DeprecatedDefaultOkApi extends OkApi {
    private final ApiClient apiClient;
    private final OkApiHolder okApiHolder;
    private final List<OkApiInterceptor> okApiInterceptors;
    private final RxApiClient rxApiClient;

    /* JADX WARN: Multi-variable type inference failed */
    public DeprecatedDefaultOkApi(OkApi.Builder builder, ConfigurationStore configurationStore, TokenProvider tokenProvider, List<? extends OkApiInterceptor> list) {
        super(builder);
        this.okApiInterceptors = list;
        DeprecatedExternApiConfigProvider deprecatedExternApiConfigProvider = new DeprecatedExternApiConfigProvider(configurationStore);
        builder.getSslProvider();
        HttpApiClient httpApiClient = new HttpApiClient(new r7o0());
        httpApiClient.setRequestDebugger(builder.getApiRequestDebugger());
        httpApiClient.setEndpointProvider(new DnsOverHttpApiEndpointProvider(new ConfigurationUriProvider(deprecatedExternApiConfigProvider), DnsOverHttpApiEndpointProvider.CacheStrategy.TTL, DnsOverHttpApiEndpointProvider.FallbackStrategy.FOREVER));
        DeprecatedSimpleApiClient deprecatedSimpleApiClient = new DeprecatedSimpleApiClient(httpApiClient, deprecatedExternApiConfigProvider, tokenProvider, builder.getDeviceIdProvider(), getOkApiInterceptors());
        this.okApiHolder = new DeprecatedOkApiHolderImpl(deprecatedExternApiConfigProvider, deprecatedSimpleApiClient, httpApiClient);
        this.apiClient = deprecatedSimpleApiClient;
        this.rxApiClient = new RxApiClient(deprecatedSimpleApiClient);
    }

    @Override // ru.ok.android.sdk.api.OkApi
    public ApiClient getApiClient() {
        return this.apiClient;
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
