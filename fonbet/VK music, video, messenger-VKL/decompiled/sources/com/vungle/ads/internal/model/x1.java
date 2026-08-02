package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.g18;
import xsna.iq;
import xsna.u500;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class x1 {
    public static final w1 Companion = new w1();
    public final Boolean a;
    public final Long b;

    public /* synthetic */ x1(int i, Boolean bool, Long l) {
        this.a = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.b = Long.MAX_VALUE;
        } else {
            this.b = l;
        }
    }

    public static final void a(x1 x1Var, cti ctiVar, xfb0 xfb0Var) {
        Long l;
        if (ctiVar.z() || !epx.f(x1Var.a, Boolean.FALSE)) {
            ctiVar.s(xfb0Var, 0, g18.a, x1Var.a);
        }
        if (ctiVar.z() || (l = x1Var.b) == null || l.longValue() != Long.MAX_VALUE) {
            ctiVar.s(xfb0Var, 1, u500.a, x1Var.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return epx.f(this.a, x1Var.a) && epx.f(this.b, x1Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("AutoRedirect(allowAutoRedirect=");
        a.append(this.a);
        a.append(", afterClickDuration=");
        return iq.b(a, this.b, ')');
    }
}
