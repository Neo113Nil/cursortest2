package com.yandex.go.taxi.tariffs.internal.routestats.factory;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.analytics.AccountType;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.order.models.api.preorder.Transfer;
import com.yandex.go.taxi.tariffs.internal.routestats.models.RouteStatsMode;
import com.yandex.go.zone.model.Zone;
import defpackage.bbl0;
import defpackage.bvf0;
import defpackage.cbl0;
import defpackage.cia0;
import defpackage.czi0;
import defpackage.dqe0;
import defpackage.fnx0;
import defpackage.gqe0;
import defpackage.hci;
import defpackage.jd21;
import defpackage.jni;
import defpackage.jst;
import defpackage.kb5;
import defpackage.kzi0;
import defpackage.ldm;
import defpackage.mmf0;
import defpackage.ny61;
import defpackage.o3i;
import defpackage.oci;
import defpackage.oje;
import defpackage.qoj0;
import defpackage.scc;
import defpackage.sfa0;
import defpackage.stx;
import defpackage.sxg;
import defpackage.t7j0;
import defpackage.usx;
import defpackage.vo40;
import defpackage.w3l0;
import defpackage.wdi;
import defpackage.wiq0;
import defpackage.wt90;
import defpackage.wtx;
import defpackage.xby;
import defpackage.xku0;
import defpackage.y1s;
import defpackage.yne0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.i;
import ru.yandex.taxi.delivery.impl.paid_insurance.d;
import ru.yandex.taxi.launch.c;
import ru.yandex.taxi.preorder.repositories.g;
import ru.yandex.taxi.preorder.tollroad.data.e;

/* loaded from: classes8.dex */
public final class a {
    public final xku0 A;
    public final t7j0 a;
    public final b b;
    public final c c;
    public final wiq0 d;
    public final ru.yandex.taxi.shortcuts.interactors.a e;
    public final qoj0 f;
    public final vo40 g;
    public final dqe0 h;
    public final g i;
    public final sfa0 j;
    public final i k;
    public final wtx l;
    public final usx m;
    public final stx n;
    public final y1s o;
    public final mmf0 p;
    public final e q;
    public final jd21 r;
    public final ldm s;
    public final oci t;
    public final ru.yandex.taxi.logistics.sdk.dashboard.storage.c u;
    public final czi0 v;
    public final d w;
    public final wdi x;
    public final o3i y;
    public final wt90 z;

    public a(t7j0 t7j0Var, b bVar, c cVar, wiq0 wiq0Var, ru.yandex.taxi.shortcuts.interactors.a aVar, qoj0 qoj0Var, vo40 vo40Var, dqe0 dqe0Var, g gVar, sfa0 sfa0Var, i iVar, wtx wtxVar, usx usxVar, stx stxVar, y1s y1sVar, mmf0 mmf0Var, e eVar, jd21 jd21Var, ldm ldmVar, oci ociVar, ru.yandex.taxi.logistics.sdk.dashboard.storage.c cVar2, czi0 czi0Var, d dVar, wdi wdiVar, o3i o3iVar, wt90 wt90Var, xku0 xku0Var) {
        this.a = t7j0Var;
        this.b = bVar;
        this.c = cVar;
        this.d = wiq0Var;
        this.e = aVar;
        this.f = qoj0Var;
        this.g = vo40Var;
        this.h = dqe0Var;
        this.i = gVar;
        this.j = sfa0Var;
        this.k = iVar;
        this.l = wtxVar;
        this.m = usxVar;
        this.n = stxVar;
        this.o = y1sVar;
        this.p = mmf0Var;
        this.q = eVar;
        this.r = jd21Var;
        this.s = ldmVar;
        this.t = ociVar;
        this.u = cVar2;
        this.v = czi0Var;
        this.w = dVar;
        this.x = wdiVar;
        this.y = o3iVar;
        this.z = wt90Var;
        this.A = xku0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x02da, code lost:
    
        if (r3 == r5) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b0, code lost:
    
        if (r3 == r5) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, sxg sxgVar, long j, ContinuationImpl continuationImpl) {
        PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$1 prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1;
        int i;
        sxg sxgVar2;
        Zone zone;
        Address address;
        sxg sxgVar3;
        fnx0 fnx0Var;
        kb5 kb5Var;
        Zone zone2;
        Address address2;
        sxg sxgVar4;
        String str;
        List list;
        List a;
        List a2;
        cia0 cia0Var;
        boolean z;
        Object w;
        w3l0 w3l0Var;
        cia0 cia0Var2;
        List list2;
        Zone zone3;
        List list3;
        String str2;
        List list4;
        AccountType accountType;
        long j2;
        kb5 kb5Var2;
        String str3;
        int i2;
        Object b;
        oje ojeVar;
        List list5;
        Boolean bool;
        List list6;
        gqe0 gqe0Var;
        kb5 kb5Var3;
        int i3;
        String str4;
        long j3 = j;
        aVar.getClass();
        if (continuationImpl instanceof PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$1) {
            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1 = (PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$1) continuationImpl;
            int i4 = prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.label = i4 - Integer.MIN_VALUE;
                Object obj = prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.label) {
                    case 0:
                        i = 0;
                        kotlin.b.b(obj);
                        PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$sourceZoneAddress$1 prefetchRouteStatsParamBuilderImpl$buildParamForDestination$sourceZoneAddress$1 = new PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$sourceZoneAddress$1(aVar, null);
                        sxgVar2 = sxgVar;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$0 = sxgVar2;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.J$0 = j3;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.label = 1;
                        obj = kotlinx.coroutines.a.w(j3, prefetchRouteStatsParamBuilderImpl$buildParamForDestination$sourceZoneAddress$1, prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1);
                        break;
                    case 1:
                        i = 0;
                        j3 = prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.J$0;
                        sxgVar2 = (sxg) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$0;
                        kotlin.b.b(obj);
                        ZoneAddress zoneAddress = (ZoneAddress) obj;
                        if (zoneAddress == null) {
                            xby.l(jst.e, "RouteStats.Prefetch.BuildParams", null, null, "Source zone address is null", 6);
                            return null;
                        }
                        Address address3 = zoneAddress.a;
                        Zone zone4 = zoneAddress.b;
                        if (zone4 == null) {
                            xby.l(jst.e, "RouteStats.Prefetch.BuildParams", null, null, "Source zone is null", 6);
                            return null;
                        }
                        PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$tariffSelection$1 prefetchRouteStatsParamBuilderImpl$buildParamForDestination$tariffSelection$1 = new PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$tariffSelection$1(aVar, null);
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$0 = sxgVar2;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$1 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$2 = address3;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$3 = zone4;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.J$0 = j3;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.label = 2;
                        Object w2 = kotlinx.coroutines.a.w(j3, prefetchRouteStatsParamBuilderImpl$buildParamForDestination$tariffSelection$1, prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1);
                        if (w2 != coroutineSingletons) {
                            sxg sxgVar5 = sxgVar2;
                            zone = zone4;
                            obj = w2;
                            address = address3;
                            sxgVar3 = sxgVar5;
                            fnx0Var = (fnx0) obj;
                            if (fnx0Var == null) {
                                kb5 kb5Var4 = fnx0Var.e;
                                PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$userId$1 prefetchRouteStatsParamBuilderImpl$buildParamForDestination$userId$1 = new PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$userId$1(aVar, null);
                                prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$0 = sxgVar3;
                                prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$1 = null;
                                prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$2 = address;
                                prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$3 = zone;
                                prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$4 = null;
                                prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$5 = kb5Var4;
                                prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.J$0 = j3;
                                prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.label = 3;
                                Object w3 = kotlinx.coroutines.a.w(j3, prefetchRouteStatsParamBuilderImpl$buildParamForDestination$userId$1, prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1);
                                if (w3 != coroutineSingletons) {
                                    kb5Var = kb5Var4;
                                    zone2 = zone;
                                    address2 = address;
                                    sxgVar4 = sxgVar3;
                                    obj = w3;
                                    str = (String) obj;
                                    if (str == null) {
                                        list = aVar.h.a.x;
                                        a = aVar.f.a(zone2, list);
                                        a2 = aVar.g.a();
                                        cia0Var = new cia0(aVar.j.a(aVar.A.a.a(), aVar.i.a()), ((Number) kotlinx.coroutines.flow.e.d(aVar.l.b).a.getValue()).longValue(), 0L, ((Number) kotlinx.coroutines.flow.e.d(aVar.m.b).a.getValue()).longValue(), ((Number) kotlinx.coroutines.flow.e.d(aVar.n.b).a.getValue()).longValue());
                                        PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$accountType$1 prefetchRouteStatsParamBuilderImpl$buildParamForDestination$accountType$1 = new PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$accountType$1(aVar, null);
                                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$0 = sxgVar4;
                                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$1 = null;
                                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$2 = address2;
                                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$3 = zone2;
                                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$4 = null;
                                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$5 = kb5Var;
                                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$6 = str;
                                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$7 = list;
                                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$8 = a;
                                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$9 = a2;
                                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$10 = null;
                                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$11 = cia0Var;
                                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.J$0 = j3;
                                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.label = 4;
                                        obj = kotlinx.coroutines.a.w(j3, prefetchRouteStatsParamBuilderImpl$buildParamForDestination$accountType$1, prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1);
                                        break;
                                    } else {
                                        xby.l(jst.e, "RouteStats.Prefetch.BuildParams", null, null, "Exceed timeout to get launch id", 6);
                                        return null;
                                    }
                                }
                            } else {
                                xby.l(jst.e, "RouteStats.Prefetch.BuildParams", null, null, "Tariff selection is null", 6);
                                return null;
                            }
                        }
                        return coroutineSingletons;
                    case 2:
                        i = 0;
                        j3 = prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.J$0;
                        zone = (Zone) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$3;
                        address = (Address) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$2;
                        sxgVar3 = (sxg) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$0;
                        kotlin.b.b(obj);
                        fnx0Var = (fnx0) obj;
                        if (fnx0Var == null) {
                        }
                        break;
                    case 3:
                        i = 0;
                        j3 = prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.J$0;
                        kb5 kb5Var5 = (kb5) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$5;
                        Zone zone5 = (Zone) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$3;
                        Address address4 = (Address) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$2;
                        sxg sxgVar6 = (sxg) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$0;
                        kotlin.b.b(obj);
                        kb5Var = kb5Var5;
                        zone2 = zone5;
                        address2 = address4;
                        sxgVar4 = sxgVar6;
                        str = (String) obj;
                        if (str == null) {
                        }
                        break;
                    case 4:
                        i = 0;
                        j3 = prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.J$0;
                        cia0Var = (cia0) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$11;
                        a2 = (List) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$9;
                        a = (List) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$8;
                        list = (List) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$7;
                        str = (String) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$6;
                        kb5Var = (kb5) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$5;
                        zone2 = (Zone) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$3;
                        address2 = (Address) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$2;
                        sxgVar4 = (sxg) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$0;
                        kotlin.b.b(obj);
                        AccountType accountType2 = (AccountType) obj;
                        if (accountType2 == null) {
                            accountType2 = AccountType.None;
                        }
                        Address address5 = sxgVar4.a.a;
                        Address address6 = address2;
                        Address[] addressArr = new Address[2];
                        addressArr[i] = address6;
                        z = true;
                        addressArr[1] = address5;
                        w3l0 w3l0Var2 = new w3l0(zone2, scc.g(addressArr));
                        PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$promoCode$1 prefetchRouteStatsParamBuilderImpl$buildParamForDestination$promoCode$1 = new PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$promoCode$1(aVar, null);
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$0 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$1 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$2 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$3 = zone2;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$4 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$5 = kb5Var;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$6 = str;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$7 = list;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$8 = a;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$9 = a2;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$10 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$11 = cia0Var;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$12 = accountType2;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$13 = w3l0Var2;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.J$0 = j3;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.label = 5;
                        w = kotlinx.coroutines.a.w(j3, prefetchRouteStatsParamBuilderImpl$buildParamForDestination$promoCode$1, prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1);
                        if (w != coroutineSingletons) {
                            w3l0Var = w3l0Var2;
                            cia0Var2 = cia0Var;
                            list2 = a2;
                            zone3 = zone2;
                            list3 = a;
                            str2 = str;
                            list4 = list;
                            accountType = accountType2;
                            j2 = j3;
                            kb5Var2 = kb5Var;
                            str3 = aVar.p.b.d(zone3) ? null : (String) w;
                            Transfer transfer = aVar.h.a.T;
                            gqe0 gqe0Var2 = new gqe0(transfer == null ? transfer.getA() : null, null, null, aVar.o.a(), null, null);
                            Boolean valueOf = Boolean.valueOf(aVar.q.f());
                            long j4 = j2;
                            List list7 = list2;
                            oje ojeVar2 = new oje(0L);
                            ru.yandex.taxi.logistics.sdk.dashboard.storage.c cVar = aVar.u;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$0 = null;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$1 = null;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$2 = null;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$3 = null;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$4 = null;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$5 = kb5Var2;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$6 = null;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$7 = null;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$8 = null;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$9 = null;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$10 = null;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$11 = null;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$12 = accountType;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$13 = null;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$14 = null;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$15 = str2;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$16 = zone3;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$17 = w3l0Var;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$18 = list4;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$19 = list3;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$20 = str3;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$21 = gqe0Var2;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$22 = cia0Var2;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$23 = list7;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$24 = valueOf;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$25 = ojeVar2;
                            kb5 kb5Var6 = kb5Var2;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.J$0 = j4;
                            i2 = i;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.I$0 = i2;
                            prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.label = 6;
                            b = cVar.b(prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1);
                            if (b != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            ojeVar = ojeVar2;
                            list5 = list7;
                            bool = valueOf;
                            list6 = list4;
                            gqe0Var = gqe0Var2;
                            kb5Var3 = kb5Var6;
                            obj = b;
                            i3 = i2;
                            cia0 cia0Var3 = cia0Var2;
                            Zone zone6 = zone3;
                            String str5 = str2;
                            AccountType accountType3 = accountType;
                            String str6 = str3;
                            List list8 = list3;
                            w3l0 w3l0Var3 = w3l0Var;
                            boolean z2 = obj == null ? z : i2;
                            kzi0 kzi0Var = (kzi0) aVar.v.b.getValue();
                            jni jniVar = new jni(z2, kzi0Var == null ? new Integer(kzi0Var.a) : null, new hci((Boolean) aVar.w.d.getValue()), (String) aVar.x.b.getValue(), (Boolean) aVar.y.b.getValue(), (Boolean) aVar.z.b.getValue());
                            str4 = aVar.h.a.Q;
                            if (str4 == null) {
                                str4 = "default";
                            }
                            bbl0 bbl0Var = new bbl0(str5, zone6, w3l0Var3, list6, list8, str6, gqe0Var, cia0Var3, list5, i3 == 0 ? z : i2, bool, ojeVar, jniVar, str4, ((Number) kotlinx.coroutines.flow.e.d(aVar.r.a).a.getValue()).longValue(), accountType3, ((Number) kotlinx.coroutines.flow.e.d(aVar.s.a).a.getValue()).longValue());
                            RouteStatsMode routeStatsMode = RouteStatsMode.FULL;
                            return new yne0(aVar.a.a(kb5Var3, bbl0Var, routeStatsMode, false, aVar.t.a()), new cbl0(bbl0Var, routeStatsMode));
                        }
                        return coroutineSingletons;
                    case 5:
                        i = 0;
                        long j5 = prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.J$0;
                        w3l0 w3l0Var4 = (w3l0) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$13;
                        AccountType accountType4 = (AccountType) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$12;
                        cia0 cia0Var4 = (cia0) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$11;
                        List list9 = (List) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$9;
                        List list10 = (List) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$8;
                        list4 = (List) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$7;
                        String str7 = (String) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$6;
                        kb5 kb5Var7 = (kb5) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$5;
                        Zone zone7 = (Zone) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$3;
                        kotlin.b.b(obj);
                        w = obj;
                        j2 = j5;
                        kb5Var2 = kb5Var7;
                        list3 = list10;
                        accountType = accountType4;
                        cia0Var2 = cia0Var4;
                        zone3 = zone7;
                        w3l0Var = w3l0Var4;
                        list2 = list9;
                        str2 = str7;
                        z = true;
                        if (aVar.p.b.d(zone3)) {
                        }
                        Transfer transfer2 = aVar.h.a.T;
                        gqe0 gqe0Var22 = new gqe0(transfer2 == null ? transfer2.getA() : null, null, null, aVar.o.a(), null, null);
                        Boolean valueOf2 = Boolean.valueOf(aVar.q.f());
                        long j42 = j2;
                        List list72 = list2;
                        oje ojeVar22 = new oje(0L);
                        ru.yandex.taxi.logistics.sdk.dashboard.storage.c cVar2 = aVar.u;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$0 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$1 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$2 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$3 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$4 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$5 = kb5Var2;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$6 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$7 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$8 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$9 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$10 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$11 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$12 = accountType;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$13 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$14 = null;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$15 = str2;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$16 = zone3;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$17 = w3l0Var;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$18 = list4;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$19 = list3;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$20 = str3;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$21 = gqe0Var22;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$22 = cia0Var2;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$23 = list72;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$24 = valueOf2;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$25 = ojeVar22;
                        kb5 kb5Var62 = kb5Var2;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.J$0 = j42;
                        i2 = i;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.I$0 = i2;
                        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.label = 6;
                        b = cVar2.b(prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1);
                        if (b != coroutineSingletons) {
                        }
                        break;
                    case 6:
                        int i5 = prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.I$0;
                        oje ojeVar3 = (oje) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$25;
                        Boolean bool2 = (Boolean) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$24;
                        List list11 = (List) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$23;
                        cia0Var2 = (cia0) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$22;
                        gqe0 gqe0Var3 = (gqe0) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$21;
                        str3 = (String) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$20;
                        list3 = (List) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$19;
                        List list12 = (List) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$18;
                        w3l0Var = (w3l0) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$17;
                        zone3 = (Zone) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$16;
                        str2 = (String) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$15;
                        accountType = (AccountType) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$12;
                        kb5 kb5Var8 = (kb5) prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.L$5;
                        kotlin.b.b(obj);
                        kb5Var3 = kb5Var8;
                        i2 = 0;
                        ojeVar = ojeVar3;
                        bool = bool2;
                        list5 = list11;
                        gqe0Var = gqe0Var3;
                        list6 = list12;
                        z = true;
                        i3 = i5;
                        cia0 cia0Var32 = cia0Var2;
                        Zone zone62 = zone3;
                        String str52 = str2;
                        AccountType accountType32 = accountType;
                        String str62 = str3;
                        List list82 = list3;
                        w3l0 w3l0Var32 = w3l0Var;
                        if (obj == null) {
                        }
                        kzi0 kzi0Var2 = (kzi0) aVar.v.b.getValue();
                        jni jniVar2 = new jni(z2, kzi0Var2 == null ? new Integer(kzi0Var2.a) : null, new hci((Boolean) aVar.w.d.getValue()), (String) aVar.x.b.getValue(), (Boolean) aVar.y.b.getValue(), (Boolean) aVar.z.b.getValue());
                        str4 = aVar.h.a.Q;
                        if (str4 == null) {
                        }
                        bbl0 bbl0Var2 = new bbl0(str52, zone62, w3l0Var32, list6, list82, str62, gqe0Var, cia0Var32, list5, i3 == 0 ? z : i2, bool, ojeVar, jniVar2, str4, ((Number) kotlinx.coroutines.flow.e.d(aVar.r.a).a.getValue()).longValue(), accountType32, ((Number) kotlinx.coroutines.flow.e.d(aVar.s.a).a.getValue()).longValue());
                        RouteStatsMode routeStatsMode2 = RouteStatsMode.FULL;
                        return new yne0(aVar.a.a(kb5Var3, bbl0Var2, routeStatsMode2, false, aVar.t.a()), new cbl0(bbl0Var2, routeStatsMode2));
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1 = new PrefetchRouteStatsParamBuilderImpl$buildParamForDestination$1(aVar, continuationImpl);
        Object obj2 = prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (prefetchRouteStatsParamBuilderImpl$buildParamForDestination$1.label) {
        }
    }

    public final Object b(List list, long j, Continuation continuation) {
        if (!list.isEmpty()) {
            return bvf0.n(new PrefetchRouteStatsParamBuilderImpl$buildPrefetchParams$2(list, this, j, null), continuation);
        }
        xby.l(jst.e, "RouteStats.Prefetch.BuildParams", null, null, "Empty destinations", 6);
        return EmptyList.a;
    }
}
