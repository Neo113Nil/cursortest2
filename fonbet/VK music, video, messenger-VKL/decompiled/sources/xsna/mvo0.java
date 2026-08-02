package xsna;

/* compiled from: TimeStampMs.kt */
@vby
/* loaded from: classes7.dex */
public final class mvo0 {
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        return q9k.d("TimeStampMs(time=", j, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mvo0) {
            return this.a == ((mvo0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
