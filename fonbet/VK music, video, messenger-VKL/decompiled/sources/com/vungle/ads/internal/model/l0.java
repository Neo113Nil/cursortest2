package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.ho8;
import xsna.sp;
import xsna.urd0;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class l0 {
    public static final k0 Companion = new k0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ l0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            sp.x(i, 7, j0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static final void a(l0 l0Var, cti ctiVar, xfb0 xfb0Var) {
        ctiVar.m(xfb0Var, 0, l0Var.a);
        ctiVar.m(xfb0Var, 1, l0Var.b);
        ctiVar.m(xfb0Var, 2, l0Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return epx.f(this.a, l0Var.a) && epx.f(this.b, l0Var.b) && epx.f(this.c, l0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("AppNode(bundle=");
        a.append(this.a);
        a.append(", ver=");
        a.append(this.b);
        a.append(", appId=");
        return ho8.a(a, this.c, ')');
    }

    public l0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
