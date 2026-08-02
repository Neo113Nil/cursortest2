package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class h7l0 {
    public final double a;
    public final double b;
    public final String c;
    public final String d;

    public h7l0(double d, double d2, String str, String str2) {
        this.a = d;
        this.b = d2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7l0)) {
            return false;
        }
        h7l0 h7l0Var = (h7l0) obj;
        return Double.compare(this.a, h7l0Var.a) == 0 && Double.compare(this.b, h7l0Var.b) == 0 && jl40.l(this.c, h7l0Var.c) && jl40.l(this.d, h7l0Var.d);
    }

    public final int hashCode() {
        int a = unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "RoutePoint(latitude=", ", longitude=");
        u.append(this.b);
        u.append(", uri=");
        u.append(this.c);
        return unr0.r(u, ", comment=", this.d, Extension.C_BRAKE);
    }
}
