package defpackage;

import java.util.Enumeration;

/* loaded from: classes4.dex */
public final class p4x0 extends o2 {
    public l2 A;
    public fxs B;
    public gzo C;
    public l2 a;
    public u2 b;
    public nt10 c;
    public l2 w;
    public g2 x;
    public qm y;
    public w1 z;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x012f, code lost:
    
        defpackage.ny61.g("Invalid micros field : not in (1..999)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0134, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p4x0 m(b3 b3Var) {
        nt10 nt10Var;
        o2 o2Var;
        qm qmVar;
        if (b3Var == null) {
            return null;
        }
        i3 z = i3.z(b3Var);
        p4x0 p4x0Var = new p4x0();
        Enumeration B = z.B();
        p4x0Var.a = l2.u(B.nextElement());
        p4x0Var.b = u2.A(B.nextElement());
        Object nextElement = B.nextElement();
        if (nextElement instanceof nt10) {
            nt10Var = (nt10) nextElement;
        } else if (nextElement != null) {
            i3 z2 = i3.z(nextElement);
            nt10 nt10Var2 = new nt10();
            if (z2.size() != 2) {
                ny61.g("sequence has wrong number of elements");
                return null;
            }
            nt10Var2.a = xr1.m(z2.A(0));
            nt10Var2.b = w2.x(z2.A(1)).a;
            nt10Var = nt10Var2;
        } else {
            nt10Var = null;
        }
        p4x0Var.c = nt10Var;
        p4x0Var.w = l2.u(B.nextElement());
        p4x0Var.x = g2.z(B.nextElement());
        w1 w1Var = w1.c;
        loop0: while (true) {
            p4x0Var.z = w1Var;
            while (B.hasMoreElements()) {
                o2Var = (o2) B.nextElement();
                if (o2Var instanceof s3) {
                    s3 s3Var = (s3) o2Var;
                    int i = s3Var.c;
                    if (i == 0) {
                        p4x0Var.B = fxs.m(s3.z(s3Var));
                    } else {
                        if (i != 1) {
                            ny61.g(oyr.i(i, "Unknown tag value "));
                            return null;
                        }
                        p4x0Var.C = gzo.n((i3) i3.b.Hg(s3Var, false));
                    }
                } else if ((o2Var instanceof i3) || (o2Var instanceof qm)) {
                    if (o2Var instanceof qm) {
                        qmVar = (qm) o2Var;
                    } else if (o2Var != null) {
                        i3 z3 = i3.z(o2Var);
                        qm qmVar2 = new qm();
                        qmVar2.a = null;
                        qmVar2.b = null;
                        qmVar2.c = null;
                        for (int i2 = 0; i2 < z3.size(); i2++) {
                            if (z3.A(i2) instanceof l2) {
                                qmVar2.a = (l2) z3.A(i2);
                            } else if (z3.A(i2) instanceof s3) {
                                s3 s3Var2 = (s3) z3.A(i2);
                                int i3 = s3Var2.c;
                                p1 p1Var = l2.c;
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        ny61.g("Invalid tag number");
                                        return null;
                                    }
                                    l2 l2Var = (l2) p1Var.Hg(s3Var2, false);
                                    qmVar2.c = l2Var;
                                    int A = l2Var.A();
                                    if (A < 1 || A > 999) {
                                        break loop0;
                                    }
                                } else {
                                    l2 l2Var2 = (l2) p1Var.Hg(s3Var2, false);
                                    qmVar2.b = l2Var2;
                                    int A2 = l2Var2.A();
                                    if (A2 < 1 || A2 > 999) {
                                        break loop0;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        qmVar = qmVar2;
                    } else {
                        qmVar = null;
                    }
                    p4x0Var.y = qmVar;
                } else {
                    if (o2Var instanceof w1) {
                        break;
                    }
                    if (o2Var instanceof l2) {
                        p4x0Var.A = l2.u(o2Var);
                    }
                }
            }
            return p4x0Var;
            w1Var = w1.x(o2Var);
        }
        ny61.g("Invalid millis field : not in (1..999)");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        w1 w1Var = this.z;
        c2 c2Var = new c2(10);
        c2Var.a(this.a);
        c2Var.a(this.b);
        c2Var.a(this.c);
        c2Var.a(this.w);
        c2Var.a(this.x);
        qm qmVar = this.y;
        if (qmVar != null) {
            c2Var.a(qmVar);
        }
        if (w1Var != null && w1Var.y()) {
            c2Var.a(w1Var);
        }
        l2 l2Var = this.A;
        if (l2Var != null) {
            c2Var.a(l2Var);
        }
        fxs fxsVar = this.B;
        int i = 0;
        Object[] objArr = 0;
        boolean z = true;
        char c = 1;
        if (fxsVar != null) {
            c2Var.a(new oqf(z, i, fxsVar, 0));
        }
        gzo gzoVar = this.C;
        if (gzoVar != null) {
            c2Var.a(new oqf(objArr == true ? 1 : 0, c == true ? 1 : 0, gzoVar, 0));
        }
        return new jqf(c2Var);
    }
}
