package xsna;

/* compiled from: TextUnit.kt */
@vby
/* loaded from: classes11.dex */
public final class fno0 {
    public static final gno0[] b = {new gno0(0), new gno0(4294967296L), new gno0(8589934592L)};
    public static final long c = l2l0.n(Float.NaN, 0);
    public final long a;

    public /* synthetic */ fno0(long j) {
        this.a = j;
    }

    public static final /* synthetic */ fno0 a(long j) {
        return new fno0(j);
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static final long c(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float d(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final boolean e(long j) {
        return (j & 1095216660480L) == 4294967296L;
    }

    public static String f(long j) {
        long c2 = c(j);
        if (gno0.a(c2, 0L)) {
            return "Unspecified";
        }
        if (gno0.a(c2, 4294967296L)) {
            return d(j) + ".sp";
        }
        if (!gno0.a(c2, 8589934592L)) {
            return "Invalid";
        }
        return d(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fno0) {
            return this.a == ((fno0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return f(this.a);
    }
}
