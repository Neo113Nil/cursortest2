package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class z {
    public static final y Companion = new y();
    public final c0 a;

    public /* synthetic */ z(int i, c0 c0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = c0Var;
        }
    }

    public static final void a(z zVar, cti ctiVar, xfb0 xfb0Var) {
        if (!ctiVar.z() && zVar.a == null) {
            return;
        }
        ctiVar.s(xfb0Var, 0, a0.a, zVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && epx.f(this.a, ((z) obj).a);
    }

    public final int hashCode() {
        c0 c0Var = this.a;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.hashCode();
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("ViewAbility(om=");
        a.append(this.a);
        a.append(')');
        return a.toString();
    }
}
