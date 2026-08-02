package xsna;

import android.annotation.SuppressLint;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: MemoryPreloadableCache.kt */
/* loaded from: classes17.dex */
public abstract class c320<T> {
    public final long a;
    public T b;
    public long c;
    public io.reactivex.rxjava3.core.q<T> d;

    public c320(long j) {
        this.a = j;
    }

    public final void a() {
        this.d = null;
        this.b = null;
        this.c = 0L;
    }

    public final io.reactivex.rxjava3.core.q<T> b() {
        T t = this.b;
        if (t != null) {
            if (System.currentTimeMillis() - this.c < this.a) {
                return io.reactivex.rxjava3.core.q.T(t);
            }
        }
        io.reactivex.rxjava3.core.q<T> qVar = this.d;
        if (qVar != null) {
            return qVar;
        }
        a();
        return c();
    }

    @SuppressLint({"CheckResult"})
    public final io.reactivex.rxjava3.core.q<T> c() {
        io.reactivex.rxjava3.core.q<T> d = d();
        pv2 pv2Var = new pv2(new j4x(this, 10), 26);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        io.reactivex.rxjava3.core.q<T> M0 = d.E(pv2Var, lVar, kVar, kVar).F(new m5y(new r9k(this, 25), 3)).g0().M0(1, lVar);
        int i = kwg0.a;
        M0.subscribe(new iwg0(), new io1(new svz(2), 28));
        this.d = M0;
        return M0;
    }

    public abstract io.reactivex.rxjava3.core.q<T> d();
}
