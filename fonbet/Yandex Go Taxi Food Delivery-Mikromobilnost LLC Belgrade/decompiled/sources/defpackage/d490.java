package defpackage;

import java.util.Enumeration;

/* loaded from: classes4.dex */
public final class d490 extends o2 {
    public i3 a;

    public static d490 m(a2 a2Var) {
        if (a2Var instanceof d490) {
            return (d490) a2Var;
        }
        if (a2Var == null) {
            return null;
        }
        i3 z = i3.z(a2Var);
        d490 d490Var = new d490();
        Enumeration B = z.B();
        while (B.hasMoreElements()) {
            if (!(B.nextElement() instanceof rqf)) {
                ny61.g("attempt to insert non UTF8 STRING into PKIFreeText");
                return null;
            }
        }
        d490Var.a = z;
        return d490Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return this.a;
    }
}
