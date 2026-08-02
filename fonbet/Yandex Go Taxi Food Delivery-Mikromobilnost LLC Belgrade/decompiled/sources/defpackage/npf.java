package defpackage;

/* loaded from: classes4.dex */
public final class npf extends a3 {
    public t2 a;
    public k2 b;
    public a3 c;
    public int w;
    public a3 x;
    public final /* synthetic */ int y;

    public npf(h3 h3Var, int i) {
        int i2;
        a3 aSN1Primitive;
        this.y = i;
        a3 q = q(h3Var, 0);
        if (q instanceof t2) {
            this.a = (t2) q;
            q = q(h3Var, 1);
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (q instanceof k2) {
            this.b = (k2) q;
            i2++;
            q = q(h3Var, i2);
        }
        if (!(q instanceof r3)) {
            this.c = q;
            i2++;
            q = q(h3Var, i2);
        }
        if (h3Var.size() != i2 + 1) {
            ny61.g("input sequence too large");
            throw null;
        }
        if (!(q instanceof r3)) {
            ny61.g("No tagged object found in sequence. Structure doesn't seem to be of type External");
            throw null;
        }
        r3 r3Var = (r3) q;
        int i3 = r3Var.c;
        if (i3 < 0 || i3 > 2) {
            ny61.g(oyr.i(i3, "invalid encoding value: "));
            throw null;
        }
        this.w = i3;
        int i4 = r3Var.b;
        if (128 != i4) {
            ny61.g("invalid tag: ".concat(y3.a(i4, i3)));
            throw null;
        }
        if (i3 != 0) {
            if (i3 == 1) {
                aSN1Primitive = (v2) v2.b.f(r3Var, false);
            } else {
                if (i3 != 2) {
                    ny61.g("invalid tag: ".concat(y3.a(i4, i3)));
                    throw null;
                }
                aSN1Primitive = (r1) r1.b.f(r3Var, false);
            }
        } else {
            if (!r3Var.q()) {
                ny61.r("object implicit - explicit expected.");
                throw null;
            }
            z1 z1Var = r3Var.w;
            aSN1Primitive = (z1Var instanceof n2 ? (n2) z1Var : z1Var.toASN1Primitive()).toASN1Primitive();
        }
        this.x = aSN1Primitive;
    }

    public static a3 q(h3 h3Var, int i) {
        if (h3Var.size() > i) {
            return h3Var.s(i).toASN1Primitive();
        }
        ny61.g("too few objects in input sequence");
        return null;
    }

    @Override // defpackage.a3
    public final boolean h(a3 a3Var) {
        npf npfVar;
        t2 t2Var;
        t2 t2Var2;
        if (this == a3Var) {
            return true;
        }
        if (!(a3Var instanceof npf) || ((t2Var = this.a) != (t2Var2 = (npfVar = (npf) a3Var).a) && (t2Var == null || t2Var2 == null || !t2Var.equals(t2Var2)))) {
            return false;
        }
        k2 k2Var = this.b;
        k2 k2Var2 = npfVar.b;
        if (k2Var != k2Var2 && (k2Var == null || k2Var2 == null || !k2Var.equals(k2Var2))) {
            return false;
        }
        a3 a3Var2 = this.c;
        a3 a3Var3 = npfVar.c;
        return (a3Var2 == a3Var3 || !(a3Var2 == null || a3Var3 == null || !a3Var2.equals(a3Var3))) && this.w == npfVar.w && this.x.l(npfVar.x);
    }

    @Override // defpackage.a3, defpackage.n2
    public final int hashCode() {
        t2 t2Var = this.a;
        int hashCode = t2Var == null ? 0 : t2Var.hashCode();
        k2 k2Var = this.b;
        int hashCode2 = hashCode ^ (k2Var == null ? 0 : k2Var.hashCode());
        a3 a3Var = this.c;
        return this.x.hashCode() ^ ((hashCode2 ^ (a3Var != null ? a3Var.hashCode() : 0)) ^ this.w);
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        g191Var.c0(40, z);
        p().i(g191Var, false);
    }

    @Override // defpackage.a3
    public final boolean j() {
        return true;
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        return p().k(z);
    }

    @Override // defpackage.a3
    public a3 n() {
        switch (this.y) {
            case 0:
                return this;
            default:
                t2 t2Var = this.a;
                k2 k2Var = this.b;
                a3 a3Var = this.c;
                int i = this.w;
                a3 a3Var2 = this.x;
                npf npfVar = new npf();
                npfVar.a = t2Var;
                npfVar.b = k2Var;
                npfVar.c = a3Var;
                if (i >= 0 && i <= 2) {
                    npfVar.w = i;
                    if (i == 1) {
                        if (!v2.class.isInstance(a3Var2)) {
                            ny61.r("unexpected object: ".concat(a3Var2.getClass().getName()));
                        }
                        npfVar.x = a3Var2;
                        return npfVar;
                    }
                    if (i == 2 && !r1.class.isInstance(a3Var2)) {
                        ny61.r("unexpected object: ".concat(a3Var2.getClass().getName()));
                    }
                    npfVar.x = a3Var2;
                    return npfVar;
                }
                ny61.g(oyr.i(i, "invalid encoding value: "));
                return null;
        }
    }

    @Override // defpackage.a3
    public final a3 o() {
        int i = this.y;
        return this;
    }

    public final h3 p() {
        switch (this.y) {
            case 0:
                b2 b2Var = new b2(4);
                t2 t2Var = this.a;
                if (t2Var != null) {
                    b2Var.a(t2Var);
                }
                k2 k2Var = this.b;
                if (k2Var != null) {
                    b2Var.a(k2Var);
                }
                a3 a3Var = this.c;
                if (a3Var != null) {
                    b2Var.a(a3Var.n());
                }
                int i = this.w;
                b2Var.a(new td4(i == 0, i, (z1) this.x, false));
                return new iqf(b2Var);
            default:
                b2 b2Var2 = new b2(4);
                t2 t2Var2 = this.a;
                if (t2Var2 != null) {
                    b2Var2.a(t2Var2);
                }
                k2 k2Var2 = this.b;
                if (k2Var2 != null) {
                    b2Var2.a(k2Var2);
                }
                a3 a3Var2 = this.c;
                if (a3Var2 != null) {
                    b2Var2.a(a3Var2.o());
                }
                int i2 = this.w;
                b2Var2.a(new td4(i2 == 0, i2, this.x, 2));
                return new wvf(b2Var2);
        }
    }

    public /* synthetic */ npf() {
        this.y = 0;
    }
}
