package defpackage;

/* loaded from: classes4.dex */
public final class h79 extends o2 {
    public i3 a;
    public c4x0 b;

    public static h79 m(Object obj) {
        int i;
        boolean z;
        boolean z2;
        if (obj instanceof h79) {
            return (h79) obj;
        }
        c4x0 c4x0Var = null;
        if (obj != null) {
            i3 z3 = i3.z(obj);
            h79 h79Var = new h79();
            h79Var.a = z3;
            if (z3.size() == 3) {
                a2 A = z3.A(0);
                if (A instanceof c4x0) {
                    c4x0Var = (c4x0) A;
                } else if (A != null) {
                    i3 z4 = i3.z(A);
                    c4x0 c4x0Var2 = new c4x0();
                    c4x0Var2.a = z4;
                    if (z4.A(0) instanceof s3) {
                        c4x0Var2.b = (l2) l2.c.Hg((s3) z4.A(0), true);
                        i = 0;
                    } else {
                        c4x0Var2.b = new l2(0L);
                        i = -1;
                    }
                    if (c4x0Var2.b.y(0)) {
                        z2 = false;
                        z = true;
                    } else if (c4x0Var2.b.y(1)) {
                        z = false;
                        z2 = true;
                    } else {
                        if (!c4x0Var2.b.y(2)) {
                            ny61.g("version number not recognised");
                            return null;
                        }
                        z = false;
                        z2 = false;
                    }
                    c4x0Var2.c = l2.u(z4.A(i + 1));
                    c4x0Var2.w = xr1.m(z4.A(i + 2));
                    c4x0Var2.x = jc51.m(z4.A(i + 3));
                    i3 i3Var = (i3) z4.A(i + 4);
                    c4x0Var2.y = t5z0.n(i3Var.A(0));
                    c4x0Var2.z = t5z0.n(i3Var.A(1));
                    c4x0Var2.A = jc51.m(z4.A(i + 5));
                    int i2 = i + 6;
                    c4x0Var2.B = zyu0.m(z4.A(i2));
                    int size = (z4.size() - i2) - 1;
                    if (size != 0 && z) {
                        ny61.g("version 1 certificate contains extra data");
                        return null;
                    }
                    while (size > 0) {
                        s3 s3Var = (s3) z4.A(i2 + size);
                        int i3 = s3Var.c;
                        p1 p1Var = s1.b;
                        if (i3 == 1) {
                            c4x0Var2.C = (s1) p1Var.Hg(s3Var, false);
                        } else if (i3 == 2) {
                            c4x0Var2.D = (s1) p1Var.Hg(s3Var, false);
                        } else {
                            if (i3 != 3) {
                                ny61.e(s3Var.c, "Unknown tag encountered in structure: ");
                                return null;
                            }
                            if (z2) {
                                ny61.g("version 2 certificate cannot contain extensions");
                                return null;
                            }
                            c4x0Var2.E = gzo.n((i3) i3.b.Hg(s3Var, true));
                        }
                        size--;
                    }
                    c4x0Var = c4x0Var2;
                }
                h79Var.b = c4x0Var;
                xr1.m(z3.A(1));
                s1.y(z3.A(2));
                return h79Var;
            }
            ny61.g("sequence wrong size for a certificate");
        }
        return null;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return this.a;
    }
}
