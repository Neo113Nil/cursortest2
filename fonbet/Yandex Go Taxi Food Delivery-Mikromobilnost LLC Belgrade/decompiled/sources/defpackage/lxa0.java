package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lxa0 {
    public final String a;
    public final List b;
    public final List c;
    public final ixa0 d;

    public lxa0(String str, List list, List list2, ixa0 ixa0Var) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = ixa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxa0)) {
            return false;
        }
        lxa0 lxa0Var = (lxa0) obj;
        return this.a.equals(lxa0Var.a) && jl40.l(this.b, lxa0Var.b) && jl40.l(this.c, lxa0Var.c) && jl40.l(this.d, lxa0Var.d);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        ixa0 ixa0Var = this.d;
        return hashCode + (ixa0Var != null ? ixa0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = xvz.r("PerformerRouteParams(deliveryRef=", oyr.p("DeliveryRef(asString=", this.a, Extension.C_BRAKE), ", deliveryPoints=", this.b, ", performerPathPoints=");
        r.append(this.c);
        r.append(", performerPosition=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
