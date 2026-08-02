package defpackage;

/* loaded from: classes4.dex */
public final class ngi0 extends o2 implements y1 {
    public o2 a;

    public ngi0(b3 b3Var) {
        this.a = b3Var;
    }

    public static ngi0 n(a2 a2Var) {
        if (a2Var == null || (a2Var instanceof ngi0)) {
            return (ngi0) a2Var;
        }
        if (a2Var instanceof i3) {
            return new ngi0((i3) a2Var);
        }
        if (a2Var instanceof s3) {
            return new ngi0((s3) a2Var);
        }
        ny61.g("unknown object in factory: ".concat(a2Var.getClass().getName()));
        return null;
    }

    public final a2 m() {
        o2 o2Var = this.a;
        if (!(o2Var instanceof s3)) {
            return njx.m(o2Var);
        }
        s3 s3Var = (s3) o2Var;
        int i = s3Var.c;
        if (i == 1) {
            return phx.m(s3Var);
        }
        if (i == 2) {
            return s3Var.C() ? pfx.m(s3Var, true) : pfx.m(s3Var, false);
        }
        if (i == 3) {
            return wp90.m(s3Var);
        }
        if (i == 4) {
            return jr80.m((i3) i3.b.Hg(s3Var, false));
        }
        ny61.r("unknown tag");
        return null;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return this.a.toASN1Primitive();
    }
}
