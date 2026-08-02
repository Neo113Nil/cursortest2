package xsna;

/* compiled from: ProductsMultiPickerCreateGoodListenerImpl.kt */
/* loaded from: classes18.dex */
public final class xsd0 implements wsd0 {
    public final fy00 a;
    public io.reactivex.rxjava3.disposables.c b;

    public xsd0(fy00 fy00Var) {
        this.a = fy00Var;
    }

    @Override // xsna.wsd0
    public final void b() {
        io.reactivex.rxjava3.disposables.c cVar = this.b;
        if (cVar != null) {
            cVar.dispose();
        }
        this.b = null;
    }

    @Override // xsna.wsd0
    public final void c(fa00 fa00Var) {
        io.reactivex.rxjava3.disposables.c cVar = this.b;
        if (cVar != null) {
            cVar.dispose();
        }
        this.b = this.a.a().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new q440(new gj80(fa00Var, 6), 15));
    }
}
