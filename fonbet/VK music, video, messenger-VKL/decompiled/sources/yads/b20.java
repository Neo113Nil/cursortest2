package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.s5a;
import xsna.vq;

/* loaded from: classes10.dex */
public final class b20 implements zk3 {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final e20 e;
    public final String f;
    public final r13 g;
    public final String h;
    public final int i;
    public final String j;

    public b20(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, e20 e20Var, String str, r13 r13Var, String str2, int i, String str3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = arrayList4;
        this.e = e20Var;
        this.f = str;
        this.g = r13Var;
        this.h = str2;
        this.i = i;
        this.j = str3;
    }

    @Override // yads.zk3
    public final Map a() {
        List<b93> list = this.d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (b93 b93Var : list) {
            String str = b93Var.a;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = s5a.a(str, linkedHashMap);
            }
            ((List) obj).add(b93Var.b);
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b20)) {
            return false;
        }
        b20 b20Var = (b20) obj;
        return epx.f(this.a, b20Var.a) && epx.f(this.b, b20Var.b) && epx.f(this.c, b20Var.c) && epx.f(this.d, b20Var.d) && epx.f(this.e, b20Var.e) && epx.f(this.f, b20Var.f) && epx.f(this.g, b20Var.g) && epx.f(this.h, b20Var.h) && this.i == b20Var.i && epx.f(this.j, b20Var.j);
    }

    public final int hashCode() {
        int a = eb.a(this.d, eb.a(this.c, eb.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        e20 e20Var = this.e;
        int hashCode = (a + (e20Var == null ? 0 : e20Var.hashCode())) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        r13 r13Var = this.g;
        int hashCode3 = (hashCode2 + (r13Var == null ? 0 : r13Var.hashCode())) * 31;
        String str2 = this.h;
        int a2 = re3.a(this.i, (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.j;
        return a2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        List list = this.a;
        List list2 = this.b;
        List list3 = this.c;
        List list4 = this.d;
        e20 e20Var = this.e;
        String str = this.f;
        r13 r13Var = this.g;
        String str2 = this.h;
        int i = this.i;
        String str3 = this.j;
        StringBuilder sb = new StringBuilder("Creative(mediaFiles=");
        sb.append(list);
        sb.append(", interactiveCreativeFiles=");
        sb.append(list2);
        sb.append(", icons=");
        vq.d(sb, list3, ", trackingEventsList=", list4, ", creativeExtensions=");
        sb.append(e20Var);
        sb.append(", clickThroughUrl=");
        sb.append(str);
        sb.append(", skipOffset=");
        sb.append(r13Var);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", durationMillis=");
        sb.append(i);
        sb.append(", adParameters=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
