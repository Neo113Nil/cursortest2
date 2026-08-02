package xsna;

/* compiled from: TrimmerInternalState.kt */
/* loaded from: classes2.dex */
public final class r500 {
    public final long a;
    public final long b;
    public final bpn0 c = new bpn0(new ldl(this, 23));

    public r500(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r500)) {
            return false;
        }
        r500 r500Var = (r500) obj;
        return this.a == r500Var.a && this.b == r500Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LongRange(from=");
        sb.append(this.a);
        sb.append(", to=");
        return vu5.a(')', this.b, sb);
    }
}
