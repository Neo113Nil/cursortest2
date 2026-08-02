package xsna;

/* compiled from: IntSize.kt */
@vby
/* loaded from: classes11.dex */
public final class q9x {
    public final long a;

    public static boolean a(long j, Object obj) {
        return (obj instanceof q9x) && j == ((q9x) obj).a;
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static String c(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return a(this.a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
