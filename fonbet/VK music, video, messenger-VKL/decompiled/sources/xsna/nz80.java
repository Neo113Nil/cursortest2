package xsna;

import okhttp3.Interceptor;

/* compiled from: OtelDecoratedOkhttpInterceptor.kt */
/* loaded from: classes17.dex */
public final class nz80 implements Interceptor {
    public final wdp0 a;
    public final String b;
    public final Interceptor c;

    public nz80(wdp0 wdp0Var, String str, Interceptor interceptor) {
        this.a = wdp0Var;
        this.b = str;
        this.c = interceptor;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        Object i;
        String str = this.b;
        if (str == null) {
            str = this.c.getClass().getSimpleName();
        }
        i = vhk0.i(this.a, "Okhttp Interceptor ".concat(str), (r5 & 2) == 0, new xdf(2), new mz80(0, this, aVar));
        return (okhttp3.u) i;
    }
}
