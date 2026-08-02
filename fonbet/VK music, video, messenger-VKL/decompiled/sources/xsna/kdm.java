package xsna;

/* compiled from: DialogFlags.kt */
@vby
/* loaded from: classes2.dex */
public final class kdm {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof kdm) {
            return this.a == ((kdm) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return q9k.d("DialogFlags(flags=", this.a, ')');
    }
}
