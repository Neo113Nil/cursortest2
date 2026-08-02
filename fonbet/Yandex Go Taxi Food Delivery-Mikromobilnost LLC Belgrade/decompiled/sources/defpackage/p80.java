package defpackage;

/* loaded from: classes10.dex */
public final class p80 {
    public final long a;
    public final long b;

    public p80(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p80)) {
            return false;
        }
        p80 p80Var = (p80) obj;
        return this.a == p80Var.a && this.b == p80Var.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
