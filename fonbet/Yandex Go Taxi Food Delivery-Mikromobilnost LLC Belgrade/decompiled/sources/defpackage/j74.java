package defpackage;

/* loaded from: classes.dex */
public final class j74 extends jfz {
    public final long a;

    public j74(long j) {
        this.a = j;
    }

    @Override // defpackage.jfz
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof jfz) && this.a == ((jfz) obj).b();
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return oyr.n(this.a, "}", new StringBuilder("LogResponse{nextRequestWaitMillis="));
    }
}
