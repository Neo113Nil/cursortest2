package xsna;

/* compiled from: ULong.kt */
@vby
/* loaded from: classes8.dex */
public final class oxp0 implements Comparable<oxp0> {
    public final long b;

    public /* synthetic */ oxp0(long j) {
        this.b = j;
    }

    public static String a(long j) {
        if (j >= 0) {
            ro.d(10);
            return Long.toString(j, 10);
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        ro.d(10);
        String l = Long.toString(j3, 10);
        ro.d(10);
        return l.concat(Long.toString(j4, 10));
    }

    @Override // java.lang.Comparable
    public final int compareTo(oxp0 oxp0Var) {
        return epx.h(this.b ^ Long.MIN_VALUE, oxp0Var.b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oxp0) {
            return this.b == ((oxp0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return a(this.b);
    }
}
