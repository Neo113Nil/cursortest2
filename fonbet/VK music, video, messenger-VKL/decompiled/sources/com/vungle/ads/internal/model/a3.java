package com.vungle.ads.internal.model;

import com.unity3d.services.UnityAdsConstants;
import xsna.cti;
import xsna.epx;
import xsna.ho8;
import xsna.n9x;
import xsna.oqm0;
import xsna.shy;
import xsna.u500;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class a3 {
    public static final z2 Companion = new z2();
    public boolean a;
    public String b;
    public Integer c;
    public float d;
    public String e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public float l;
    public int m;
    public boolean n;
    public int o;
    public boolean p;
    public String q;
    public String r;
    public Long s;
    public Long t;
    public Long u;
    public Long v;
    public String w;

    public /* synthetic */ a3(int i, boolean z, String str, Integer num, float f, String str2, int i2, String str3, String str4, String str5, String str6, String str7, float f2, int i3, boolean z2, int i4, boolean z3, String str8, String str9, Long l, Long l2, Long l3, Long l4, String str10) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            this.d = f;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str7;
        }
        if ((i & 2048) == 0) {
            this.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            this.l = f2;
        }
        if ((i & 4096) == 0) {
            this.m = 1;
        } else {
            this.m = i3;
        }
        if ((i & 8192) == 0) {
            this.n = false;
        } else {
            this.n = z2;
        }
        if ((i & 16384) == 0) {
            this.o = 1;
        } else {
            this.o = i4;
        }
        if ((32768 & i) == 0) {
            this.p = false;
        } else {
            this.p = z3;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str8;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = str9;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = l;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = l2;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = l3;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = l4;
        }
        if ((i & 4194304) == 0) {
            this.w = null;
        } else {
            this.w = str10;
        }
    }

    public static final void a(a3 a3Var, cti ctiVar, xfb0 xfb0Var) {
        Float valueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (ctiVar.z() || a3Var.a) {
            ctiVar.l(xfb0Var, 0, a3Var.a);
        }
        if (ctiVar.z() || a3Var.b != null) {
            ctiVar.s(xfb0Var, 1, oqm0.a, a3Var.b);
        }
        if (ctiVar.z() || a3Var.c != null) {
            ctiVar.s(xfb0Var, 2, n9x.a, a3Var.c);
        }
        if (ctiVar.z() || !Float.valueOf(a3Var.d).equals(valueOf)) {
            ctiVar.w(xfb0Var, 3, a3Var.d);
        }
        if (ctiVar.z() || a3Var.e != null) {
            ctiVar.s(xfb0Var, 4, oqm0.a, a3Var.e);
        }
        if (ctiVar.z() || a3Var.f != 0) {
            ctiVar.M(5, a3Var.f, xfb0Var);
        }
        if (ctiVar.z() || a3Var.g != null) {
            ctiVar.s(xfb0Var, 6, oqm0.a, a3Var.g);
        }
        if (ctiVar.z() || a3Var.h != null) {
            ctiVar.s(xfb0Var, 7, oqm0.a, a3Var.h);
        }
        if (ctiVar.z() || a3Var.i != null) {
            ctiVar.s(xfb0Var, 8, oqm0.a, a3Var.i);
        }
        if (ctiVar.z() || a3Var.j != null) {
            ctiVar.s(xfb0Var, 9, oqm0.a, a3Var.j);
        }
        if (ctiVar.z() || a3Var.k != null) {
            ctiVar.s(xfb0Var, 10, oqm0.a, a3Var.k);
        }
        if (ctiVar.z() || !Float.valueOf(a3Var.l).equals(valueOf)) {
            ctiVar.w(xfb0Var, 11, a3Var.l);
        }
        if (ctiVar.z() || a3Var.m != 1) {
            ctiVar.M(12, a3Var.m, xfb0Var);
        }
        if (ctiVar.z() || a3Var.n) {
            ctiVar.l(xfb0Var, 13, a3Var.n);
        }
        if (ctiVar.z() || a3Var.o != 1) {
            ctiVar.M(14, a3Var.o, xfb0Var);
        }
        if (ctiVar.z() || a3Var.p) {
            ctiVar.l(xfb0Var, 15, a3Var.p);
        }
        if (ctiVar.z() || a3Var.q != null) {
            ctiVar.s(xfb0Var, 16, oqm0.a, a3Var.q);
        }
        if (ctiVar.z() || a3Var.r != null) {
            ctiVar.s(xfb0Var, 17, oqm0.a, a3Var.r);
        }
        if (ctiVar.z() || a3Var.s != null) {
            ctiVar.s(xfb0Var, 18, u500.a, a3Var.s);
        }
        if (ctiVar.z() || a3Var.t != null) {
            ctiVar.s(xfb0Var, 19, u500.a, a3Var.t);
        }
        if (ctiVar.z() || a3Var.u != null) {
            ctiVar.s(xfb0Var, 20, u500.a, a3Var.u);
        }
        if (ctiVar.z() || a3Var.v != null) {
            ctiVar.s(xfb0Var, 21, u500.a, a3Var.v);
        }
        if (!ctiVar.z() && a3Var.w == null) {
            return;
        }
        ctiVar.s(xfb0Var, 22, oqm0.a, a3Var.w);
    }

    public final void b(String str) {
        this.b = str;
    }

    public final void c(String str) {
        this.e = str;
    }

    public final void d(String str) {
        this.g = str;
    }

    public final void e(String str) {
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return this.a == a3Var.a && epx.f(this.b, a3Var.b) && epx.f(this.c, a3Var.c) && Float.valueOf(this.d).equals(Float.valueOf(a3Var.d)) && epx.f(this.e, a3Var.e) && this.f == a3Var.f && epx.f(this.g, a3Var.g) && epx.f(this.h, a3Var.h) && epx.f(this.i, a3Var.i) && epx.f(this.j, a3Var.j) && epx.f(this.k, a3Var.k) && Float.valueOf(this.l).equals(Float.valueOf(a3Var.l)) && this.m == a3Var.m && this.n == a3Var.n && this.o == a3Var.o && this.p == a3Var.p && epx.f(this.q, a3Var.q) && epx.f(this.r, a3Var.r) && epx.f(this.s, a3Var.s) && epx.f(this.t, a3Var.t) && epx.f(this.u, a3Var.u) && epx.f(this.v, a3Var.v) && epx.f(this.w, a3Var.w);
    }

    public final void f(String str) {
        this.q = str;
    }

    public final void g(String str) {
        this.w = str;
    }

    public final void h(String str) {
        this.j = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r3v28, types: [boolean] */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.b;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        int a = io.reactivex.rxjava3.subjects.b.a(this.d, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str2 = this.e;
        int a2 = shy.a(this.f, (a + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.g;
        int hashCode2 = (a2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int hashCode5 = (hashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int a3 = shy.a(this.m, io.reactivex.rxjava3.subjects.b.a(this.l, (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31, 31), 31);
        ?? r3 = this.n;
        int i2 = r3;
        if (r3 != 0) {
            i2 = 1;
        }
        int a4 = shy.a(this.o, (a3 + i2) * 31, 31);
        boolean z2 = this.p;
        int i3 = (a4 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        String str8 = this.q;
        int hashCode6 = (i3 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.r;
        int hashCode7 = (hashCode6 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l = this.s;
        int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.t;
        int hashCode9 = (hashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.u;
        int hashCode10 = (hashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.v;
        int hashCode11 = (hashCode10 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str10 = this.w;
        return hashCode11 + (str10 != null ? str10.hashCode() : 0);
    }

    public final void i(String str) {
        this.i = str;
    }

    public final void j(String str) {
        this.k = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VungleExt(isGooglePlayServicesAvailable=");
        sb.append(this.a);
        sb.append(", appSetId=");
        sb.append(this.b);
        sb.append(", appSetIdScope=");
        sb.append(this.c);
        sb.append(", batteryLevel=");
        sb.append(this.d);
        sb.append(", batteryState=");
        sb.append(this.e);
        sb.append(", batterySaverEnabled=");
        sb.append(this.f);
        sb.append(", connectionType=");
        sb.append(this.g);
        sb.append(", connectionTypeDetail=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", language=");
        sb.append(this.j);
        sb.append(", timeZone=");
        sb.append(this.k);
        sb.append(", volumeLevel=");
        sb.append(this.l);
        sb.append(", soundEnabled=");
        sb.append(this.m);
        sb.append(", isTv=");
        sb.append(this.n);
        sb.append(", sdCardAvailable=");
        sb.append(this.o);
        sb.append(", isSideloadEnabled=");
        sb.append(this.p);
        sb.append(", gaid=");
        sb.append(this.q);
        sb.append(", amazonAdvertisingId=");
        sb.append(this.r);
        sb.append(", sit=");
        sb.append(this.s);
        sb.append(", oit=");
        sb.append(this.t);
        sb.append(", ort=");
        sb.append(this.u);
        sb.append(", obt=");
        sb.append(this.v);
        sb.append(", gpVersion=");
        return ho8.a(sb, this.w, ')');
    }

    public a3(boolean z, String str, Integer num, float f, String str2, int i, String str3, String str4, String str5, String str6, String str7, float f2, int i2, boolean z2, int i3, boolean z3, String str8, String str9, Long l, Long l2, Long l3, Long l4, String str10) {
        this.a = z;
        this.b = str;
        this.c = num;
        this.d = f;
        this.e = str2;
        this.f = i;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = f2;
        this.m = i2;
        this.n = z2;
        this.o = i3;
        this.p = z3;
        this.q = str8;
        this.r = str9;
        this.s = l;
        this.t = l2;
        this.u = l3;
        this.v = l4;
        this.w = str10;
    }

    public final void b(float f) {
        this.l = f;
    }

    public final void c(int i) {
        this.m = i;
    }

    public final void d(Long l) {
        this.s = l;
    }

    public final void b(boolean z) {
        this.n = z;
    }

    public final void c(Long l) {
        this.u = l;
    }

    public final void b(int i) {
        this.o = i;
    }

    public final void b(Long l) {
        this.t = l;
    }

    public final void a(boolean z) {
        this.a = z;
    }

    public final void a(Integer num) {
        this.c = num;
    }

    public final void a(float f) {
        this.d = f;
    }

    public final void a(int i) {
        this.f = i;
    }

    public final void a() {
        this.p = false;
    }

    public final void a(String str) {
        this.r = str;
    }

    public final void a(Long l) {
        this.v = l;
    }

    public /* synthetic */ a3() {
        this(false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, false, 1, false, null, null, null, null, null, null, null);
    }
}
