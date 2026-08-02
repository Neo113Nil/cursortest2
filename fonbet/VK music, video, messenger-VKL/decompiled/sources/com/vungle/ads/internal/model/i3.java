package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.ho8;
import xsna.oqm0;
import xsna.sp;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class i3 {
    public static final h3 Companion = new h3();
    public final String a;
    public final boolean b;
    public final String c;

    public /* synthetic */ i3(int i, String str, boolean z, String str2) {
        if (1 != (i & 1)) {
            sp.x(i, 1, g3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public static final void a(i3 i3Var, cti ctiVar, xfb0 xfb0Var) {
        ctiVar.m(xfb0Var, 0, i3Var.a);
        if (ctiVar.z() || i3Var.b) {
            ctiVar.l(xfb0Var, 1, i3Var.b);
        }
        if (!ctiVar.z() && i3Var.c == null) {
            return;
        }
        ctiVar.s(xfb0Var, 2, oqm0.a, i3Var.c);
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final boolean d() {
        return epx.f(this.c, "appopen");
    }

    public final boolean e() {
        return epx.f(this.c, "banner");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return epx.f(this.a, i3Var.a) && this.b == i3Var.b && epx.f(this.c, i3Var.c);
    }

    public final boolean f() {
        return epx.f(this.c, "in_line");
    }

    public final boolean g() {
        return epx.f(this.c, "interstitial");
    }

    public final boolean h() {
        return epx.f(this.c, "mrec");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.c;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public final boolean i() {
        return epx.f(this.c, "native");
    }

    public final boolean j() {
        return epx.f(this.c, "rewarded");
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Placement(referenceId=");
        a.append(this.a);
        a.append(", headerBidding=");
        a.append(this.b);
        a.append(", type=");
        return ho8.a(a, this.c, ')');
    }

    public i3(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean a() {
        return this.b;
    }

    public /* synthetic */ i3(String str) {
        this(str, null, false);
    }
}
