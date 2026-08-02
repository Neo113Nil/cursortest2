package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.pm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5100pm {
    public final Map A;
    public final N9 B;
    public final String a;
    public final String b;
    public final C5203tm c;
    public final String d;
    public final List e;
    public final List f;
    public final List g;
    public final Map h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final C5286x4 n;
    public final long o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final Ie s;
    public final RetryPolicyConfig t;
    public final long u;
    public final long v;
    public final boolean w;
    public final C5081p3 x;
    public final C5309y2 y;
    public final Mm z;

    public C5100pm(String str, String str2, C5203tm c5203tm) {
        this.a = str;
        this.b = str2;
        this.c = c5203tm;
        this.d = c5203tm.a;
        this.e = c5203tm.b;
        this.f = c5203tm.f;
        this.g = c5203tm.g;
        this.h = c5203tm.i;
        this.i = c5203tm.c;
        this.j = c5203tm.d;
        this.k = c5203tm.j;
        this.l = c5203tm.k;
        this.m = c5203tm.l;
        this.n = c5203tm.m;
        this.o = c5203tm.n;
        this.p = c5203tm.o;
        this.q = c5203tm.p;
        this.r = c5203tm.q;
        this.s = c5203tm.s;
        this.t = c5203tm.t;
        this.u = c5203tm.u;
        this.v = c5203tm.v;
        this.w = c5203tm.w;
        this.x = c5203tm.x;
        this.y = c5203tm.y;
        this.z = c5203tm.z;
        this.A = c5203tm.A;
        this.B = c5203tm.B;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.a + ", deviceIdHash=" + this.b + ", startupStateModel=" + this.c + ')';
    }
}
