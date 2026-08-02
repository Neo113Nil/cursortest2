package yads;

import android.graphics.drawable.Drawable;
import xsna.epx;

/* loaded from: classes10.dex */
public final class vj0 {
    public final Drawable a;
    public final v41 b;

    public vj0(Drawable drawable, v41 v41Var) {
        this.a = drawable;
        this.b = v41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj0)) {
            return false;
        }
        vj0 vj0Var = (vj0) obj;
        return epx.f(this.a, vj0Var.a) && this.b == vj0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CachedDrawable(drawable=" + this.a + ", imageType=" + this.b + ")";
    }
}
