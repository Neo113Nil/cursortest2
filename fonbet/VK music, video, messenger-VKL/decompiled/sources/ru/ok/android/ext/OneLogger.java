package ru.ok.android.ext;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import ru.ok.android.api.core.ApiClient;
import ru.ok.android.api.core.ApiClientEngine;
import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.http.HttpApiClient;
import ru.ok.android.api.methods.auth.anonymLogin.AnonymLoginApiRequestV1;
import ru.ok.android.api.methods.authV2.anonymLogin.AnonymLoginApiResult;
import ru.ok.android.api.session.ApiConfigStore;
import ru.ok.android.api.session.ApiSessionCallback;
import ru.ok.android.commons.http.HttpClient;
import ru.ok.android.commons.http.TcpHttpClient;
import ru.ok.android.onelog.OneLogImpl;
import xsna.e9e0;

/* loaded from: classes11.dex */
public final class OneLogger {
    private static volatile e9e0<ApiClient> API_CLIENT_PROVIDER = null;
    static final String OLD_DEVICE_ID = "test";
    private static final int OLD_UPLOAD_JOB_ID = 15261;

    private static void checkDoubleInit() {
        if (API_CLIENT_PROVIDER != null) {
            throw new IllegalStateException(OneLogger.class.getName().concat(" is already initialized"));
        }
    }

    public static void ensureInitialized() {
        if (API_CLIENT_PROVIDER == null) {
            throw new IllegalStateException(OneLogger.class.getName().concat(" is not initialized, please call init() method on this class\nYou can find this class in \"ru.ok.android:onelogger:0.1.1\""));
        }
    }

    public static void flush() {
        OneLogImpl.getInstance().flush();
    }

    public static synchronized void init(@NonNull e9e0<ApiClient> e9e0Var) {
        synchronized (OneLogger.class) {
            init(e9e0Var, OLD_UPLOAD_JOB_ID);
        }
    }

    public static e9e0<ApiClient> mkApiClient(@NonNull final ApiClientEngine apiClientEngine, @NonNull final ApiConfigStore apiConfigStore, @NonNull final ApiSessionCallback apiSessionCallback) {
        return new DCheckProvider<ApiClient>() { // from class: ru.ok.android.ext.OneLogger.1
            @Override // ru.ok.android.ext.DCheckProvider
            @NonNull
            public ApiClient create() {
                return ApiClient.create(ApiClientEngine.this, apiConfigStore, apiSessionCallback);
            }
        };
    }

    public static e9e0<ApiClient> mkDefaultApiClient(@NonNull String str, @Nullable String str2) {
        HttpApiClient mkDefaultApiClientEngine = mkDefaultApiClientEngine(mkDefaultHttpClient());
        return mkApiClient(mkDefaultApiClientEngine, mkDefaultConfigStore(str), mkDefaultApiSessionCallback(mkDefaultApiClientEngine, str2));
    }

    public static HttpApiClient mkDefaultApiClientEngine(@NonNull HttpClient httpClient) {
        return new HttpApiClient(httpClient);
    }

    public static ApiSessionCallback mkDefaultApiSessionCallback(@NonNull final ApiClientEngine apiClientEngine, @Nullable final String str) {
        if (str == null) {
            str = "test";
        }
        return new ApiSessionCallback() { // from class: ru.ok.android.ext.OneLogger.2
            @Override // ru.ok.android.api.session.ApiSessionCallback
            public ApiConfig provideAnonymousSession(ApiConfig apiConfig, @Nullable ApiInvocationException apiInvocationException) throws IOException, ApiException {
                AnonymLoginApiResult anonymLoginApiResult = (AnonymLoginApiResult) apiClientEngine.execute(new AnonymLoginApiRequestV1(str, null, null, null), apiConfig);
                return apiConfig.withoutUser().withSession(anonymLoginApiResult.getSessionKey(), anonymLoginApiResult.getSessionSecret());
            }
        };
    }

    public static ApiConfigStore mkDefaultConfigStore(@NonNull String str) {
        return ApiConfigStore.create(ApiConfig.EMPTY.withApplication(str));
    }

    public static HttpClient mkDefaultHttpClient() {
        return new TcpHttpClient();
    }

    public static void setDataFileLengthSizeToUpload(int i) {
        OneLogImpl.getInstance().setDefFileLengthToUpload(i);
    }

    public static synchronized void init(@NonNull e9e0<ApiClient> e9e0Var, int i) {
        synchronized (OneLogger.class) {
            checkDoubleInit();
            API_CLIENT_PROVIDER = e9e0Var;
            OneLogImpl oneLogImpl = OneLogImpl.getInstance();
            oneLogImpl.attachApiClient(API_CLIENT_PROVIDER);
            oneLogImpl.setUploadJobId(i);
        }
    }
}
