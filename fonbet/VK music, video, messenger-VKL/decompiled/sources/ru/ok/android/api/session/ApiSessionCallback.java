package ru.ok.android.api.session;

import java.io.IOException;
import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: ApiSessionCallback.kt */
/* loaded from: classes9.dex */
public interface ApiSessionCallback {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final ApiSessionCallback NOP = new ApiSessionCallback() { // from class: ru.ok.android.api.session.ApiSessionCallback$Companion$NOP$1
    };

    /* compiled from: ApiSessionCallback.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    static /* synthetic */ ApiConfig provideAnonymousSession$default(ApiSessionCallback apiSessionCallback, ApiConfig apiConfig, ApiInvocationException apiInvocationException, int i, Object obj) throws IOException, ApiException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: provideAnonymousSession");
        }
        if ((i & 2) != 0) {
            apiInvocationException = null;
        }
        return apiSessionCallback.provideAnonymousSession(apiConfig, apiInvocationException);
    }

    static /* synthetic */ ApiConfig provideSession$default(ApiSessionCallback apiSessionCallback, ApiConfig apiConfig, ApiInvocationException apiInvocationException, int i, Object obj) throws IOException, ApiException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: provideSession");
        }
        if ((i & 2) != 0) {
            apiInvocationException = null;
        }
        return apiSessionCallback.provideSession(apiConfig, apiInvocationException);
    }

    default ApiConfig provideSession(ApiConfig apiConfig, ApiInvocationException apiInvocationException) throws IOException, ApiException {
        return apiConfig.withoutUser();
    }

    default ApiConfig provideAnonymousSession(ApiConfig apiConfig, ApiInvocationException apiInvocationException) throws IOException, ApiException {
        return apiConfig;
    }
}
