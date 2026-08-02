package xsna;

/* compiled from: TransformOrigin.kt */
@vby
/* loaded from: classes11.dex */
public final class lkp0 {
    public static final long b = f370.i(0.5f, 0.5f);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        return q9k.d("TransformOrigin(packedValue=", j, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lkp0) {
            return this.a == ((lkp0) obj).a;
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
