package com.vungle.ads.internal.model;

import com.vungle.ads.internal.protos.Sdk;
import xsna.cti;
import xsna.epx;
import xsna.n9x;
import xsna.oqm0;
import xsna.shy;
import xsna.sp;
import xsna.urd0;
import xsna.xfb0;

/* loaded from: classes7.dex */
public final class b3 {
    public static final x2 Companion = new x2();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public int f;
    public int g;
    public String h;
    public String i;
    public Integer j;
    public a3 k;

    public /* synthetic */ b3(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, String str7, Integer num, a3 a3Var) {
        if (119 != (i & Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE)) {
            sp.x(i, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, w2.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        this.e = str5;
        this.f = i2;
        this.g = i3;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str6;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str7;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = a3Var;
        }
    }

    public static b3 a(b3 b3Var) {
        return new b3(b3Var.a, b3Var.b, b3Var.c, b3Var.d, b3Var.e, b3Var.f, b3Var.g, b3Var.h, b3Var.i, b3Var.j, b3Var.k);
    }

    public final void b(int i) {
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return epx.f(this.a, b3Var.a) && epx.f(this.b, b3Var.b) && epx.f(this.c, b3Var.c) && epx.f(this.d, b3Var.d) && epx.f(this.e, b3Var.e) && this.f == b3Var.f && this.g == b3Var.g && epx.f(this.h, b3Var.h) && epx.f(this.i, b3Var.i) && epx.f(this.j, b3Var.j) && epx.f(this.k, b3Var.k);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int a2 = shy.a(this.g, shy.a(this.f, urd0.a((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31), 31);
        String str2 = this.h;
        int hashCode = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.j;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        a3 a3Var = this.k;
        return hashCode3 + (a3Var != null ? a3Var.hashCode() : 0);
    }

    public final String toString() {
        return "DeviceNode(make=" + this.a + ", model=" + this.b + ", osv=" + this.c + ", carrier=" + this.d + ", os=" + this.e + ", w=" + this.f + ", h=" + this.g + ", ua=" + this.h + ", ifa=" + this.i + ", lmt=" + this.j + ", ext=" + this.k + ')';
    }

    public b3(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, Integer num, a3 a3Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = i2;
        this.h = str6;
        this.i = str7;
        this.j = num;
        this.k = a3Var;
    }

    public static final void a(b3 b3Var, cti ctiVar, xfb0 xfb0Var) {
        ctiVar.m(xfb0Var, 0, b3Var.a);
        ctiVar.m(xfb0Var, 1, b3Var.b);
        ctiVar.m(xfb0Var, 2, b3Var.c);
        if (ctiVar.z() || b3Var.d != null) {
            ctiVar.s(xfb0Var, 3, oqm0.a, b3Var.d);
        }
        ctiVar.m(xfb0Var, 4, b3Var.e);
        ctiVar.M(5, b3Var.f, xfb0Var);
        ctiVar.M(6, b3Var.g, xfb0Var);
        if (ctiVar.z() || b3Var.h != null) {
            ctiVar.s(xfb0Var, 7, oqm0.a, b3Var.h);
        }
        if (ctiVar.z() || b3Var.i != null) {
            ctiVar.s(xfb0Var, 8, oqm0.a, b3Var.i);
        }
        if (ctiVar.z() || b3Var.j != null) {
            ctiVar.s(xfb0Var, 9, n9x.a, b3Var.j);
        }
        if (!ctiVar.z() && b3Var.k == null) {
            return;
        }
        ctiVar.s(xfb0Var, 10, y2.a, b3Var.k);
    }

    public final void b(String str) {
        this.h = str;
    }

    public final void a(int i) {
        this.g = i;
    }

    public final void a(String str) {
        this.i = str;
    }

    public final void a(Integer num) {
        this.j = num;
    }

    public final void a(a3 a3Var) {
        this.k = a3Var;
    }

    public /* synthetic */ b3(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6) {
        this(str, str2, str3, str4, str5, i, i2, str6, null, null, null);
    }
}
