package yads;

import xsna.imi0;

@imi0
/* loaded from: classes10.dex */
public final class hj2 {
    public static final gj2 Companion = new gj2();
    public final double a;

    public /* synthetic */ hj2(int i, double d) {
        if (1 == (i & 1)) {
            this.a = d;
        } else {
            xsna.sp.x(i, 1, fj2.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hj2) && Double.compare(this.a, ((hj2) obj).a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.a);
    }

    public final String toString() {
        return "PrefetchedMediationRevenue(value=" + this.a + ")";
    }
}
