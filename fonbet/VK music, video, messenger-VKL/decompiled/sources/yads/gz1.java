package yads;

import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.n6j;
import xsna.vq;

/* loaded from: classes10.dex */
public final class gz1 {
    public final dr2 a;
    public List b;
    public final String c;
    public final String d;
    public final jg1 e;
    public final j5 f;
    public final List g;
    public final List h;
    public final gc i;
    public final String j;
    public final String k;
    public final Map l;

    public gz1(dr2 dr2Var, List list, String str, String str2, jg1 jg1Var, j5 j5Var, List list2, List list3, gc gcVar, String str3, String str4, Map map) {
        this.a = dr2Var;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = jg1Var;
        this.f = j5Var;
        this.g = list2;
        this.h = list3;
        this.i = gcVar;
        this.j = str3;
        this.k = str4;
        this.l = map;
    }

    public final jg1 a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz1)) {
            return false;
        }
        gz1 gz1Var = (gz1) obj;
        return this.a == gz1Var.a && epx.f(this.b, gz1Var.b) && epx.f(this.c, gz1Var.c) && epx.f(this.d, gz1Var.d) && epx.f(this.e, gz1Var.e) && epx.f(this.f, gz1Var.f) && epx.f(this.g, gz1Var.g) && epx.f(this.h, gz1Var.h) && epx.f(this.i, gz1Var.i) && epx.f(this.j, gz1Var.j) && epx.f(this.k, gz1Var.k) && epx.f(this.l, gz1Var.l);
    }

    public final int hashCode() {
        int a = eb.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        jg1 jg1Var = this.e;
        int hashCode3 = (hashCode2 + (jg1Var == null ? 0 : jg1Var.hashCode())) * 31;
        j5 j5Var = this.f;
        int a2 = eb.a(this.h, eb.a(this.g, (hashCode3 + (j5Var == null ? 0 : j5Var.b.hashCode())) * 31, 31), 31);
        gc gcVar = this.i;
        int hashCode4 = (a2 + (gcVar == null ? 0 : gcVar.hashCode())) * 31;
        String str3 = this.j;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map map = this.l;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        dr2 dr2Var = this.a;
        List list = this.b;
        String str = this.c;
        String str2 = this.d;
        jg1 jg1Var = this.e;
        j5 j5Var = this.f;
        List list2 = this.g;
        List list3 = this.h;
        gc gcVar = this.i;
        String str3 = this.j;
        String str4 = this.k;
        Map map = this.l;
        StringBuilder sb = new StringBuilder("Native(responseNativeType=");
        sb.append(dr2Var);
        sb.append(", assets=");
        sb.append(list);
        sb.append(", adId=");
        n6j.b(sb, str, ", info=", str2, ", link=");
        sb.append(jg1Var);
        sb.append(", impressionData=");
        sb.append(j5Var);
        sb.append(", renderTrackingUrls=");
        vq.d(sb, list2, ", showNotices=", list3, ", additionalInfo=");
        sb.append(gcVar);
        sb.append(", creativeId=");
        sb.append(str3);
        sb.append(", campaignId=");
        sb.append(str4);
        sb.append(", analyticsParameters=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }
}
