package defpackage;

/* loaded from: classes4.dex */
public class kqf extends l3 {
    public int c;

    public kqf(z1[] z1VarArr) {
        super(true, z1VarArr);
        this.c = -1;
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.c0(49, z);
        eqf J = g191Var.J();
        z1[] z1VarArr = this.a;
        int length = z1VarArr.length;
        int i = 0;
        if (this.c >= 0 || length > 16) {
            g191Var.W(s());
            while (i < length) {
                z1VarArr[i].toASN1Primitive().n().i(J, true);
                i++;
            }
            return;
        }
        a3[] a3VarArr = new a3[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            a3 n = z1VarArr[i3].toASN1Primitive().n();
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
        return g191.M(s(), z);
    }

    @Override // defpackage.l3, defpackage.a3
    public final a3 n() {
        return this.b ? this : super.n();
    }

    @Override // defpackage.l3, defpackage.a3
    public final a3 o() {
        return this;
    }

    public final int s() {
        if (this.c < 0) {
            int i = 0;
            for (z1 z1Var : this.a) {
                i += z1Var.toASN1Primitive().n().k(true);
            }
            this.c = i;
        }
        return this.c;
    }

    public kqf() {
        this.c = -1;
    }
}
