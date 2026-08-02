package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jv20 {
    public final Uri a;
    public final Double b;
    public final Double c;
    public final Double d;
    public final Double e;
    public final Boolean f;
    public final String g;

    public jv20(Uri uri, Double d, Double d2, Double d3, Double d4, Boolean bool, String str) {
        this.a = uri;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.f = bool;
        this.g = str;
    }

    public final Double a() {
        return this.b;
    }

    public final Double b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv20)) {
            return false;
        }
        jv20 jv20Var = (jv20) obj;
        return jl40.l(this.a, jv20Var.a) && jl40.l(this.b, jv20Var.b) && jl40.l(this.c, jv20Var.c) && jl40.l(this.d, jv20Var.d) && jl40.l(this.e, jv20Var.e) && jl40.l(this.f, jv20Var.f) && jl40.l(this.g, jv20Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.d;
        int hashCode4 = (hashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.e;
        int hashCode5 = (hashCode4 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Boolean bool = this.f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.g;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MobilityHubDeeplink(deeplinkUri=");
        sb.append(this.a);
        sb.append(", startLat=");
        sb.append(this.b);
        sb.append(", startLon=");
        sb.append(this.c);
        sb.append(", endLat=");
        sb.append(this.d);
        sb.append(", endLon=");
        sb.append(this.e);
        sb.append(", skipTaxiMainOnBack=");
        sb.append(this.f);
        sb.append(", guaranteedFirstOfferType=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
