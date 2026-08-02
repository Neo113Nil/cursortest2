package defpackage;

import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j6s {
    public final Map a;
    public final mea0 b;
    public final e0l0 c;
    public final e0l0 d;
    public final Map e;
    public final List f;
    public final String g;
    public final l9i h;
    public final Map i;

    public j6s(Map map, mea0 mea0Var, e0l0 e0l0Var, e0l0 e0l0Var2, Map map2, List list, String str, l9i l9iVar, Map map3) {
        this.a = map;
        this.b = mea0Var;
        this.c = e0l0Var;
        this.d = e0l0Var2;
        this.e = map2;
        this.f = list;
        this.g = str;
        this.h = l9iVar;
        this.i = map3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6s)) {
            return false;
        }
        j6s j6sVar = (j6s) obj;
        return jl40.l(this.a, j6sVar.a) && jl40.l(this.b, j6sVar.b) && jl40.l(this.c, j6sVar.c) && this.d.equals(j6sVar.d) && jl40.l(this.e, j6sVar.e) && jl40.l(this.f, j6sVar.f) && jl40.l(this.g, j6sVar.g) && jl40.l(this.h, j6sVar.h) && jl40.l(this.i, j6sVar.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mea0 mea0Var = this.b;
        int d = unr0.d(unr0.c(unr0.c((hashCode + (mea0Var == null ? 0 : mea0Var.hashCode())) * 31, 31, this.c.a), 31, this.d.a), 31, this.e);
        List list = this.f;
        int hashCode2 = (d + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        l9i l9iVar = this.h;
        int hashCode4 = (hashCode3 + (l9iVar == null ? 0 : l9iVar.hashCode())) * 31;
        Map map = this.i;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FormState(stateMap=");
        sb.append(this.a);
        sb.append(", selectedPayment=");
        sb.append(this.b);
        sb.append(", route=");
        sb.append(this.c);
        sb.append(", pickupPointsRoute=");
        sb.append(this.d);
        sb.append(", contacts=");
        sb.append(this.e);
        sb.append(", costCenters=");
        sb.append(this.f);
        sb.append(", coupon=");
        sb.append(this.g);
        sb.append(", deliveryExtra=");
        sb.append(this.h);
        sb.append(", asyncTasks=");
        return b64.r(sb, this.i, Extension.C_BRAKE);
    }
}
