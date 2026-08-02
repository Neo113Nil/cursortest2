package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class jpt0 implements Comparable {
    public final double a;

    public static String a(double d) {
        return "Speed(valueMetersPerSecond=" + d + Extension.C_BRAKE;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Double.compare(this.a, ((jpt0) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jpt0) {
            return Double.compare(this.a, ((jpt0) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
