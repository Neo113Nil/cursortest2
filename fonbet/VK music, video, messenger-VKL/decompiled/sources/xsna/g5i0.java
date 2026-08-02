package xsna;

/* compiled from: MaxSegmentsToLoadDecider.kt */
/* loaded from: classes8.dex */
public final class g5i0 {
    public int a = 1;
    public int b = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5i0)) {
            return false;
        }
        g5i0 g5i0Var = (g5i0) obj;
        return this.a == g5i0Var.a && this.b == g5i0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return efz.a(this.a, this.b, "V: ", ", A: ");
    }
}
