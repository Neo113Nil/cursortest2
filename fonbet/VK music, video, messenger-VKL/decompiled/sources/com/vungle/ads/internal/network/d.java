package com.vungle.ads.internal.network;

import java.util.Map;
import xsna.cti;
import xsna.epx;
import xsna.ho8;
import xsna.jdz;
import xsna.oqm0;
import xsna.shy;
import xsna.sp;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class d {
    public static final c Companion = new c();
    public final g a;
    public final Map b;
    public final String c;
    public int d;
    public int e;
    public String f;

    public /* synthetic */ d(int i, g gVar, Map map, String str, int i2, int i3, String str2) {
        if (16 != (i & 16)) {
            sp.x(i, 16, b.a.getDescriptor());
            throw null;
        }
        this.a = (i & 1) == 0 ? g.GET : gVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i2;
        }
        this.e = i3;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
    }

    public static d a(d dVar, int i) {
        return new d(dVar.a, dVar.b, dVar.c, i, dVar.e, dVar.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && this.d == dVar.d && this.e == dVar.e && epx.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.c;
        int a = shy.a(this.e, shy.a(this.d, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.f;
        return a + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("FailedTpat(method=");
        a.append(this.a);
        a.append(", headers=");
        a.append(this.b);
        a.append(", body=");
        a.append(this.c);
        a.append(", retryAttempt=");
        a.append(this.d);
        a.append(", retryCount=");
        a.append(this.e);
        a.append(", tpatKey=");
        return ho8.a(a, this.f, ')');
    }

    public static final void a(d dVar, cti ctiVar, xfb0 xfb0Var) {
        if (ctiVar.z() || dVar.a != g.GET) {
            ctiVar.n(xfb0Var, 0, e.a, dVar.a);
        }
        if (ctiVar.z() || dVar.b != null) {
            oqm0 oqm0Var = oqm0.a;
            ctiVar.s(xfb0Var, 1, new jdz(oqm0Var, oqm0Var), dVar.b);
        }
        if (ctiVar.z() || dVar.c != null) {
            ctiVar.s(xfb0Var, 2, oqm0.a, dVar.c);
        }
        if (ctiVar.z() || dVar.d != 0) {
            ctiVar.M(3, dVar.d, xfb0Var);
        }
        ctiVar.M(4, dVar.e, xfb0Var);
        if (!ctiVar.z() && dVar.f == null) {
            return;
        }
        ctiVar.s(xfb0Var, 5, oqm0.a, dVar.f);
    }

    public d(g gVar, Map map, String str, int i, int i2, String str2) {
        this.a = gVar;
        this.b = map;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = str2;
    }

    public final int a() {
        return this.d;
    }
}
