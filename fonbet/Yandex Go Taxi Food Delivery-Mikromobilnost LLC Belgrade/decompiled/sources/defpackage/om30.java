package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class om30 {
    public final double a;
    public final double b;
    public final bl00 c;
    public final bl00 d;

    public om30(double d, double d2, bl00 bl00Var, bl00 bl00Var2) {
        this.a = d;
        this.b = d2;
        this.c = bl00Var;
        this.d = bl00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om30)) {
            return false;
        }
        om30 om30Var = (om30) obj;
        return Double.compare(this.a, om30Var.a) == 0 && Double.compare(this.b, om30Var.b) == 0 && jl40.l(this.c, om30Var.c) && jl40.l(this.d, om30Var.d);
    }

    public final int hashCode() {
        int a = unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
        bl00 bl00Var = this.c;
        int hashCode = (a + (bl00Var == null ? 0 : bl00Var.hashCode())) * 31;
        bl00 bl00Var2 = this.d;
        return hashCode + (bl00Var2 != null ? bl00Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "MtHubRoutePin(lat=", ", lon=");
        u.append(this.b);
        u.append(", pinImage=");
        u.append(this.c);
        u.append(", bulletImage=");
        u.append(this.d);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
