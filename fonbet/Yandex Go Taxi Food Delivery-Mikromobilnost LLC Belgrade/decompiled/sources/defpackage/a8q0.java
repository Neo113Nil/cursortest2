package defpackage;

/* loaded from: classes10.dex */
public final class a8q0 {
    public final long a;
    public final long b;

    public a8q0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a8q0.class == obj.getClass()) {
            a8q0 a8q0Var = (a8q0) obj;
            if (this.a == a8q0Var.a && this.b == a8q0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
