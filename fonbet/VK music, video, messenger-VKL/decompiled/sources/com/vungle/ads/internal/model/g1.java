package com.vungle.ads.internal.model;

import xsna.bh10;
import xsna.cti;
import xsna.epx;
import xsna.ho8;
import xsna.sp;
import xsna.urd0;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class g1 {
    public static final f1 Companion = new f1();
    public final String a;
    public final String b;
    public final long c;
    public final String d;

    public /* synthetic */ g1(int i, String str, String str2, long j, String str3) {
        if (15 != (i & 15)) {
            sp.x(i, 15, e1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
    }

    public static final void a(g1 g1Var, cti ctiVar, xfb0 xfb0Var) {
        ctiVar.m(xfb0Var, 0, g1Var.a);
        ctiVar.m(xfb0Var, 1, g1Var.b);
        ctiVar.q(xfb0Var, 2, g1Var.c);
        ctiVar.m(xfb0Var, 3, g1Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return epx.f(this.a, g1Var.a) && epx.f(this.b, g1Var.b) && this.c == g1Var.c && epx.f(this.d, g1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + bh10.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("GDPR(consentStatus=");
        a.append(this.a);
        a.append(", consentSource=");
        a.append(this.b);
        a.append(", consentTimestamp=");
        a.append(this.c);
        a.append(", consentMessageVersion=");
        return ho8.a(a, this.d, ')');
    }

    public g1(long j, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
    }
}
