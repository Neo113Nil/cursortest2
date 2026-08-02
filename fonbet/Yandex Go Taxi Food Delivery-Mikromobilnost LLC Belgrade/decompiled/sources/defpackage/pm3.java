package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class pm3 extends o2 {
    public yf[] a;

    public static pm3 m(o2 o2Var) {
        yf yfVar;
        if (o2Var instanceof pm3) {
            return (pm3) o2Var;
        }
        i3 z = i3.z(o2Var);
        pm3 pm3Var = new pm3();
        if (z.size() < 1) {
            ny61.g("sequence may not be empty");
            return null;
        }
        pm3Var.a = new yf[z.size()];
        for (int i = 0; i != z.size(); i++) {
            yf[] yfVarArr = pm3Var.a;
            a2 A = z.A(i);
            u2 u2Var = yf.c;
            if (A instanceof yf) {
                yfVar = (yf) A;
            } else if (A != null) {
                i3 z2 = i3.z(A);
                yf yfVar2 = new yf();
                yfVar2.a = null;
                yfVar2.b = null;
                if (z2.size() != 2) {
                    ny61.g("wrong number of elements in sequence");
                    return null;
                }
                yfVar2.a = u2.A(z2.A(0));
                yfVar2.b = fxs.m(z2.A(1));
                yfVar = yfVar2;
            } else {
                yfVar = null;
            }
            yfVarArr[i] = yfVar;
        }
        return pm3Var;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return new jqf(this.a);
    }

    public final String toString() {
        return oyr.t(new StringBuilder("AuthorityInformationAccess: Oid("), this.a[0].a.a, Extension.C_BRAKE);
    }
}
