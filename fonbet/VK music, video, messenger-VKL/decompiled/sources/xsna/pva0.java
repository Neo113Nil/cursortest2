package xsna;

/* compiled from: ErrorCommand.kt */
/* loaded from: classes2.dex */
public final class pva0 extends avp {
    public final long a;

    public pva0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pva0) && this.a == ((pva0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return vu5.a(')', this.a, new StringBuilder("PlayWithPosition(nextPosition="));
    }
}
