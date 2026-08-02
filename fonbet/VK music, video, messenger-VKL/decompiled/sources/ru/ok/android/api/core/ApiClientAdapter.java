package ru.ok.android.api.core;

import android.os.Trace;
import java.io.IOException;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.api.core.ApiClientAdapter;
import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.session.ApiConfigStore;
import ru.ok.android.api.session.ApiSessionCallback;
import ru.ok.android.api.session.ApiSessionChangedException;
import ru.ok.android.api.session.SimpleApiConfigStore;
import ru.ok.android.commons.os.AutoTraceCompat;
import xsna.epx;
import xsna.kx2;

/* compiled from: ApiClientAdapter.kt */
/* loaded from: classes9.dex */
public final class ApiClientAdapter implements ApiClient {
    private final ApiSessionCallback callback;
    private final ApiConfigStore configStore;
    private final ApiClientEngine engine;

    public ApiClientAdapter(ApiClientEngine apiClientEngine, ApiConfigStore apiConfigStore, ApiSessionCallback apiSessionCallback) {
        this.engine = apiClientEngine;
        this.configStore = apiConfigStore;
        this.callback = apiSessionCallback;
    }

    @AutoTraceCompat
    private final ApiConfig configureConcurrent(ApiScope apiScope, ApiConfigStore apiConfigStore, String str, ApiInvocationException apiInvocationException) throws IOException, ApiException {
        ApiConfig apiConfig = apiConfigStore.getApiConfig();
        if (apiScope == ApiScope.SESSION) {
            if (apiConfig.getUserId() == null) {
                throw new ApiScopeException(ApiScopeException.NO_USER_FOR_SESSION_MSG, apiInvocationException);
            }
            if (apiConfig.getSessionKey() == null || epx.f(apiConfig.getSessionKey(), str)) {
                return configureExclusive(apiScope, apiConfigStore, str, apiInvocationException);
            }
        } else if (apiScope == ApiScope.OPT_SESSION && (apiConfig.getSessionKey() == null || epx.f(apiConfig.getSessionKey(), str))) {
            return configureExclusive(apiScope, apiConfigStore, str, apiInvocationException);
        }
        return apiConfig;
    }

    public static /* synthetic */ ApiConfig configureConcurrent$default(ApiClientAdapter apiClientAdapter, ApiScope apiScope, ApiConfigStore apiConfigStore, String str, ApiInvocationException apiInvocationException, int i, Object obj) throws IOException, ApiException {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            apiInvocationException = null;
        }
        return apiClientAdapter.configureConcurrent(apiScope, apiConfigStore, str, apiInvocationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @AutoTraceCompat
    private final ApiConfig configureExclusive(final ApiScope apiScope, ApiConfigStore apiConfigStore, final String str, final ApiInvocationException apiInvocationException) throws IOException, ApiException {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        apiConfigStore.updateApiConfig(new ApiConfigStore.Updater() { // from class: xsna.mx2
            @Override // ru.ok.android.api.session.ApiConfigStore.Updater
            public final ApiConfig invoke(ApiConfig apiConfig) {
                ApiConfig configureExclusive$lambda$1;
                configureExclusive$lambda$1 = ApiClientAdapter.configureExclusive$lambda$1(str, apiScope, this, apiInvocationException, ref$ObjectRef2, ref$ObjectRef, apiConfig);
                return configureExclusive$lambda$1;
            }
        });
        Throwable th = (Throwable) ref$ObjectRef2.element;
        if (th == null) {
            return (ApiConfig) ref$ObjectRef.element;
        }
        throw th;
    }

    public static /* synthetic */ ApiConfig configureExclusive$default(ApiClientAdapter apiClientAdapter, ApiScope apiScope, ApiConfigStore apiConfigStore, String str, ApiInvocationException apiInvocationException, int i, Object obj) throws IOException, ApiException {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            apiInvocationException = null;
        }
        return apiClientAdapter.configureExclusive(apiScope, apiConfigStore, str, apiInvocationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:5:0x0010, B:7:0x0014, B:9:0x001a, B:14:0x0054, B:16:0x005a, B:19:0x0064, B:21:0x0068, B:23:0x006e, B:25:0x0078, B:27:0x0021, B:28:0x002a, B:29:0x0031, B:30:0x0032, B:32:0x0036, B:35:0x003d, B:37:0x0043, B:38:0x004a), top: B:4:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:5:0x0010, B:7:0x0014, B:9:0x001a, B:14:0x0054, B:16:0x005a, B:19:0x0064, B:21:0x0068, B:23:0x006e, B:25:0x0078, B:27:0x0021, B:28:0x002a, B:29:0x0031, B:30:0x0032, B:32:0x0036, B:35:0x003d, B:37:0x0043, B:38:0x004a), top: B:4:0x0010 }] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, ru.ok.android.api.core.ApiScopeException] */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, ru.ok.android.api.core.ApiScopeException] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, ru.ok.android.api.core.ApiConfig] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ApiConfig configureExclusive$lambda$1(String str, ApiScope apiScope, ApiClientAdapter apiClientAdapter, ApiInvocationException apiInvocationException, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, ApiConfig apiConfig) {
        ?? r4;
        ApiConfig withoutSession = !epx.f(apiConfig.getSessionKey(), str) ? apiConfig : apiConfig.withoutSession();
        try {
            ApiScope apiScope2 = ApiScope.SESSION;
            if (apiScope != apiScope2) {
                if (apiScope == ApiScope.OPT_SESSION && withoutSession.getSessionKey() == null) {
                    r4 = withoutSession.getAuthToken() != null ? apiClientAdapter.callback.provideSession(withoutSession, apiInvocationException) : apiClientAdapter.callback.provideAnonymousSession(withoutSession, apiInvocationException);
                    if (apiScope != apiScope2) {
                    }
                    if (apiScope == ApiScope.OPT_SESSION) {
                    }
                    ref$ObjectRef2.element = r4;
                    return r4;
                }
                r4 = withoutSession;
                if (apiScope != apiScope2) {
                }
                if (apiScope == ApiScope.OPT_SESSION) {
                }
                ref$ObjectRef2.element = r4;
                return r4;
            }
            if (withoutSession.getUserId() == null) {
                throw new ApiScopeException(ApiScopeException.NO_USER_FOR_SESSION_MSG, apiInvocationException);
            }
            if (withoutSession.getSessionKey() == null) {
                r4 = apiClientAdapter.callback.provideSession(apiConfig, apiInvocationException);
                if (apiScope != apiScope2) {
                }
                if (apiScope == ApiScope.OPT_SESSION) {
                }
                ref$ObjectRef2.element = r4;
                return r4;
            }
            r4 = withoutSession;
            if (apiScope != apiScope2 && r4.getSessionKey() == null) {
                ref$ObjectRef.element = new ApiScopeException("Couldn't provide session", apiInvocationException);
                return r4;
            }
            if (apiScope == ApiScope.OPT_SESSION || r4.getSessionKey() != null) {
                ref$ObjectRef2.element = r4;
                return r4;
            }
            ref$ObjectRef.element = new ApiScopeException("Couldn't provide anonymous session", apiInvocationException);
            return r4;
        } catch (Throwable th) {
            ref$ObjectRef.element = th;
            return withoutSession;
        }
    }

    @AutoTraceCompat
    private final <T> T executeConcurrent(ApiExecutableRequest<T> apiExecutableRequest, ApiConfigStore apiConfigStore) throws IOException, ApiException {
        ApiConfig configureConcurrent$default = configureConcurrent$default(this, apiExecutableRequest.getScope(), apiConfigStore, null, null, 12, null);
        try {
            return (T) executeSingle(apiExecutableRequest, apiConfigStore, configureConcurrent$default);
        } catch (ApiInvocationException e) {
            if (e instanceof ApiSessionChangedException) {
                ApiSessionChangedException apiSessionChangedException = (ApiSessionChangedException) e;
                return (T) executeSingle(apiExecutableRequest, apiConfigStore, reconfigureConcurrent(apiConfigStore, configureConcurrent$default.getSessionKey(), apiSessionChangedException.getSessionKey(), apiSessionChangedException.getSessionSecret()));
            }
            if (e.getErrorCode() == 103 || e.getErrorCode() == 102 || (e.getErrorCode() == 401 && configureConcurrent$default.getUserId() != null)) {
                return (T) executeSingle(apiExecutableRequest, apiConfigStore, configureConcurrent(apiExecutableRequest.getScope(), apiConfigStore, configureConcurrent$default.getSessionKey(), e));
            }
            throw e;
        }
    }

    @AutoTraceCompat
    private final <T> T executeExclusive(final ApiExecutableRequest<T> apiExecutableRequest, ApiConfigStore apiConfigStore) throws IOException, ApiException {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = null;
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        apiConfigStore.updateApiConfig(new ApiConfigStore.Updater() { // from class: xsna.lx2
            @Override // ru.ok.android.api.session.ApiConfigStore.Updater
            public final ApiConfig invoke(ApiConfig apiConfig) {
                ApiConfig executeExclusive$lambda$0;
                executeExclusive$lambda$0 = ApiClientAdapter.executeExclusive$lambda$0(Ref$ObjectRef.this, this, apiExecutableRequest, ref$ObjectRef2, apiConfig);
                return executeExclusive$lambda$0;
            }
        });
        ApiInvocationException apiInvocationException = (ApiInvocationException) ref$ObjectRef2.element;
        if (apiInvocationException == null) {
            return ref$ObjectRef.element;
        }
        throw apiInvocationException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, ru.ok.android.api.core.ApiInvocationException] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    public static final ApiConfig executeExclusive$lambda$0(Ref$ObjectRef ref$ObjectRef, ApiClientAdapter apiClientAdapter, ApiExecutableRequest apiExecutableRequest, Ref$ObjectRef ref$ObjectRef2, ApiConfig apiConfig) {
        SimpleApiConfigStore simpleApiConfigStore = new SimpleApiConfigStore(apiConfig);
        try {
            ref$ObjectRef.element = apiClientAdapter.executeConcurrent(apiExecutableRequest, simpleApiConfigStore);
        } catch (ApiInvocationException e) {
            ref$ObjectRef2.element = e;
        }
        return simpleApiConfigStore.getApiConfig();
    }

    @AutoTraceCompat
    private final <T> T executeSingle(ApiExecutableRequest<T> apiExecutableRequest, ApiConfigStore apiConfigStore, ApiConfig apiConfig) throws IOException, ApiException {
        T t = (T) this.engine.execute(apiExecutableRequest, apiConfig);
        if (apiExecutableRequest.getScopeAfter() != ApiScopeAfter.SAME) {
            apiConfigStore.setApiConfig(apiExecutableRequest.getConfigExtractor2().extractApiConfig(apiConfig, t));
        }
        return t;
    }

    private final ApiConfig reconfigureConcurrent(ApiConfigStore apiConfigStore, String str, String str2, String str3) {
        return apiConfigStore.updateApiConfig(new kx2(str, str2, str3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ApiConfig reconfigureConcurrent$lambda$2(String str, String str2, String str3, ApiConfig apiConfig) {
        return !epx.f(apiConfig.getSessionKey(), str) ? apiConfig : apiConfig.getUserId() != null ? apiConfig.withUser(apiConfig.getUserId(), str2).withSession(str2, str3) : apiConfig.withSession(str2, str3);
    }

    @Override // ru.ok.android.api.core.ApiClient
    public <T> T execute(ApiExecutableRequest<T> apiExecutableRequest) throws IOException, ApiException {
        try {
            Trace.beginSection("ApiClientAdapter.execute: " + ApiRequests.extractLogTag(apiExecutableRequest));
            T t = apiExecutableRequest.getScopeAfter() != ApiScopeAfter.SAME ? (T) executeExclusive(apiExecutableRequest, this.configStore) : (T) executeConcurrent(apiExecutableRequest, this.configStore);
            Trace.endSection();
            return t;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
