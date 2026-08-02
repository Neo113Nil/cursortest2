package xsna;

/* compiled from: GridStrategyProvider.kt */
/* loaded from: classes18.dex */
public final class mgu implements qpr {
    public final pu9 b;
    public final u5t a = new u5t();
    public final int c = 10;

    public mgu(gzs<s3d0> gzsVar) {
        this.b = new pu9(gzsVar);
    }

    @Override // xsna.qpr
    public final int a() {
        return this.c;
    }

    @Override // xsna.qpr
    public final opr b(int i) {
        if (i == 1) {
            return this.b;
        }
        int i2 = this.c;
        if (i > i2) {
            i = i2;
        }
        u5t u5tVar = this.a;
        u5tVar.d = i;
        return u5tVar;
    }
}
