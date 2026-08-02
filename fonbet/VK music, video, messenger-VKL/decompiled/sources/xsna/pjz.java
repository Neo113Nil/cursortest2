package xsna;

/* compiled from: LiveLatencyInfo.kt */
/* loaded from: classes8.dex */
public final class pjz {
    public final Long a;
    public final long b;

    public pjz(Long l, long j) {
        this.a = l;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjz)) {
            return false;
        }
        pjz pjzVar = (pjz) obj;
        return epx.f(this.a, pjzVar.a) && this.b == pjzVar.b;
    }

    public final int hashCode() {
        Long l = this.a;
        return Long.hashCode(this.b) + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "LiveLatencyInfo(liveOffsetMs=" + this.a + ", liveBufferMs=" + this.b + ")";
    }
}
