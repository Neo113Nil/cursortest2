package xsna;

/* compiled from: Percentage.kt */
/* loaded from: classes12.dex */
public final class uv90 implements Comparable<uv90> {
    public final double b;

    public uv90(double d) {
        this.b = d;
    }

    @Override // java.lang.Comparable
    public final int compareTo(uv90 uv90Var) {
        return Double.compare(this.b, uv90Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uv90) {
            return this.b == ((uv90) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.b);
    }

    public final String toString() {
        return ojp0.a(new StringBuilder(), this.b, '%');
    }
}
