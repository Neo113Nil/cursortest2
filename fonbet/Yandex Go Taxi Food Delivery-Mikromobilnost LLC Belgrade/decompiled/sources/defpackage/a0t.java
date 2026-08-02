package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class a0t {
    public final double a;
    public final double b;
    public final double c;

    public a0t(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0t)) {
            return false;
        }
        a0t a0tVar = (a0t) obj;
        return Double.compare(this.a, a0tVar.a) == 0 && Double.compare(this.b, a0tVar.b) == 0 && Double.compare(this.c, a0tVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "GeoPointModel(latitude=", ", longitude=");
        u.append(this.b);
        u.append(", accuracy=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
