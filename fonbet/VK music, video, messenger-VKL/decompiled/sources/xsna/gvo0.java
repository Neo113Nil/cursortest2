package xsna;

/* compiled from: TimeRecord.kt */
/* loaded from: classes17.dex */
public final class gvo0 {
    public final long a;
    public final long b;

    public gvo0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvo0)) {
            return false;
        }
        gvo0 gvo0Var = (gvo0) obj;
        return this.a == gvo0Var.a && this.b == gvo0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(gvo0.class.getSimpleName());
        sb.append("(duration=");
        long j = this.b;
        long j2 = this.a;
        sb.append((j - j2) / 1000.0f);
        sb.append(" start=");
        sb.append(j2);
        sb.append(" end=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }
}
