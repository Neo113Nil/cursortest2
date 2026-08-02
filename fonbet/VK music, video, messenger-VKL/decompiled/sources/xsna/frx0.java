package xsna;

import android.graphics.Rect;

/* compiled from: WindowMetrics.kt */
/* loaded from: classes12.dex */
public final class frx0 {
    public final aa8 a;
    public final float b;

    public frx0(aa8 aa8Var, float f) {
        this.a = aa8Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!frx0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        frx0 frx0Var = (frx0) obj;
        return epx.f(this.a, frx0Var.a) && this.b == frx0Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append(this.a);
        sb.append(", density=");
        return xq.c(')', this.b, sb);
    }

    public frx0(float f, Rect rect) {
        this(new aa8(rect), f);
    }
}
