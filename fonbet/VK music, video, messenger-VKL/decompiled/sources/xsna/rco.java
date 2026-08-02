package xsna;

/* compiled from: Dp.kt */
@vby
/* loaded from: classes11.dex */
public final class rco {
    public final long a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long c(long j, long j2) {
        float a = a(j) - a(j2);
        float b = b(j) - b(j2);
        return (Float.floatToRawIntBits(a) << 32) | (4294967295L & Float.floatToRawIntBits(b));
    }

    public static String d(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) pco.c(a(j))) + ", " + ((Object) pco.c(b(j))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rco) {
            return this.a == ((rco) obj).a;
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
