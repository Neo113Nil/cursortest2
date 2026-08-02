package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.sp;
import xsna.vu5;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class t0 {
    public static final s0 Companion = new s0();
    public final int a;
    public final int b;

    public t0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static final void a(t0 t0Var, cti ctiVar, xfb0 xfb0Var) {
        ctiVar.M(0, t0Var.a, xfb0Var);
        ctiVar.M(1, t0Var.b, xfb0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.a == t0Var.a && this.b == t0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("AdSizeParam(width=");
        a.append(this.a);
        a.append(", height=");
        return vu5.b(a, this.b, ')');
    }

    public /* synthetic */ t0(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            sp.x(i, 3, r0.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
    }
}
