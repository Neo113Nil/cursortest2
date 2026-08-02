package yads;

import xsna.epx;
import xsna.imi0;
import xsna.ss9;

@imi0
/* loaded from: classes10.dex */
public final class na0 {
    public static final ma0 Companion = new ma0();
    public final String a;
    public final String b;

    public /* synthetic */ na0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            xsna.sp.x(i, 3, la0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na0)) {
            return false;
        }
        na0 na0Var = (na0) obj;
        return epx.f(this.a, na0Var.a) && epx.f(this.b, na0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ss9.a("DebugPanelWaterfallParameter(name=", this.a, ", value=", this.b, ")");
    }
}
