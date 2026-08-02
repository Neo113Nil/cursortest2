package yads;

import java.util.Map;
import xsna.epx;

/* loaded from: classes10.dex */
public final class fm3 {
    public final em3 a;
    public final df1 b;
    public final kk1 c;
    public final Map d;

    public fm3(em3 em3Var, df1 df1Var, kk1 kk1Var, Map map) {
        this.a = em3Var;
        this.b = df1Var;
        this.c = kk1Var;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm3)) {
            return false;
        }
        fm3 fm3Var = (fm3) obj;
        return epx.f(this.a, fm3Var.a) && epx.f(this.b, fm3Var.b) && epx.f(this.c, fm3Var.c) && epx.f(this.d, fm3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ViewSizeInfo(view=" + this.a + ", layoutParams=" + this.b + ", measured=" + this.c + ", additionalInfo=" + this.d + ")";
    }
}
