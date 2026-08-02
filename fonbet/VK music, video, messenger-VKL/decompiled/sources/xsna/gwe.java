package xsna;

/* compiled from: ClipsPrecacheExternalProviderImpl.kt */
/* loaded from: classes16.dex */
public final class gwe implements nkh0 {
    public final /* synthetic */ hwe a;

    public gwe(hwe hweVar) {
        this.a = hweVar;
    }

    @Override // xsna.nkh0
    public final io.reactivex.rxjava3.internal.operators.observable.f0 a(xy2 xy2Var) {
        dz2 x = yfb.x(xy2Var);
        if (!((b25) this.a.b.getValue()).b()) {
            x.d = true;
            x.c = true;
        }
        return rsg0.W(x, 5);
    }
}
