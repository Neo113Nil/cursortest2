package xsna;

/* compiled from: MusicPlayerEventSnapshot.kt */
/* loaded from: classes3.dex */
public final class nw40 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public long e;

    public nw40() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw40)) {
            return false;
        }
        nw40 nw40Var = (nw40) obj;
        return this.a == nw40Var.a && this.b == nw40Var.b && this.c == nw40Var.c && this.d == nw40Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + shy.a(this.c, bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicPlayerEventSnapshot(timelineMs=");
        sb.append(this.a);
        sb.append(", timelineFromMs=");
        sb.append(this.b);
        sb.append(", actionTrigger=");
        sb.append(this.c);
        sb.append(", actionTimestampMs=");
        return vu5.a(')', this.d, sb);
    }

    public /* synthetic */ nw40(int i) {
        this(-99, 0L, 0L, 0L);
    }

    public nw40(int i, long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = j3;
        this.e = Long.MAX_VALUE;
    }
}
