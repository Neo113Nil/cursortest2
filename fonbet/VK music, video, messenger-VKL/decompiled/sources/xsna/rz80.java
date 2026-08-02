package xsna;

import okhttp3.Interceptor;

/* compiled from: OtelDecoratedOkhttpInterceptor.kt */
/* loaded from: classes17.dex */
public final class rz80 implements Interceptor {
    public final wdp0 a;

    public rz80(wdp0 wdp0Var) {
        this.a = wdp0Var;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        Object i;
        i = vhk0.i(this.a, "Okhttp", (r5 & 2) == 0, new xdf(2), new ux40(aVar, 8));
        return (okhttp3.u) i;
    }
}
