package defpackage;

import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.plus.badge.CashbackBadgeStyle;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class elx0 {
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final boolean F;
    public final CashbackBadgeStyle G;
    public final CashbackBadgeStyle H;
    public final kdc I;
    public final boolean J;
    public final Float K;
    public final oeq0 L;
    public final boolean M;
    public final boolean N;
    public final String O;
    public final t0f0 P;
    public final String Q;
    public final String R;
    public final boolean S;
    public final CashbackBadgeStyle T;
    public final boolean U;
    public final boolean V;
    public final String a;
    public final String b;
    public final wu1 c;
    public final sgx0 d;
    public final List e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;
    public final TariffOrderFlow j;
    public final boolean k;
    public final nco l;
    public final String m;
    public final t0f0 n;
    public final t0f0 o;
    public final t0f0 p;
    public final String q;
    public final String r;
    public final mr31 s;
    public final Map t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final String z;

    public elx0(String str, String str2, wu1 wu1Var, sgx0 sgx0Var, List list, String str3, boolean z, String str4, String str5, TariffOrderFlow tariffOrderFlow, boolean z2, nco ncoVar, String str6, t0f0 t0f0Var, t0f0 t0f0Var2, t0f0 t0f0Var3, String str7, String str8, mr31 mr31Var, Map map, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str9, String str10, String str11, String str12, String str13, String str14, boolean z8, CashbackBadgeStyle cashbackBadgeStyle, CashbackBadgeStyle cashbackBadgeStyle2, kdc kdcVar, boolean z9, Float f, oeq0 oeq0Var, boolean z10) {
        this.a = str;
        this.b = str2;
        this.c = wu1Var;
        this.d = sgx0Var;
        this.e = list;
        this.f = str3;
        this.g = z;
        String str15 = str4;
        this.h = str15;
        this.i = str5;
        this.j = tariffOrderFlow;
        this.k = z2;
        this.l = ncoVar;
        this.m = str6;
        t0f0 t0f0Var4 = t0f0Var;
        this.n = t0f0Var4;
        this.o = t0f0Var2;
        this.p = t0f0Var3;
        this.q = str7;
        this.r = str8;
        this.s = mr31Var;
        this.t = map;
        this.u = z3;
        this.v = z4;
        this.w = z5;
        this.x = z6;
        this.y = z7;
        this.z = str9;
        String str16 = str10;
        this.A = str16;
        this.B = str11;
        this.C = str12;
        this.D = str13;
        this.E = str14;
        this.F = z8;
        CashbackBadgeStyle cashbackBadgeStyle3 = cashbackBadgeStyle;
        this.G = cashbackBadgeStyle3;
        this.H = cashbackBadgeStyle2;
        this.I = kdcVar;
        this.J = z9;
        this.K = f;
        this.L = oeq0Var;
        this.M = z10;
        this.N = z5 || z3;
        if (!z3 && str5 != null) {
            str15 = str5;
        }
        this.O = str15;
        if (z3) {
            t0f0Var4 = t0f0Var2;
        } else if (t0f0Var3 != null) {
            t0f0Var4 = t0f0Var3;
        }
        this.P = t0f0Var4;
        String str17 = (z3 || str11 == null) ? str16 : str11;
        this.Q = str17;
        if (!z3) {
            if (str12 != null) {
                str16 = str12;
            } else if (str11 != null) {
                str16 = str11;
            }
        }
        this.R = str16;
        boolean z11 = str17 != null;
        this.S = z11;
        cashbackBadgeStyle3 = z3 ? cashbackBadgeStyle2 : cashbackBadgeStyle3;
        this.T = cashbackBadgeStyle3;
        boolean z12 = z11 && cashbackBadgeStyle3 != CashbackBadgeStyle.DISABLED;
        this.U = z12;
        this.V = z3 && z6 && !z12;
    }

    public final boolean a() {
        return this.w && !this.v;
    }

    public final boolean b(elx0 elx0Var) {
        return jl40.l(this.b, elx0Var.b) && a() == elx0Var.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elx0)) {
            return false;
        }
        elx0 elx0Var = (elx0) obj;
        return jl40.l(this.a, elx0Var.a) && jl40.l(this.b, elx0Var.b) && jl40.l(this.c, elx0Var.c) && jl40.l(this.d, elx0Var.d) && jl40.l(this.e, elx0Var.e) && jl40.l(this.f, elx0Var.f) && this.g == elx0Var.g && jl40.l(this.h, elx0Var.h) && jl40.l(this.i, elx0Var.i) && this.j == elx0Var.j && this.k == elx0Var.k && jl40.l(this.l, elx0Var.l) && jl40.l(this.m, elx0Var.m) && jl40.l(this.n, elx0Var.n) && jl40.l(this.o, elx0Var.o) && jl40.l(this.p, elx0Var.p) && jl40.l(this.q, elx0Var.q) && jl40.l(this.r, elx0Var.r) && jl40.l(this.s, elx0Var.s) && jl40.l(this.t, elx0Var.t) && this.u == elx0Var.u && this.v == elx0Var.v && this.w == elx0Var.w && this.x == elx0Var.x && this.y == elx0Var.y && jl40.l(this.z, elx0Var.z) && jl40.l(this.A, elx0Var.A) && jl40.l(this.B, elx0Var.B) && jl40.l(this.C, elx0Var.C) && jl40.l(this.D, elx0Var.D) && jl40.l(this.E, elx0Var.E) && this.F == elx0Var.F && this.G == elx0Var.G && this.H == elx0Var.H && jl40.l(this.I, elx0Var.I) && this.J == elx0Var.J && jl40.l(this.K, elx0Var.K) && jl40.l(this.L, elx0Var.L) && this.M == elx0Var.M;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        wu1 wu1Var = this.c;
        int e = unr0.e(unr0.b(unr0.c((this.d.hashCode() + ((b + (wu1Var == null ? 0 : wu1Var.hashCode())) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int e2 = unr0.e((this.j.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.k);
        nco ncoVar = this.l;
        int hashCode2 = (e2 + (ncoVar == null ? 0 : ncoVar.hashCode())) * 31;
        String str3 = this.m;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        t0f0 t0f0Var = this.n;
        int hashCode4 = (hashCode3 + (t0f0Var == null ? 0 : t0f0Var.hashCode())) * 31;
        t0f0 t0f0Var2 = this.o;
        int hashCode5 = (hashCode4 + (t0f0Var2 == null ? 0 : t0f0Var2.hashCode())) * 31;
        t0f0 t0f0Var3 = this.p;
        int hashCode6 = (hashCode5 + (t0f0Var3 == null ? 0 : t0f0Var3.hashCode())) * 31;
        String str4 = this.q;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.r;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        mr31 mr31Var = this.s;
        int b2 = unr0.b(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.d((hashCode8 + (mr31Var == null ? 0 : mr31Var.hashCode())) * 31, 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z);
        String str6 = this.A;
        int hashCode9 = (b2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.B;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.C;
        int b3 = unr0.b((hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.D);
        String str9 = this.E;
        int hashCode11 = (this.H.hashCode() + ((this.G.hashCode() + unr0.e((b3 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.F)) * 31)) * 31;
        kdc kdcVar = this.I;
        int e3 = unr0.e((hashCode11 + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31, 31, this.J);
        Float f = this.K;
        return Boolean.hashCode(this.M) + ((this.L.hashCode() + ((e3 + (f != null ? f.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("TariffPresentationModel(verticalId=", this.a, ", tariffClass=", this.b, ", alternativeGroup=");
        v.append(this.c);
        v.append(", tariffOffer=");
        v.append(this.d);
        v.append(", verticalModels=");
        oyr.D(", title=", this.f, ", titleLoading=", v, this.e);
        unr0.A(", carIconUrl=", this.h, ", unselectedOverrideCarIconUrl=", v, this.g);
        v.append(this.i);
        v.append(", tariffOrderFlow=");
        v.append(this.j);
        v.append(", isHiddenTariffInfo=");
        v.append(this.k);
        v.append(", etaUiState=");
        v.append(this.l);
        v.append(", time=");
        v.append(this.m);
        v.append(", price=");
        v.append(this.n);
        v.append(", priceOnSelect=");
        v.append(this.o);
        v.append(", unselectedOverridePrice=");
        v.append(this.p);
        v.append(", brandingIconUrl=");
        g8e.D(v, this.q, ", inactiveBrandingIconUrl=", this.r, ", tooltip=");
        v.append(this.s);
        v.append(", modifiers=");
        v.append(this.t);
        v.append(", selected=");
        nnm.v(", originalOption=", ", compound=", v, this.u, this.v);
        nnm.v(", couponVisible=", ", unavailable=", v, this.w, this.x);
        unr0.A(", cashbackTooltipValue=", this.z, ", cashbackBrandingValue=", v, this.y);
        g8e.D(v, this.A, ", cashbackBrandingUnselectedOverrideValue=", this.B, ", cashbackBrandingUnselectedOverrideContentDescription=");
        g8e.D(v, this.C, ", cashbackBadgePromoText=", this.D, ", cashbackIconUrl=");
        tse0.y(this.E, ", needToShowCashbackBadgeAnimation=", ", inactiveTariffBadgeStyle=", v, this.F);
        v.append(this.G);
        v.append(", tariffBadgeStyle=");
        v.append(this.H);
        v.append(", cashbackTextColor=");
        v.append(this.I);
        v.append(", cashbackGradientEnabled=");
        v.append(this.J);
        v.append(", cashbackHeight=");
        v.append(this.K);
        v.append(", selectScrollType=");
        v.append(this.L);
        v.append(", hasUnselectedOverride=");
        return x4e.i(v, this.M, Extension.C_BRAKE);
    }
}
