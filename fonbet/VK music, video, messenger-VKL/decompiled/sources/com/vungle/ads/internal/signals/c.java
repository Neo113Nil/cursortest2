package com.vungle.ads.internal.signals;

import com.vungle.ads.internal.model.p3;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import xsna.cti;
import xsna.epx;
import xsna.sp;
import xsna.vu5;
import xsna.xfb0;
import xsna.yk3;

/* loaded from: classes7.dex */
public final class c {
    public static final b Companion = new b();
    public final int a;
    public final String b;
    public long c;
    public List d;
    public long e;
    public int f;
    public List g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    public c(int i) {
        this.a = i;
        this.b = UUID.randomUUID().toString();
        this.c = System.currentTimeMillis() / 1000;
        this.d = new ArrayList();
        this.g = new ArrayList();
    }

    public static final void a(c cVar, cti ctiVar, xfb0 xfb0Var) {
        ctiVar.M(0, cVar.a, xfb0Var);
        if (ctiVar.z() || !epx.f(cVar.b, UUID.randomUUID().toString())) {
            ctiVar.m(xfb0Var, 1, cVar.b);
        }
        if (ctiVar.z() || cVar.c != System.currentTimeMillis() / 1000) {
            ctiVar.q(xfb0Var, 2, cVar.c);
        }
        if (ctiVar.z() || !epx.f(cVar.d, new ArrayList())) {
            ctiVar.n(xfb0Var, 3, new yk3(k.a), cVar.d);
        }
        if (ctiVar.z() || cVar.e != 0) {
            ctiVar.q(xfb0Var, 4, cVar.e);
        }
        if (ctiVar.z() || cVar.f != 0) {
            ctiVar.M(5, cVar.f, xfb0Var);
        }
        if (ctiVar.z() || !epx.f(cVar.g, new ArrayList())) {
            ctiVar.n(xfb0Var, 6, new yk3(p3.a), cVar.g);
        }
        if (ctiVar.z() || cVar.h != 0) {
            ctiVar.M(7, cVar.h, xfb0Var);
        }
        if (ctiVar.z() || cVar.i != 0) {
            ctiVar.M(8, cVar.i, xfb0Var);
        }
        if (ctiVar.z() || cVar.j != 0) {
            ctiVar.M(9, cVar.j, xfb0Var);
        }
        if (ctiVar.z() || cVar.k != 0) {
            ctiVar.M(10, cVar.k, xfb0Var);
        }
        if (!ctiVar.z() && cVar.l == 0) {
            return;
        }
        ctiVar.M(11, cVar.l, xfb0Var);
    }

    public final List b() {
        return this.d;
    }

    public final List c() {
        return this.g;
    }

    public final void d(int i) {
        this.k = i;
    }

    public final void e(int i) {
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a == ((c) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(com.iab.omid.library.vungle.internal.l.a("SessionData(sessionCount="), this.a, ')');
    }

    public final void b(int i) {
        this.l = i;
    }

    public final void c(int i) {
        this.j = i;
    }

    public /* synthetic */ c(int i, int i2, String str, long j, List list, long j2, int i3, List list2, int i4, int i5, int i6, int i7, int i8) {
        if (1 != (i & 1)) {
            sp.x(i, 1, a.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        if ((i & 2) == 0) {
            this.b = UUID.randomUUID().toString();
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = System.currentTimeMillis() / 1000;
        } else {
            this.c = j;
        }
        if ((i & 8) == 0) {
            this.d = new ArrayList();
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j2;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i3;
        }
        if ((i & 64) == 0) {
            this.g = new ArrayList();
        } else {
            this.g = list2;
        }
        if ((i & 128) == 0) {
            this.h = 0;
        } else {
            this.h = i4;
        }
        if ((i & 256) == 0) {
            this.i = 0;
        } else {
            this.i = i5;
        }
        if ((i & 512) == 0) {
            this.j = 0;
        } else {
            this.j = i6;
        }
        if ((i & 1024) == 0) {
            this.k = 0;
        } else {
            this.k = i7;
        }
        if ((i & 2048) == 0) {
            this.l = 0;
        } else {
            this.l = i8;
        }
    }

    public final String a() {
        return this.b;
    }

    public final void a(ArrayList arrayList) {
        this.g = arrayList;
    }

    public final void a(int i) {
        this.h = i;
    }
}
