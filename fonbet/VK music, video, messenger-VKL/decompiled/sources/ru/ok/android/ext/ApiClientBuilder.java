package ru.ok.android.ext;

import androidx.annotation.NonNull;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.core.ApiClientEngine;
import ru.ok.android.api.http.DnsOverHttpApiEndpointProvider;
import ru.ok.android.api.http.HttpApiClient;
import ru.ok.android.api.http.HttpApiEndpointProvider;
import ru.ok.android.api.session.ApiConfigStore;
import ru.ok.android.api.session.ApiSessionCallback;
import ru.ok.android.commons.http.HttpClient;
import ru.ok.android.sdk.api.login.LoginRequest;
import xsna.e9e0;

/* loaded from: classes11.dex */
public class ApiClientBuilder {
    private ApiClientEngine apiClientEngine;
    private ApiSessionCallback apiSessionCallback;

    @NonNull
    private final String appKey;
    private ApiConfigStore configStore;
    private String deviceId;
    private HttpApiClient httpApiClientEngine;
    private HttpClient httpClient;
    private e9e0<String> tokenProvider;

    public ApiClientBuilder(@NonNull String str) {
        this.appKey = str;
    }

    private ApiClientEngine deriveApiClientEngine() {
        if (this.apiClientEngine == null) {
            HttpApiClient mkDefaultApiClientEngine = OneLogger.mkDefaultApiClientEngine(deriveHttpClient());
            this.httpApiClientEngine = mkDefaultApiClientEngine;
            this.apiClientEngine = mkDefaultApiClientEngine;
        }
        return this.apiClientEngine;
    }

    private ApiSessionCallback deriveApiSessionCallback() {
        if (this.apiSessionCallback == null) {
            if (this.tokenProvider != null) {
                this.apiSessionCallback = new TokenApiSessionCallback(deriveApiClientEngine(), deriveDeviceId(), this.tokenProvider);
            } else {
                this.apiSessionCallback = OneLogger.mkDefaultApiSessionCallback(deriveApiClientEngine(), deriveDeviceId());
            }
        }
        return this.apiSessionCallback;
    }

    private ApiConfigStore deriveConfigStore() {
        if (this.configStore == null) {
            this.configStore = OneLogger.mkDefaultConfigStore(this.appKey);
        }
        return this.configStore;
    }

    private String deriveDeviceId() {
        if (this.deviceId == null) {
            this.deviceId = LoginRequest.CLIENT_NAME;
        }
        return this.deviceId;
    }

    private HttpClient deriveHttpClient() {
        if (this.httpClient == null) {
            this.httpClient = OneLogger.mkDefaultHttpClient();
        }
        return this.httpClient;
    }

    private HttpApiClient getHttpApiClientEngine() {
        if (this.httpApiClientEngine == null && this.apiClientEngine != null) {
            throw new IllegalStateException("Cannot make changes on unknown ApiClientEngine");
        }
        deriveApiClientEngine();
        return this.httpApiClientEngine;
    }

    public ApiClient build() {
        return ApiClient.create(deriveApiClientEngine(), deriveConfigStore(), deriveApiSessionCallback());
    }

    public ApiClientBuilder setApiClientEngine(@NonNull ApiClientEngine apiClientEngine) {
        if (this.httpClient != null) {
            throw new IllegalStateException("Overriding transport previously set via setHttpClient");
        }
        this.apiClientEngine = apiClientEngine;
        if (apiClientEngine instanceof HttpApiClient) {
            this.httpApiClientEngine = (HttpApiClient) apiClientEngine;
        }
        return this;
    }

    public ApiClientBuilder setApiEndpointProvider(@NonNull HttpApiEndpointProvider httpApiEndpointProvider) {
        if (this.httpApiClientEngine == null && this.apiClientEngine != null) {
            throw new IllegalStateException("Cannot change user agent of unknown ApiClientEngine");
        }
        getHttpApiClientEngine().setEndpointProvider(httpApiEndpointProvider);
        return this;
    }

    public ApiClientBuilder setApiEndpointProviderWithGoogleDns(@NonNull HttpApiEndpointProvider httpApiEndpointProvider) {
        if (this.httpApiClientEngine == null && this.apiClientEngine != null) {
            throw new IllegalStateException("Cannot change user agent of unknown ApiClientEngine");
        }
        getHttpApiClientEngine().setEndpointProvider(new DnsOverHttpApiEndpointProvider(httpApiEndpointProvider, DnsOverHttpApiEndpointProvider.CacheStrategy.TTL, DnsOverHttpApiEndpointProvider.FallbackStrategy.FOREVER));
        return this;
    }

    public ApiClientBuilder setApiSessionProvider(@NonNull ApiSessionCallback apiSessionCallback) {
        if (this.tokenProvider != null) {
            throw new IllegalStateException("Overriding session provider previously set via setTokenProvider");
        }
        this.apiSessionCallback = apiSessionCallback;
        return this;
    }

    public ApiClientBuilder setDeviceId(@NonNull String str) {
        this.deviceId = str;
        return this;
    }

    public ApiClientBuilder setHttpClient(@NonNull HttpClient httpClient) {
        if (this.apiClientEngine != null) {
            throw new IllegalStateException("API client engine is already set");
        }
        this.httpClient = httpClient;
        return this;
    }

    public ApiClientBuilder setTokenProvider(@NonNull e9e0<String> e9e0Var) {
        if (this.apiSessionCallback != null) {
            throw new IllegalStateException("Overriding session provider previously set via setApiSessionProvider");
        }
        this.tokenProvider = e9e0Var;
        return this;
    }

    public ApiClientBuilder setUserAgent(@NonNull String str) {
        if (this.httpApiClientEngine == null && this.apiClientEngine != null) {
            throw new IllegalStateException("Cannot change user agent of unknown ApiClientEngine");
        }
        getHttpApiClientEngine().setUserAgent(str);
        return this;
    }

    public e9e0<ApiClient> toProvider() {
        return new DCheckProvider<ApiClient>() { // from class: ru.ok.android.ext.ApiClientBuilder.1
            @Override // ru.ok.android.ext.DCheckProvider
            @NonNull
            public ApiClient create() {
                return ApiClientBuilder.this.build();
            }
        };
    }
}
