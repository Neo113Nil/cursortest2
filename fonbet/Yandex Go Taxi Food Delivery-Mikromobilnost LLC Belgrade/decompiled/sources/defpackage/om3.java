package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class om3 extends n2 {
    public xf[] a;

    public static om3 h(a3 a3Var) {
        xf xfVar;
        if (a3Var != null) {
            h3 r = h3.r(a3Var);
            om3 om3Var = new om3();
            if (r.size() >= 1) {
                om3Var.a = new xf[r.size()];
                for (int i = 0; i != r.size(); i++) {
                    xf[] xfVarArr = om3Var.a;
                    z1 s = r.s(i);
                    t2 t2Var = xf.c;
                    if (s instanceof xf) {
                        xfVar = (xf) s;
                    } else if (s != null) {
                        h3 r2 = h3.r(s);
                        xf xfVar2 = new xf();
                        xfVar2.a = null;
                        xfVar2.b = null;
                        if (r2.size() != 2) {
                            ny61.g("wrong number of elements in sequence");
                            return null;
                        }
                        xfVar2.a = t2.s(r2.s(0));
                        xfVar2.b = exs.h(r2.s(1));
                        xfVar = xfVar2;
                    } else {
                        xfVar = null;
                    }
                    xfVarArr[i] = xfVar;
                }
                return om3Var;
            }
            ny61.g("sequence may not be empty");
        }
        return null;
    }

    @Override // defpackage.z1
    public final a3 toASN1Primitive() {
        return new iqf(this.a);
    }

    public final String toString() {
        return oyr.t(new StringBuilder("AuthorityInformationAccess: Oid("), this.a[0].a.a, Extension.C_BRAKE);
    }
}
