package defpackage;

/* loaded from: classes4.dex */
public final class c4x0 extends o2 {
    public jc51 A;
    public zyu0 B;
    public s1 C;
    public s1 D;
    public gzo E;
    public i3 a;
    public l2 b;
    public l2 c;
    public xr1 w;
    public jc51 x;
    public t5z0 y;
    public t5z0 z;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        l2 l2Var = this.b;
        i3 i3Var = this.a;
        if (ltf0.a("org.bouncycastle.x509.allow_non-der_tbscert") == null || ltf0.b("org.bouncycastle.x509.allow_non-der_tbscert")) {
            return i3Var;
        }
        c2 c2Var = new c2();
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        boolean z = true;
        char c = 1;
        char c2 = 1;
        if (!l2Var.y(0)) {
            c2Var.a(new oqf(z, i, l2Var, 0));
        }
        c2Var.a(this.c);
        c2Var.a(this.w);
        c2Var.a(this.x);
        int i2 = 2;
        c2 c2Var2 = new c2(2);
        c2Var2.a(this.y);
        c2Var2.a(this.z);
        c2Var.a(new jqf(c2Var2));
        a2 a2Var = this.A;
        if (a2Var == null) {
            a2Var = new jqf();
        }
        c2Var.a(a2Var);
        c2Var.a(this.B);
        s1 s1Var = this.C;
        if (s1Var != null) {
            c2Var.a(new oqf(objArr2 == true ? 1 : 0, c2 == true ? 1 : 0, s1Var, 0));
        }
        s1 s1Var2 = this.D;
        if (s1Var2 != null) {
            c2Var.a(new oqf(objArr == true ? 1 : 0, i2, s1Var2, 0));
        }
        gzo gzoVar = this.E;
        if (gzoVar != null) {
            c2Var.a(new oqf(c == true ? 1 : 0, 3, gzoVar, 0));
        }
        return new jqf(c2Var);
    }
}
