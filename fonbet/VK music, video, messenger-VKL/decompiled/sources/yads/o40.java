package yads;

import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class o40 implements p40 {
    public final ka0 a;
    public final List b;

    public o40(ka0 ka0Var, List list) {
        this.a = ka0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o40)) {
            return false;
        }
        o40 o40Var = (o40) obj;
        return epx.f(this.a, o40Var.a) && epx.f(this.b, o40Var.b);
    }

    public final int hashCode() {
        ka0 ka0Var = this.a;
        return this.b.hashCode() + ((ka0Var == null ? 0 : ka0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Waterfall(currency=" + this.a + ", cpmFloors=" + this.b + ")";
    }
}
