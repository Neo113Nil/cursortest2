package defpackage;

import java.util.Enumeration;

/* loaded from: classes4.dex */
public final class l8z0 extends o2 {
    public e490 a;
    public ige b;

    public static l8z0 m(b3 b3Var) {
        a2 A;
        e490 e490Var = null;
        if (b3Var == null) {
            return null;
        }
        i3 z = i3.z(b3Var);
        l8z0 l8z0Var = new l8z0();
        Enumeration B = z.B();
        Object nextElement = B.nextElement();
        if (nextElement instanceof e490) {
            e490Var = (e490) nextElement;
        } else if (nextElement != null) {
            i3 z2 = i3.z(nextElement);
            e490 e490Var2 = new e490();
            e490Var2.a = l2.u(z2.A(0));
            e490Var2.b = null;
            e490Var2.c = null;
            if (z2.size() > 2) {
                e490Var2.b = d490.m(z2.A(1));
                A = z2.A(2);
            } else {
                if (z2.size() > 1) {
                    A = z2.A(1);
                    if (!(A instanceof s1)) {
                        e490Var2.b = d490.m(A);
                    }
                }
                e490Var = e490Var2;
            }
            e490Var2.c = s1.y(A);
            e490Var = e490Var2;
        }
        l8z0Var.a = e490Var;
        if (B.hasMoreElements()) {
            l8z0Var.b = ige.m(B.nextElement());
        }
        return l8z0Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        ige igeVar = this.b;
        if (igeVar != null) {
            c2Var.a(igeVar);
        }
        return new jqf(c2Var);
    }
}
