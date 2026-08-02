package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class at0 {
    public final lqe a;
    public final lqe b;
    public final List c;
    public final lqe d;
    public final String e;
    public final vu0 f;
    public final String g;
    public final boolean h;
    public final int i;
    public final String j;
    public final us0 k;
    public final va31 l;

    public at0(lqe lqeVar, lqe lqeVar2, List list, lqe lqeVar3, String str, vu0 vu0Var, String str2, boolean z, int i, String str3, us0 us0Var, va31 va31Var) {
        this.a = lqeVar;
        this.b = lqeVar2;
        this.c = list;
        this.d = lqeVar3;
        this.e = str;
        this.f = vu0Var;
        this.g = str2;
        this.h = z;
        this.i = i;
        this.j = str3;
        this.k = us0Var;
        this.l = va31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at0)) {
            return false;
        }
        at0 at0Var = (at0) obj;
        return jl40.l(this.a, at0Var.a) && jl40.l(this.b, at0Var.b) && jl40.l(this.c, at0Var.c) && jl40.l(this.d, at0Var.d) && jl40.l(this.e, at0Var.e) && jl40.l(this.f, at0Var.f) && jl40.l(this.g, at0Var.g) && this.h == at0Var.h && this.i == at0Var.i && jl40.l(this.j, at0Var.j) && jl40.l(this.k, at0Var.k) && jl40.l(this.l, at0Var.l);
    }

    public final int hashCode() {
        lqe lqeVar = this.a;
        int hashCode = (lqeVar == null ? 0 : lqeVar.hashCode()) * 31;
        lqe lqeVar2 = this.b;
        int hashCode2 = (hashCode + (lqeVar2 == null ? 0 : lqeVar2.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        lqe lqeVar3 = this.d;
        int hashCode4 = (hashCode3 + (lqeVar3 == null ? 0 : lqeVar3.hashCode())) * 31;
        String str = this.e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        vu0 vu0Var = this.f;
        int hashCode6 = (hashCode5 + (vu0Var == null ? 0 : vu0Var.hashCode())) * 31;
        String str2 = this.g;
        int b = oyr.b(this.i, unr0.e((hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.h), 31);
        String str3 = this.j;
        int hashCode7 = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
        us0 us0Var = this.k;
        int hashCode8 = (hashCode7 + (us0Var == null ? 0 : us0Var.hashCode())) * 31;
        va31 va31Var = this.l;
        return hashCode8 + (va31Var != null ? va31Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressDetailsLayout(topSection=");
        sb.append(this.a);
        sb.append(", bottomSection=");
        sb.append(this.b);
        sb.append(", routePoints=");
        sb.append(this.c);
        sb.append(", stickyBottomSection=");
        sb.append(this.d);
        sb.append(", metricaLabel=");
        sb.append(this.e);
        sb.append(", addressFlow=");
        sb.append(this.f);
        sb.append(", openEventStateKey=");
        tse0.y(this.g, ", showDefaultFinishButton=", ", spacingHeight=", sb, this.h);
        smw0.t(this.i, ", spacingColor=", this.j, ", header=", sb);
        sb.append(this.k);
        sb.append(", verticalBar=");
        sb.append(this.l);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
