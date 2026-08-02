package xsna;

/* compiled from: CompositeDisposableContainer.kt */
/* loaded from: classes5.dex */
public abstract class ysi implements wsi {
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();

    @Override // xsna.wsi, xsna.qdc0
    public void a(io.reactivex.rxjava3.disposables.c cVar) {
        this.b.b(cVar);
    }

    @Override // xsna.wsi
    public void dispose() {
        this.b.dispose();
    }
}
