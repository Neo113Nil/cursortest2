package defpackage;

/* loaded from: classes10.dex */
public final class kr90 extends tr90 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public kr90(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr90)) {
            return false;
        }
        kr90 kr90Var = (kr90) obj;
        return Float.compare(this.c, kr90Var.c) == 0 && Float.compare(this.d, kr90Var.d) == 0 && Float.compare(this.e, kr90Var.e) == 0 && Float.compare(this.f, kr90Var.f) == 0 && Float.compare(this.g, kr90Var.g) == 0 && Float.compare(this.h, kr90Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + g8e.c(this.g, g8e.c(this.f, g8e.c(this.e, g8e.c(this.d, Float.hashCode(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.c);
        sb.append(", dy1=");
        sb.append(this.d);
        sb.append(", dx2=");
        sb.append(this.e);
        sb.append(", dy2=");
        sb.append(this.f);
        sb.append(", dx3=");
        sb.append(this.g);
        sb.append(", dy3=");
        return n.n(sb, this.h, ')');
    }
}
