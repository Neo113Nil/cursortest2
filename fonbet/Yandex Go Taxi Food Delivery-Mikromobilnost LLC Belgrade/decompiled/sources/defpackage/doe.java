package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class doe {
    public final double a;
    public final double b;

    public doe(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double a() {
        return this.a;
    }

    public final double b() {
        return this.b;
    }

    public final List c() {
        return scc.g(Double.valueOf(this.b), Double.valueOf(this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doe)) {
            return false;
        }
        doe doeVar = (doe) obj;
        return Double.compare(this.a, doeVar.a) == 0 && Double.compare(this.b, doeVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "Coordinates(latitude=", ", longitude="), this.b, Extension.C_BRAKE);
    }
}
