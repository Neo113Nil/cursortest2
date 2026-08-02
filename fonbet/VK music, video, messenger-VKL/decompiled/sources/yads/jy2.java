package yads;

/* loaded from: classes10.dex */
public final class jy2 {
    public final long a;
    public final long b;

    public jy2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jy2.class == obj.getClass()) {
            jy2 jy2Var = (jy2) obj;
            if (this.a == jy2Var.a && this.b == jy2Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
