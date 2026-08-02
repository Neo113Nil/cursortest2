package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.g18;
import xsna.sp;
import xsna.tn;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class z0 {
    public static final y0 Companion = new y0();
    public final Boolean a;

    public /* synthetic */ z0(int i, Boolean bool) {
        if (1 == (i & 1)) {
            this.a = bool;
        } else {
            sp.x(i, 1, x0.a.getDescriptor());
            throw null;
        }
    }

    public static final void a(z0 z0Var, cti ctiVar, xfb0 xfb0Var) {
        ctiVar.s(xfb0Var, 0, g18.a, z0Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0) && epx.f(this.a, ((z0) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return tn.a(com.iab.omid.library.vungle.internal.l.a("COPPA(isCoppa="), this.a, ')');
    }

    public z0(Boolean bool) {
        this.a = bool;
    }
}
