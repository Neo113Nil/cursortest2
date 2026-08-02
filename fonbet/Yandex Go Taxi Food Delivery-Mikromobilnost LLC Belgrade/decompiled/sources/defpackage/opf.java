package defpackage;

/* loaded from: classes4.dex */
public final class opf extends b3 {
    public static final p1 z = new p1(4, opf.class);
    public u2 a;
    public l2 b;
    public b3 c;
    public int w;
    public b3 x;
    public final /* synthetic */ int y;

    public opf(i3 i3Var, int i) {
        int i2;
        b3 aSN1Primitive;
        this.y = i;
        b3 x = x(i3Var, 0);
        if (x instanceof u2) {
            this.a = (u2) x;
            x = x(i3Var, 1);
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (x instanceof l2) {
            this.b = (l2) x;
            i2++;
            x = x(i3Var, i2);
        }
        if (!(x instanceof s3)) {
            this.c = x;
            i2++;
            x = x(i3Var, i2);
        }
        if (i3Var.size() != i2 + 1) {
            ny61.g("input sequence too large");
            throw null;
        }
        if (!(x instanceof s3)) {
            ny61.g("No tagged object found in sequence. Structure doesn't seem to be of type External");
            throw null;
        }
        s3 s3Var = (s3) x;
        int i3 = s3Var.c;
        if (i3 < 0 || i3 > 2) {
            ny61.g(oyr.i(i3, "invalid encoding value: "));
            throw null;
        }
        this.w = i3;
        int i4 = s3Var.b;
        if (128 != i4) {
            ny61.g("invalid tag: ".concat(z3.b(i4, i3)));
            throw null;
        }
        if (i3 == 0) {
            aSN1Primitive = s3Var.y().toASN1Primitive();
        } else if (i3 == 1) {
            aSN1Primitive = (w2) w2.b.Hg(s3Var, false);
        } else {
            if (i3 != 2) {
                ny61.g("invalid tag: ".concat(z3.b(i4, i3)));
                throw null;
            }
            aSN1Primitive = (s1) s1.b.Hg(s3Var, false);
        }
        this.x = aSN1Primitive;
    }

    public static b3 x(i3 i3Var, int i) {
        if (i3Var.size() > i) {
            return i3Var.A(i).toASN1Primitive();
        }
        ny61.g("too few objects in input sequence");
        return null;
    }

    @Override // defpackage.b3, defpackage.o2
    public final int hashCode() {
        u2 u2Var = this.a;
        int hashCode = u2Var == null ? 0 : u2Var.hashCode();
        l2 l2Var = this.b;
        int hashCode2 = hashCode ^ (l2Var == null ? 0 : l2Var.hashCode());
        b3 b3Var = this.c;
        return this.x.hashCode() ^ ((hashCode2 ^ (b3Var != null ? b3Var.hashCode() : 0)) ^ this.w);
    }

    @Override // defpackage.b3
    public final boolean m(b3 b3Var) {
        opf opfVar;
        u2 u2Var;
        u2 u2Var2;
        if (this == b3Var) {
            return true;
        }
        if (!(b3Var instanceof opf) || ((u2Var = this.a) != (u2Var2 = (opfVar = (opf) b3Var).a) && (u2Var == null || u2Var2 == null || !u2Var.equals(u2Var2)))) {
            return false;
        }
        l2 l2Var = this.b;
        l2 l2Var2 = opfVar.b;
        if (l2Var != l2Var2 && (l2Var == null || l2Var2 == null || !l2Var.equals(l2Var2))) {
            return false;
        }
        b3 b3Var2 = this.c;
        b3 b3Var3 = opfVar.c;
        return (b3Var2 == b3Var3 || !(b3Var2 == null || b3Var3 == null || !b3Var2.equals(b3Var3))) && this.w == opfVar.w && this.x.q(opfVar.x);
    }

    @Override // defpackage.b3
    public final void n(ryh ryhVar, boolean z2) {
        ryhVar.M(40, z2);
        u().n(ryhVar, false);
    }

    @Override // defpackage.b3
    public final boolean o() {
        return true;
    }

    @Override // defpackage.b3
    public final int p(boolean z2) {
        return u().p(z2);
    }

    @Override // defpackage.b3
    public b3 s() {
        switch (this.y) {
            case 0:
                return this;
            default:
                u2 u2Var = this.a;
                l2 l2Var = this.b;
                b3 b3Var = this.c;
                int i = this.w;
                b3 b3Var2 = this.x;
                opf opfVar = new opf();
                opfVar.a = u2Var;
                opfVar.b = l2Var;
                opfVar.c = b3Var;
                if (i < 0 || i > 2) {
                    ny61.g(oyr.i(i, "invalid encoding value: "));
                } else {
                    opfVar.w = i;
                    if (i == 1 ? w2.class.isInstance(b3Var2) : !(i == 2 && !s1.class.isInstance(b3Var2))) {
                        opfVar.x = b3Var2;
                        return opfVar;
                    }
                    ny61.r("unexpected object: ".concat(b3Var2.getClass().getName()));
                }
                return null;
        }
    }

    @Override // defpackage.b3
    public final b3 t() {
        int i = this.y;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i3 u() {
        Object[] objArr = 0;
        char c = 1;
        switch (this.y) {
            case 0:
                c2 c2Var = new c2(4);
                u2 u2Var = this.a;
                if (u2Var != null) {
                    c2Var.a(u2Var);
                }
                l2 l2Var = this.b;
                if (l2Var != null) {
                    c2Var.a(l2Var);
                }
                b3 b3Var = this.c;
                if (b3Var != null) {
                    c2Var.a(b3Var.s());
                }
                int i = this.w;
                c2Var.a(new oqf(i == 0, i, this.x, objArr == true ? 1 : 0));
                return new jqf(c2Var);
            default:
                c2 c2Var2 = new c2(4);
                u2 u2Var2 = this.a;
                if (u2Var2 != null) {
                    c2Var2.a(u2Var2);
                }
                l2 l2Var2 = this.b;
                if (l2Var2 != null) {
                    c2Var2.a(l2Var2);
                }
                b3 b3Var2 = this.c;
                if (b3Var2 != null) {
                    c2Var2.a(b3Var2.t());
                }
                int i2 = this.w;
                c2Var2.a(new oqf(i2 == 0, i2, this.x, c == true ? 1 : 0));
                return new xvf(c2Var2);
        }
    }

    public /* synthetic */ opf() {
        this.y = 0;
    }
}
