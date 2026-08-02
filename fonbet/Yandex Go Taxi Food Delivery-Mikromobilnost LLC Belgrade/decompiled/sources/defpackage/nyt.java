package defpackage;

/* loaded from: classes2.dex */
public final class nyt {
    public final double a;
    public final double b;

    public nyt(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyt)) {
            return false;
        }
        nyt nytVar = (nyt) obj;
        return Double.compare(this.a, nytVar.a) == 0 && Double.compare(this.b, nytVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeRadius(x=");
        sb.append(this.a);
        sb.append(", y=");
        return unr0.q(sb, this.b, ')');
    }
}
