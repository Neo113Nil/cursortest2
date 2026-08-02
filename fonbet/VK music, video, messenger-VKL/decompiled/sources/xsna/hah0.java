package xsna;

/* compiled from: Scores.kt */
/* loaded from: classes2.dex */
public final class hah0 {
    public final double a;
    public final double b;

    public hah0() {
        this(Double.MIN_VALUE, Double.MIN_VALUE);
    }

    public final double a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return -1.7976931348623157E308d;
        }
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hah0)) {
            return false;
        }
        hah0 hah0Var = (hah0) obj;
        return this.a == hah0Var.a && this.b == hah0Var.b;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + zjh0.b(this.a, hah0.class.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Scores(geo_score=" + a(0) + ", q_score=" + a(1) + ')';
    }

    public hah0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }
}
