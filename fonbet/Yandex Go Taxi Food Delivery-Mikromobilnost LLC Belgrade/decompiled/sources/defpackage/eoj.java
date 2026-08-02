package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.state.CouponSize;

/* loaded from: classes5.dex */
public final class eoj {
    public final rry0 a;
    public final rry0 b;
    public final rry0 c;
    public final hhg d;
    public final w4v e;
    public final rry0 f;
    public final u3b1 g;
    public final CouponSize h;
    public final boolean i;
    public final goj j;
    public final String k;
    public final Object l;

    public eoj(rry0 rry0Var, rry0 rry0Var2, rry0 rry0Var3, hhg hhgVar, w4v w4vVar, rry0 rry0Var4, u3b1 u3b1Var, CouponSize couponSize, boolean z, goj gojVar, String str, Object obj) {
        this.a = rry0Var;
        this.b = rry0Var2;
        this.c = rry0Var3;
        this.d = hhgVar;
        this.e = w4vVar;
        this.f = rry0Var4;
        this.g = u3b1Var;
        this.h = couponSize;
        this.i = z;
        this.j = gojVar;
        this.k = str;
        this.l = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoj)) {
            return false;
        }
        eoj eojVar = (eoj) obj;
        return jl40.l(this.a, eojVar.a) && jl40.l(this.b, eojVar.b) && jl40.l(this.c, eojVar.c) && jl40.l(this.d, eojVar.d) && jl40.l(this.e, eojVar.e) && jl40.l(this.f, eojVar.f) && jl40.l(this.g, eojVar.g) && this.h == eojVar.h && this.i == eojVar.i && jl40.l(this.j, eojVar.j) && jl40.l(this.k, eojVar.k) && jl40.l(this.l, eojVar.l);
    }

    public final int hashCode() {
        rry0 rry0Var = this.a;
        int hashCode = (rry0Var == null ? 0 : rry0Var.hashCode()) * 31;
        rry0 rry0Var2 = this.b;
        int hashCode2 = (hashCode + (rry0Var2 == null ? 0 : rry0Var2.hashCode())) * 31;
        rry0 rry0Var3 = this.c;
        int hashCode3 = (hashCode2 + (rry0Var3 == null ? 0 : rry0Var3.hashCode())) * 31;
        hhg hhgVar = this.d;
        int hashCode4 = (hashCode3 + (hhgVar == null ? 0 : hhgVar.hashCode())) * 31;
        w4v w4vVar = this.e;
        int hashCode5 = (hashCode4 + (w4vVar == null ? 0 : w4vVar.hashCode())) * 31;
        rry0 rry0Var4 = this.f;
        int hashCode6 = (hashCode5 + (rry0Var4 == null ? 0 : rry0Var4.hashCode())) * 31;
        u3b1 u3b1Var = this.g;
        int e = unr0.e((this.h.hashCode() + ((hashCode6 + (u3b1Var == null ? 0 : u3b1Var.hashCode())) * 31)) * 31, 31, this.i);
        goj gojVar = this.j;
        int hashCode7 = (e + (gojVar == null ? 0 : gojVar.hashCode())) * 31;
        String str = this.k;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.l;
        return hashCode8 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscountCouponModel(title=");
        sb.append(this.a);
        sb.append(", discount=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", action=");
        sb.append(this.d);
        sb.append(", icon=");
        sb.append(this.e);
        sb.append(", bottomText=");
        sb.append(this.f);
        sb.append(", backgroundModel=");
        sb.append(this.g);
        sb.append(", couponSize=");
        sb.append(this.h);
        sb.append(", showWhenSectionCollapsed=");
        sb.append(this.i);
        sb.append(", trailItem=");
        sb.append(this.j);
        sb.append(", metricaLabel=");
        return tse0.l(sb, this.k, ", meta=", this.l, Extension.C_BRAKE);
    }
}
