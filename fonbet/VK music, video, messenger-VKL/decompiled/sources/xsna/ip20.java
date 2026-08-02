package xsna;

/* compiled from: MiniAppID.kt */
@vby
/* loaded from: classes6.dex */
public final class ip20 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof ip20) {
            return this.a == ((ip20) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return q9k.d("MiniAppID(id=", this.a, ')');
    }
}
