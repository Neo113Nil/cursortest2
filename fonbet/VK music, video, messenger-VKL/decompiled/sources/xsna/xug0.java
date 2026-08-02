package xsna;

import io.reactivex.rxjava3.internal.operators.maybe.c;

/* compiled from: RxMaybe.kt */
/* loaded from: classes8.dex */
public final class xug0<T> extends xd<T> {
    public final io.reactivex.rxjava3.core.l<T> e;

    public xug0(kotlin.coroutines.d dVar, io.reactivex.rxjava3.core.l<T> lVar) {
        super(dVar, false, true);
        this.e = lVar;
    }

    @Override // xsna.xd
    public final void u0(Throwable th, boolean z) {
        try {
            if (((c.a) this.e).g(th)) {
                return;
            }
        } catch (Throwable th2) {
            mnh0.d(th, th2);
        }
        xx1.p(this.d, th);
    }

    @Override // xsna.xd
    public final void v0(T t) {
        io.reactivex.rxjava3.core.l<T> lVar = this.e;
        try {
            if (t == null) {
                ((c.a) lVar).d();
            } else {
                ((c.a) lVar).f(t);
            }
        } catch (Throwable th) {
            xx1.p(this.d, th);
        }
    }
}
