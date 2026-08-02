package xsna;

import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: TooltipBalloonLayoutParams.kt */
/* loaded from: classes17.dex */
public final class z4p0 {
    public final l9x a;
    public final long b;
    public final LayoutDirection c;
    public final long d;
    public final long e;

    public z4p0(l9x l9xVar, long j, LayoutDirection layoutDirection, long j2, long j3) {
        this.a = l9xVar;
        this.b = j;
        this.c = layoutDirection;
        this.d = j2;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4p0)) {
            return false;
        }
        z4p0 z4p0Var = (z4p0) obj;
        return epx.f(this.a, z4p0Var.a) && q9x.b(this.b, z4p0Var.b) && this.c == z4p0Var.c && q9x.b(this.d, z4p0Var.d) && h9x.b(this.e, z4p0Var.e);
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + bh10.a((this.c.hashCode() + bh10.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        return "TooltipBalloonLayoutParams(anchorBounds=" + this.a + ", windowSize=" + ((Object) q9x.c(this.b)) + ", layoutDirection=" + this.c + ", popupContentSize=" + ((Object) q9x.c(this.d)) + ", calculatedPosition=" + ((Object) h9x.e(this.e)) + ')';
    }
}
