package defpackage;

import java.util.HashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ini {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final fx70 h;
    public final HashMap i;
    public final String j;
    public final String k;
    public final s1i l;

    public ini(String str, boolean z, String str2, String str3, boolean z2, boolean z3, String str4, fx70 fx70Var, HashMap hashMap, String str5, String str6, s1i s1iVar) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = z2;
        this.f = z3;
        this.g = str4;
        this.h = fx70Var;
        this.i = hashMap;
        this.j = str5;
        this.k = str6;
        this.l = s1iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ini)) {
            return false;
        }
        ini iniVar = (ini) obj;
        return this.a.equals(iniVar.a) && this.b == iniVar.b && this.c.equals(iniVar.c) && jl40.l(this.d, iniVar.d) && this.e == iniVar.e && this.f == iniVar.f && jl40.l(this.g, iniVar.g) && jl40.l(this.h, iniVar.h) && this.i.equals(iniVar.i) && jl40.l(this.j, iniVar.j) && jl40.l(this.k, iniVar.k) && jl40.l(this.l, iniVar.l);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int e = unr0.e(unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        String str2 = this.g;
        int hashCode = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        fx70 fx70Var = this.h;
        int hashCode2 = (this.i.hashCode() + ((hashCode + (fx70Var == null ? 0 : fx70Var.hashCode())) * 31)) * 31;
        String str3 = this.j;
        int b2 = unr0.b((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.k);
        s1i s1iVar = this.l;
        return b2 + (s1iVar != null ? s1iVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("DeliveryRouteStatsInfo(price=", this.a, ", loading=", ", orderButtonTitle=", this.b);
        g8e.D(l, this.c, ", tariffUnavailableMessage=", this.d, ", orderBlocked=");
        nnm.v(", isDeliveryOrderFlow=", ", deliveryOfferId=", l, this.e, this.f);
        l.append(this.g);
        l.append(", orderSelectSettings=");
        l.append(this.h);
        l.append(", tariffRequirements=");
        l.append(this.i);
        l.append(", routeEta=");
        l.append(this.j);
        l.append(", tariff=");
        l.append(this.k);
        l.append(", costDetails=");
        l.append(this.l);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
