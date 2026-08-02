package xsna;

/* compiled from: AnalyticsTimestamp.kt */
@vby
/* loaded from: classes3.dex */
public final class my1 implements Comparable<my1> {
    public final long b;

    public /* synthetic */ my1(long j) {
        this.b = j;
    }

    public static void a(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(defpackage.k0.a(j, "Timestamp must not be less than zero: "));
        }
    }

    public static String b(long j) {
        return q9k.d("AnalyticsTimestamp(timestampMs=", j, ')');
    }

    @Override // java.lang.Comparable
    public final int compareTo(my1 my1Var) {
        return (int) (this.b - my1Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof my1) {
            return this.b == ((my1) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return b(this.b);
    }
}
