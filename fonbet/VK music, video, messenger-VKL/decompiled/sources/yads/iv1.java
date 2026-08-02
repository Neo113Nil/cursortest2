package yads;

import xsna.epx;
import xsna.imi0;

@imi0
/* loaded from: classes10.dex */
public final class iv1 {
    public static final hv1 Companion = new hv1();
    public final nv1 a;
    public final qv1 b;

    public /* synthetic */ iv1(int i, nv1 nv1Var, qv1 qv1Var) {
        if (3 != (i & 3)) {
            xsna.sp.x(i, 3, gv1.a.getDescriptor());
            throw null;
        }
        this.a = nv1Var;
        this.b = qv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv1)) {
            return false;
        }
        iv1 iv1Var = (iv1) obj;
        return epx.f(this.a, iv1Var.a) && epx.f(this.b, iv1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        qv1 qv1Var = this.b;
        return hashCode + (qv1Var == null ? 0 : qv1Var.hashCode());
    }

    public final String toString() {
        return "MobileAdsNetworkLog(request=" + this.a + ", response=" + this.b + ")";
    }

    public iv1(nv1 nv1Var, qv1 qv1Var) {
        this.a = nv1Var;
        this.b = qv1Var;
    }
}
