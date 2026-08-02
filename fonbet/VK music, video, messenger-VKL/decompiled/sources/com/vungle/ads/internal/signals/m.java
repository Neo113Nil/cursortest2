package com.vungle.ads.internal.signals;

import xsna.cti;
import xsna.epx;
import xsna.oqm0;
import xsna.sp;
import xsna.vu5;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class m {
    public static final l Companion = new l();
    public final Long a;
    public final long b;
    public String c;
    public final long d;
    public String e;
    public long f;
    public int g;
    public long h;
    public long i;

    public /* synthetic */ m(int i, String str, long j, String str2, long j2, int i2) {
        if (2 != (i & 2)) {
            sp.x(i, 2, k.a.getDescriptor());
            throw null;
        }
        this.a = 0L;
        this.b = 0L;
        if ((i & 1) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        this.d = j;
        if ((i & 4) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 8) == 0) {
            this.f = 0L;
        } else {
            this.f = j2;
        }
        if ((i & 16) == 0) {
            this.g = 0;
        } else {
            this.g = i2;
        }
        this.h = 0L;
        this.i = 0L;
        this.d = a(0L, 0L);
    }

    public static final void a(m mVar, cti ctiVar, xfb0 xfb0Var) {
        if (ctiVar.z() || mVar.c != null) {
            ctiVar.s(xfb0Var, 0, oqm0.a, mVar.c);
        }
        ctiVar.q(xfb0Var, 1, mVar.d);
        if (ctiVar.z() || mVar.e != null) {
            ctiVar.s(xfb0Var, 2, oqm0.a, mVar.e);
        }
        if (ctiVar.z() || mVar.f != 0) {
            ctiVar.q(xfb0Var, 3, mVar.f);
        }
        if (!ctiVar.z() && mVar.g == 0) {
            return;
        }
        ctiVar.M(4, mVar.g, xfb0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return epx.f(this.a, mVar.a) && this.b == mVar.b;
    }

    public final int hashCode() {
        Long l = this.a;
        return Long.hashCode(this.b) + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("SignaledAd(lastAdLoadTime=");
        a.append(this.a);
        a.append(", loadAdTime=");
        return vu5.a(')', this.b, a);
    }

    public final void a(String str) {
        this.e = str;
    }

    public final void a(int i) {
        this.g = i;
    }

    public final void a(long j) {
        this.h = j;
    }

    public static long a(Long l, long j) {
        if (l == null) {
            return -1L;
        }
        long longValue = j - l.longValue();
        if (longValue < 0) {
            return -1L;
        }
        return longValue;
    }

    public m(Long l, long j) {
        this.a = l;
        this.b = j;
        this.d = a(l, j);
    }
}
