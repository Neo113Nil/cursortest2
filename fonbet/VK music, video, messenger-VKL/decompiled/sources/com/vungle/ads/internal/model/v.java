package com.vungle.ads.internal.model;

import java.util.Map;
import xsna.cjl0;
import xsna.cti;
import xsna.epx;
import xsna.jdz;
import xsna.oqm0;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class v {
    public static final u Companion = new u();
    public final Map a;
    public final Map b;

    public /* synthetic */ v(int i, Map map, Map map2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = map;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map2;
        }
    }

    public static final void a(v vVar, cti ctiVar, xfb0 xfb0Var) {
        if (ctiVar.z() || vVar.a != null) {
            oqm0 oqm0Var = oqm0.a;
            ctiVar.s(xfb0Var, 0, new jdz(oqm0Var, oqm0Var), vVar.a);
        }
        if (!ctiVar.z() && vVar.b == null) {
            return;
        }
        ctiVar.s(xfb0Var, 1, new jdz(oqm0.a, m.a), vVar.b);
    }

    public final Map b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return epx.f(this.a, vVar.a) && epx.f(this.b, vVar.b);
    }

    public final int hashCode() {
        Map map = this.a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.b;
        return hashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("TemplateSettings(normalReplacements=");
        a.append(this.a);
        a.append(", cacheableReplacements=");
        return cjl0.a(a, this.b, ')');
    }

    public final Map a() {
        return this.b;
    }
}
