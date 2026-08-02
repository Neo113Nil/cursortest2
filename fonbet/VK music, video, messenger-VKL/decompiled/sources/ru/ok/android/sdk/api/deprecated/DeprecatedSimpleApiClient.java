package ru.ok.android.sdk.api.deprecated;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.core.ApiClientEngine;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.core.ApiScopeException;
import ru.ok.android.sdk.api.ApiDeviceIdProvider;
import ru.ok.android.sdk.api.ApiErrorCasesKt;
import ru.ok.android.sdk.api.ExternApiConfigProvider;
import ru.ok.android.sdk.api.OkApiInterceptor;
import ru.ok.android.sdk.api.OkApiInterceptorKt;
import ru.ok.android.sdk.api.TokenProvider;
import ru.ok.android.sdk.api.config.SdkApiConfig;
import ru.ok.android.sdk.api.login.AuthTokenLoginRequest;
import ru.ok.android.sdk.api.login.LoginResponse;

/* loaded from: classes9.dex */
class DeprecatedSimpleApiClient implements ApiClient {
    private final ApiClientEngine apiClientEngine;
    private final ExternApiConfigProvider apiConfigProvider;
    final ApiDeviceIdProvider deviceIdProvider;
    private final List<OkApiInterceptor> okApiInterceptors;
    private final TokenProvider provider;
    private final Object sessionLock = new Object();
    private volatile boolean sessionExpired = false;

    public DeprecatedSimpleApiClient(ApiClientEngine apiClientEngine, ExternApiConfigProvider externApiConfigProvider, TokenProvider tokenProvider, @Nullable ApiDeviceIdProvider apiDeviceIdProvider, List<OkApiInterceptor> list) {
        this.apiClientEngine = apiClientEngine;
        this.apiConfigProvider = externApiConfigProvider;
        this.provider = tokenProvider;
        this.deviceIdProvider = apiDeviceIdProvider;
        this.okApiInterceptors = list;
    }

    private <T> T executeWithRelogin(@NonNull ApiExecutableRequest<T> apiExecutableRequest) throws IOException, ApiException {
        SdkApiConfig apiConfig = this.apiConfigProvider.getApiConfig();
        runLogin(apiConfig, apiConfig.getSessionKey());
        return (T) OkApiInterceptorKt.executeWithInterceptors(this.apiClientEngine, apiExecutableRequest, this.apiConfigProvider.getApiConfig().getApiConfig(), this.okApiInterceptors);
    }

    private void runLogin(SdkApiConfig sdkApiConfig, String str) throws IOException, ApiException {
        synchronized (this.sessionLock) {
            try {
                if (Objects.equals(str, this.apiConfigProvider.getApiConfig().getSessionKey())) {
                    String token = this.provider.getToken();
                    ApiDeviceIdProvider apiDeviceIdProvider = this.deviceIdProvider;
                    this.apiConfigProvider.setApiConfig(sdkApiConfig.withSession(((LoginResponse) OkApiInterceptorKt.executeWithInterceptors(this.apiClientEngine, ApiExecutableRequest.from(new AuthTokenLoginRequest(token, apiDeviceIdProvider != null ? apiDeviceIdProvider.getDeviceId() : null, null, null), LoginResponse.PARSER), sdkApiConfig.getApiConfig(), this.okApiInterceptors)).sessionKey));
                    this.sessionExpired = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.ok.android.api.core.ApiClient
    public <T> T execute(@NonNull ApiExecutableRequest<T> apiExecutableRequest) throws IOException, ApiException {
        SdkApiConfig apiConfig = this.apiConfigProvider.getApiConfig();
        String sessionKey = apiConfig.getSessionKey();
        try {
            if (this.sessionExpired || sessionKey == null) {
                synchronized (this.sessionLock) {
                    if (this.sessionExpired || sessionKey == null) {
                        runLogin(apiConfig, sessionKey);
                    }
                }
            }
            return (T) OkApiInterceptorKt.executeWithInterceptors(this.apiClientEngine, apiExecutableRequest, this.apiConfigProvider.getApiConfig().getApiConfig(), this.okApiInterceptors);
        } catch (ApiInvocationException e) {
            if (apiExecutableRequest.getScopeAfter() == ApiScopeAfter.SAME && ApiErrorCasesKt.isAuthError(e)) {
                return (T) executeWithRelogin(apiExecutableRequest);
            }
            throw e;
        } catch (ApiScopeException unused) {
            return (T) executeWithRelogin(apiExecutableRequest);
        }
    }

    public void markSessionExpired() {
        this.sessionExpired = true;
    }
}
