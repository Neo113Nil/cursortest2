package com.vungle.ads.internal.model;

import xsna.cti;
import xsna.epx;
import xsna.n9x;
import xsna.oqm0;
import xsna.uqi;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class o {
    public static final n Companion = new n();
    public final String a;
    public final String b;
    public final Integer c;

    public /* synthetic */ o(int i, String str, String str2, Integer num) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
    }

    public static final void a(o oVar, cti ctiVar, xfb0 xfb0Var) {
        if (ctiVar.z() || oVar.a != null) {
            ctiVar.s(xfb0Var, 0, oqm0.a, oVar.a);
        }
        if (ctiVar.z() || oVar.b != null) {
            ctiVar.s(xfb0Var, 1, oqm0.a, oVar.b);
        }
        if (!ctiVar.z() && oVar.c == null) {
            return;
        }
        ctiVar.s(xfb0Var, 2, n9x.a, oVar.c);
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return epx.f(this.a, oVar.a) && epx.f(this.b, oVar.b) && epx.f(this.c, oVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("CacheableReplacement(url=");
        a.append(this.a);
        a.append(", extension=");
        a.append(this.b);
        a.append(", downloadPercent=");
        return uqi.b(a, this.c, ')');
    }

    public final Integer a() {
        return this.c;
    }
}
