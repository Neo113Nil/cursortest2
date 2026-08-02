package xsna;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: Insets.java */
/* loaded from: classes.dex */
public final class h4x {
    public static final h4x e = new h4x(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    /* compiled from: Insets.java */
    /* loaded from: classes11.dex */
    public static class a {
        public static Insets a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    public h4x(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static h4x a(h4x h4xVar, h4x h4xVar2) {
        return c(Math.max(h4xVar.a, h4xVar2.a), Math.max(h4xVar.b, h4xVar2.b), Math.max(h4xVar.c, h4xVar2.c), Math.max(h4xVar.d, h4xVar2.d));
    }

    public static h4x b(h4x h4xVar, h4x h4xVar2) {
        return c(Math.min(h4xVar.a, h4xVar2.a), Math.min(h4xVar.b, h4xVar2.b), Math.min(h4xVar.c, h4xVar2.c), Math.min(h4xVar.d, h4xVar2.d));
    }

    public static h4x c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new h4x(i, i2, i3, i4);
    }

    public static h4x d(Rect rect) {
        return c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static h4x e(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return c(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h4x.class != obj.getClass()) {
            return false;
        }
        h4x h4xVar = (h4x) obj;
        return this.d == h4xVar.d && this.a == h4xVar.a && this.c == h4xVar.c && this.b == h4xVar.b;
    }

    public final Insets f() {
        return a.a(this.a, this.b, this.c, this.d);
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return vu5.b(sb, this.d, '}');
    }
}
