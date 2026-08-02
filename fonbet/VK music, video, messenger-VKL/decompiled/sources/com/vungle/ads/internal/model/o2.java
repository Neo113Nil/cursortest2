package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.n9x;
import xsna.uqi;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class o2 {
    public static final m2 Companion = new m2();
    public final Integer a;

    public /* synthetic */ o2(int i, Integer num) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
    }

    public static final void a(o2 o2Var, cti ctiVar, xfb0 xfb0Var) {
        if (!ctiVar.z() && o2Var.a == null) {
            return;
        }
        ctiVar.s(xfb0Var, 0, n9x.a, o2Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2) && epx.f(this.a, ((o2) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(com.iab.omid.library.vungle.internal.l.a("IABSettings(tcfStatus="), this.a, ')');
    }
}
