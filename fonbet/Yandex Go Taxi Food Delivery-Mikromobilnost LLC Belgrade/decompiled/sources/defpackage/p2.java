package defpackage;

/* loaded from: classes4.dex */
public final class p2 extends a3 {
    public final upf a;

    public p2(upf upfVar) {
        this.a = upfVar;
    }

    public static p2 p(byte[] bArr) {
        return new p2(new upf(bArr));
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        if (a3Var instanceof p2) {
            return this.a.h(((p2) a3Var).a);
        }
        return false;
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        return ~ffx.T(this.a.a);
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.c0(7, z);
        g191Var.Y(25, this.a.a, false);
    }

    @Override // defpackage.a3
    public final boolean j() {
        return false;
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        return this.a.k(z);
    }

    @Override // defpackage.a3
    public final a3 n() {
        this.a.getClass();
        return this;
    }

    @Override // defpackage.a3
    public final a3 o() {
        this.a.getClass();
        return this;
    }
}
