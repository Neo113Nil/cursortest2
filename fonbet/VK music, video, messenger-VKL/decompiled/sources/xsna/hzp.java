package xsna;

/* compiled from: EventHubApiParams.kt */
/* loaded from: classes3.dex */
public final class hzp implements l9i {
    public final long a;
    public final long b;

    public hzp(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzp)) {
            return false;
        }
        hzp hzpVar = (hzp) obj;
        return this.a == hzpVar.a && this.b == hzpVar.b;
    }

    @Override // xsna.l9i
    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventHubApiParams(requestTimeoutMs=");
        sb.append(this.a);
        sb.append(", reconnectTimeoutMs=");
        return vu5.a(')', this.b, sb);
    }
}
