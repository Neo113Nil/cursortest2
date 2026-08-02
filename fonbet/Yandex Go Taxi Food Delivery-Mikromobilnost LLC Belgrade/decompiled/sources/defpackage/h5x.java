package defpackage;

/* loaded from: classes9.dex */
public final class h5x implements j5x {
    public final double a;

    public h5x(double d) {
        this.a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5x) && Double.compare(this.a, ((h5x) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final String toString() {
        return unr0.q(new StringBuilder("JasonFloat64(content="), this.a, ')');
    }
}
