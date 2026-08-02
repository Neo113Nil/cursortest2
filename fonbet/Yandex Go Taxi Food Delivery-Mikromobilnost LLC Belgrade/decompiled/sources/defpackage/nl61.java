package defpackage;

import java.util.Map;

/* loaded from: classes7.dex */
public final class nl61 {
    public final String a;
    public final Map b;
    public final String c;
    public final boolean d;
    public final String e;

    public nl61(String str, String str2, String str3, Map map, boolean z) {
        this.a = str;
        this.b = map;
        this.c = str2;
        this.d = z;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl61)) {
            return false;
        }
        nl61 nl61Var = (nl61) obj;
        return jl40.l(this.a, nl61Var.a) && jl40.l(this.b, nl61Var.b) && jl40.l(this.c, nl61Var.c) && this.d == nl61Var.d && jl40.l(this.e, nl61Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 887503681;
        Map map = this.b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 961;
        String str = this.c;
        int e = unr0.e((hashCode2 + (str == null ? 0 : str.hashCode())) * 961, 31, this.d);
        String str2 = this.e;
        return (e + (str2 != null ? str2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdRequestData(adUnitId=");
        sb.append(this.a);
        sb.append(", age=null, gender=null, contextQuery=null, contextTags=null, location=null, parameters=");
        sb.append(this.b);
        sb.append(", openBiddingData=null, readyResponse=");
        tse0.y(this.c, ", preferredTheme=null, shouldLoadImagesAutomatically=", ", preloadType=", sb, this.d);
        return oyr.t(sb, this.e, ", adapterIdentity=null)");
    }
}
