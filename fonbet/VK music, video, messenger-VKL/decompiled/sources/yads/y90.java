package yads;

import java.util.List;
import xsna.epx;
import xsna.i5s;
import xsna.n6j;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class y90 extends ba0 {
    public final String a;
    public final String b;
    public final x80 c;
    public final q50 d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final List i;
    public final c50 j;
    public final String k;

    public y90(String str, String str2, x80 x80Var, q50 q50Var, String str3, String str4, String str5, List list, List list2, c50 c50Var, String str6) {
        super(0);
        this.a = str;
        this.b = str2;
        this.c = x80Var;
        this.d = q50Var;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = list;
        this.i = list2;
        this.j = c50Var;
        this.k = str6;
    }

    public final String a() {
        return this.f;
    }

    public final List b() {
        return this.i;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.g;
    }

    public final List e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y90)) {
            return false;
        }
        y90 y90Var = (y90) obj;
        return epx.f(this.a, y90Var.a) && epx.f(this.b, y90Var.b) && epx.f(this.c, y90Var.c) && epx.f(this.d, y90Var.d) && epx.f(this.e, y90Var.e) && epx.f(this.f, y90Var.f) && epx.f(this.g, y90Var.g) && epx.f(this.h, y90Var.h) && epx.f(this.i, y90Var.i) && this.j == y90Var.j && epx.f(this.k, y90Var.k);
    }

    public final c50 f() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        x80 x80Var = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (x80Var == null ? 0 : x80Var.hashCode())) * 31)) * 31;
        String str2 = this.e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.h;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.i;
        int hashCode8 = (this.j.hashCode() + ((hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        String str5 = this.k;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        x80 x80Var = this.c;
        q50 q50Var = this.d;
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        List list = this.h;
        List list2 = this.i;
        c50 c50Var = this.j;
        String str6 = this.k;
        StringBuilder a = xe9.a("MediationAdapter(name=", str, ", logoUrl=", str2, ", infoFirst=");
        a.append(x80Var);
        a.append(", infoSecond=");
        a.append(q50Var);
        a.append(", waringMessage=");
        n6j.b(a, str3, ", adUnitId=", str4, ", networkAdUnitIdName=");
        com.vk.movika.sdk.base.model.history.b.c(str5, ", parameters=", ", cpmFloors=", a, list);
        a.append(list2);
        a.append(", type=");
        a.append(c50Var);
        a.append(", sdk=");
        return i5s.a(a, str6, ")");
    }

    public /* synthetic */ y90(String str, String str2, x80 x80Var, q50 q50Var, String str3, String str4, String str5, List list, List list2, c50 c50Var, String str6, int i) {
        this(str, str2, x80Var, q50Var, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? c50.e : c50Var, (i & 1024) != 0 ? null : str6);
    }
}
