package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class bs81 implements ri81 {
    public final String A;
    public final String B;
    public final bw71 C;
    public final Integer D;
    public final String E;
    public final zy2 F;
    public final ArrayList G;
    public final Map H;
    public final boolean a;
    public final ArrayList b;
    public final LinkedHashMap c;
    public final uc71 w;
    public final String x;
    public final String y;
    public final String z;

    public bs81(boolean z, ArrayList arrayList, LinkedHashMap linkedHashMap, uc71 uc71Var, String str, String str2, String str3, String str4, String str5, bw71 bw71Var, Integer num, String str6, zy2 zy2Var, ArrayList arrayList2, LinkedHashMap linkedHashMap2) {
        this.a = z;
        this.b = arrayList;
        this.c = linkedHashMap;
        this.w = uc71Var;
        this.x = str;
        this.y = str2;
        this.z = str3;
        this.A = str4;
        this.B = str5;
        this.C = bw71Var;
        this.D = num;
        this.E = str6;
        this.F = zy2Var;
        this.G = arrayList2;
        this.H = linkedHashMap2;
    }

    @Override // defpackage.ri81
    public final Map a() {
        return this.H;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs81)) {
            return false;
        }
        bs81 bs81Var = (bs81) obj;
        return this.a == bs81Var.a && jl40.l(this.b, bs81Var.b) && jl40.l(this.c, bs81Var.c) && jl40.l(this.w, bs81Var.w) && jl40.l(this.x, bs81Var.x) && jl40.l(this.y, bs81Var.y) && jl40.l(this.z, bs81Var.z) && jl40.l(this.A, bs81Var.A) && jl40.l(this.B, bs81Var.B) && jl40.l(this.C, bs81Var.C) && jl40.l(this.D, bs81Var.D) && jl40.l(this.E, bs81Var.E) && jl40.l(this.F, bs81Var.F) && jl40.l(this.G, bs81Var.G) && jl40.l(this.H, bs81Var.H);
    }

    public final int hashCode() {
        int hashCode = (this.w.hashCode() + ((this.c.hashCode() + ly3.b(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31;
        String str = this.x;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.y;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.z;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.B;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        bw71 bw71Var = this.C;
        int hashCode7 = (hashCode6 + (bw71Var == null ? 0 : bw71Var.a.hashCode())) * 31;
        Integer num = this.D;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.E;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        zy2 zy2Var = this.F;
        return this.H.hashCode() + ly3.b((hashCode9 + (zy2Var != null ? zy2Var.hashCode() : 0)) * 31, 31, this.G);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAd(isWrapper=");
        sb.append(this.a);
        sb.append(", creatives=");
        sb.append(this.b);
        sb.append(", rawTrackingEvents=");
        sb.append(this.c);
        sb.append(", videoAdExtensions=");
        sb.append(this.w);
        sb.append(", adSystem=");
        g8e.D(sb, this.x, ", adTitle=", this.y, ", description=");
        g8e.D(sb, this.z, ", survey=", this.A, ", vastAdTagUri=");
        sb.append(this.B);
        sb.append(", viewableImpression=");
        sb.append(this.C);
        sb.append(", sequence=");
        tse0.w(this.D, ", id=", this.E, ", wrapperConfiguration=", sb);
        sb.append(this.F);
        sb.append(", adVerifications=");
        sb.append(this.G);
        sb.append(", trackingEvents=");
        return b64.r(sb, this.H, Extension.C_BRAKE);
    }
}
