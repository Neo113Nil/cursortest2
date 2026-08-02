package xsna;

/* compiled from: RxSingle.kt */
/* loaded from: classes8.dex */
public final class vvg0<T> extends xd<T> {
    public final io.reactivex.rxjava3.core.y<T> e;

    public vvg0(kotlin.coroutines.d dVar, io.reactivex.rxjava3.core.y<T> yVar) {
        super(dVar, false, true);
        this.e = yVar;
    }

    @Override // xsna.xd
    public final void u0(Throwable th, boolean z) {
        try {
            if (this.e.b(th)) {
                return;
            }
        } catch (Throwable th2) {
            mnh0.d(th, th2);
        }
        xx1.p(this.d, th);
    }

    @Override // xsna.xd
    public final void v0(T t) {
        try {
            this.e.onSuccess(t);
        } catch (Throwable th) {
            xx1.p(this.d, th);
        }
    }
}
