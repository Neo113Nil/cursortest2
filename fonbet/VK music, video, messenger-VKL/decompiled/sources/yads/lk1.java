package yads;

/* loaded from: classes10.dex */
public final class lk1 {
    public final int a;
    public final mk1 b;

    public lk1(int i, mk1 mk1Var) {
        this.a = i;
        this.b = mk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk1)) {
            return false;
        }
        lk1 lk1Var = (lk1) obj;
        return this.a == lk1Var.a && this.b == lk1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MeasuredSizeSpec(value=" + this.a + ", mode=" + this.b + ")";
    }
}
