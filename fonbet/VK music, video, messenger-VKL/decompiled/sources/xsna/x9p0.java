package xsna;

import xsna.wkj;

/* compiled from: TopshelfCardConfig.kt */
/* loaded from: classes2.dex */
public final class x9p0 {
    public final dt1 a;
    public final fbp0 b;

    public x9p0(dt1 dt1Var, fbp0 fbp0Var) {
        this.a = dt1Var;
        this.b = fbp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9p0)) {
            return false;
        }
        x9p0 x9p0Var = (x9p0) obj;
        if (!epx.f(this.a, x9p0Var.a)) {
            return false;
        }
        Object obj2 = wkj.a.a;
        return obj2.equals(obj2) && this.b.equals(x9p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((wkj.a.a.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TopshelfCardBackgroundAppearance(imageAlignment=" + this.a + ", imageContentScale=" + wkj.a.a + ", scrim=" + this.b + ')';
    }
}
