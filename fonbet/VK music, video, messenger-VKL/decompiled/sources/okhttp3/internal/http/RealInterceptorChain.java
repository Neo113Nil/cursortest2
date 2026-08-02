package okhttp3.internal.http;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.d;
import okhttp3.l;
import okhttp3.p;
import okhttp3.u;
import xsna.epx;
import xsna.f8f0;
import xsna.u1q;
import xsna.u3j;
import xsna.x1q;
import xsna.x2r0;

/* compiled from: RealInterceptorChain.kt */
/* loaded from: classes11.dex */
public final class RealInterceptorChain implements Interceptor.a {
    public final f8f0 a;
    public final ArrayList b;
    public final int c;
    public final u1q d;
    public final p e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public RealInterceptorChain(f8f0 f8f0Var, ArrayList arrayList, int i, u1q u1qVar, p pVar, int i2, int i3, int i4) {
        this.a = f8f0Var;
        this.b = arrayList;
        this.c = i;
        this.d = u1qVar;
        this.e = pVar;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static RealInterceptorChain g(RealInterceptorChain realInterceptorChain, int i, u1q u1qVar, p pVar, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = realInterceptorChain.c;
        }
        int i5 = i;
        if ((i4 & 2) != 0) {
            u1qVar = realInterceptorChain.d;
        }
        u1q u1qVar2 = u1qVar;
        if ((i4 & 4) != 0) {
            pVar = realInterceptorChain.e;
        }
        p pVar2 = pVar;
        if ((i4 & 8) != 0) {
            i2 = realInterceptorChain.f;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = realInterceptorChain.g;
        }
        int i7 = realInterceptorChain.h;
        return new RealInterceptorChain(realInterceptorChain.a, realInterceptorChain.b, i5, u1qVar2, pVar2, i6, i3, i7);
    }

    @Override // okhttp3.Interceptor.a
    public final u a(p pVar) throws IOException {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.i++;
        u1q u1qVar = this.d;
        if (u1qVar != null) {
            x1q h = u1qVar.h();
            l lVar = pVar.a;
            l lVar2 = h.b.h;
            if (lVar.e != lVar2.e || !epx.f(lVar.d, lVar2.d)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        RealInterceptorChain g = g(this, i2, null, pVar, 0, 0, 58);
        Interceptor interceptor = (Interceptor) arrayList.get(i);
        u intercept = interceptor.intercept(g);
        if (intercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (u1qVar != null && i2 < arrayList.size() && g.i != 1) {
            throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
        }
        if (intercept.m() != null) {
            return intercept;
        }
        throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }

    @Override // okhttp3.Interceptor.a
    public final u3j b() {
        u1q u1qVar = this.d;
        if (u1qVar != null) {
            return u1qVar.g();
        }
        return null;
    }

    @Override // okhttp3.Interceptor.a
    public final Interceptor.a c(int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (this.d == null) {
            return g(this, 0, null, null, x2r0.b("connectTimeout", i, timeUnit), 0, 55);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // okhttp3.Interceptor.a
    public final d call() {
        return this.a;
    }

    @Override // okhttp3.Interceptor.a
    public final int d() {
        return this.g;
    }

    @Override // okhttp3.Interceptor.a
    public final Interceptor.a e(int i, TimeUnit timeUnit) {
        if (this.d == null) {
            return g(this, 0, null, null, 0, x2r0.b("readTimeout", i, timeUnit), 47);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // okhttp3.Interceptor.a
    public final int f() {
        return this.f;
    }

    @Override // okhttp3.Interceptor.a
    public final p request() {
        return this.e;
    }
}
