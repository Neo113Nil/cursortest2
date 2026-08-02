package xsna;

import android.graphics.Rect;

/* compiled from: Bounds.kt */
/* loaded from: classes12.dex */
public final class aa8 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new aa8(0, 0, 0, 0);
    }

    public aa8(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            throw new IllegalArgumentException(efz.a(i, i3, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i2 > i4) {
            throw new IllegalArgumentException(efz.a(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final int a() {
        return this.d - this.b;
    }

    public final int b() {
        return this.c - this.a;
    }

    public final Rect c() {
        return new Rect(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!aa8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        aa8 aa8Var = (aa8) obj;
        return this.a == aa8Var.a && this.b == aa8Var.b && this.c == aa8Var.c && this.d == aa8Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(aa8.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return h5s.c(this.d, "] }", sb);
    }

    public aa8(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
    }
}
