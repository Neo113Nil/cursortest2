package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.ho8;
import xsna.oqm0;
import xsna.shy;
import xsna.sp;
import xsna.urd0;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class c1 {
    public static final b1 Companion = new b1();
    public final double a;
    public final int b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public c1(double d, int i, boolean z, String str, String str2, String str3, String str4) {
        this.a = d;
        this.b = i;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    public static final void a(c1 c1Var, cti ctiVar, xfb0 xfb0Var) {
        ctiVar.Q(xfb0Var, 0, c1Var.a);
        ctiVar.M(1, c1Var.b, xfb0Var);
        ctiVar.l(xfb0Var, 2, c1Var.c);
        ctiVar.m(xfb0Var, 3, c1Var.d);
        ctiVar.m(xfb0Var, 4, c1Var.e);
        ctiVar.m(xfb0Var, 5, c1Var.f);
        if (!ctiVar.z() && c1Var.g == null) {
            return;
        }
        ctiVar.s(xfb0Var, 6, oqm0.a, c1Var.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Double.valueOf(this.a).equals(Double.valueOf(c1Var.a)) && this.b == c1Var.b && this.c == c1Var.c && epx.f(this.d, c1Var.d) && epx.f(this.e, c1Var.e) && epx.f(this.f, c1Var.f) && epx.f(this.g, c1Var.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int a = shy.a(this.b, Double.hashCode(this.a) * 31, 31);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int a2 = urd0.a(urd0.a(urd0.a((a + i) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("CSBParam(bidfloor=");
        a.append(this.a);
        a.append(", phase=");
        a.append(this.b);
        a.append(", isVXWinner=");
        a.append(this.c);
        a.append(", parentAuctionId=");
        a.append(this.d);
        a.append(", creativeId=");
        a.append(this.e);
        a.append(", adUnitId=");
        a.append(this.f);
        a.append(", ext=");
        return ho8.a(a, this.g, ')');
    }

    public /* synthetic */ c1(int i, double d, int i2, boolean z, String str, String str2, String str3, String str4) {
        if (63 != (i & 63)) {
            sp.x(i, 63, a1.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = i2;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
    }
}
