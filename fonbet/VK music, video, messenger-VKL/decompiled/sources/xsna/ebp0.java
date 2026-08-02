package xsna;

/* compiled from: TopshelfCardConfig.kt */
/* loaded from: classes2.dex */
public final class ebp0 {
    public final float a;
    public final float b;

    public ebp0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebp0)) {
            return false;
        }
        ebp0 ebp0Var = (ebp0) obj;
        return Float.compare(this.a, ebp0Var.a) == 0 && Float.compare(this.b, ebp0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfCardScrimAlphaStop(fraction=");
        sb.append(this.a);
        sb.append(", alphaMultiplier=");
        return xq.c(')', this.b, sb);
    }
}
