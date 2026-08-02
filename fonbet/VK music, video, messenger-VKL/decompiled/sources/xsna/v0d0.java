package xsna;

/* compiled from: PreloadCancelableExt.kt */
/* loaded from: classes3.dex */
public final class v0d0 implements u0d0 {
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c b;

    public v0d0(io.reactivex.rxjava3.disposables.c cVar) {
        this.b = cVar;
    }

    @Override // xsna.u0d0
    public final void cancel() {
        this.b.dispose();
    }
}
