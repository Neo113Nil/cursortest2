package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class gf20 {
    public final String a;
    public final List b;
    public final g0k c;
    public final ofe d;
    public final q0d0 e;
    public final boolean f;

    public gf20(String str, List list, g0k g0kVar, q0d0 q0d0Var, boolean z, int i) {
        ofe ofeVar = (i & 8) != 0 ? null : ofe.e;
        q0d0Var = (i & 16) != 0 ? null : q0d0Var;
        this.a = str;
        this.b = list;
        this.c = g0kVar;
        this.d = ofeVar;
        this.e = q0d0Var;
        this.f = z;
    }

    public final boolean a(g0c g0cVar) {
        List list = this.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (qoi0.a(((dg20) it.next()).getClass()).equals(g0cVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf20)) {
            return false;
        }
        gf20 gf20Var = (gf20) obj;
        return jl40.l(this.a, gf20Var.a) && this.b.equals(gf20Var.b) && jl40.l(this.c, gf20Var.c) && jl40.l(this.d, gf20Var.d) && jl40.l(this.e, gf20Var.e) && this.f == gf20Var.f;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        ofe ofeVar = this.d;
        int hashCode2 = (hashCode + (ofeVar == null ? 0 : ofeVar.hashCode())) * 31;
        q0d0 q0d0Var = this.e;
        return Boolean.hashCode(this.f) + ((hashCode2 + (q0d0Var != null ? q0d0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder r = xvz.r("MicroWidgetLevelModel(id=", this.a, ", microWidgets=", this.b, ", displaySettings=");
        r.append(this.c);
        r.append(", contentDescription=");
        r.append(this.d);
        r.append(", action=");
        r.append(this.e);
        r.append(", isTablet=");
        r.append(this.f);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
