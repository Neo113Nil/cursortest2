package yads;

import xsna.epx;
import xsna.imi0;

@imi0
/* loaded from: classes10.dex */
public final class ha0 {
    public static final ga0 Companion = new ga0();
    public final String a;
    public final double b;

    public /* synthetic */ ha0(int i, String str, double d) {
        if (3 != (i & 3)) {
            xsna.sp.x(i, 3, fa0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = d;
    }

    public final double a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha0)) {
            return false;
        }
        ha0 ha0Var = (ha0) obj;
        return epx.f(this.a, ha0Var.a) && Double.compare(this.b, ha0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelWaterfallCpmFloor(networkAdUnitId=" + this.a + ", minCpm=" + this.b + ")";
    }
}
