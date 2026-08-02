package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class em61 {
    public static final zh61 Companion = new zh61();
    public final double a;

    public em61(int i, double d) {
        if (1 == (i & 1)) {
            this.a = d;
        } else {
            qje.Z(i, 1, p191.b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof em61) && Double.compare(this.a, ((em61) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final String toString() {
        return "PrefetchedMediationRevenue(value=" + this.a + Extension.C_BRAKE;
    }
}
