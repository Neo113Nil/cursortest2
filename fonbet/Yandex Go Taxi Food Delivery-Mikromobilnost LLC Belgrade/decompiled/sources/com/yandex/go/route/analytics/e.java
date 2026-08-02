package com.yandex.go.route.analytics;

import com.yandex.go.address.models.Address;
import com.yandex.go.analytics.ApplicationAnalytics$OrderAddressActionV4;
import com.yandex.go.analytics.ApplicationAnalytics$OrderAddressMethodV4;
import com.yandex.go.analytics.ListBasedOrderAddressAnalyticsData;
import com.yandex.go.analytics.PinDropOrderAddressAnalyticsData;
import com.yandex.go.analytics.PositionChoicesOrderAddressAnalyticsData;
import com.yandex.go.analytics.ShortcutOrderAddressAnalyticsData;
import com.yandex.go.preorder.source.altpins.Alternatives;
import defpackage.h73;
import defpackage.hbp0;
import defpackage.k99;
import defpackage.n7r;
import defpackage.qbl0;
import defpackage.sz2;
import defpackage.t41;
import defpackage.tje;
import defpackage.tse0;
import defpackage.tt2;
import defpackage.tz2;
import defpackage.uz2;
import defpackage.vz2;
import defpackage.wiq0;
import defpackage.wnt;
import defpackage.wz2;
import defpackage.xz2;
import defpackage.y4;
import defpackage.yal0;
import defpackage.yz2;
import defpackage.zet0;
import defpackage.zoa1;
import defpackage.zz2;
import defpackage.zzs;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class e implements t41 {
    public final wnt a;
    public final k99 b;
    public final wiq0 c;
    public final qbl0 d;
    public final zet0 e;
    public final ru.yandex.taxi.perf.b f;
    public final zz2 g;
    public final hbp0 h;
    public final CopyOnWriteArraySet i = new CopyOnWriteArraySet();
    public String j;
    public yal0 k;
    public Address l;
    public Address m;
    public Pair n;
    public Address o;
    public boolean p;
    public boolean q;
    public boolean r;

    /* JADX WARN: Multi-variable type inference failed */
    public e(wnt wntVar, k99 k99Var, wiq0 wiq0Var, qbl0 qbl0Var, zet0 zet0Var, ru.yandex.taxi.perf.b bVar, tt2 tt2Var, zz2 zz2Var) {
        this.a = wntVar;
        this.b = k99Var;
        this.c = wiq0Var;
        this.d = qbl0Var;
        this.e = zet0Var;
        this.f = bVar;
        this.g = zz2Var;
        this.h = new hbp0(new AddressPointsAnalyticsImpl$scopeDelegate$1(0, tt2Var, tt2.class, "io", "io()Lkotlinx/coroutines/CoroutineDispatcher;", 0), null, 0 == true ? 1 : 0, 6);
    }

    public final void a() {
        if (this.r) {
            return;
        }
        this.r = true;
        hbp0 hbp0Var = this.h;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new AddressPointsAnalyticsImpl$attach$1(this, null), 3);
        tje.N(hbp0Var.c(), null, null, new AddressPointsAnalyticsImpl$attach$2(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x000a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(Address address, Address address2, String str) {
        synchronized (this) {
            this.l = address;
        }
        synchronized (this) {
            this.j = str;
        }
        synchronized (this) {
            this.m = address2;
            synchronized (this) {
            }
        }
    }

    public final void c(Address address, Address address2, boolean z, String str) {
        com.yandex.go.analytics.e analyticsData;
        boolean z2;
        String str2;
        xz2 xz2Var;
        Iterable iterable;
        Alternatives alternatives;
        zzs a;
        String str3;
        String str4;
        if (address == null || (analyticsData = address.getAnalyticsData()) == null) {
            return;
        }
        String a2 = analyticsData.getA();
        boolean j = analyticsData.getJ();
        zzs a3 = analyticsData.getA();
        wz2 wz2Var = new wz2(a3.a, a3.b);
        boolean z3 = this.p;
        boolean isFavorite = address.getIsFavorite();
        boolean z4 = analyticsData instanceof PinDropOrderAddressAnalyticsData;
        vz2 vz2Var = null;
        vz2Var = null;
        PinDropOrderAddressAnalyticsData pinDropOrderAddressAnalyticsData = z4 ? (PinDropOrderAddressAnalyticsData) analyticsData : null;
        ApplicationAnalytics$OrderAddressActionV4 b = (pinDropOrderAddressAnalyticsData == null || (str4 = pinDropOrderAddressAnalyticsData.f) == null) ? null : zoa1.b(str4);
        String d = analyticsData.getD();
        ApplicationAnalytics$OrderAddressMethodV4 c = d != null ? zoa1.c(d) : null;
        zzs c2 = analyticsData.getC();
        if (c2 != null) {
            z2 = z4;
            str2 = a2;
            xz2Var = new xz2(c2.a, c2.b, c2.c);
        } else {
            z2 = z4;
            str2 = a2;
            xz2Var = null;
        }
        PinDropOrderAddressAnalyticsData pinDropOrderAddressAnalyticsData2 = z2 ? (PinDropOrderAddressAnalyticsData) analyticsData : null;
        String str5 = pinDropOrderAddressAnalyticsData2 != null ? pinDropOrderAddressAnalyticsData2.h : null;
        ListBasedOrderAddressAnalyticsData listBasedOrderAddressAnalyticsData = analyticsData instanceof ListBasedOrderAddressAnalyticsData ? (ListBasedOrderAddressAnalyticsData) analyticsData : null;
        String h = listBasedOrderAddressAnalyticsData != null ? listBasedOrderAddressAnalyticsData.h() : null;
        PinDropOrderAddressAnalyticsData pinDropOrderAddressAnalyticsData3 = z2 ? (PinDropOrderAddressAnalyticsData) analyticsData : null;
        String str6 = pinDropOrderAddressAnalyticsData3 != null ? pinDropOrderAddressAnalyticsData3.i : null;
        String e = analyticsData.getE();
        Long l = address.B().e;
        yz2 yz2Var = new yz2(str2, j, wz2Var, z3, isFavorite, b, c, xz2Var, str5, h, str6, e, l != null ? String.valueOf(l.longValue()) : null);
        double currentTimeMillis = (System.currentTimeMillis() - this.e.a.j("source_point_changed_time", 0L)) / 1000;
        com.yandex.go.analytics.e analyticsData2 = address2 != null ? address2.getAnalyticsData() : null;
        if (analyticsData2 != null && address2 != null) {
            String a4 = analyticsData2.getA();
            boolean j2 = analyticsData2.getJ();
            zzs a5 = analyticsData2.getA();
            sz2 sz2Var = new sz2(a5.a, a5.b);
            boolean z5 = this.q;
            boolean isFavorite2 = address2.getIsFavorite();
            boolean z6 = analyticsData2 instanceof PinDropOrderAddressAnalyticsData;
            PinDropOrderAddressAnalyticsData pinDropOrderAddressAnalyticsData4 = z6 ? (PinDropOrderAddressAnalyticsData) analyticsData2 : null;
            ApplicationAnalytics$OrderAddressActionV4 b2 = (pinDropOrderAddressAnalyticsData4 == null || (str3 = pinDropOrderAddressAnalyticsData4.f) == null) ? null : zoa1.b(str3);
            String d2 = analyticsData2.getD();
            ApplicationAnalytics$OrderAddressMethodV4 c3 = d2 != null ? zoa1.c(d2) : null;
            zzs c4 = analyticsData2.getC();
            tz2 tz2Var = c4 != null ? new tz2(c4.a, c4.b, c4.c) : null;
            n7r n7rVar = analyticsData2 instanceof n7r ? (n7r) analyticsData2 : null;
            uz2 uz2Var = (n7rVar == null || (a = n7rVar.getA()) == null) ? null : new uz2(a.a, a.b);
            String e2 = analyticsData2.getE();
            boolean z7 = analyticsData2 instanceof ListBasedOrderAddressAnalyticsData;
            ListBasedOrderAddressAnalyticsData listBasedOrderAddressAnalyticsData2 = z7 ? (ListBasedOrderAddressAnalyticsData) analyticsData2 : null;
            Integer valueOf = listBasedOrderAddressAnalyticsData2 != null ? Integer.valueOf(listBasedOrderAddressAnalyticsData2.h) : null;
            ListBasedOrderAddressAnalyticsData listBasedOrderAddressAnalyticsData3 = z7 ? (ListBasedOrderAddressAnalyticsData) analyticsData2 : null;
            String h2 = listBasedOrderAddressAnalyticsData3 != null ? listBasedOrderAddressAnalyticsData3.h() : null;
            PinDropOrderAddressAnalyticsData pinDropOrderAddressAnalyticsData5 = z6 ? (PinDropOrderAddressAnalyticsData) analyticsData2 : null;
            String str7 = pinDropOrderAddressAnalyticsData5 != null ? pinDropOrderAddressAnalyticsData5.h : null;
            boolean z8 = analyticsData2 instanceof PositionChoicesOrderAddressAnalyticsData;
            PositionChoicesOrderAddressAnalyticsData positionChoicesOrderAddressAnalyticsData = z8 ? (PositionChoicesOrderAddressAnalyticsData) analyticsData2 : null;
            String g = positionChoicesOrderAddressAnalyticsData != null ? positionChoicesOrderAddressAnalyticsData.getG() : null;
            PositionChoicesOrderAddressAnalyticsData positionChoicesOrderAddressAnalyticsData2 = z8 ? (PositionChoicesOrderAddressAnalyticsData) analyticsData2 : null;
            String f = positionChoicesOrderAddressAnalyticsData2 != null ? positionChoicesOrderAddressAnalyticsData2.getF() : null;
            boolean z9 = analyticsData2 instanceof ShortcutOrderAddressAnalyticsData;
            ShortcutOrderAddressAnalyticsData shortcutOrderAddressAnalyticsData = z9 ? (ShortcutOrderAddressAnalyticsData) analyticsData2 : null;
            String h3 = shortcutOrderAddressAnalyticsData != null ? shortcutOrderAddressAnalyticsData.getH() : null;
            ShortcutOrderAddressAnalyticsData shortcutOrderAddressAnalyticsData2 = z9 ? (ShortcutOrderAddressAnalyticsData) analyticsData2 : null;
            String g2 = shortcutOrderAddressAnalyticsData2 != null ? shortcutOrderAddressAnalyticsData2.getG() : null;
            ShortcutOrderAddressAnalyticsData shortcutOrderAddressAnalyticsData3 = z9 ? (ShortcutOrderAddressAnalyticsData) analyticsData2 : null;
            String i = shortcutOrderAddressAnalyticsData3 != null ? shortcutOrderAddressAnalyticsData3.getI() : null;
            Long l2 = address2.B().e;
            vz2Var = new vz2(a4, j2, sz2Var, z5, isFavorite2, b2, c3, tz2Var, uz2Var, e2, valueOf, h2, str7, g, f, h3, g2, i, l2 != null ? String.valueOf(l2.longValue()) : null);
        }
        List J0 = kotlin.collections.a.J0(this.i);
        String str8 = this.j;
        yal0 yal0Var = this.k;
        if (yal0Var == null || (alternatives = yal0Var.e) == null || (iterable = alternatives.a) == null) {
            iterable = EmptyList.a;
        }
        Map r = kotlin.collections.b.r(kotlin.sequences.b.o(new h73(1, iterable), new y4(24, this)));
        Boolean valueOf2 = Boolean.valueOf(z);
        zz2 zz2Var = this.g;
        zz2Var.getClass();
        HashMap hashMap = new HashMap();
        if (str8 != null) {
            hashMap.put("last_offer_id", str8);
        }
        hashMap.put("offer_ids", J0);
        hashMap.put("altoffers", r);
        hashMap.put("is_multiorder", valueOf2);
        hashMap.put("starting", yz2Var.a());
        hashMap.put("time_since_last_address_selection_sec", Double.valueOf(currentTimeMillis));
        if (vz2Var != null) {
            hashMap.put("destination", vz2Var.a());
        }
        zz2Var.a.a("Application.OrderAddress.Selected", hashMap, 4, tse0.r("order_id", hashMap, str));
    }
}
