package defpackage;

/* loaded from: classes10.dex */
public final class l92 {
    public final float a;
    public final float b;

    public l92(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l92)) {
            return false;
        }
        l92 l92Var = (l92) obj;
        return Float.compare(this.a, l92Var.a) == 0 && Float.compare(this.b, l92Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.a);
        sb.append(", velocityCoefficient=");
        return n.n(sb, this.b, ')');
    }
}
