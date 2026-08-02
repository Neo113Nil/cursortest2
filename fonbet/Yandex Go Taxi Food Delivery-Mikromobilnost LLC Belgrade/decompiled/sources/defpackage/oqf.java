package defpackage;

/* loaded from: classes4.dex */
public final class oqf extends s3 {
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oqf(int i, int i2, int i3, a2 a2Var, int i4) {
        super(i, i2, i3, a2Var);
        this.x = i4;
    }

    @Override // defpackage.s3
    public final i3 E(b3 b3Var) {
        switch (this.x) {
            case 0:
                return new jqf(b3Var);
            default:
                xvf xvfVar = new xvf(b3Var);
                xvfVar.c = -1;
                return xvfVar;
        }
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z) {
        int i = this.x;
        int i2 = this.c;
        int i3 = this.b;
        a2 a2Var = this.w;
        switch (i) {
            case 0:
                b3 s = a2Var.toASN1Primitive().s();
                boolean C = C();
                if (z) {
                    if (C || s.o()) {
                        i3 |= 32;
                    }
                    ryhVar.L(i3, i2);
                }
                if (C) {
                    ryhVar.G(s.p(true));
                }
                s.n(ryhVar.t(), C);
                break;
            default:
                b3 t = a2Var.toASN1Primitive().t();
                boolean C2 = C();
                if (z) {
                    if (C2 || t.o()) {
                        i3 |= 32;
                    }
                    ryhVar.L(i3, i2);
                }
                if (C2) {
                    ryhVar.G(t.p(true));
                }
                t.n(ryhVar.u(), C2);
                break;
        }
    }

    @Override // defpackage.b3
    public final boolean o() {
        int i = this.x;
        a2 a2Var = this.w;
        switch (i) {
            case 0:
                if (!C() && !a2Var.toASN1Primitive().s().o()) {
                    break;
                }
                break;
            default:
                if (!C() && !a2Var.toASN1Primitive().t().o()) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // defpackage.b3
    public final int p(boolean z) {
        int i = this.x;
        int i2 = this.c;
        a2 a2Var = this.w;
        switch (i) {
            case 0:
                b3 s = a2Var.toASN1Primitive().s();
                boolean C = C();
                int p = s.p(C);
                if (C) {
                    p += ryh.v(p);
                }
                return p + (z ? ryh.x(i2) : 0);
            default:
                b3 t = a2Var.toASN1Primitive().t();
                boolean C2 = C();
                int p2 = t.p(C2);
                if (C2) {
                    p2 += ryh.v(p2);
                }
                return p2 + (z ? ryh.x(i2) : 0);
        }
    }

    @Override // defpackage.s3, defpackage.b3
    public b3 s() {
        switch (this.x) {
            case 0:
                return this;
            default:
                return super.s();
        }
    }

    @Override // defpackage.s3, defpackage.b3
    public final b3 t() {
        int i = this.x;
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oqf(boolean z, int i, a2 a2Var, int i2) {
        super(z, i, a2Var);
        this.x = i2;
    }
}
