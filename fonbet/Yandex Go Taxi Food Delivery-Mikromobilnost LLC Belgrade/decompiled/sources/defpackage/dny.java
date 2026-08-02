package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.linked_order.models.data.IconType;

/* loaded from: classes5.dex */
public final class dny {
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final boolean F;
    public final qi11 G;
    public final String H;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final IconType h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final ArrayList n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final String y;
    public final t0a0 z;

    public dny(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, IconType iconType, String str4, String str5, String str6, String str7, String str8, ArrayList arrayList, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, t0a0 t0a0Var, String str20, String str21, String str22, String str23, String str24, boolean z5, qi11 qi11Var, String str25) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = iconType;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = str8;
        this.n = arrayList;
        this.o = str9;
        this.p = str10;
        this.q = str11;
        this.r = str12;
        this.s = str13;
        this.t = str14;
        this.u = str15;
        this.v = str16;
        this.w = str17;
        this.x = str18;
        this.y = str19;
        this.z = t0a0Var;
        this.A = str20;
        this.B = str21;
        this.C = str22;
        this.D = str23;
        this.E = str24;
        this.F = z5;
        this.G = qi11Var;
        this.H = str25;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dny)) {
            return false;
        }
        dny dnyVar = (dny) obj;
        return this.a == dnyVar.a && this.b == dnyVar.b && this.c == dnyVar.c && this.d == dnyVar.d && jl40.l(this.e, dnyVar.e) && jl40.l(this.f, dnyVar.f) && jl40.l(this.g, dnyVar.g) && this.h == dnyVar.h && jl40.l(this.i, dnyVar.i) && jl40.l(this.j, dnyVar.j) && jl40.l(this.k, dnyVar.k) && jl40.l(this.l, dnyVar.l) && jl40.l(this.m, dnyVar.m) && this.n.equals(dnyVar.n) && this.o.equals(dnyVar.o) && this.p.equals(dnyVar.p) && this.q.equals(dnyVar.q) && this.r.equals(dnyVar.r) && this.s.equals(dnyVar.s) && this.t.equals(dnyVar.t) && jl40.l(this.u, dnyVar.u) && jl40.l(this.v, dnyVar.v) && jl40.l(this.w, dnyVar.w) && jl40.l(this.x, dnyVar.x) && jl40.l(this.y, dnyVar.y) && jl40.l(this.z, dnyVar.z) && jl40.l(this.A, dnyVar.A) && jl40.l(this.B, dnyVar.B) && jl40.l(this.C, dnyVar.C) && jl40.l(this.D, dnyVar.D) && jl40.l(this.E, dnyVar.E) && this.F == dnyVar.F && jl40.l(this.G, dnyVar.G) && jl40.l(this.H, dnyVar.H);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(ly3.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b((this.h.hashCode() + unr0.b(unr0.b(unr0.b(unr0.e(unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y);
        t0a0 t0a0Var = this.z;
        int e = unr0.e(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b((b + (t0a0Var == null ? 0 : t0a0Var.hashCode())) * 31, 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F);
        qi11 qi11Var = this.G;
        return this.H.hashCode() + ((e + (qi11Var != null ? qi11Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder u = qv10.u("LinkedOrderInfoData(showFinishButton=", ", showPhoneButton=", ", showCallTrustingContactButton=", this.a, this.b);
        nnm.v(", showSourcePoint=", ", title=", u, this.c, this.d);
        g8e.D(u, this.e, ", subtitle=", this.f, ", titleIconTag=");
        u.append(this.g);
        u.append(", iconsType=");
        u.append(this.h);
        u.append(", phone=");
        g8e.D(u, this.i, ", porchLabel=", this.j, ", apartmentLabel=");
        g8e.D(u, this.k, ", floorLabel=", this.l, ", doorCodeLabel=");
        u.append(this.m);
        u.append(", infoItems=");
        u.append(this.n);
        u.append(", sourceAddress=");
        g8e.D(u, this.o, ", destinationAddress=", this.p, ", destinationPorch=");
        g8e.D(u, this.q, ", destinationApartment=", this.r, ", destinationFloor=");
        g8e.D(u, this.s, ", destinationDoorCode=", this.t, ", additionalInfo=");
        g8e.D(u, this.u, ", tariffClassForMetrica=", this.v, ", orderTypeForMetrica=");
        g8e.D(u, this.w, ", paymentMethodTitle=", this.x, ", paymentMethodSubtitle=");
        u.append(this.y);
        u.append(", paymentOptionInfo=");
        u.append(this.z);
        u.append(", detailsTitle=");
        g8e.D(u, this.A, ", detailsSubtitle=", this.B, ", detailsImageTag=");
        g8e.D(u, this.C, ", carColor=", this.D, ", carNumber=");
        tse0.y(this.E, ", isExpandWhenOpenDetailsScreen=", ", trustingContact=", u, this.F);
        u.append(this.G);
        u.append(", shareText=");
        u.append(this.H);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
