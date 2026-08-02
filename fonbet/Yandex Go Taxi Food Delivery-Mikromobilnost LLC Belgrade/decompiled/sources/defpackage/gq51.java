package defpackage;

import com.ybsdk.feature.card.api.entities.YbCardType;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gq51 {
    public final String a;
    public final String b;
    public final String c;
    public final YbCardType d;
    public final String e;
    public final String f;
    public final ArrayList g;
    public final String h;
    public final fq51 i;
    public final fq51 j;
    public final String k;
    public final String l;
    public final jq51 m;

    public gq51(String str, String str2, String str3, YbCardType ybCardType, String str4, String str5, ArrayList arrayList, String str6, fq51 fq51Var, fq51 fq51Var2, String str7, String str8, jq51 jq51Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ybCardType;
        this.e = str4;
        this.f = str5;
        this.g = arrayList;
        this.h = str6;
        this.i = fq51Var;
        this.j = fq51Var2;
        this.k = str7;
        this.l = str8;
        this.m = jq51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq51)) {
            return false;
        }
        gq51 gq51Var = (gq51) obj;
        return jl40.l(this.a, gq51Var.a) && jl40.l(this.b, gq51Var.b) && jl40.l(this.c, gq51Var.c) && this.d == gq51Var.d && jl40.l(this.e, gq51Var.e) && jl40.l(this.f, gq51Var.f) && this.g.equals(gq51Var.g) && jl40.l(this.h, gq51Var.h) && jl40.l(this.i, gq51Var.i) && jl40.l(this.j, gq51Var.j) && jl40.l(this.k, gq51Var.k) && jl40.l(this.l, gq51Var.l) && jl40.l(this.m, gq51Var.m);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        YbCardType ybCardType = this.d;
        int b2 = unr0.b((hashCode + (ybCardType == null ? 0 : ybCardType.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        int b3 = unr0.b(ly3.b((b2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g), 31, this.h);
        fq51 fq51Var = this.i;
        int hashCode2 = (b3 + (fq51Var == null ? 0 : fq51Var.hashCode())) * 31;
        fq51 fq51Var2 = this.j;
        int hashCode3 = (hashCode2 + (fq51Var2 == null ? 0 : fq51Var2.hashCode())) * 31;
        String str3 = this.k;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        jq51 jq51Var = this.m;
        return hashCode5 + (jq51Var != null ? jq51Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("YbCardPromoEntity(id=", this.a, ", groupId=", this.b, ", agreementId=");
        v.append(this.c);
        v.append(", type=");
        v.append(this.d);
        v.append(", title=");
        g8e.D(v, this.e, ", subtitle=", this.f, ", points=");
        v.append(this.g);
        v.append(", caption=");
        v.append(this.h);
        v.append(", claimButtonInfo=");
        v.append(this.i);
        v.append(", acquireButtonInfo=");
        v.append(this.j);
        v.append(", applicationId=");
        g8e.D(v, this.k, ", agreement=", this.l, ", skin=");
        v.append(this.m);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
