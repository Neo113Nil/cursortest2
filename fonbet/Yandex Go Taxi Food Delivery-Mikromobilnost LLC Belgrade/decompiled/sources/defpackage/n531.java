package defpackage;

/* loaded from: classes.dex */
public final class n531 implements h531 {
    public final int a;
    public final int b;
    public final ofa0 c;

    public n531(int i, int i2, rbn rbnVar) {
        this.a = i;
        this.b = i2;
        this.c = new ofa0(new ror(i, i2, rbnVar));
    }

    @Override // defpackage.h531
    public final int f() {
        return this.a;
    }

    @Override // defpackage.f531
    public final sj2 k(long j, sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        return this.c.k(j, sj2Var, sj2Var2, sj2Var3);
    }

    @Override // defpackage.f531
    public final sj2 n(long j, sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        return this.c.n(j, sj2Var, sj2Var2, sj2Var3);
    }

    @Override // defpackage.h531
    public final int r() {
        return this.b;
    }

    public n531() {
        this(300, 0, ubn.a);
    }
}
