package com.vungle.ads.internal.model;

import java.util.List;
import xsna.cti;
import xsna.epx;
import xsna.oqm0;
import xsna.u500;
import xsna.xfb0;
import xsna.yk3;

/* loaded from: classes7.dex */
public final class p1 {
    public static final o1 Companion = new o1();
    public final List a;
    public t0 b;
    public final Long c;
    public final String d;
    public final String e;
    public final String f;
    public final c1 g;

    public /* synthetic */ p1(int i, List list, t0 t0Var, Long l, String str, String str2, String str3, c1 c1Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = t0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = c1Var;
        }
    }

    public static final void a(p1 p1Var, cti ctiVar, xfb0 xfb0Var) {
        if (ctiVar.z() || p1Var.a != null) {
            ctiVar.s(xfb0Var, 0, new yk3(oqm0.a), p1Var.a);
        }
        if (ctiVar.z() || p1Var.b != null) {
            ctiVar.s(xfb0Var, 1, r0.a, p1Var.b);
        }
        if (ctiVar.z() || p1Var.c != null) {
            ctiVar.s(xfb0Var, 2, u500.a, p1Var.c);
        }
        if (ctiVar.z() || p1Var.d != null) {
            ctiVar.s(xfb0Var, 3, oqm0.a, p1Var.d);
        }
        if (ctiVar.z() || p1Var.e != null) {
            ctiVar.s(xfb0Var, 4, oqm0.a, p1Var.e);
        }
        if (ctiVar.z() || p1Var.f != null) {
            ctiVar.s(xfb0Var, 5, oqm0.a, p1Var.f);
        }
        if (!ctiVar.z() && p1Var.g == null) {
            return;
        }
        ctiVar.s(xfb0Var, 6, a1.a, p1Var.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return epx.f(this.a, p1Var.a) && epx.f(this.b, p1Var.b) && epx.f(this.c, p1Var.c) && epx.f(this.d, p1Var.d) && epx.f(this.e, p1Var.e) && epx.f(this.f, p1Var.f) && epx.f(this.g, p1Var.g);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        t0 t0Var = this.b;
        int hashCode2 = (hashCode + (t0Var == null ? 0 : t0Var.hashCode())) * 31;
        Long l = this.c;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        c1 c1Var = this.g;
        return hashCode6 + (c1Var != null ? c1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("RequestParam(placements=");
        a.append(this.a);
        a.append(", adSize=");
        a.append(this.b);
        a.append(", adStartTime=");
        a.append(this.c);
        a.append(", advAppId=");
        a.append(this.d);
        a.append(", placementReferenceId=");
        a.append(this.e);
        a.append(", user=");
        a.append(this.f);
        a.append(", csb=");
        a.append(this.g);
        a.append(')');
        return a.toString();
    }

    public p1(List list, t0 t0Var, Long l, String str, String str2, String str3, c1 c1Var) {
        this.a = list;
        this.b = t0Var;
        this.c = l;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = c1Var;
    }

    public final List a() {
        return this.a;
    }

    public final void a(t0 t0Var) {
        this.b = t0Var;
    }

    public /* synthetic */ p1(List list, Long l, String str, String str2, String str3, c1 c1Var, int i) {
        this((i & 1) != 0 ? null : list, (t0) null, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : c1Var);
    }
}
