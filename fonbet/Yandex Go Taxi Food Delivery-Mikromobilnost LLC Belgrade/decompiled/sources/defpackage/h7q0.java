package defpackage;

/* loaded from: classes10.dex */
public final class h7q0 {
    public static final h7q0 c = new h7q0(0, 0);
    public final long a;
    public final long b;

    public h7q0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h7q0.class == obj.getClass()) {
            h7q0 h7q0Var = (h7q0) obj;
            if (this.a == h7q0Var.a && this.b == h7q0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return oyr.n(this.b, "]", sb);
    }
}
