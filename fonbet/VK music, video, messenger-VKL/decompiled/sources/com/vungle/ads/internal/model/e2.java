package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.iq;
import xsna.u500;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class e2 {
    public static final d2 Companion = new d2();
    public final Long a;

    public /* synthetic */ e2(int i, Long l) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = l;
        }
    }

    public static final void a(e2 e2Var, cti ctiVar, xfb0 xfb0Var) {
        if (!ctiVar.z() && e2Var.a == null) {
            return;
        }
        ctiVar.s(xfb0Var, 0, u500.a, e2Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2) && epx.f(this.a, ((e2) obj).a);
    }

    public final int hashCode() {
        Long l = this.a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        return iq.b(com.iab.omid.library.vungle.internal.l.a("ConfigSettings(refreshTime="), this.a, ')');
    }

    public final Long a() {
        return this.a;
    }
}
