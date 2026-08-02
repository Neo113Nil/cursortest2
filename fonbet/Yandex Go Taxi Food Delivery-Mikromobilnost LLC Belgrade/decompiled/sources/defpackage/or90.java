package defpackage;

/* loaded from: classes10.dex */
public final class or90 extends tr90 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public or90(float f, float f2, float f3, float f4) {
        super(1);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or90)) {
            return false;
        }
        or90 or90Var = (or90) obj;
        return Float.compare(this.c, or90Var.c) == 0 && Float.compare(this.d, or90Var.d) == 0 && Float.compare(this.e, or90Var.e) == 0 && Float.compare(this.f, or90Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + g8e.c(this.e, g8e.c(this.d, Float.hashCode(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        return n.n(sb, this.f, ')');
    }
}
