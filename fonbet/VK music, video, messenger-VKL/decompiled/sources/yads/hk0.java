package yads;

import android.graphics.drawable.Drawable;
import xsna.epx;

/* loaded from: classes10.dex */
public final class hk0 {
    public final Drawable a;
    public final v41 b;

    public hk0(Drawable drawable, v41 v41Var) {
        this.a = drawable;
        this.b = v41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0)) {
            return false;
        }
        hk0 hk0Var = (hk0) obj;
        return epx.f(this.a, hk0Var.a) && this.b == hk0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableResponse(drawable=" + this.a + ", imageType=" + this.b + ")";
    }
}
