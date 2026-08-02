package defpackage;

/* loaded from: classes4.dex */
public final class ilp0 extends jlp0 {
    public final long a;
    public final long b;

    public ilp0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilp0)) {
            return false;
        }
        ilp0 ilp0Var = (ilp0) obj;
        return this.a == ilp0Var.a && this.b == ilp0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SCT timestamp, ");
        sb.append(this.a);
        sb.append(", is greater than the log server validity, ");
        return b64.o(sb, this.b, '.');
    }
}
