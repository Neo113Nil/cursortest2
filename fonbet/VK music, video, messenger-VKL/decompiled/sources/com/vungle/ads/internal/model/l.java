package com.vungle.ads.internal.model;

import java.util.List;
import xsna.cti;
import xsna.epx;
import xsna.ms9;
import xsna.oqm0;
import xsna.v6o;
import xsna.xfb0;
import xsna.yk3;

/* loaded from: classes7.dex */
public final class l {
    public static final k Companion = new k();
    public final Double a;
    public final List b;
    public final List c;

    public /* synthetic */ l(int i, Double d, List list, List list2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
    }

    public static final void a(l lVar, cti ctiVar, xfb0 xfb0Var) {
        if (ctiVar.z() || lVar.a != null) {
            ctiVar.s(xfb0Var, 0, v6o.a, lVar.a);
        }
        if (ctiVar.z() || lVar.b != null) {
            ctiVar.s(xfb0Var, 1, new yk3(oqm0.a), lVar.b);
        }
        if (!ctiVar.z() && lVar.c == null) {
            return;
        }
        ctiVar.s(xfb0Var, 2, new yk3(oqm0.a), lVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return epx.f(this.a, lVar.a) && epx.f(this.b, lVar.b) && epx.f(this.c, lVar.c);
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.c;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("CSBResponse(price=");
        a.append(this.a);
        a.append(", nurls=");
        a.append(this.b);
        a.append(", lurls=");
        return ms9.a(')', a, this.c);
    }
}
