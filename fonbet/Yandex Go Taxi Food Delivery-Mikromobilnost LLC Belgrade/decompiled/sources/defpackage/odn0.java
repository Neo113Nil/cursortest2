package defpackage;

import android.net.Uri;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class odn0 {
    public final Uri a;
    public final String b;
    public final String c;
    public final Double d;
    public final Double e;
    public final List f;
    public final String g;
    public final String h;
    public final Integer i;
    public final String j;

    public odn0(Uri uri, String str, String str2, Double d, Double d2, List list, String str3, String str4, Integer num, String str5) {
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = d;
        this.e = d2;
        this.f = list;
        this.g = str3;
        this.h = str4;
        this.i = num;
        this.j = str5;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odn0)) {
            return false;
        }
        odn0 odn0Var = (odn0) obj;
        return jl40.l(this.a, odn0Var.a) && jl40.l(this.b, odn0Var.b) && jl40.l(this.c, odn0Var.c) && jl40.l(this.d, odn0Var.d) && jl40.l(this.e, odn0Var.e) && this.f.equals(odn0Var.f) && jl40.l(this.g, odn0Var.g) && jl40.l(this.h, odn0Var.h) && jl40.l(this.i, odn0Var.i) && jl40.l(this.j, odn0Var.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.d;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.e;
        int c = unr0.c((hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31, 31, this.f);
        String str3 = this.g;
        int hashCode5 = (c + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.i;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.j;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScootersDeeplink(deeplinkUri=");
        sb.append(this.a);
        sb.append(", number=");
        sb.append(this.b);
        sb.append(", vendor=");
        sb.append(this.c);
        sb.append(", endLat=");
        sb.append(this.d);
        sb.append(", endLon=");
        sb.append(this.e);
        sb.append(", scootersSource=");
        sb.append(this.f);
        sb.append(", scootersCampaign=");
        g8e.D(sb, this.g, ", source=", this.h, ", successCompletionRadiusM=");
        sb.append(this.i);
        sb.append(", multimodalOfferId=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
