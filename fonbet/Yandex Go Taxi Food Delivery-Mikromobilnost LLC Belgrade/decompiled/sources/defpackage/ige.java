package defpackage;

/* loaded from: classes4.dex */
public final class ige extends o2 implements p87 {
    public final u2 a;
    public final a2 b;
    public final boolean c;

    public ige(i3 i3Var) {
        if (i3Var.size() < 1 || i3Var.size() > 2) {
            ny61.g(vfc.n(i3Var, new StringBuilder("Bad sequence size: ")));
            throw null;
        }
        this.a = (u2) i3Var.A(0);
        if (i3Var.size() > 1) {
            s3 B = s3.B(i3Var.A(1));
            if (!B.C() || B.c != 0) {
                ny61.g("Bad tag for 'content'");
                throw null;
            }
            this.b = B.y();
        } else {
            this.b = null;
        }
        this.c = !(i3Var instanceof nd4);
    }

    public static ige m(Object obj) {
        if (obj instanceof ige) {
            return (ige) obj;
        }
        if (obj != null) {
            return new ige(i3.z(obj));
        }
        return null;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        boolean z = this.c;
        a2 a2Var = this.b;
        if (a2Var != null) {
            c2Var.a(z ? new oqf(true, 0, a2Var, 1) : new ud4(true, 0, a2Var));
        }
        return z ? new xvf(c2Var) : new nd4(c2Var);
    }

    public ige(u2 u2Var, o2 o2Var) {
        this.a = u2Var;
        this.b = o2Var;
        boolean z = true;
        if (o2Var == null) {
            this.c = true;
            return;
        }
        b3 aSN1Primitive = o2Var.toASN1Primitive();
        if (!(aSN1Primitive instanceof dqf) && !(aSN1Primitive instanceof xvf) && !(aSN1Primitive instanceof jqf)) {
            z = false;
        }
        this.c = z;
    }
}
