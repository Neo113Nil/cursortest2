package yads;

import android.content.Context;
import xsna.epx;

/* loaded from: classes10.dex */
public final class ki0 implements ag0 {
    public final v9 a;

    public ki0(v9 v9Var) {
        this.a = v9Var;
    }

    @Override // yads.ag0
    public final boolean a(Context context) {
        String str = this.a.k;
        eg0[] eg0VarArr = eg0.b;
        return "divkit".equals(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki0) && epx.f(this.a, ((ki0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DivKitDesignConstraint(adResponse=" + this.a + ")";
    }
}
