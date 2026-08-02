package com.vungle.ads.internal.model;

import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.Map;
import xsna.cti;
import xsna.epx;
import xsna.g18;
import xsna.n9x;
import xsna.oqm0;
import xsna.uqi;
import xsna.xfb0;
import xsna.yk3;

/* loaded from: classes7.dex */
public final class i {
    public static final h Companion = new h();
    public final f0 A;
    public final Boolean B;
    public final Boolean C;
    public final Integer D;
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final Boolean g;
    public final Boolean h;
    public final String i;
    public final String j;
    public final Integer k;
    public final Integer l;
    public final Map m;
    public final String n;
    public final String o;
    public final String p;
    public final List q;
    public final List r;
    public final z s;
    public final String t;
    public final v u;
    public final String v;
    public final String w;
    public final Integer x;
    public final Integer y;
    public final f z;

    public /* synthetic */ i(int i, String str, String str2, String str3, Integer num, Integer num2, String str4, Boolean bool, Boolean bool2, String str5, String str6, Integer num3, Integer num4, Map map, String str7, String str8, String str9, List list, List list2, z zVar, String str10, v vVar, String str11, String str12, Integer num5, Integer num6, f fVar, f0 f0Var, Boolean bool3, Boolean bool4, Integer num7) {
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
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool2;
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
            this.k = num3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = num4;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = map;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = str7;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = str8;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = str9;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = list;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = list2;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = zVar;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = str10;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = vVar;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = str11;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = str12;
        }
        if ((8388608 & i) == 0) {
            this.x = 0;
        } else {
            this.x = num5;
        }
        if ((16777216 & i) == 0) {
            this.y = 0;
        } else {
            this.y = num6;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = fVar;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = f0Var;
        }
        this.B = (134217728 & i) == 0 ? Boolean.FALSE : bool3;
        if ((268435456 & i) == 0) {
            this.C = null;
        } else {
            this.C = bool4;
        }
        if ((i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0) {
            this.D = 0;
        } else {
            this.D = num7;
        }
    }

    public static final void a(i iVar, cti ctiVar, xfb0 xfb0Var) {
        Integer num;
        Integer num2;
        Integer num3;
        if (ctiVar.z() || iVar.a != null) {
            ctiVar.s(xfb0Var, 0, oqm0.a, iVar.a);
        }
        if (ctiVar.z() || iVar.b != null) {
            ctiVar.s(xfb0Var, 1, oqm0.a, iVar.b);
        }
        if (ctiVar.z() || iVar.c != null) {
            ctiVar.s(xfb0Var, 2, oqm0.a, iVar.c);
        }
        if (ctiVar.z() || iVar.d != null) {
            ctiVar.s(xfb0Var, 3, n9x.a, iVar.d);
        }
        if (ctiVar.z() || iVar.e != null) {
            ctiVar.s(xfb0Var, 4, n9x.a, iVar.e);
        }
        if (ctiVar.z() || iVar.f != null) {
            ctiVar.s(xfb0Var, 5, oqm0.a, iVar.f);
        }
        if (ctiVar.z() || iVar.g != null) {
            ctiVar.s(xfb0Var, 6, g18.a, iVar.g);
        }
        if (ctiVar.z() || iVar.h != null) {
            ctiVar.s(xfb0Var, 7, g18.a, iVar.h);
        }
        if (ctiVar.z() || iVar.i != null) {
            ctiVar.s(xfb0Var, 8, oqm0.a, iVar.i);
        }
        if (ctiVar.z() || iVar.j != null) {
            ctiVar.s(xfb0Var, 9, oqm0.a, iVar.j);
        }
        if (ctiVar.z() || iVar.k != null) {
            ctiVar.s(xfb0Var, 10, n9x.a, iVar.k);
        }
        if (ctiVar.z() || iVar.l != null) {
            ctiVar.s(xfb0Var, 11, n9x.a, iVar.l);
        }
        if (ctiVar.z() || iVar.m != null) {
            ctiVar.s(xfb0Var, 12, w.a, iVar.m);
        }
        if (ctiVar.z() || iVar.n != null) {
            ctiVar.s(xfb0Var, 13, oqm0.a, iVar.n);
        }
        if (ctiVar.z() || iVar.o != null) {
            ctiVar.s(xfb0Var, 14, oqm0.a, iVar.o);
        }
        if (ctiVar.z() || iVar.p != null) {
            ctiVar.s(xfb0Var, 15, oqm0.a, iVar.p);
        }
        if (ctiVar.z() || iVar.q != null) {
            ctiVar.s(xfb0Var, 16, new yk3(oqm0.a), iVar.q);
        }
        if (ctiVar.z() || iVar.r != null) {
            ctiVar.s(xfb0Var, 17, new yk3(oqm0.a), iVar.r);
        }
        if (ctiVar.z() || iVar.s != null) {
            ctiVar.s(xfb0Var, 18, x.a, iVar.s);
        }
        if (ctiVar.z() || iVar.t != null) {
            ctiVar.s(xfb0Var, 19, oqm0.a, iVar.t);
        }
        if (ctiVar.z() || iVar.u != null) {
            ctiVar.s(xfb0Var, 20, t.a, iVar.u);
        }
        if (ctiVar.z() || iVar.v != null) {
            ctiVar.s(xfb0Var, 21, oqm0.a, iVar.v);
        }
        if (ctiVar.z() || iVar.w != null) {
            ctiVar.s(xfb0Var, 22, oqm0.a, iVar.w);
        }
        if (ctiVar.z() || (num3 = iVar.x) == null || num3.intValue() != 0) {
            ctiVar.s(xfb0Var, 23, n9x.a, iVar.x);
        }
        if (ctiVar.z() || (num2 = iVar.y) == null || num2.intValue() != 0) {
            ctiVar.s(xfb0Var, 24, n9x.a, iVar.y);
        }
        if (ctiVar.z() || iVar.z != null) {
            ctiVar.s(xfb0Var, 25, d.a, iVar.z);
        }
        if (ctiVar.z() || iVar.A != null) {
            ctiVar.s(xfb0Var, 26, d0.a, iVar.A);
        }
        if (ctiVar.z() || !epx.f(iVar.B, Boolean.FALSE)) {
            ctiVar.s(xfb0Var, 27, g18.a, iVar.B);
        }
        if (ctiVar.z() || iVar.C != null) {
            ctiVar.s(xfb0Var, 28, g18.a, iVar.C);
        }
        if (ctiVar.z() || (num = iVar.D) == null || num.intValue() != 0) {
            ctiVar.s(xfb0Var, 29, n9x.a, iVar.D);
        }
    }

    public final Integer b() {
        return this.l;
    }

    public final Integer c() {
        return this.d;
    }

    public final String d() {
        return this.j;
    }

    public final List e() {
        return this.r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return epx.f(this.a, iVar.a) && epx.f(this.b, iVar.b) && epx.f(this.c, iVar.c) && epx.f(this.d, iVar.d) && epx.f(this.e, iVar.e) && epx.f(this.f, iVar.f) && epx.f(this.g, iVar.g) && epx.f(this.h, iVar.h) && epx.f(this.i, iVar.i) && epx.f(this.j, iVar.j) && epx.f(this.k, iVar.k) && epx.f(this.l, iVar.l) && epx.f(this.m, iVar.m) && epx.f(this.n, iVar.n) && epx.f(this.o, iVar.o) && epx.f(this.p, iVar.p) && epx.f(this.q, iVar.q) && epx.f(this.r, iVar.r) && epx.f(this.s, iVar.s) && epx.f(this.t, iVar.t) && epx.f(this.u, iVar.u) && epx.f(this.v, iVar.v) && epx.f(this.w, iVar.w) && epx.f(this.x, iVar.x) && epx.f(this.y, iVar.y) && epx.f(this.z, iVar.z) && epx.f(this.A, iVar.A) && epx.f(this.B, iVar.B) && epx.f(this.C, iVar.C) && epx.f(this.D, iVar.D);
    }

    public final Integer f() {
        return this.D;
    }

    public final Integer g() {
        return this.x;
    }

    public final Integer h() {
        return this.y;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.g;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.k;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.l;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Map map = this.m;
        int hashCode13 = (hashCode12 + (map == null ? 0 : map.hashCode())) * 31;
        String str7 = this.n;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.o;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.p;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List list = this.q;
        int hashCode17 = (hashCode16 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.r;
        int hashCode18 = (hashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
        z zVar = this.s;
        int hashCode19 = (hashCode18 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        String str10 = this.t;
        int hashCode20 = (hashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        v vVar = this.u;
        int hashCode21 = (hashCode20 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        String str11 = this.v;
        int hashCode22 = (hashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.w;
        int hashCode23 = (hashCode22 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num5 = this.x;
        int hashCode24 = (hashCode23 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.y;
        int hashCode25 = (hashCode24 + (num6 == null ? 0 : num6.hashCode())) * 31;
        f fVar = this.z;
        int hashCode26 = (hashCode25 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        f0 f0Var = this.A;
        int hashCode27 = (hashCode26 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        Boolean bool3 = this.B;
        int hashCode28 = (hashCode27 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.C;
        int hashCode29 = (hashCode28 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num7 = this.D;
        return hashCode29 + (num7 != null ? num7.hashCode() : 0);
    }

    public final Integer i() {
        return this.k;
    }

    public final v j() {
        return this.u;
    }

    public final Map k() {
        return this.m;
    }

    public final Boolean l() {
        return this.B;
    }

    public final String m() {
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdUnit(id=");
        sb.append(this.a);
        sb.append(", adType=");
        sb.append(this.b);
        sb.append(", adSource=");
        sb.append(this.c);
        sb.append(", expiry=");
        sb.append(this.d);
        sb.append(", expiryDuration=");
        sb.append(this.e);
        sb.append(", deeplinkUrl=");
        sb.append(this.f);
        sb.append(", clickCoordinatesEnabled=");
        sb.append(this.g);
        sb.append(", adLoadOptimizationEnabled=");
        sb.append(this.h);
        sb.append(", mediationName=");
        sb.append(this.i);
        sb.append(", info=");
        sb.append(this.j);
        sb.append(", sleep=");
        sb.append(this.k);
        sb.append(", errorCode=");
        sb.append(this.l);
        sb.append(", tpat=");
        sb.append(this.m);
        sb.append(", vmURL=");
        sb.append(this.n);
        sb.append(", vmVersion=");
        sb.append(this.o);
        sb.append(", adMarketId=");
        sb.append(this.p);
        sb.append(", notification=");
        sb.append(this.q);
        sb.append(", loadAdUrls=");
        sb.append(this.r);
        sb.append(", viewAbility=");
        sb.append(this.s);
        sb.append(", templateType=");
        sb.append(this.t);
        sb.append(", templateSettings=");
        sb.append(this.u);
        sb.append(", creativeId=");
        sb.append(this.v);
        sb.append(", advAppId=");
        sb.append(this.w);
        sb.append(", showClose=");
        sb.append(this.x);
        sb.append(", showCloseIncentivized=");
        sb.append(this.y);
        sb.append(", adSizeInfo=");
        sb.append(this.z);
        sb.append(", webViewSettings=");
        sb.append(this.A);
        sb.append(", usePreloading=");
        sb.append(this.B);
        sb.append(", partialDownloadEnabled=");
        sb.append(this.C);
        sb.append(", maxDownloadRetryAttempts=");
        return uqi.b(sb, this.D, ')');
    }

    public final String a() {
        return this.f;
    }
}
