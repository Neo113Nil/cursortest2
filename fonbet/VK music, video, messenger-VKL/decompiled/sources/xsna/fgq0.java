package xsna;

import okhttp3.Interceptor;
import okhttp3.p;

/* compiled from: UserAgentInterceptor.kt */
/* loaded from: classes.dex */
public final class fgq0 implements Interceptor {
    public final n260 a;

    public fgq0(n260 n260Var) {
        this.a = n260Var;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        p.a b = aVar.request().b();
        b.c.h("User-Agent", this.a.getUserAgent());
        return aVar.a(b.b());
    }
}
