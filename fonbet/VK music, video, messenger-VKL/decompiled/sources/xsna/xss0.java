package xsna;

/* compiled from: VideoMediaPlaybackState.kt */
/* loaded from: classes3.dex */
public final class xss0 {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final float e;

    public xss0(long j, long j2, long j3, float f, int i) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = j3;
        this.e = f;
    }

    public final boolean a(long j) {
        return (this.a & j) == j;
    }

    public final boolean b() {
        if (this.b != 2) {
            return false;
        }
        long j = this.c;
        if (j <= 0) {
            return false;
        }
        long j2 = this.d;
        return j2 > 0 && j2 >= j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xss0)) {
            return false;
        }
        xss0 xss0Var = (xss0) obj;
        return this.a == xss0Var.a && this.b == xss0Var.b && this.c == xss0Var.c && this.d == xss0Var.d && Float.compare(this.e, xss0Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + bh10.a(bh10.a(shy.a(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMediaPlaybackState(actions=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", duration=");
        sb.append(this.c);
        sb.append(", position=");
        sb.append(this.d);
        sb.append(", speed=");
        return xq.c(')', this.e, sb);
    }
}
