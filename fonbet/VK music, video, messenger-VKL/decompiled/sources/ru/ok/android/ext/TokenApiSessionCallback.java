package ru.ok.android.ext;

import androidx.annotation.NonNull;
import java.io.IOException;
import ru.ok.android.api.core.ApiClientEngine;
import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.methods.authV2.anonymLogin.AnonymLoginApiResult;
import ru.ok.android.api.session.ApiSessionCallback;
import ru.ok.android.ext.TokenApiSessionCallback;
import ru.ok.android.sdk.api.login.LoginRequest;
import xsna.e9e0;

/* loaded from: classes9.dex */
public class TokenApiSessionCallback implements ApiSessionCallback {

    @NonNull
    private final String deviceId;

    @NonNull
    private final ApiClientEngine engine;

    @NonNull
    private final e9e0<String> tokenProvider;

    public TokenApiSessionCallback(@NonNull ApiClientEngine apiClientEngine, String str, @NonNull e9e0<String> e9e0Var) {
        this.deviceId = str == null ? LoginRequest.CLIENT_NAME : str;
        this.tokenProvider = e9e0Var;
        this.engine = apiClientEngine;
    }

    @Override // ru.ok.android.api.session.ApiSessionCallback
    public ApiConfig provideAnonymousSession(ApiConfig apiConfig, ApiInvocationException apiInvocationException) throws IOException, ApiException {
        AnonymLoginApiResult anonymLoginApiResult = (AnonymLoginApiResult) this.engine.execute(new TokenLoginRequest(this.deviceId, this.tokenProvider), apiConfig);
        return apiConfig.withoutUser().withSession(anonymLoginApiResult.getSessionKey(), anonymLoginApiResult.getSessionSecret());
    }

    public TokenApiSessionCallback(@NonNull ApiClientEngine apiClientEngine, String str, @NonNull final String str2) {
        this(apiClientEngine, str, (e9e0<String>) new e9e0() { // from class: xsna.r1p0
            @Override // xsna.e9e0
            public final Object get() {
                String lambda$new$0;
                lambda$new$0 = TokenApiSessionCallback.lambda$new$0(str2);
                return lambda$new$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$0(String str) {
        return str;
    }
}
