package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.n6j;

/* loaded from: classes10.dex */
public final class ye3 implements zk3 {
    public final boolean a;
    public final List b;
    public final Map c;
    public final hf3 d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final sm3 j;
    public final Integer k;
    public final String l;
    public final mq3 m;
    public final List n;
    public final Map o;

    public ye3(boolean z, ArrayList arrayList, LinkedHashMap linkedHashMap, hf3 hf3Var, String str, String str2, String str3, String str4, String str5, sm3 sm3Var, Integer num, String str6, mq3 mq3Var, ArrayList arrayList2, Map map) {
        this.a = z;
        this.b = arrayList;
        this.c = linkedHashMap;
        this.d = hf3Var;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = sm3Var;
        this.k = num;
        this.l = str6;
        this.m = mq3Var;
        this.n = arrayList2;
        this.o = map;
    }

    @Override // yads.zk3
    public final Map a() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye3)) {
            return false;
        }
        ye3 ye3Var = (ye3) obj;
        return this.a == ye3Var.a && epx.f(this.b, ye3Var.b) && epx.f(this.c, ye3Var.c) && epx.f(this.d, ye3Var.d) && epx.f(this.e, ye3Var.e) && epx.f(this.f, ye3Var.f) && epx.f(this.g, ye3Var.g) && epx.f(this.h, ye3Var.h) && epx.f(this.i, ye3Var.i) && epx.f(this.j, ye3Var.j) && epx.f(this.k, ye3Var.k) && epx.f(this.l, ye3Var.l) && epx.f(this.m, ye3Var.m) && epx.f(this.n, ye3Var.n) && epx.f(this.o, ye3Var.o);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + xsna.v11.a(eb.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        sm3 sm3Var = this.j;
        int hashCode7 = (hashCode6 + (sm3Var == null ? 0 : sm3Var.a.hashCode())) * 31;
        Integer num = this.k;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.l;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        mq3 mq3Var = this.m;
        return this.o.hashCode() + eb.a(this.n, (hashCode9 + (mq3Var != null ? mq3Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        boolean z = this.a;
        List list = this.b;
        Map map = this.c;
        hf3 hf3Var = this.d;
        String str = this.e;
        String str2 = this.f;
        String str3 = this.g;
        String str4 = this.h;
        String str5 = this.i;
        sm3 sm3Var = this.j;
        Integer num = this.k;
        String str6 = this.l;
        mq3 mq3Var = this.m;
        List list2 = this.n;
        Map map2 = this.o;
        StringBuilder sb = new StringBuilder("VideoAd(isWrapper=");
        sb.append(z);
        sb.append(", creatives=");
        sb.append(list);
        sb.append(", rawTrackingEvents=");
        sb.append(map);
        sb.append(", videoAdExtensions=");
        sb.append(hf3Var);
        sb.append(", adSystem=");
        n6j.b(sb, str, ", adTitle=", str2, ", description=");
        n6j.b(sb, str3, ", survey=", str4, ", vastAdTagUri=");
        sb.append(str5);
        sb.append(", viewableImpression=");
        sb.append(sm3Var);
        sb.append(", sequence=");
        xsna.mq.b(num, ", id=", str6, ", wrapperConfiguration=", sb);
        sb.append(mq3Var);
        sb.append(", adVerifications=");
        sb.append(list2);
        sb.append(", trackingEvents=");
        sb.append(map2);
        sb.append(")");
        return sb.toString();
    }
}
