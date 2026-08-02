package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.tm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5203tm {
    public final Map A;
    public final N9 B;
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final List h;
    public final Map i;
    public final String j;
    public final String k;
    public final String l;
    public final C5286x4 m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final Qm r;
    public final Ie s;
    public final RetryPolicyConfig t;
    public final long u;
    public final long v;
    public final boolean w;
    public final C5081p3 x;
    public final C5309y2 y;
    public final Mm z;

    public C5203tm(C5177sm c5177sm) {
        String str;
        long j;
        long j2;
        Mm mm;
        Map map;
        N9 n9;
        this.a = c5177sm.a;
        List list = c5177sm.b;
        this.b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.c = c5177sm.c;
        this.d = c5177sm.d;
        this.e = c5177sm.e;
        List list2 = c5177sm.f;
        this.f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c5177sm.g;
        this.g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c5177sm.h;
        this.h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map2 = c5177sm.i;
        this.i = map2 != null ? CollectionUtils.unmodifiableMapCopy(map2) : null;
        this.j = c5177sm.j;
        this.k = c5177sm.k;
        this.m = c5177sm.m;
        this.s = c5177sm.n;
        this.n = c5177sm.o;
        this.o = c5177sm.p;
        this.l = c5177sm.l;
        this.p = c5177sm.q;
        str = c5177sm.r;
        this.q = str;
        this.r = c5177sm.s;
        j = c5177sm.t;
        this.u = j;
        j2 = c5177sm.u;
        this.v = j2;
        this.w = c5177sm.v;
        RetryPolicyConfig retryPolicyConfig = c5177sm.w;
        if (retryPolicyConfig == null) {
            Gm gm = new Gm();
            this.t = new RetryPolicyConfig(gm.w, gm.x);
        } else {
            this.t = retryPolicyConfig;
        }
        this.x = c5177sm.x;
        this.y = c5177sm.y;
        mm = c5177sm.z;
        this.z = mm == null ? new Mm(U7.b.a) : c5177sm.z;
        map = c5177sm.A;
        this.A = map == null ? Collections.EMPTY_MAP : c5177sm.A;
        n9 = c5177sm.B;
        this.B = n9;
    }

    public final C5177sm a(C5286x4 c5286x4) {
        C5177sm c5177sm = new C5177sm(c5286x4);
        c5177sm.a = this.a;
        c5177sm.f = this.f;
        c5177sm.g = this.g;
        c5177sm.j = this.j;
        c5177sm.b = this.b;
        c5177sm.c = this.c;
        c5177sm.d = this.d;
        c5177sm.e = this.e;
        c5177sm.h = this.h;
        c5177sm.i = this.i;
        c5177sm.k = this.k;
        c5177sm.l = this.l;
        c5177sm.q = this.p;
        c5177sm.o = this.n;
        c5177sm.p = this.o;
        c5177sm.r = this.q;
        c5177sm.n = this.s;
        c5177sm.t = this.u;
        c5177sm.u = this.v;
        c5177sm.s = this.r;
        c5177sm.v = this.w;
        c5177sm.w = this.t;
        c5177sm.x = this.x;
        c5177sm.y = this.y;
        c5177sm.z = this.z;
        c5177sm.A = this.A;
        c5177sm.B = this.B;
        return c5177sm;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.a + "', reportUrls=" + this.b + ", getAdUrl='" + this.c + "', reportAdUrl='" + this.d + "', certificateUrl='" + this.e + "', hostUrlsFromStartup=" + this.f + ", hostUrlsFromClient=" + this.g + ", diagnosticUrls=" + this.h + ", customSdkHosts=" + this.i + ", encodedClidsFromResponse='" + this.j + "', lastClientClidsForStartupRequest='" + this.k + "', lastChosenForRequestClids='" + this.l + "', collectingFlags=" + this.m + ", obtainTime=" + this.n + ", hadFirstStartup=" + this.o + ", startupDidNotOverrideClids=" + this.p + ", countryInit='" + this.q + "', statSending=" + this.r + ", permissionsCollectingConfig=" + this.s + ", retryPolicyConfig=" + this.t + ", obtainServerTime=" + this.u + ", firstStartupServerTime=" + this.v + ", outdated=" + this.w + ", cacheControl=" + this.x + ", attributionConfig=" + this.y + ", startupUpdateConfig=" + this.z + ", modulesRemoteConfigs=" + this.A + ", externalAttributionConfig=" + this.B + '}';
    }
}
