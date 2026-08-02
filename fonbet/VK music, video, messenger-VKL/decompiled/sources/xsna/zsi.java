package xsna;

/* compiled from: CompositeDisposableContainer.kt */
/* loaded from: classes17.dex */
public abstract class zsi implements xsi {
    public Object a;

    public zsi(int i) {
        switch (i) {
            case 1:
                break;
            default:
                this.a = new io.reactivex.rxjava3.disposables.b();
                break;
        }
    }

    @Override // xsna.xsi
    public void a(io.reactivex.rxjava3.disposables.c cVar) {
        ((io.reactivex.rxjava3.disposables.b) this.a).b(cVar);
    }

    public void d() {
        ((io.reactivex.rxjava3.disposables.b) this.a).dispose();
    }
}
