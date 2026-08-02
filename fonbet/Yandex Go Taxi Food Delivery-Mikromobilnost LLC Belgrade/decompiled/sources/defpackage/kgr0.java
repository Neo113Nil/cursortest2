package defpackage;

/* loaded from: classes.dex */
public final class kgr0 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public kgr0(float f, float f2, float f3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgr0)) {
            return false;
        }
        kgr0 kgr0Var = (kgr0) obj;
        return Float.compare(this.a, kgr0Var.a) == 0 && Float.compare(this.b, kgr0Var.b) == 0 && Float.compare(this.c, kgr0Var.c) == 0 && this.d == kgr0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowData(offsetX=");
        sb.append(this.a);
        sb.append(", offsetY=");
        sb.append(this.b);
        sb.append(", radius=");
        sb.append(this.c);
        sb.append(", color=");
        return oyr.s(sb, this.d, ')');
    }
}
