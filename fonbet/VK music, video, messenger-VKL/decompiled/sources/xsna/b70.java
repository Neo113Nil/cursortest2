package xsna;

/* compiled from: ActionWithOfflineSupport.kt */
@vby
/* loaded from: classes4.dex */
public final class b70 {
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static int b(long j) {
        return Long.hashCode(j);
    }

    public static String c(long j) {
        return q9k.d("ActionWithOfflineSupportId(value=", j, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b70) {
            return this.a == ((b70) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
