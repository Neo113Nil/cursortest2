package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class laf0 {
    public final List a;
    public final List b;
    public final List c;
    public final dlg0 d;
    public final rr51 e;
    public final boolean f;
    public final List g;
    public final List h;

    public laf0(List list, List list2, List list3, dlg0 dlg0Var, rr51 rr51Var, boolean z, List list4, ArrayList arrayList) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = dlg0Var;
        this.e = rr51Var;
        this.f = z;
        this.g = list4;
        this.h = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof laf0)) {
            return false;
        }
        laf0 laf0Var = (laf0) obj;
        return jl40.l(this.a, laf0Var.a) && jl40.l(this.b, laf0Var.b) && jl40.l(this.c, laf0Var.c) && jl40.l(this.d, laf0Var.d) && jl40.l(this.e, laf0Var.e) && this.f == laf0Var.f && jl40.l(this.g, laf0Var.g) && jl40.l(this.h, laf0Var.h);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        dlg0 dlg0Var = this.d;
        int hashCode2 = (hashCode + (dlg0Var == null ? 0 : dlg0Var.a.hashCode())) * 31;
        rr51 rr51Var = this.e;
        int e = unr0.e((hashCode2 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31, 31, this.f);
        List list2 = this.g;
        int hashCode3 = (e + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.h;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = qv10.v("ProductsResponseEntity(products=", this.a, ", screenItems=", this.b, ", fullScreens=");
        v.append(this.c);
        v.append(", quickActionsHeader=");
        v.append(this.d);
        v.append(", divUserInfoBlock=");
        v.append(this.e);
        v.append(", areProductsSorted=");
        v.append(this.f);
        v.append(", educationsV2=");
        return vfc.p(v, this.g, ", serverTooltips=", this.h, Extension.C_BRAKE);
    }
}
