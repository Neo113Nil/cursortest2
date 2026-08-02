package xsna;

/* compiled from: QRTypes.kt */
/* loaded from: classes5.dex */
public final class gme0 implements yp80 {
    public final /* synthetic */ io.reactivex.rxjava3.core.r<Boolean> b;

    public gme0(io.reactivex.rxjava3.core.r<Boolean> rVar) {
        this.b = rVar;
    }

    @Override // xsna.yp80
    public final void onError(Throwable th) {
        this.b.onNext(Boolean.FALSE);
    }

    @Override // xsna.yp80
    public final void onSuccess() {
        this.b.onNext(Boolean.TRUE);
    }

    @Override // xsna.yp80
    public final void I() {
    }

    @Override // xsna.yp80
    public final void U() {
    }

    @Override // xsna.yp80
    public final void B0(boolean z) {
    }
}
