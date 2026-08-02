package yads;

import android.graphics.RectF;
import xsna.epx;

/* loaded from: classes10.dex */
public final class cq0 {
    public final int a;
    public final RectF b;

    public cq0(int i, RectF rectF) {
        this.a = i;
        this.b = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq0)) {
            return false;
        }
        cq0 cq0Var = (cq0) obj;
        return this.a == cq0Var.a && epx.f(this.b, cq0Var.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        RectF rectF = this.b;
        return hashCode + (rectF == null ? 0 : rectF.hashCode());
    }

    public final String toString() {
        return "Exposure(exposedPercentage=" + this.a + ", visibleRectangle=" + this.b + ")";
    }
}
