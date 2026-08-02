package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j7l0 {
    public final sbv a;
    public final lts0 b;
    public final lts0 c;
    public final jts0 d;
    public final String e;
    public final List f;
    public final List g;
    public final lqe h;
    public final vu0 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public j7l0(sbv sbvVar, lts0 lts0Var, lts0 lts0Var2, jts0 jts0Var, String str, List list, List list2, lqe lqeVar, vu0 vu0Var, boolean z, boolean z2, boolean z3) {
        this.a = sbvVar;
        this.b = lts0Var;
        this.c = lts0Var2;
        this.d = jts0Var;
        this.e = str;
        this.f = list;
        this.g = list2;
        this.h = lqeVar;
        this.i = vu0Var;
        this.j = z;
        this.k = z2;
        this.l = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7l0)) {
            return false;
        }
        j7l0 j7l0Var = (j7l0) obj;
        return this.a.equals(j7l0Var.a) && jl40.l(this.b, j7l0Var.b) && jl40.l(this.c, j7l0Var.c) && jl40.l(this.d, j7l0Var.d) && jl40.l(this.e, j7l0Var.e) && jl40.l(this.f, j7l0Var.f) && this.g.equals(j7l0Var.g) && jl40.l(this.h, j7l0Var.h) && jl40.l(this.i, j7l0Var.i) && this.j == j7l0Var.j && this.k == j7l0Var.k && this.l == j7l0Var.l;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        lts0 lts0Var = this.b;
        int hashCode2 = (hashCode + (lts0Var == null ? 0 : lts0Var.hashCode())) * 31;
        lts0 lts0Var2 = this.c;
        int hashCode3 = (hashCode2 + (lts0Var2 == null ? 0 : lts0Var2.hashCode())) * 31;
        jts0 jts0Var = this.d;
        int b = unr0.b((hashCode3 + (jts0Var == null ? 0 : jts0Var.a.hashCode())) * 31, 31, this.e);
        List list = this.f;
        int c = unr0.c((b + (list == null ? 0 : list.hashCode())) * 31, 31, this.g);
        lqe lqeVar = this.h;
        int hashCode4 = (c + (lqeVar == null ? 0 : lqeVar.hashCode())) * 31;
        vu0 vu0Var = this.i;
        return Boolean.hashCode(this.l) + unr0.e(unr0.e((hashCode4 + (vu0Var != null ? vu0Var.hashCode() : 0)) * 31, 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoutePointDescription(icon=");
        sb.append(this.a);
        sb.append(", selectedLead=");
        sb.append(this.b);
        sb.append(", unselectedLead=");
        sb.append(this.c);
        sb.append(", mapPin=");
        sb.append(this.d);
        sb.append(", additionalTitle=");
        tse0.x(this.e, ", bubbles=", ", hiddenFields=", sb, this.f);
        sb.append(this.g);
        sb.append(", section=");
        sb.append(this.h);
        sb.append(", addressFlow=");
        sb.append(this.i);
        sb.append(", showDeleteButton=");
        sb.append(this.j);
        sb.append(", closeDetailsAfterAddressSelection=");
        return smw0.k(", showMiniMap=", Extension.C_BRAKE, sb, this.k, this.l);
    }
}
