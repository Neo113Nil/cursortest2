package defpackage;

/* loaded from: classes4.dex */
public class jqf extends i3 {
    public int c;

    public jqf(a2[] a2VarArr) {
        if (a2VarArr != null) {
            for (a2 a2Var : a2VarArr) {
                if (a2Var != null) {
                }
            }
            this.a = c2.b(a2VarArr);
            this.c = -1;
            return;
        }
        ny61.t("'elements' cannot be null, or contain null");
        throw null;
    }

    @Override // defpackage.i3
    public final s1 C() {
        return new mpf(bd4.A(u()));
    }

    @Override // defpackage.i3
    public final opf E() {
        return new opf(this, 0);
    }

    @Override // defpackage.i3
    public final w2 F() {
        return new dqf(hd4.y(x()));
    }

    @Override // defpackage.i3
    public final m3 G() {
        return new zvf(this.a);
    }

    public final int I() {
        if (this.c < 0) {
            int length = this.a.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.a[i2].toASN1Primitive().s().p(true);
            }
            this.c = i;
        }
        return this.c;
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        ryhVar.M(48, z);
        fqf t = ryhVar.t();
        int length = this.a.length;
        int i = 0;
        if (this.c >= 0 || length > 16) {
            ryhVar.G(I());
            while (i < length) {
                this.a[i].toASN1Primitive().s().n(t, true);
                i++;
            }
            return;
        }
        b3[] b3VarArr = new b3[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            b3 s = this.a[i3].toASN1Primitive().s();
            b3VarArr[i3] = s;
            i2 += s.p(true);
        }
        this.c = i2;
        ryhVar.G(i2);
        while (i < length) {
            b3VarArr[i].n(t, true);
            i++;
        }
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        return ryh.w(I(), z);
    }

    @Override // defpackage.i3, defpackage.b3
    public final b3 s() {
        return this;
    }

    @Override // defpackage.i3, defpackage.b3
    public final b3 t() {
        return this;
    }

    public jqf(a2 a2Var) {
        super(a2Var);
        this.c = -1;
    }

    public jqf(c2 c2Var) {
        super(c2Var);
        this.c = -1;
    }

    public jqf() {
        this.c = -1;
    }
}
