package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.g18;
import xsna.n9x;
import xsna.tn;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class r2 {
    public static final q2 Companion = new q2();
    public final Integer a;
    public final Boolean b;

    public /* synthetic */ r2(int i, Integer num, Boolean bool) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
    }

    public static final void a(r2 r2Var, cti ctiVar, xfb0 xfb0Var) {
        if (ctiVar.z() || r2Var.a != null) {
            ctiVar.s(xfb0Var, 0, n9x.a, r2Var.a);
        }
        if (!ctiVar.z() && r2Var.b == null) {
            return;
        }
        ctiVar.s(xfb0Var, 1, g18.a, r2Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return epx.f(this.a, r2Var.a) && epx.f(this.b, r2Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("LogMetricsSettings(errorLogLevel=");
        a.append(this.a);
        a.append(", metricsEnabled=");
        return tn.a(a, this.b, ')');
    }
}
