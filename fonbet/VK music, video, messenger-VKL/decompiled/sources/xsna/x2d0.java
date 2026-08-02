package xsna;

/* compiled from: Pressure.kt */
/* loaded from: classes12.dex */
public final class x2d0 implements Comparable<x2d0> {
    public static final a c = new a();
    public final double b;

    /* compiled from: Pressure.kt */
    public static final class a {
    }

    public x2d0(double d) {
        this.b = d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(x2d0 x2d0Var) {
        return Double.compare(this.b, x2d0Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x2d0) {
            return this.b == ((x2d0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.b);
    }

    public final String toString() {
        return this.b + " mmHg";
    }
}
