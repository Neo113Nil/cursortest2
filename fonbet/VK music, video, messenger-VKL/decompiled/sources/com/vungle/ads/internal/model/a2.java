package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.n9x;
import xsna.u500;
import xsna.uqi;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class a2 {
    public static final z1 Companion = new z1();
    public final Long a;
    public final Integer b;

    public /* synthetic */ a2(int i, Long l, Integer num) {
        this.a = (i & 1) == 0 ? 1000L : l;
        if ((i & 2) == 0) {
            this.b = 3;
        } else {
            this.b = num;
        }
    }

    public static final void a(a2 a2Var, cti ctiVar, xfb0 xfb0Var) {
        Integer num;
        Long l;
        if (ctiVar.z() || (l = a2Var.a) == null || l.longValue() != 1000) {
            ctiVar.s(xfb0Var, 0, u500.a, a2Var.a);
        }
        if (ctiVar.z() || (num = a2Var.b) == null || num.intValue() != 3) {
            ctiVar.s(xfb0Var, 1, n9x.a, a2Var.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return epx.f(this.a, a2Var.a) && epx.f(this.b, a2Var.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("CleverCache(diskSize=");
        a.append(this.a);
        a.append(", diskPercentage=");
        return uqi.b(a, this.b, ')');
    }
}
