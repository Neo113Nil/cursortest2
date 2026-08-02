package ru.ok.android.sdk.api;

import ru.ok.android.api.core.ApiConfig;
import ru.ok.android.api.core.ApiExecutableRequest;
import xsna.epx;

/* compiled from: OkApiInterceptor.kt */
/* loaded from: classes9.dex */
public final class OkApiRequest {
    private final ApiConfig config;
    private final ApiExecutableRequest<?> request;

    public OkApiRequest(ApiExecutableRequest<?> apiExecutableRequest, ApiConfig apiConfig) {
        this.request = apiExecutableRequest;
        this.config = apiConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OkApiRequest copy$default(OkApiRequest okApiRequest, ApiExecutableRequest apiExecutableRequest, ApiConfig apiConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            apiExecutableRequest = okApiRequest.request;
        }
        if ((i & 2) != 0) {
            apiConfig = okApiRequest.config;
        }
        return okApiRequest.copy(apiExecutableRequest, apiConfig);
    }

    public final ApiExecutableRequest<?> component1() {
        return this.request;
    }

    public final ApiConfig component2() {
        return this.config;
    }

    public final OkApiRequest copy(ApiExecutableRequest<?> apiExecutableRequest, ApiConfig apiConfig) {
        return new OkApiRequest(apiExecutableRequest, apiConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OkApiRequest)) {
            return false;
        }
        OkApiRequest okApiRequest = (OkApiRequest) obj;
        return epx.f(this.request, okApiRequest.request) && epx.f(this.config, okApiRequest.config);
    }

    public final ApiConfig getConfig() {
        return this.config;
    }

    public final ApiExecutableRequest<?> getRequest() {
        return this.request;
    }

    public int hashCode() {
        return this.config.hashCode() + (this.request.hashCode() * 31);
    }

    public String toString() {
        return "OkApiRequest(request=" + this.request + ", config=" + this.config + ")";
    }
}
