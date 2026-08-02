package xsna;

import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.u;

/* compiled from: InternalLoggingInterceptor.kt */
/* loaded from: classes.dex */
public final class mhx extends c200 {

    /* compiled from: InternalLoggingInterceptor.kt */
    /* loaded from: classes15.dex */
    public static final class a implements Interceptor.a {
        public final okhttp3.u a;
        public final Interceptor.a b;

        public a(okhttp3.u uVar, Interceptor.a aVar) {
            this.a = uVar;
            this.b = aVar;
        }

        @Override // okhttp3.Interceptor.a
        public final okhttp3.u a(okhttp3.p pVar) {
            return this.a;
        }

        @Override // okhttp3.Interceptor.a
        public final u3j b() {
            return this.b.b();
        }

        @Override // okhttp3.Interceptor.a
        public final Interceptor.a c(int i) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return this.b.c(i);
        }

        @Override // okhttp3.Interceptor.a
        public final okhttp3.d call() {
            return this.b.call();
        }

        @Override // okhttp3.Interceptor.a
        public final int d() {
            return this.b.d();
        }

        @Override // okhttp3.Interceptor.a
        public final Interceptor.a e(int i, TimeUnit timeUnit) {
            return this.b.e(i, timeUnit);
        }

        @Override // okhttp3.Interceptor.a
        public final int f() {
            return this.b.f();
        }

        @Override // okhttp3.Interceptor.a
        public final okhttp3.p request() {
            return this.b.request();
        }
    }

    @Override // xsna.c200
    public final okhttp3.u a(Interceptor.a aVar, HttpLoggingInterceptor httpLoggingInterceptor) {
        okhttp3.u a2 = aVar.a(aVar.request());
        okhttp3.v m = a2.m();
        long contentLength = m != null ? m.contentLength() : 0L;
        n8f0 n8f0Var = null;
        bn8 source = m != null ? m.source() : null;
        if (0 > contentLength || contentLength >= 4097) {
            contentLength = -1;
        } else if (source != null) {
            source.o3(contentLength);
        }
        vl8 C = source != null ? source.C() : null;
        bn8 clone = C != null ? C.clone() : null;
        String a3 = a2.s().a("Content-Type");
        boolean z = false;
        if (a3 != null && drm0.D(a3, "application/x-msgpack", true)) {
            z = true;
        }
        u.a w = a2.w();
        if (clone != null) {
            String valueOf = z ? "application/json" : String.valueOf(m.contentType());
            long j = z ? -1L : contentLength;
            if (z) {
                clone = new e8f0(new qn30(clone));
            }
            n8f0Var = new n8f0(valueOf, j, clone);
        }
        w.b(n8f0Var);
        httpLoggingInterceptor.intercept(new a(w.c(), aVar));
        return a2;
    }
}
