package defpackage;

/* loaded from: classes4.dex */
public class iqf extends h3 {
    public int c;

    public iqf(z1[] z1VarArr) {
        if (z1VarArr != null) {
            for (z1 z1Var : z1VarArr) {
                if (z1Var != null) {
                }
            }
            this.a = b2.b(z1VarArr);
            this.c = -1;
            return;
        }
        ny61.t("'elements' cannot be null, or contain null");
        throw null;
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.c0(48, z);
        eqf J = g191Var.J();
        int length = this.a.length;
        int i = 0;
        if (this.c >= 0 || length > 16) {
            g191Var.W(z());
            while (i < length) {
                this.a[i].toASN1Primitive().n().i(J, true);
                i++;
            }
            return;
        }
        a3[] a3VarArr = new a3[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            a3 n = this.a[i3].toASN1Primitive().n();
            a3VarArr[i3] = n;
            i2 += n.k(true);
        }
        this.c = i2;
        g191Var.W(i2);
        while (i < length) {
            a3VarArr[i].i(J, true);
            i++;
        }
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        return g191.M(z(), z);
    }

    @Override // defpackage.h3, defpackage.a3
    public final a3 n() {
        return this;
    }

    @Override // defpackage.h3, defpackage.a3
    public final a3 o() {
        return this;
    }

    @Override // defpackage.h3
    public final r1 u() {
        return new lpf(ad4.q(p()), false);
    }

    @Override // defpackage.h3
    public final v2 x() {
        return new cqf(gd4.q(q()));
    }

    @Override // defpackage.h3
    public final l3 y() {
        return new yvf(false, this.a);
    }

    public final int z() {
        if (this.c < 0) {
            int length = this.a.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.a[i2].toASN1Primitive().n().k(true);
            }
            this.c = i;
        }
        return this.c;
    }

    public iqf() {
        this.c = -1;
    }

    public iqf(b2 b2Var) {
        super(b2Var);
        this.c = -1;
    }

    public iqf(z1[] z1VarArr, int i) {
        super(z1VarArr);
        this.c = -1;
    }
}
