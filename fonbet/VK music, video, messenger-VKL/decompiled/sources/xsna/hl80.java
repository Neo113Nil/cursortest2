package xsna;

/* compiled from: OneVideoId.kt */
@vby
/* loaded from: classes7.dex */
public final class hl80 {
    public final long a;

    public static String a(long j) {
        return q9k.d("OneVideoId(value=", j, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hl80) {
            return this.a == ((hl80) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
