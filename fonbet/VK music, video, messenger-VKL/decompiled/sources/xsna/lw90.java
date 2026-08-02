package xsna;

/* compiled from: PerformanceMetrics.kt */
/* loaded from: classes.dex */
public final class lw90 {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final Integer r;
    public final Integer s;

    public lw90(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = num5;
        this.f = num6;
        this.g = num7;
        this.h = num8;
        this.i = num9;
        this.j = num10;
        this.k = num11;
        this.l = num12;
        this.m = num13;
        this.n = num14;
        this.o = num15;
        this.p = num16;
        this.q = num17;
        this.r = num18;
        this.s = num19;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw90)) {
            return false;
        }
        lw90 lw90Var = (lw90) obj;
        return epx.f(this.a, lw90Var.a) && epx.f(this.b, lw90Var.b) && epx.f(this.c, lw90Var.c) && epx.f(this.d, lw90Var.d) && epx.f(this.e, lw90Var.e) && epx.f(this.f, lw90Var.f) && epx.f(this.g, lw90Var.g) && epx.f(this.h, lw90Var.h) && epx.f(this.i, lw90Var.i) && epx.f(this.j, lw90Var.j) && epx.f(this.k, lw90Var.k) && epx.f(this.l, lw90Var.l) && epx.f(this.m, lw90Var.m) && epx.f(this.n, lw90Var.n) && epx.f(this.o, lw90Var.o) && epx.f(this.p, lw90Var.p) && epx.f(this.q, lw90Var.q) && epx.f(this.r, lw90Var.r) && epx.f(this.s, lw90Var.s);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.e;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.g;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.h;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.i;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.j;
        int hashCode10 = (hashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.k;
        int hashCode11 = (hashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.l;
        int hashCode12 = (hashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.m;
        int hashCode13 = (hashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.n;
        int hashCode14 = (hashCode13 + (num14 == null ? 0 : num14.hashCode())) * 31;
        Integer num15 = this.o;
        int hashCode15 = (hashCode14 + (num15 == null ? 0 : num15.hashCode())) * 31;
        Integer num16 = this.p;
        int hashCode16 = (hashCode15 + (num16 == null ? 0 : num16.hashCode())) * 31;
        Integer num17 = this.q;
        int hashCode17 = (hashCode16 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.r;
        int hashCode18 = (hashCode17 + (num18 == null ? 0 : num18.hashCode())) * 31;
        Integer num19 = this.s;
        return hashCode18 + (num19 != null ? num19.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FreezeTimesData(appFtrFeed=");
        sb.append(this.a);
        sb.append(", appFtrSuperAppFeed=");
        sb.append(this.b);
        sb.append(", appFtrDiscover=");
        sb.append(this.c);
        sb.append(", appFtrDialogs=");
        sb.append(this.d);
        sb.append(", appFtrDialog=");
        sb.append(this.e);
        sb.append(", appFtrFriends=");
        sb.append(this.f);
        sb.append(", appFtrFeedVideo=");
        sb.append(this.g);
        sb.append(", appFtrFeedFrameAggregator=");
        sb.append(this.h);
        sb.append(", appFtrClipsFeedFrameAggregator=");
        sb.append(this.i);
        sb.append(", appFtrClipsEditor=");
        sb.append(this.j);
        sb.append(", appFtrMarketItem=");
        sb.append(this.k);
        sb.append(", appFtrMarketplaceMain=");
        sb.append(this.l);
        sb.append(", appFtrMarketStorefront=");
        sb.append(this.m);
        sb.append(", appFtrNotifyFrameAggregator=");
        sb.append(this.n);
        sb.append(", appFtrMarketCart=");
        sb.append(this.o);
        sb.append(", appFtrMotionLayoutVideo=");
        sb.append(this.p);
        sb.append(", appFtrLazyColumnVideoLibrary=");
        sb.append(this.q);
        sb.append(", appFtrLazyColumnVideoChannel=");
        sb.append(this.r);
        sb.append(", appFtrLazyColumnVideoPlaylist=");
        return uqi.b(sb, this.s, ')');
    }
}
