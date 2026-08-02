package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class h6g0 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;

    public h6g0(double d, double d2, double d3, double d4, double d5) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6g0)) {
            return false;
        }
        h6g0 h6g0Var = (h6g0) obj;
        return Double.compare(this.a, h6g0Var.a) == 0 && Double.compare(this.b, h6g0Var.b) == 0 && Double.compare(this.c, h6g0Var.c) == 0 && Double.compare(this.d, h6g0Var.d) == 0 && Double.compare(this.e, h6g0Var.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + unr0.a(unr0.a(unr0.a(Double.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "ResolvedCutoutDp(cornerRadius=", ", height=");
        u.append(this.b);
        nzs.o(u, ", width=", this.c, ", x=");
        u.append(this.d);
        u.append(", y=");
        u.append(this.e);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
