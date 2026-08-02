package yads;

import xsna.epx;
import xsna.imi0;
import xsna.ss9;

@imi0
/* loaded from: classes10.dex */
public final class p50 {
    public static final o50 Companion = new o50();
    public final String a;
    public final String b;

    public /* synthetic */ p50(int i, String str, String str2) {
        if (3 != (i & 3)) {
            xsna.sp.x(i, 3, n50.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p50)) {
            return false;
        }
        p50 p50Var = (p50) obj;
        return epx.f(this.a, p50Var.a) && epx.f(this.b, p50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ss9.a("DebugPanelBiddingParameter(name=", this.a, ", value=", this.b, ")");
    }
}
