package defpackage;

/* loaded from: classes4.dex */
public class lqf extends m3 {
    public int w;

    public lqf(c2 c2Var) {
        super(c2Var, true);
        this.w = -1;
    }

    public final int A() {
        if (this.w < 0) {
            int i = 0;
            for (a2 a2Var : this.a) {
                i += a2Var.toASN1Primitive().s().p(true);
            }
            this.w = i;
        }
        return this.w;
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        ryhVar.M(49, z);
        fqf t = ryhVar.t();
        a2[] a2VarArr = this.a;
        int length = a2VarArr.length;
        int i = 0;
        if (this.w >= 0 || length > 16) {
            ryhVar.G(A());
            while (i < length) {
                a2VarArr[i].toASN1Primitive().s().n(t, true);
                i++;
            }
            return;
        }
        b3[] b3VarArr = new b3[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            b3 s = a2VarArr[i3].toASN1Primitive().s();
            b3VarArr[i3] = s;
            i2 += s.p(true);
        }
        this.w = i2;
        ryhVar.G(i2);
        while (i < length) {
            b3VarArr[i].n(t, true);
            i++;
        }
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        return ryh.w(A(), z);
    }

    @Override // defpackage.m3, defpackage.b3
    public final b3 s() {
        return this.b != null ? this : super.s();
    }

    @Override // defpackage.m3, defpackage.b3
    public final b3 t() {
        return this;
    }

    public lqf() {
        this.w = -1;
    }

    public lqf(o2 o2Var) {
        super(o2Var);
        this.w = -1;
    }
}
