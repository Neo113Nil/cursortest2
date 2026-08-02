package xsna;

/* compiled from: ReefHttpRequestMetric.kt */
/* loaded from: classes5.dex */
public final class pnf0 {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final Integer j;
    public final String k;
    public final Boolean l;
    public final String m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final String r;
    public final Boolean s;
    public final Integer t;
    public final Boolean u;
    public final String v;

    public pnf0() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnf0)) {
            return false;
        }
        pnf0 pnf0Var = (pnf0) obj;
        return epx.f(this.a, pnf0Var.a) && epx.f(this.b, pnf0Var.b) && epx.f(this.c, pnf0Var.c) && epx.f(this.d, pnf0Var.d) && epx.f(this.e, pnf0Var.e) && epx.f(this.f, pnf0Var.f) && epx.f(this.g, pnf0Var.g) && epx.f(this.h, pnf0Var.h) && epx.f(this.i, pnf0Var.i) && epx.f(this.j, pnf0Var.j) && epx.f(this.k, pnf0Var.k) && epx.f(this.l, pnf0Var.l) && epx.f(this.m, pnf0Var.m) && epx.f(this.n, pnf0Var.n) && epx.f(this.o, pnf0Var.o) && epx.f(this.p, pnf0Var.p) && epx.f(this.q, pnf0Var.q) && epx.f(this.r, pnf0Var.r) && epx.f(this.s, pnf0Var.s) && epx.f(this.t, pnf0Var.t) && epx.f(this.u, pnf0Var.u) && epx.f(this.v, pnf0Var.v);
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
        Boolean bool = this.f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.g;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num6 = this.j;
        int hashCode10 = (hashCode9 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str4 = this.k;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool2 = this.l;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.m;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num7 = this.n;
        int hashCode14 = (hashCode13 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.o;
        int hashCode15 = (hashCode14 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.p;
        int hashCode16 = (hashCode15 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.q;
        int hashCode17 = (hashCode16 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str6 = this.r;
        int hashCode18 = (hashCode17 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool3 = this.s;
        int hashCode19 = (hashCode18 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num11 = this.t;
        int hashCode20 = (hashCode19 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Boolean bool4 = this.u;
        int hashCode21 = (hashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str7 = this.v;
        return hashCode21 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = wr.a(this.a, "ReefHttpRequestMetric(requestCounter=", this.b, ", connectionTime=", ", responseTtfb=");
        sq.b(a, this.c, ", sessionTime=", this.d, ", responseSize=");
        rq.h(a, this.e, ", isConnectionReused=", this.f, ", protocol=");
        n6j.b(a, this.g, ", httpRequestMethod=", this.h, ", httpRequestHost=");
        kr.b(this.j, this.i, ", httpResponseCode=", ", httpResponseContentType=", a);
        uq.c(this.l, this.k, ", isProxy=", ", proxyIpv4=", a);
        kr.b(this.n, this.m, ", domainLookupTime=", ", rtt=", a);
        sq.b(a, this.o, ", responseTime=", this.p, ", connectionTlsTime=");
        mq.b(this.q, ", tlsVersion=", this.r, ", isHttpKeepAlive=", a);
        a.append(this.s);
        a.append(", httpRequestBodySize=");
        a.append(this.t);
        a.append(", isFailed=");
        a.append(this.u);
        a.append(", failReason=");
        a.append(this.v);
        a.append(")");
        return a.toString();
    }

    public pnf0(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, String str, String str2, String str3, Integer num6, String str4, Boolean bool2, String str5, Integer num7, Integer num8, Integer num9, Integer num10, String str6, Boolean bool3, Integer num11, Boolean bool4, String str7) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = num5;
        this.f = bool;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = num6;
        this.k = str4;
        this.l = bool2;
        this.m = str5;
        this.n = num7;
        this.o = num8;
        this.p = num9;
        this.q = num10;
        this.r = str6;
        this.s = bool3;
        this.t = num11;
        this.u = bool4;
        this.v = str7;
    }
}
