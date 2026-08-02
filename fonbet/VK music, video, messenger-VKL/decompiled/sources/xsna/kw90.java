package xsna;

import com.vk.stat.scheme.SchemeStat$TypeAppStarts;

/* compiled from: PerformanceMetrics.kt */
/* loaded from: classes.dex */
public final class kw90 {
    public final String A;
    public final boolean B;
    public final iw90 C;
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final jw90 e;
    public final lw90 f;
    public final Long g;
    public final Long h;
    public final Integer i;
    public final Long j;
    public final Integer k;
    public final Integer l;
    public final Boolean m;
    public final Boolean n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final Long x;
    public final SchemeStat$TypeAppStarts.StartMethod y;
    public final SchemeStat$TypeAppStarts.StartType z;

    public kw90(Integer num, Integer num2, Integer num3, Integer num4, jw90 jw90Var, lw90 lw90Var, Long l, Long l2, Integer num5, Long l3, Integer num6, Integer num7, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l4, SchemeStat$TypeAppStarts.StartMethod startMethod, SchemeStat$TypeAppStarts.StartType startType, String str10, boolean z, iw90 iw90Var) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = jw90Var;
        this.f = lw90Var;
        this.g = l;
        this.h = l2;
        this.i = num5;
        this.j = l3;
        this.k = num6;
        this.l = num7;
        this.m = bool;
        this.n = bool2;
        this.o = str;
        this.p = str2;
        this.q = str3;
        this.r = str4;
        this.s = str5;
        this.t = str6;
        this.u = str7;
        this.v = str8;
        this.w = str9;
        this.x = l4;
        this.y = startMethod;
        this.z = startType;
        this.A = str10;
        this.B = z;
        this.C = iw90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw90)) {
            return false;
        }
        kw90 kw90Var = (kw90) obj;
        return epx.f(this.a, kw90Var.a) && epx.f(this.b, kw90Var.b) && epx.f(this.c, kw90Var.c) && epx.f(this.d, kw90Var.d) && epx.f(this.e, kw90Var.e) && epx.f(this.f, kw90Var.f) && epx.f(this.g, kw90Var.g) && epx.f(this.h, kw90Var.h) && epx.f(this.i, kw90Var.i) && epx.f(this.j, kw90Var.j) && epx.f(this.k, kw90Var.k) && epx.f(this.l, kw90Var.l) && epx.f(this.m, kw90Var.m) && epx.f(this.n, kw90Var.n) && epx.f(this.o, kw90Var.o) && epx.f(this.p, kw90Var.p) && epx.f(this.q, kw90Var.q) && epx.f(this.r, kw90Var.r) && epx.f(this.s, kw90Var.s) && epx.f(this.t, kw90Var.t) && epx.f(this.u, kw90Var.u) && epx.f(this.v, kw90Var.v) && epx.f(this.w, kw90Var.w) && epx.f(this.x, kw90Var.x) && this.y == kw90Var.y && this.z == kw90Var.z && epx.f(this.A, kw90Var.A) && this.B == kw90Var.B && epx.f(this.C, kw90Var.C);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int hashCode4 = (this.f.hashCode() + ((this.e.hashCode() + ((hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31)) * 31)) * 31;
        Long l = this.g;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.h;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num5 = this.i;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Long l3 = this.j;
        int hashCode8 = (hashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num6 = this.k;
        int hashCode9 = (hashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.l;
        int hashCode10 = (hashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool = this.m;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.n;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.o;
        int hashCode13 = (hashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.p;
        int hashCode14 = (hashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.q;
        int hashCode15 = (hashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.r;
        int hashCode16 = (hashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.s;
        int hashCode17 = (hashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.t;
        int hashCode18 = (hashCode17 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.u;
        int hashCode19 = (hashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.v;
        int hashCode20 = (hashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.w;
        int hashCode21 = (hashCode20 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l4 = this.x;
        return this.C.hashCode() + qoy.b(urd0.a((this.z.hashCode() + ((this.y.hashCode() + ((hashCode21 + (l4 != null ? l4.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.A), 31, this.B);
    }

    public final String toString() {
        return "CommonData(ramAverageSize=" + this.a + ", backgroundRamAverageSize=" + this.b + ", foregroundRamAverageSize=" + this.c + ", ramMaxSize=" + this.d + ", appStartTimes=" + this.e + ", appFreezeData=" + this.f + ", netUsageStart=" + this.g + ", netUsage=" + this.h + ", netLoadApiCount=" + this.i + ", netBackgroundTraffic=" + this.j + ", netErrorCount=" + this.k + ", net4xxErrorCount=" + this.l + ", appANR=" + this.m + ", appCrash=" + this.n + ", anrId=" + this.o + ", anrScreenName=" + this.p + ", anrProcessImportance=" + this.q + ", crashId=" + this.r + ", crashStackTraceHash=" + this.s + ", crashScreenName=" + this.t + ", crashClassName=" + this.u + ", crashThreadName=" + this.v + ", crashCodeowner=" + this.w + ", crashCodeownerExtractionTime=" + this.x + ", startMethod=" + this.y + ", startType=" + this.z + ", startMethodPayload=" + this.A + ", hasEarlyAnr=" + this.B + ", appColdStartTimes=" + this.C + ')';
    }
}
