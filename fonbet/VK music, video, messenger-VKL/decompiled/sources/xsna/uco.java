package xsna;

/* compiled from: Dp.kt */
@vby
/* loaded from: classes.dex */
public final class uco {
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String d(long j) {
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) pco.c(c(j))) + " x " + ((Object) pco.c(b(j)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uco) {
            return this.a == ((uco) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
