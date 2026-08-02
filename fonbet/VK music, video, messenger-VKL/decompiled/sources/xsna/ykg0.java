package xsna;

/* compiled from: RippleTheme.kt */
/* loaded from: classes11.dex */
public final class ykg0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public ykg0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykg0)) {
            return false;
        }
        ykg0 ykg0Var = (ykg0) obj;
        return this.a == ykg0Var.a && this.b == ykg0Var.b && this.c == ykg0Var.c && this.d == ykg0Var.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.a);
        sb.append(", focusedAlpha=");
        sb.append(this.b);
        sb.append(", hoveredAlpha=");
        sb.append(this.c);
        sb.append(", pressedAlpha=");
        return xq.c(')', this.d, sb);
    }
}
