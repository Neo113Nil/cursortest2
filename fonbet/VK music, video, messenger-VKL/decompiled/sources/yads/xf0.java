package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class xf0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final Map e;

    public xf0(String str, String str2, String str3, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf0)) {
            return false;
        }
        xf0 xf0Var = (xf0) obj;
        return epx.f(this.a, xf0Var.a) && epx.f(this.b, xf0Var.b) && epx.f(this.c, xf0Var.c) && epx.f(this.d, xf0Var.d) && epx.f(this.e, xf0Var.e);
    }

    public final int hashCode() {
        int a = k4.a(this.c, k4.a(this.b, this.a.hashCode() * 31, 31), 31);
        List list = this.d;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.e;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        List list = this.d;
        Map map = this.e;
        StringBuilder a = xe9.a("Design(type=", str, ", target=", str2, ", layout=");
        com.vk.movika.sdk.base.model.history.b.c(str3, ", images=", ", analyticsParameters=", a, list);
        a.append(map);
        a.append(")");
        return a.toString();
    }
}
