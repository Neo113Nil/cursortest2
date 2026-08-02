package yads;

import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.n6j;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class oy0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final Map f;
    public final hq2 g;

    public oy0(String str, String str2, String str3, String str4, List list, Map map, hq2 hq2Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = map;
        this.g = hq2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy0)) {
            return false;
        }
        oy0 oy0Var = (oy0) obj;
        return epx.f(this.a, oy0Var.a) && epx.f(this.b, oy0Var.b) && epx.f(this.c, oy0Var.c) && epx.f(this.d, oy0Var.d) && epx.f(this.e, oy0Var.e) && epx.f(this.f, oy0Var.f) && this.g == oy0Var.g;
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
        Map map = this.f;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        hq2 hq2Var = this.g;
        return hashCode6 + (hq2Var != null ? hq2Var.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        List list = this.e;
        Map map = this.f;
        hq2 hq2Var = this.g;
        StringBuilder a = xe9.a("FullscreenCacheParams(adUnitId=", str, ", age=", str2, ", gender=");
        n6j.b(a, str3, ", contextQuery=", str4, ", contextTags=");
        a.append(list);
        a.append(", parameters=");
        a.append(map);
        a.append(", preferredTheme=");
        a.append(hq2Var);
        a.append(")");
        return a.toString();
    }
}
