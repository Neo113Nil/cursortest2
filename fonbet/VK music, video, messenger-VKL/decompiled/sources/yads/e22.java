package yads;

import java.util.List;
import java.util.Map;
import xsna.epx;

/* loaded from: classes10.dex */
public final class e22 {
    public final List a;
    public final List b;
    public final List c;
    public final j5 d;
    public final Map e;
    public final List f;
    public final List g;
    public final String h;
    public final qz2 i;
    public final c7 j;

    public e22(List list, List list2, List list3, j5 j5Var, Map map, List list4, List list5, String str, qz2 qz2Var, c7 c7Var) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = j5Var;
        this.e = map;
        this.f = list4;
        this.g = list5;
        this.h = str;
        this.i = qz2Var;
        this.j = c7Var;
    }

    public final List a() {
        return this.f;
    }

    public final qz2 b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e22)) {
            return false;
        }
        e22 e22Var = (e22) obj;
        return epx.f(this.a, e22Var.a) && epx.f(this.b, e22Var.b) && epx.f(this.c, e22Var.c) && epx.f(this.d, e22Var.d) && epx.f(this.e, e22Var.e) && epx.f(this.f, e22Var.f) && epx.f(this.g, e22Var.g) && epx.f(this.h, e22Var.h) && epx.f(this.i, e22Var.i) && epx.f(this.j, e22Var.j);
    }

    public final int hashCode() {
        int a = eb.a(this.c, eb.a(this.b, this.a.hashCode() * 31, 31), 31);
        j5 j5Var = this.d;
        int a2 = eb.a(this.g, eb.a(this.f, xsna.v11.a((a + (j5Var == null ? 0 : j5Var.b.hashCode())) * 31, 31, this.e), 31), 31);
        String str = this.h;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        qz2 qz2Var = this.i;
        int hashCode2 = (hashCode + (qz2Var == null ? 0 : qz2Var.hashCode())) * 31;
        c7 c7Var = this.j;
        return hashCode2 + (c7Var != null ? c7Var.hashCode() : 0);
    }

    public final String toString() {
        List list = this.a;
        List list2 = this.b;
        List list3 = this.c;
        j5 j5Var = this.d;
        Map map = this.e;
        List list4 = this.f;
        List list5 = this.g;
        String str = this.h;
        qz2 qz2Var = this.i;
        c7 c7Var = this.j;
        StringBuilder sb = new StringBuilder("NativeAdResponse(nativeAds=");
        sb.append(list);
        sb.append(", assets=");
        sb.append(list2);
        sb.append(", renderTrackingUrls=");
        sb.append(list3);
        sb.append(", impressionData=");
        sb.append(j5Var);
        sb.append(", properties=");
        sb.append(map);
        sb.append(", divKitDesigns=");
        sb.append(list4);
        sb.append(", showNotices=");
        xsna.vr.c(", version=", str, ", settings=", sb, list5);
        sb.append(qz2Var);
        sb.append(", adPod=");
        sb.append(c7Var);
        sb.append(")");
        return sb.toString();
    }
}
