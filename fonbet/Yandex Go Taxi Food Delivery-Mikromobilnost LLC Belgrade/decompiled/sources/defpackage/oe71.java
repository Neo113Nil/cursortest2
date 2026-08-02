package defpackage;

/* loaded from: classes7.dex */
public final class oe71 {
    public static final oe71 c = new oe71(0, 0);
    public final long a;
    public final long b;

    public oe71(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oe71.class == obj.getClass()) {
            oe71 oe71Var = (oe71) obj;
            if (this.a == oe71Var.a && this.b == oe71Var.b) {
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
