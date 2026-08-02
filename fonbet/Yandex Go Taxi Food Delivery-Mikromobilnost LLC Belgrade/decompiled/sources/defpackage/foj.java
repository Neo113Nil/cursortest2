package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.state.CouponSize;

/* loaded from: classes5.dex */
public final class foj {
    public final wsy0 a;
    public final wsy0 b;
    public final wsy0 c;
    public final ky d;
    public final v4v e;
    public final wsy0 f;
    public final w3b1 g;
    public final CouponSize h;
    public final boolean i;
    public final hoj j;
    public final String k;
    public final Object l;

    public foj(wsy0 wsy0Var, wsy0 wsy0Var2, wsy0 wsy0Var3, ky kyVar, ra90 ra90Var, wsy0 wsy0Var4, w3b1 w3b1Var, CouponSize couponSize, boolean z, hoj hojVar, String str, Object obj) {
        this.a = wsy0Var;
        this.b = wsy0Var2;
        this.c = wsy0Var3;
        this.d = kyVar;
        this.e = ra90Var;
        this.f = wsy0Var4;
        this.g = w3b1Var;
        this.h = couponSize;
        this.i = z;
        this.j = hojVar;
        this.k = str;
        this.l = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof foj)) {
            return false;
        }
        foj fojVar = (foj) obj;
        return jl40.l(this.a, fojVar.a) && jl40.l(this.b, fojVar.b) && jl40.l(this.c, fojVar.c) && jl40.l(this.d, fojVar.d) && jl40.l(this.e, fojVar.e) && jl40.l(this.f, fojVar.f) && jl40.l(this.g, fojVar.g) && this.h == fojVar.h && this.i == fojVar.i && jl40.l(this.j, fojVar.j) && jl40.l(this.k, fojVar.k) && jl40.l(this.l, fojVar.l);
    }

    public final int hashCode() {
        wsy0 wsy0Var = this.a;
        int hashCode = (wsy0Var == null ? 0 : wsy0Var.hashCode()) * 31;
        wsy0 wsy0Var2 = this.b;
        int hashCode2 = (hashCode + (wsy0Var2 == null ? 0 : wsy0Var2.hashCode())) * 31;
        wsy0 wsy0Var3 = this.c;
        int hashCode3 = (hashCode2 + (wsy0Var3 == null ? 0 : wsy0Var3.hashCode())) * 31;
        ky kyVar = this.d;
        int hashCode4 = (hashCode3 + (kyVar == null ? 0 : kyVar.hashCode())) * 31;
        v4v v4vVar = this.e;
        int hashCode5 = (hashCode4 + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31;
        wsy0 wsy0Var4 = this.f;
        int hashCode6 = (hashCode5 + (wsy0Var4 == null ? 0 : wsy0Var4.hashCode())) * 31;
        w3b1 w3b1Var = this.g;
        int e = unr0.e((this.h.hashCode() + ((hashCode6 + (w3b1Var == null ? 0 : w3b1Var.hashCode())) * 31)) * 31, 31, this.i);
        hoj hojVar = this.j;
        int hashCode7 = (e + (hojVar == null ? 0 : hojVar.hashCode())) * 31;
        String str = this.k;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.l;
        return hashCode8 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscountCouponState(title=");
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
        sb.append(", backgroundState=");
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
