package yads;

import xsna.epx;
import xsna.imi0;

@imi0
/* loaded from: classes10.dex */
public final class ww0 {
    public static final vw0 Companion = new vw0();
    public final ex0 a;

    public /* synthetic */ ww0(int i, ex0 ex0Var) {
        if (1 == (i & 1)) {
            this.a = ex0Var;
        } else {
            xsna.sp.x(i, 1, uw0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ww0) && epx.f(this.a, ((ww0) obj).a);
    }

    public final int hashCode() {
        ex0 ex0Var = this.a;
        if (ex0Var == null) {
            return 0;
        }
        return ex0Var.hashCode();
    }

    public final String toString() {
        return "FontParameters(urls=" + this.a + ")";
    }
}
