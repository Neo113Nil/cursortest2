package xsna;

/* compiled from: RxCompletable.kt */
/* loaded from: classes8.dex */
public final class atg0 extends xd<s3q0> {
    public final io.reactivex.rxjava3.core.b e;

    public atg0(kotlin.coroutines.d dVar, io.reactivex.rxjava3.core.b bVar) {
        super(dVar, false, true);
        this.e = bVar;
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
    public final void v0(s3q0 s3q0Var) {
        try {
            this.e.onComplete();
        } catch (Throwable th) {
            xx1.p(this.d, th);
        }
    }
}
