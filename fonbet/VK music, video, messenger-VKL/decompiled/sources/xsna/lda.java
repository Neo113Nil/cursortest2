package xsna;

/* compiled from: CatalogRestrictedCommandsBus.kt */
/* loaded from: classes16.dex */
public final class lda extends q3a {
    public final q3a b;
    public final String c;

    public lda(q3a q3aVar, String str) {
        super(null);
        this.b = q3aVar;
        this.c = str;
    }

    @Override // xsna.q3a
    public final io.reactivex.rxjava3.core.q<n3a> a() {
        io.reactivex.rxjava3.core.q<n3a> a = this.b.a();
        int i = 3;
        u5 u5Var = new u5(new e1(this, 15), i);
        a.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.i0(a, u5Var).U(new qs6(new xr0(6), i));
    }

    @Override // xsna.q3a
    public final void b(n3a n3aVar, boolean z) {
        if (z) {
            n3aVar = new dgx(this.c, n3aVar);
        }
        this.b.b(n3aVar, false);
    }
}
