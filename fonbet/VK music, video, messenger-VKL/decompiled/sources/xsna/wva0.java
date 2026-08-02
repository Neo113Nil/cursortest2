package xsna;

/* compiled from: PlaybackBounds.kt */
/* loaded from: classes3.dex */
public final class wva0 {
    public final long a;
    public final long b;
    public final long c;

    public wva0() {
        this(0L, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wva0)) {
            return false;
        }
        wva0 wva0Var = (wva0) obj;
        return this.a == wva0Var.a && this.b == wva0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackBounds(startFromMs=");
        sb.append(this.a);
        sb.append(", stopAtMs=");
        return vu5.a(')', this.b, sb);
    }

    public /* synthetic */ wva0(long j, int i) {
        this((i & 1) != 0 ? 0L : j, -1L);
    }

    public wva0(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j < 0 ? 0L : j;
    }
}
