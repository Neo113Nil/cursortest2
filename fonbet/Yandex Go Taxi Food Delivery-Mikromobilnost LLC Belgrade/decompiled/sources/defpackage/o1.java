package defpackage;

/* loaded from: classes4.dex */
public abstract class o1 extends r3 {
    public final r3 x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o1(r3 r3Var) {
        super(r0, r1, r3Var.c, r3Var.w);
        int i = r3Var.a;
        int i2 = r3Var.b;
        if (64 != i2) {
            w511.q();
            throw null;
        }
        this.x = r3Var;
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        this.x.i(g191Var, z);
    }

    @Override // defpackage.a3
    public final boolean j() {
        return this.x.j();
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        return this.x.k(z);
    }

    @Override // defpackage.r3, defpackage.a3
    public a3 n() {
        return new yc4((r3) this.x.n(), 1);
    }

    @Override // defpackage.r3, defpackage.a3
    public a3 o() {
        return new nvf((r3) this.x.o());
    }

    @Override // defpackage.r3
    public final h3 r(a3 a3Var) {
        return this.x.r(a3Var);
    }
}
