package yads;

import android.content.Context;
import xsna.epx;

/* loaded from: classes10.dex */
public final class if1 implements ag0 {
    public final v9 a;

    public if1(v9 v9Var) {
        this.a = v9Var;
    }

    @Override // yads.ag0
    public final boolean a(Context context) {
        eg0[] eg0VarArr = eg0.b;
        return "lightBundle".equals(this.a.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof if1) && epx.f(this.a, ((if1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LightBundleDesignConstraint(adResponse=" + this.a + ")";
    }
}
