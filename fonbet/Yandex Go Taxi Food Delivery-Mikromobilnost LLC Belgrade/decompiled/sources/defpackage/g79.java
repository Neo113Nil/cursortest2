package defpackage;

/* loaded from: classes4.dex */
public final class g79 extends n2 {
    public h3 a;
    public b4x0 b;

    public static g79 h(a3 a3Var) {
        if (a3Var != null) {
            h3 r = h3.r(a3Var);
            g79 g79Var = new g79();
            g79Var.a = r;
            if (r.size() == 3) {
                g79Var.b = b4x0.h(r.s(0));
                return g79Var;
            }
            ny61.g("sequence wrong size for a certificate");
        }
        return null;
    }

    @Override // defpackage.z1
    public final a3 toASN1Primitive() {
        return this.a;
    }
}
