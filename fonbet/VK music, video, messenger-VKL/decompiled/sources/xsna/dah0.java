package xsna;

/* compiled from: DrawModifier.kt */
/* loaded from: classes11.dex */
public final class dah0 implements kdu {
    public fh50<mdu> a;
    public kdu b;

    @Override // xsna.kdu
    public final mdu a() {
        kdu kduVar = this.b;
        if (kduVar == null) {
            uzw.b("GraphicsContext not provided");
        }
        mdu a = kduVar.a();
        fh50<mdu> fh50Var = this.a;
        if (fh50Var != null) {
            fh50Var.j(a);
            return a;
        }
        Object[] objArr = sp70.a;
        fh50<mdu> fh50Var2 = new fh50<>(1);
        fh50Var2.j(a);
        this.a = fh50Var2;
        return a;
    }

    @Override // xsna.kdu
    public final void b(mdu mduVar) {
        kdu kduVar = this.b;
        if (kduVar != null) {
            kduVar.b(mduVar);
        }
    }

    public final void c() {
        fh50<mdu> fh50Var = this.a;
        if (fh50Var != null) {
            Object[] objArr = fh50Var.a;
            int i = fh50Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                b((mdu) objArr[i2]);
            }
            fh50Var.m();
        }
    }
}
