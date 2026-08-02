package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class j97 extends o2 {
    public i3 a;

    public static j97 n(o2 o2Var) {
        if (o2Var instanceof j97) {
            return (j97) o2Var;
        }
        if (o2Var == null) {
            return null;
        }
        i3 z = i3.z(o2Var);
        j97 j97Var = new j97();
        j97Var.a = z;
        return j97Var;
    }

    public final g2k[] m() {
        g2k g2kVar;
        i3 i3Var = this.a;
        g2k[] g2kVarArr = new g2k[i3Var.size()];
        for (int i = 0; i != i3Var.size(); i++) {
            a2 A = i3Var.A(i);
            if (A == null || (A instanceof g2k)) {
                g2kVar = (g2k) A;
            } else {
                if (!(A instanceof i3)) {
                    ny61.g("Invalid DistributionPoint: ".concat(A.getClass().getName()));
                    return null;
                }
                i3 i3Var2 = (i3) A;
                g2kVar = new g2k();
                for (int i2 = 0; i2 != i3Var2.size(); i2++) {
                    s3 A2 = s3.A(i3Var2.A(i2));
                    int i3 = A2.c;
                    if (i3 == 0) {
                        g2kVar.a = h2k.n(A2);
                    } else if (i3 == 1) {
                        g2kVar.b = new c490((s1) s1.b.Hg(A2, false));
                    } else {
                        if (i3 != 2) {
                            ny61.e(A2.c, "Unknown tag encountered in structure: ");
                            return null;
                        }
                        g2kVar.c = new gxs((i3) i3.b.Hg(A2, false));
                    }
                }
            }
            g2kVarArr[i] = g2kVar;
        }
        return g2kVarArr;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return this.a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("CRLDistPoint:");
        String str = quu0.a;
        stringBuffer.append(str);
        g2k[] m = m();
        for (int i = 0; i != m.length; i++) {
            stringBuffer.append(Extension.TAB_CHAR);
            stringBuffer.append(m[i]);
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }
}
