package xsna;

/* compiled from: ScrollStatData.kt */
/* loaded from: classes3.dex */
public final class igh0 {
    public final long a;
    public final int b;
    public final long c;
    public final int d;

    public igh0(int i, int i2, long j, long j2) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igh0)) {
            return false;
        }
        igh0 igh0Var = (igh0) obj;
        return this.a == igh0Var.a && this.b == igh0Var.b && this.c == igh0Var.c && this.d == igh0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + bh10.a(shy.a(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollStatData(scrollTime=");
        sb.append(this.a);
        sb.append(", allFrames=");
        sb.append(this.b);
        sb.append(", freezeFrameTime=");
        sb.append(this.c);
        sb.append(", freezeFrames=");
        return vu5.b(sb, this.d, ')');
    }
}
