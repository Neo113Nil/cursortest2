package defpackage;

/* loaded from: classes4.dex */
public final class m79 extends o2 {
    public a4x0 a;
    public xr1 b;
    public s1 c;
    public boolean w;
    public int x;

    public static m79 m(Object obj) {
        if (obj instanceof m79) {
            return (m79) obj;
        }
        if (obj != null) {
            i3 z = i3.z(obj);
            m79 m79Var = new m79();
            m79Var.w = false;
            if (z.size() == 3) {
                m79Var.a = a4x0.m(z.A(0));
                m79Var.b = xr1.m(z.A(1));
                m79Var.c = s1.y(z.A(2));
                return m79Var;
            }
            ny61.g("sequence wrong size for CertificateList");
        }
        return null;
    }

    @Override // defpackage.o2
    public final int hashCode() {
        if (!this.w) {
            this.x = super.hashCode();
            this.w = true;
        }
        return this.x;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(3);
        c2Var.a(this.a);
        c2Var.a(this.b);
        c2Var.a(this.c);
        return new jqf(c2Var);
    }
}
