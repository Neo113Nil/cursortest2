package defpackage;

/* loaded from: classes.dex */
public final class lz41 {
    public final float a;
    public final float b;

    public lz41(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float[] a() {
        float f = this.a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz41)) {
            return false;
        }
        lz41 lz41Var = (lz41) obj;
        return Float.compare(this.a, lz41Var.a) == 0 && Float.compare(this.b, lz41Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.a);
        sb.append(", y=");
        return n.n(sb, this.b, ')');
    }
}
