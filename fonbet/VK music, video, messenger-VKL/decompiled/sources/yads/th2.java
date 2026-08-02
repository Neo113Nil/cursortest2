package yads;

import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.i5s;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class th2 {
    public final String a;
    public final String b;
    public final Map c;
    public final Integer d;
    public final bb0 e;
    public final List f;
    public final List g;
    public final String h;
    public final String i;

    public th2(String str, String str2, Map map, Integer num, bb0 bb0Var, List list, List list2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = num;
        this.e = bb0Var;
        this.f = list;
        this.g = list2;
        this.h = str3;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th2)) {
            return false;
        }
        th2 th2Var = (th2) obj;
        return epx.f(this.a, th2Var.a) && epx.f(this.b, th2Var.b) && epx.f(this.c, th2Var.c) && epx.f(this.d, th2Var.d) && this.e == th2Var.e && epx.f(this.f, th2Var.f) && epx.f(this.g, th2Var.g) && epx.f(this.h, th2Var.h) && epx.f(this.i, th2Var.i);
    }

    public final int hashCode() {
        int a = k4.a(this.b, this.a.hashCode() * 31, 31);
        Map map = this.c;
        int hashCode = (a + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        bb0 bb0Var = this.e;
        int hashCode3 = (hashCode2 + (bb0Var == null ? 0 : bb0Var.hashCode())) * 31;
        List list = this.f;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.g;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.h;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        Map map = this.c;
        Integer num = this.d;
        bb0 bb0Var = this.e;
        List list = this.f;
        List list2 = this.g;
        String str3 = this.h;
        String str4 = this.i;
        StringBuilder a = xe9.a("PreferredPackage(packageName=", str, ", url=", str2, ", extras=");
        a.append(map);
        a.append(", flags=");
        a.append(num);
        a.append(", launchMode=");
        a.append(bb0Var);
        a.append(", trackingUrls=");
        a.append(list);
        a.append(", fallbackTrackingUrls=");
        xsna.vr.c(", deeplinkType=", str3, ", className=", a, list2);
        return i5s.a(a, str4, ")");
    }
}
