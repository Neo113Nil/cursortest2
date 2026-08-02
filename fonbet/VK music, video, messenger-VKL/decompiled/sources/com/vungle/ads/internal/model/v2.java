package com.vungle.ads.internal.model;

import java.util.List;
import xsna.cti;
import xsna.epx;
import xsna.g18;
import xsna.n9x;
import xsna.oqm0;
import xsna.tn;
import xsna.u500;
import xsna.xfb0;
import xsna.yk3;

/* loaded from: classes7.dex */
public final class v2 {
    public static final b2 Companion = new b2();
    public final a2 a;
    public final e2 b;
    public final h2 c;
    public final r2 d;
    public final List e;
    public final u2 f;
    public final String g;
    public final Boolean h;
    public final Boolean i;
    public final Integer j;
    public final Boolean k;
    public final Integer l;
    public final Boolean m;
    public final Boolean n;
    public final Boolean o;
    public Long p;
    public x1 q;
    public Boolean r;

    public /* synthetic */ v2(int i, a2 a2Var, e2 e2Var, h2 h2Var, r2 r2Var, List list, u2 u2Var, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l, x1 x1Var, Boolean bool7) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = a2Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = e2Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = h2Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = r2Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = u2Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str;
        }
        if ((i & 128) == 0) {
            this.h = Boolean.TRUE;
        } else {
            this.h = bool;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bool3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num2;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = bool4;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool5;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = bool6;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = l;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = x1Var;
        }
        if ((i & 131072) == 0) {
            this.r = null;
        } else {
            this.r = bool7;
        }
    }

    public static final void a(v2 v2Var, cti ctiVar, xfb0 xfb0Var) {
        if (ctiVar.z() || v2Var.a != null) {
            ctiVar.s(xfb0Var, 0, y1.a, v2Var.a);
        }
        if (ctiVar.z() || v2Var.b != null) {
            ctiVar.s(xfb0Var, 1, c2.a, v2Var.b);
        }
        if (ctiVar.z() || v2Var.c != null) {
            ctiVar.s(xfb0Var, 2, f2.a, v2Var.c);
        }
        if (ctiVar.z() || v2Var.d != null) {
            ctiVar.s(xfb0Var, 3, p2.a, v2Var.d);
        }
        if (ctiVar.z() || v2Var.e != null) {
            ctiVar.s(xfb0Var, 4, new yk3(g3.a), v2Var.e);
        }
        if (ctiVar.z() || v2Var.f != null) {
            ctiVar.s(xfb0Var, 5, s2.a, v2Var.f);
        }
        if (ctiVar.z() || v2Var.g != null) {
            ctiVar.s(xfb0Var, 6, oqm0.a, v2Var.g);
        }
        if (ctiVar.z() || !epx.f(v2Var.h, Boolean.TRUE)) {
            ctiVar.s(xfb0Var, 7, g18.a, v2Var.h);
        }
        if (ctiVar.z() || v2Var.i != null) {
            ctiVar.s(xfb0Var, 8, g18.a, v2Var.i);
        }
        if (ctiVar.z() || v2Var.j != null) {
            ctiVar.s(xfb0Var, 9, n9x.a, v2Var.j);
        }
        if (ctiVar.z() || v2Var.k != null) {
            ctiVar.s(xfb0Var, 10, g18.a, v2Var.k);
        }
        if (ctiVar.z() || v2Var.l != null) {
            ctiVar.s(xfb0Var, 11, n9x.a, v2Var.l);
        }
        if (ctiVar.z() || v2Var.m != null) {
            ctiVar.s(xfb0Var, 12, g18.a, v2Var.m);
        }
        if (ctiVar.z() || v2Var.n != null) {
            ctiVar.s(xfb0Var, 13, g18.a, v2Var.n);
        }
        if (ctiVar.z() || v2Var.o != null) {
            ctiVar.s(xfb0Var, 14, g18.a, v2Var.o);
        }
        if (ctiVar.z() || v2Var.p != null) {
            ctiVar.s(xfb0Var, 15, u500.a, v2Var.p);
        }
        if (ctiVar.z() || v2Var.q != null) {
            ctiVar.s(xfb0Var, 16, v1.a, v2Var.q);
        }
        if (!ctiVar.z() && v2Var.r == null) {
            return;
        }
        ctiVar.s(xfb0Var, 17, g18.a, v2Var.r);
    }

    public final Long b() {
        return this.p;
    }

    public final e2 c() {
        return this.b;
    }

    public final h2 d() {
        return this.c;
    }

    public final List e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return epx.f(this.a, v2Var.a) && epx.f(this.b, v2Var.b) && epx.f(this.c, v2Var.c) && epx.f(this.d, v2Var.d) && epx.f(this.e, v2Var.e) && epx.f(this.f, v2Var.f) && epx.f(this.g, v2Var.g) && epx.f(this.h, v2Var.h) && epx.f(this.i, v2Var.i) && epx.f(this.j, v2Var.j) && epx.f(this.k, v2Var.k) && epx.f(this.l, v2Var.l) && epx.f(this.m, v2Var.m) && epx.f(this.n, v2Var.n) && epx.f(this.o, v2Var.o) && epx.f(this.p, v2Var.p) && epx.f(this.q, v2Var.q) && epx.f(this.r, v2Var.r);
    }

    public final int hashCode() {
        a2 a2Var = this.a;
        int hashCode = (a2Var == null ? 0 : a2Var.hashCode()) * 31;
        e2 e2Var = this.b;
        int hashCode2 = (hashCode + (e2Var == null ? 0 : e2Var.hashCode())) * 31;
        h2 h2Var = this.c;
        int hashCode3 = (hashCode2 + (h2Var == null ? 0 : h2Var.hashCode())) * 31;
        r2 r2Var = this.d;
        int hashCode4 = (hashCode3 + (r2Var == null ? 0 : r2Var.hashCode())) * 31;
        List list = this.e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        u2 u2Var = this.f;
        int hashCode6 = (hashCode5 + (u2Var == null ? 0 : u2Var.hashCode())) * 31;
        String str = this.g;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.j;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.k;
        int hashCode11 = (hashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.l;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.m;
        int hashCode13 = (hashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.n;
        int hashCode14 = (hashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.o;
        int hashCode15 = (hashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Long l = this.p;
        int hashCode16 = (hashCode15 + (l == null ? 0 : l.hashCode())) * 31;
        x1 x1Var = this.q;
        int hashCode17 = (hashCode16 + (x1Var == null ? 0 : x1Var.hashCode())) * 31;
        Boolean bool7 = this.r;
        return hashCode17 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigPayload(cleverCache=");
        sb.append(this.a);
        sb.append(", configSettings=");
        sb.append(this.b);
        sb.append(", endpoints=");
        sb.append(this.c);
        sb.append(", logMetricsSettings=");
        sb.append(this.d);
        sb.append(", placements=");
        sb.append(this.e);
        sb.append(", userPrivacy=");
        sb.append(this.f);
        sb.append(", configExtension=");
        sb.append(this.g);
        sb.append(", disableAdId=");
        sb.append(this.h);
        sb.append(", isReportIncentivizedEnabled=");
        sb.append(this.i);
        sb.append(", sessionTimeout=");
        sb.append(this.j);
        sb.append(", waitForConnectivityForTPAT=");
        sb.append(this.k);
        sb.append(", signalSessionTimeout=");
        sb.append(this.l);
        sb.append(", signalsDisabled=");
        sb.append(this.m);
        sb.append(", fpdEnabled=");
        sb.append(this.n);
        sb.append(", rtaDebugging=");
        sb.append(this.o);
        sb.append(", configLastValidatedTimestamp=");
        sb.append(this.p);
        sb.append(", autoRedirect=");
        sb.append(this.q);
        sb.append(", enableOT=");
        return tn.a(sb, this.r, ')');
    }

    public final String a() {
        return this.g;
    }

    public final void a(Long l) {
        this.p = l;
    }
}
