package defpackage;

/* loaded from: classes4.dex */
public class md4 extends h3 {
    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.a0(z, 48, this.a);
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        int i = z ? 4 : 3;
        int length = this.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.a[i2].toASN1Primitive().k(true);
        }
        return i;
    }

    @Override // defpackage.h3
    public final r1 u() {
        return new ad4(p());
    }

    @Override // defpackage.h3
    public final v2 x() {
        v2[] q = q();
        return new gd4(gd4.q(q), q);
    }

    @Override // defpackage.h3
    public final l3 y() {
        return new qd4(false, this.a);
    }
}
