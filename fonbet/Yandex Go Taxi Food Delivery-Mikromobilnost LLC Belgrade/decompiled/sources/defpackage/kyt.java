package defpackage;

/* loaded from: classes2.dex */
public final class kyt {
    public final double a;

    public kyt(double d) {
        this.a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kyt) && Double.compare(this.a, ((kyt) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final String toString() {
        return unr0.q(new StringBuilder("OnLinearGradient(angle="), this.a, ')');
    }
}
