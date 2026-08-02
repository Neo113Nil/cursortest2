package xsna;

/* compiled from: CancelableDisposableAdapter.kt */
/* loaded from: classes16.dex */
public final class iq9 implements hq9 {
    public final io.reactivex.rxjava3.disposables.c a;

    public iq9(io.reactivex.rxjava3.disposables.c cVar) {
        this.a = cVar;
    }

    @Override // xsna.hq9
    public final void cancel() {
        this.a.dispose();
    }
}
