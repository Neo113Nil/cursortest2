package defpackage;

/* loaded from: classes8.dex */
public final class lwa0 {
    public final long a;

    public lwa0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == lwa0.class) {
            if (this.a == ((lwa0) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return oyr.n(this.a, " millis", new StringBuilder());
    }
}
