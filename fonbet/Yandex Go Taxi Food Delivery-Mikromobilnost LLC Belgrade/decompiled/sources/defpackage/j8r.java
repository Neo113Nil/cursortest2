package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class j8r extends b9r {
    public static final i8r Companion = new i8r();
    public final double a;
    public final Double b;
    public final Double c;

    public j8r(int i, double d, Double d2, Double d3) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, h8r.a.getDescriptor());
            throw null;
        }
        this.a = d;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8r)) {
            return false;
        }
        j8r j8rVar = (j8r) obj;
        return Double.compare(this.a, j8rVar.a) == 0 && jl40.l(this.b, j8rVar.b) && jl40.l(this.c, j8rVar.c);
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.a) * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        return hashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        return "FingerprintAltimeter(pressure=" + this.a + ", altitude=" + this.b + ", accuracy=" + this.c + Extension.C_BRAKE;
    }

    public j8r(double d, Double d2, Double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }
}
