package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ib50 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Boolean g;
    public final Boolean h;

    public ib50(Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = bool;
        this.h = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib50)) {
            return false;
        }
        ib50 ib50Var = (ib50) obj;
        return jl40.l(this.a, ib50Var.a) && jl40.l(this.b, ib50Var.b) && jl40.l(this.c, ib50Var.c) && jl40.l(this.d, ib50Var.d) && jl40.l(this.e, ib50Var.e) && jl40.l(this.f, ib50Var.f) && jl40.l(this.g, ib50Var.g) && jl40.l(this.h, ib50Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.g;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        return hashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("NavigatorDeeplink(dstLat=", this.a, ", dstLon=", this.b, ", utm=");
        g8e.D(v, this.c, ", entryPoint=", this.d, ", payload=");
        g8e.D(v, this.e, ", routeStops=", this.f, ", startRouteOnRedirect=");
        v.append(this.g);
        v.append(", proposeFinishOnExit=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ib50() {
        this(null, null, null, null, null, null, null, null);
    }
}
