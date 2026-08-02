package defpackage;

import java.util.HashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nvi {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final fx70 k;
    public final HashMap l;
    public final String m;
    public final s1i n;

    public nvi(String str, String str2, String str3, boolean z, String str4, String str5, boolean z2, boolean z3, boolean z4, String str6, fx70 fx70Var, HashMap hashMap, String str7, s1i s1iVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = str5;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = str6;
        this.k = fx70Var;
        this.l = hashMap;
        this.m = str7;
        this.n = s1iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvi)) {
            return false;
        }
        nvi nviVar = (nvi) obj;
        return jl40.l(this.a, nviVar.a) && jl40.l(this.b, nviVar.b) && this.c.equals(nviVar.c) && this.d == nviVar.d && jl40.l(this.e, nviVar.e) && jl40.l(this.f, nviVar.f) && this.g == nviVar.g && this.h == nviVar.h && this.i == nviVar.i && jl40.l(this.j, nviVar.j) && jl40.l(this.k, nviVar.k) && this.l.equals(nviVar.l) && jl40.l(this.m, nviVar.m) && jl40.l(this.n, nviVar.n);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int e = unr0.e(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        String str2 = this.e;
        int e2 = unr0.e(unr0.e(unr0.e(unr0.b((e + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str3 = this.j;
        int hashCode2 = (e2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        fx70 fx70Var = this.k;
        int b = unr0.b((this.l.hashCode() + ((hashCode2 + (fx70Var == null ? 0 : fx70Var.hashCode())) * 31)) * 31, 31, this.m);
        s1i s1iVar = this.n;
        return b + (s1iVar != null ? s1iVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("DeliveryUnitedSummaryState(screenTitle=", this.a, ", screenTitleOverwrite=", this.b, ", price=");
        tse0.y(this.c, ", isPriceLoading=", ", routeTime=", v, this.d);
        g8e.D(v, this.e, ", buttonTitle=", this.f, ", isTariffAvailable=");
        nnm.v(", isOrderBlocked=", ", isDeliveryOrderFlow=", v, this.g, this.h);
        unr0.A(", offerId=", this.j, ", orderSelectSettings=", v, this.i);
        v.append(this.k);
        v.append(", tariffRequirements=");
        v.append(this.l);
        v.append(", tariff=");
        v.append(this.m);
        v.append(", costDetails=");
        v.append(this.n);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
