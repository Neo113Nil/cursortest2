package yads;

import xsna.epx;
import xsna.imi0;
import xsna.ss9;

@imi0
/* loaded from: classes10.dex */
public final class ri2 {
    public static final qi2 Companion = new qi2();
    public final String a;
    public final String b;

    public /* synthetic */ ri2(int i, String str, String str2) {
        if (3 != (i & 3)) {
            xsna.sp.x(i, 3, pi2.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri2)) {
            return false;
        }
        ri2 ri2Var = (ri2) obj;
        return epx.f(this.a, ri2Var.a) && epx.f(this.b, ri2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ss9.a("PrefetchedMediationNetworkWinner(networkName=", this.a, ", networkAdUnit=", this.b, ")");
    }
}
