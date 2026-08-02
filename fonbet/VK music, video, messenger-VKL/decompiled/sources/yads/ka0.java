package yads;

import xsna.epx;
import xsna.imi0;
import xsna.ss9;

@imi0
/* loaded from: classes10.dex */
public final class ka0 {
    public static final ja0 Companion = new ja0();
    public final String a;
    public final String b;

    public /* synthetic */ ka0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            xsna.sp.x(i, 3, ia0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka0)) {
            return false;
        }
        ka0 ka0Var = (ka0) obj;
        return epx.f(this.a, ka0Var.a) && epx.f(this.b, ka0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ss9.a("DebugPanelWaterfallCurrency(name=", this.a, ", symbol=", this.b, ")");
    }
}
