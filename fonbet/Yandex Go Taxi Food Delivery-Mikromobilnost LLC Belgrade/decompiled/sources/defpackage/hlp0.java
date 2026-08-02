package defpackage;

/* loaded from: classes4.dex */
public final class hlp0 extends jlp0 {
    public final long a;
    public final long b;

    public hlp0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlp0)) {
            return false;
        }
        hlp0 hlp0Var = (hlp0) obj;
        return this.a == hlp0Var.a && this.b == hlp0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SCT timestamp, ");
        sb.append(this.a);
        sb.append(", is in the future, current timestamp is ");
        return b64.o(sb, this.b, '.');
    }
}
