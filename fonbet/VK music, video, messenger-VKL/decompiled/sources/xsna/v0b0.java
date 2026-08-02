package xsna;

/* compiled from: PlayerDebugInfo.kt */
/* loaded from: classes5.dex */
public final class v0b0 {
    public final long a;
    public final long b;
    public final long c;
    public final String d;

    public v0b0(long j, long j2, long j3, String str) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0b0)) {
            return false;
        }
        v0b0 v0b0Var = (v0b0) obj;
        return this.a == v0b0Var.a && this.b == v0b0Var.b && this.c == v0b0Var.c && epx.f(this.d, v0b0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerDebugInfo(bufferMs=");
        sb.append(this.a);
        sb.append(", positionMs=");
        sb.append(this.b);
        sb.append(", durationMs=");
        sb.append(this.c);
        sb.append(", playerState=");
        return ho8.a(sb, this.d, ')');
    }
}
