package xsna;

import okhttp3.Interceptor;
import xsna.k8g0;

/* compiled from: TooManyRequestInterceptor.kt */
/* loaded from: classes11.dex */
public final class l2p0 implements Interceptor {
    public final a a;
    public final m2p0 b;

    /* compiled from: TooManyRequestInterceptor.kt */
    public static final class a {
        public final int a;
        public final long b;

        public a(int i, long j) {
            if (j / i < 150) {
                this.a = 20;
                this.b = 3000L;
            } else {
                this.a = i;
                this.b = j;
            }
        }
    }

    public l2p0(a aVar, m2p0 m2p0Var) {
        this.a = aVar;
        this.b = m2p0Var;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        okhttp3.p request = aVar.request();
        if (((k8g0.a) request.c(k8g0.a.class)) == null && !epx.f(j5g.b0(0, request.a.f), "method")) {
            return aVar.a(request);
        }
        a aVar2 = this.a;
        this.b.a(aVar2.a, aVar2.b);
        return aVar.a(request);
    }
}
