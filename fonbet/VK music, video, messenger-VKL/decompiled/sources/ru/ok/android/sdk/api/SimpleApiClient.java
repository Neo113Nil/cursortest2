package ru.ok.android.sdk.api;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.core.ApiClientEngine;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiExecutableRequest;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiScopeAfter;
import ru.ok.android.api.core.ApiScopeException;
import ru.ok.android.sdk.api.config.SdkApiConfig;
import ru.ok.android.sdk.api.login.AuthTokenLoginRequest;
import ru.ok.android.sdk.api.login.LoginResponse;
import ru.ok.android.sdk.api.token.ApiTokenInfoProvider;
import xsna.epx;
import xsna.s3q0;

/* compiled from: SimpleApiClient.kt */
/* loaded from: classes9.dex */
public final class SimpleApiClient implements ApiClient {
    private final ApiClientEngine apiClientEngine;
    private final ExternApiConfigProvider apiConfigProvider;
    private final ApiDeviceIdProvider deviceIdProvider;
    private final List<OkApiInterceptor> okApiInterceptors;
    private final ApiTokenInfoProvider provider;
    private volatile boolean sessionExpired;
    private final ReentrantLock sessionLock = new ReentrantLock();

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleApiClient(ApiClientEngine apiClientEngine, ExternApiConfigProvider externApiConfigProvider, ApiTokenInfoProvider apiTokenInfoProvider, ApiDeviceIdProvider apiDeviceIdProvider, List<? extends OkApiInterceptor> list) {
        this.apiClientEngine = apiClientEngine;
        this.apiConfigProvider = externApiConfigProvider;
        this.provider = apiTokenInfoProvider;
        this.deviceIdProvider = apiDeviceIdProvider;
        this.okApiInterceptors = list;
    }

    private final <T> T executeWithRelogin(ApiExecutableRequest<T> apiExecutableRequest) throws IOException, ApiException {
        SdkApiConfig apiConfig = this.apiConfigProvider.getApiConfig();
        runLogin(apiConfig, apiConfig.getSessionKey());
        return (T) OkApiInterceptorKt.executeWithInterceptors(this.apiClientEngine, apiExecutableRequest, this.apiConfigProvider.getApiConfig().getApiConfig(), this.okApiInterceptors);
    }

    private final void runLogin(SdkApiConfig sdkApiConfig, String str) throws IOException, ApiException {
        ReentrantLock reentrantLock = this.sessionLock;
        reentrantLock.lock();
        try {
            if (!epx.f(str, this.apiConfigProvider.getApiConfig().getSessionKey())) {
                if (this.sessionExpired) {
                }
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
            }
            ApiTokenInfoProvider.Info tokenInfo = this.provider.getTokenInfo();
            SdkApiConfig withUri = sdkApiConfig.withUri("api", Uri.parse(tokenInfo.getApiEndpoint()));
            this.apiConfigProvider.setApiConfig(withUri);
            runLoginWithConfiguredUrl(withUri, tokenInfo.getToken());
            s3q0 s3q0Var2 = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private final void runLoginWithConfiguredUrl(SdkApiConfig sdkApiConfig, String str) {
        ReentrantLock reentrantLock = this.sessionLock;
        reentrantLock.lock();
        try {
            ApiDeviceIdProvider apiDeviceIdProvider = this.deviceIdProvider;
            this.apiConfigProvider.setApiConfig(sdkApiConfig.withSession(((LoginResponse) OkApiInterceptorKt.executeWithInterceptors(this.apiClientEngine, ApiExecutableRequest.Companion.from(new AuthTokenLoginRequest(str, apiDeviceIdProvider != null ? apiDeviceIdProvider.getDeviceId() : null, null, null), LoginResponse.PARSER), sdkApiConfig.getApiConfig(), this.okApiInterceptors)).sessionKey));
            this.sessionExpired = false;
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // ru.ok.android.api.core.ApiClient
    public <T> T execute(ApiExecutableRequest<T> apiExecutableRequest) throws IOException, ApiException {
        SdkApiConfig apiConfig = this.apiConfigProvider.getApiConfig();
        String sessionKey = apiConfig.getSessionKey();
        try {
            ReentrantLock reentrantLock = this.sessionLock;
            reentrantLock.lock();
            try {
                if (this.sessionExpired || sessionKey == null) {
                    runLogin(apiConfig, sessionKey);
                }
                s3q0 s3q0Var = s3q0.a;
                reentrantLock.unlock();
                return (T) OkApiInterceptorKt.executeWithInterceptors(this.apiClientEngine, apiExecutableRequest, this.apiConfigProvider.getApiConfig().getApiConfig(), this.okApiInterceptors);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (ApiInvocationException e) {
            if (apiExecutableRequest.getScopeAfter() == ApiScopeAfter.SAME && ApiErrorCasesKt.isAuthError(e)) {
                return (T) executeWithRelogin(apiExecutableRequest);
            }
            throw e;
        } catch (ApiScopeException unused) {
            return (T) executeWithRelogin(apiExecutableRequest);
        }
    }

    public final void markSessionExpired() {
        this.sessionExpired = true;
    }
}
