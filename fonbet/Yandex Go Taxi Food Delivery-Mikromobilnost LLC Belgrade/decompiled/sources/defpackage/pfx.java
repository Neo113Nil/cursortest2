package defpackage;

/* loaded from: classes4.dex */
public final class pfx extends o2 {
    public l2 a;
    public nfx b;
    public xr1 c;
    public w2 w;

    public static pfx m(s3 s3Var, boolean z) {
        nfx nfxVar;
        a2 A;
        i3 y = i3.y(s3Var, z);
        if (y == null) {
            return null;
        }
        i3 z2 = i3.z(y);
        pfx pfxVar = new pfx();
        pfxVar.a = (l2) z2.A(0);
        a2 A2 = z2.A(1);
        if (A2 == null || (A2 instanceof nfx)) {
            nfxVar = (nfx) A2;
        } else {
            if (!(A2 instanceof i3)) {
                ny61.g("Invalid KEKIdentifier: ".concat(A2.getClass().getName()));
                return null;
            }
            i3 i3Var = (i3) A2;
            nfxVar = new nfx();
            nfxVar.a = (w2) i3Var.A(0);
            int size = i3Var.size();
            if (size != 1) {
                if (size != 2) {
                    if (size != 3) {
                        ny61.g("Invalid KEKIdentifier");
                        return null;
                    }
                    nfxVar.b = (g2) i3Var.A(1);
                    A = i3Var.A(2);
                } else if (i3Var.A(1) instanceof g2) {
                    nfxVar.b = (g2) i3Var.A(1);
                } else {
                    A = i3Var.A(1);
                }
                nfxVar.c = hr80.m(A);
            }
        }
        pfxVar.b = nfxVar;
        pfxVar.c = xr1.m(z2.A(2));
        pfxVar.w = (w2) z2.A(3);
        return pfxVar;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(4);
        c2Var.a(this.a);
        c2Var.a(this.b);
        c2Var.a(this.c);
        c2Var.a(this.w);
        return new jqf(c2Var);
    }
}
