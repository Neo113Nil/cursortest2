package xsna;

/* compiled from: DraftSyncParams.kt */
/* loaded from: classes14.dex */
public final class odo implements l9i {
    public final long a;

    public odo(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof odo) && this.a == ((odo) obj).a;
    }

    @Override // xsna.l9i
    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return vu5.a(')', this.a, new StringBuilder("DraftSyncParams(userId="));
    }
}
