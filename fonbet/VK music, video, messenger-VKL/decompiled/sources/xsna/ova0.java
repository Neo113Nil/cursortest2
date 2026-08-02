package xsna;

/* compiled from: ErrorCommand.kt */
/* loaded from: classes2.dex */
public final class ova0 extends avp {
    public final long a;

    public ova0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ova0) && this.a == ((ova0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return vu5.a(')', this.a, new StringBuilder("PlayWithDelay(delay="));
    }
}
