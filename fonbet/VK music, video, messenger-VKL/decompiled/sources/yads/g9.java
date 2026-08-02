package yads;

import android.location.Location;
import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.n6j;
import xsna.qoy;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class g9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final Location f;
    public final Map g;
    public final String h;
    public final String i;
    public final hq2 j;
    public final boolean k;
    public final String l;

    public g9(String str, String str2, String str3, String str4, List list, Location location, Map map, String str5, String str6, hq2 hq2Var, boolean z, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = location;
        this.g = map;
        this.h = str5;
        this.i = str6;
        this.j = hq2Var;
        this.k = z;
        this.l = str7;
    }

    public static g9 a(g9 g9Var, Map map, String str, int i) {
        String str2 = g9Var.a;
        String str3 = g9Var.b;
        String str4 = g9Var.c;
        String str5 = g9Var.d;
        List list = g9Var.e;
        Location location = g9Var.f;
        if ((i & 64) != 0) {
            map = g9Var.g;
        }
        return new g9(str2, str3, str4, str5, list, location, map, g9Var.h, g9Var.i, g9Var.j, g9Var.k, (i & 2048) != 0 ? g9Var.l : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9)) {
            return false;
        }
        g9 g9Var = (g9) obj;
        return epx.f(this.a, g9Var.a) && epx.f(this.b, g9Var.b) && epx.f(this.c, g9Var.c) && epx.f(this.d, g9Var.d) && epx.f(this.e, g9Var.e) && epx.f(this.f, g9Var.f) && epx.f(this.g, g9Var.g) && epx.f(this.h, g9Var.h) && epx.f(this.i, g9Var.i) && this.j == g9Var.j && this.k == g9Var.k && epx.f(this.l, g9Var.l);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Location location = this.f;
        int hashCode6 = (hashCode5 + (location == null ? 0 : location.hashCode())) * 31;
        Map map = this.g;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        hq2 hq2Var = this.j;
        int b = qoy.b((hashCode9 + (hq2Var == null ? 0 : hq2Var.hashCode())) * 31, 31, this.k);
        String str6 = this.l;
        return b + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        List list = this.e;
        Location location = this.f;
        Map map = this.g;
        String str5 = this.h;
        String str6 = this.i;
        hq2 hq2Var = this.j;
        boolean z = this.k;
        String str7 = this.l;
        StringBuilder a = xe9.a("AdRequestData(adUnitId=", str, ", age=", str2, ", gender=");
        n6j.b(a, str3, ", contextQuery=", str4, ", contextTags=");
        a.append(list);
        a.append(", location=");
        a.append(location);
        a.append(", parameters=");
        a.append(map);
        a.append(", openBiddingData=");
        a.append(str5);
        a.append(", readyResponse=");
        a.append(str6);
        a.append(", preferredTheme=");
        a.append(hq2Var);
        a.append(", shouldLoadImagesAutomatically=");
        a.append(z);
        a.append(", preloadType=");
        a.append(str7);
        a.append(")");
        return a.toString();
    }
}
