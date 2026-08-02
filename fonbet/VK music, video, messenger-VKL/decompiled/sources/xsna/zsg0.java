package xsna;

/* compiled from: RxCancellable.kt */
/* loaded from: classes8.dex */
public final class zsg0 implements io.reactivex.rxjava3.functions.e {
    public final xd b;

    public zsg0(xd xdVar) {
        this.b = xdVar;
    }

    @Override // io.reactivex.rxjava3.functions.e
    public final void cancel() {
        this.b.b(null);
    }
}
