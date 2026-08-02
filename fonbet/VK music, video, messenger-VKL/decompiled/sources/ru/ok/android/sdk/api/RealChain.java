package ru.ok.android.sdk.api;

import java.io.InterruptedIOException;
import java.util.List;
import ru.ok.android.api.core.ApiClientEngine;
import ru.ok.android.sdk.api.OkApiInterceptor;
import xsna.zcl;

/* compiled from: OkApiInterceptor.kt */
/* loaded from: classes9.dex */
final class RealChain implements OkApiInterceptor.Chain {
    private final ApiClientEngine apiClientEngine;
    private final int index;
    private final List<OkApiInterceptor> interceptors;
    private final OkApiRequest request;

    /* JADX WARN: Multi-variable type inference failed */
    public RealChain(ApiClientEngine apiClientEngine, OkApiRequest okApiRequest, List<? extends OkApiInterceptor> list, int i) {
        this.apiClientEngine = apiClientEngine;
        this.request = okApiRequest;
        this.interceptors = list;
        this.index = i;
    }

    @Override // ru.ok.android.sdk.api.OkApiInterceptor.Chain
    public OkApiResponse proceed(OkApiRequest okApiRequest) {
        if (this.index < this.interceptors.size()) {
            return this.interceptors.get(this.index).intercept(new RealChain(this.apiClientEngine, okApiRequest, this.interceptors, this.index + 1));
        }
        try {
            return new OkApiResponse(this.apiClientEngine.execute(okApiRequest.getRequest(), okApiRequest.getConfig()));
        } catch (InterruptedIOException e) {
            if (okApiRequest.getRequest() instanceof OkApiInterruptedIOHandler) {
                return new OkApiResponse(((OkApiInterruptedIOHandler) okApiRequest.getRequest()).handleInterruptedIO());
            }
            throw e;
        }
    }

    @Override // ru.ok.android.sdk.api.OkApiInterceptor.Chain
    public OkApiRequest request() {
        return this.request;
    }

    public /* synthetic */ RealChain(ApiClientEngine apiClientEngine, OkApiRequest okApiRequest, List list, int i, int i2, zcl zclVar) {
        this(apiClientEngine, okApiRequest, list, (i2 & 8) != 0 ? 0 : i);
    }
}
