package com.yandex.go.preorder.deeplinks.route;

import android.content.Intent;
import android.net.Uri;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.preorder.deeplinks.route.IntentData;
import com.yandex.go.zone.model.Zone;
import defpackage.bvf0;
import defpackage.c2l0;
import defpackage.dd61;
import defpackage.dqe0;
import defpackage.evu0;
import defpackage.ffp;
import defpackage.g8e;
import defpackage.h4l0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.mo21;
import defpackage.n7z;
import defpackage.ni31;
import defpackage.noh;
import defpackage.ny61;
import defpackage.o7z;
import defpackage.og21;
import defpackage.po21;
import defpackage.pv0;
import defpackage.pzt0;
import defpackage.qoh;
import defpackage.qoi0;
import defpackage.r7z;
import defpackage.ri1;
import defpackage.s1l0;
import defpackage.s8o;
import defpackage.t7z;
import defpackage.tje;
import defpackage.tse;
import defpackage.u1l0;
import defpackage.uzs;
import defpackage.w1l0;
import defpackage.z81;
import defpackage.zzs;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.deeplinks.e;
import ru.yandex.taxi.personalstate.domain.interactor.j;

/* loaded from: classes13.dex */
public final class c {
    public final b a;
    public final e b;
    public final ru.yandex.taxi.favorites.data.repo.a c;
    public final ri1 d;
    public final com.yandex.go.preorder.address.b e;
    public final dqe0 f;
    public final po21 g;
    public final com.yandex.go.taxi.tariffs.interactor.b h;
    public final j i;

    public c(b bVar, e eVar, ru.yandex.taxi.favorites.data.repo.a aVar, ri1 ri1Var, com.yandex.go.preorder.address.b bVar2, dqe0 dqe0Var, po21 po21Var, com.yandex.go.taxi.tariffs.interactor.b bVar3, j jVar) {
        this.a = bVar;
        this.b = eVar;
        this.c = aVar;
        this.d = ri1Var;
        this.e = bVar2;
        this.f = dqe0Var;
        this.g = po21Var;
        this.h = bVar3;
        this.i = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0261 A[Catch: Exception -> 0x02c4, CancellationException -> 0x02cb, TryCatch #2 {CancellationException -> 0x02cb, Exception -> 0x02c4, blocks: (B:13:0x0065, B:16:0x025d, B:18:0x0261, B:19:0x0268, B:22:0x027d, B:24:0x028e, B:26:0x029e, B:29:0x0293, B:31:0x029b, B:35:0x009f, B:36:0x0229, B:38:0x022d, B:39:0x0231, B:45:0x00ca, B:47:0x01f7, B:52:0x00f2, B:53:0x01d2, B:58:0x0115, B:60:0x01af, B:65:0x0190), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x028e A[Catch: Exception -> 0x02c4, CancellationException -> 0x02cb, TryCatch #2 {CancellationException -> 0x02cb, Exception -> 0x02c4, blocks: (B:13:0x0065, B:16:0x025d, B:18:0x0261, B:19:0x0268, B:22:0x027d, B:24:0x028e, B:26:0x029e, B:29:0x0293, B:31:0x029b, B:35:0x009f, B:36:0x0229, B:38:0x022d, B:39:0x0231, B:45:0x00ca, B:47:0x01f7, B:52:0x00f2, B:53:0x01d2, B:58:0x0115, B:60:0x01af, B:65:0x0190), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0293 A[Catch: Exception -> 0x02c4, CancellationException -> 0x02cb, TryCatch #2 {CancellationException -> 0x02cb, Exception -> 0x02c4, blocks: (B:13:0x0065, B:16:0x025d, B:18:0x0261, B:19:0x0268, B:22:0x027d, B:24:0x028e, B:26:0x029e, B:29:0x0293, B:31:0x029b, B:35:0x009f, B:36:0x0229, B:38:0x022d, B:39:0x0231, B:45:0x00ca, B:47:0x01f7, B:52:0x00f2, B:53:0x01d2, B:58:0x0115, B:60:0x01af, B:65:0x0190), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x022d A[Catch: Exception -> 0x02c4, CancellationException -> 0x02cb, TryCatch #2 {CancellationException -> 0x02cb, Exception -> 0x02c4, blocks: (B:13:0x0065, B:16:0x025d, B:18:0x0261, B:19:0x0268, B:22:0x027d, B:24:0x028e, B:26:0x029e, B:29:0x0293, B:31:0x029b, B:35:0x009f, B:36:0x0229, B:38:0x022d, B:39:0x0231, B:45:0x00ca, B:47:0x01f7, B:52:0x00f2, B:53:0x01d2, B:58:0x0115, B:60:0x01af, B:65:0x0190), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, tse tseVar, IntentData intentData, boolean z, ContinuationImpl continuationImpl) {
        RouteDataInteractor$awaitResult$1 routeDataInteractor$awaitResult$1;
        noh h;
        noh h2;
        boolean z2;
        IntentData intentData2;
        noh nohVar;
        noh nohVar2;
        noh nohVar3;
        noh nohVar4;
        IntentData intentData3;
        Object k;
        noh nohVar5;
        dd61 dd61Var;
        IntentData intentData4;
        Object k2;
        noh nohVar6;
        dd61 dd61Var2;
        pv0 pv0Var;
        Object k3;
        pv0 pv0Var2;
        List list;
        dd61 dd61Var3;
        List list2;
        IntentData intentData5;
        Object k4;
        String str;
        pv0 pv0Var3;
        dd61 dd61Var4;
        IntentData intentData6;
        String str2;
        cVar.getClass();
        try {
            if (continuationImpl instanceof RouteDataInteractor$awaitResult$1) {
                routeDataInteractor$awaitResult$1 = (RouteDataInteractor$awaitResult$1) continuationImpl;
                int i = routeDataInteractor$awaitResult$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    routeDataInteractor$awaitResult$1.label = i - Integer.MIN_VALUE;
                    Object obj = routeDataInteractor$awaitResult$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    RouteData$Continuation routeData$Continuation = null;
                    switch (routeDataInteractor$awaitResult$1.label) {
                        case 0:
                            kotlin.b.b(obj);
                            h = tje.h(tseVar, null, null, new RouteDataInteractor$awaitResult$sourceAddressDeferred$1(cVar, intentData, null), 3);
                            qoh h3 = tje.h(tseVar, null, null, new RouteDataInteractor$awaitResult$destInfoDeferred$1(cVar, intentData, null), 3);
                            qoh h4 = tje.h(tseVar, null, null, new RouteDataInteractor$awaitResult$midAddressesDeferred$1(cVar, intentData, null), 3);
                            qoh h5 = tje.h(tseVar, null, null, new RouteDataInteractor$awaitResult$awaitTariffsForZoneDeferred$1(h, cVar, null), 3);
                            h2 = tje.h(tseVar, null, null, new RouteDataInteractor$awaitResult$tariffDeferred$1(cVar, intentData, h5, null), 3);
                            routeDataInteractor$awaitResult$1.L$0 = null;
                            routeDataInteractor$awaitResult$1.L$1 = intentData;
                            routeDataInteractor$awaitResult$1.L$2 = h;
                            routeDataInteractor$awaitResult$1.L$3 = h3;
                            routeDataInteractor$awaitResult$1.L$4 = h4;
                            routeDataInteractor$awaitResult$1.L$5 = null;
                            routeDataInteractor$awaitResult$1.L$6 = h2;
                            z2 = z;
                            routeDataInteractor$awaitResult$1.Z$0 = z2;
                            routeDataInteractor$awaitResult$1.label = 1;
                            if (h5.s(routeDataInteractor$awaitResult$1) != coroutineSingletons) {
                                intentData2 = intentData;
                                nohVar = h4;
                                nohVar2 = h3;
                                routeDataInteractor$awaitResult$1.L$0 = null;
                                routeDataInteractor$awaitResult$1.L$1 = intentData2;
                                routeDataInteractor$awaitResult$1.L$2 = null;
                                routeDataInteractor$awaitResult$1.L$3 = nohVar2;
                                routeDataInteractor$awaitResult$1.L$4 = nohVar;
                                routeDataInteractor$awaitResult$1.L$5 = null;
                                routeDataInteractor$awaitResult$1.L$6 = h2;
                                routeDataInteractor$awaitResult$1.Z$0 = z2;
                                routeDataInteractor$awaitResult$1.label = 2;
                                obj = h.k(routeDataInteractor$awaitResult$1);
                                if (obj == coroutineSingletons) {
                                    noh nohVar7 = nohVar;
                                    nohVar3 = h2;
                                    nohVar4 = nohVar7;
                                    intentData3 = intentData2;
                                    dd61 dd61Var5 = (dd61) obj;
                                    routeDataInteractor$awaitResult$1.L$0 = null;
                                    routeDataInteractor$awaitResult$1.L$1 = intentData3;
                                    routeDataInteractor$awaitResult$1.L$2 = null;
                                    routeDataInteractor$awaitResult$1.L$3 = null;
                                    routeDataInteractor$awaitResult$1.L$4 = nohVar4;
                                    routeDataInteractor$awaitResult$1.L$5 = null;
                                    routeDataInteractor$awaitResult$1.L$6 = nohVar3;
                                    routeDataInteractor$awaitResult$1.L$7 = dd61Var5;
                                    routeDataInteractor$awaitResult$1.Z$0 = z2;
                                    routeDataInteractor$awaitResult$1.label = 3;
                                    k = nohVar2.k(routeDataInteractor$awaitResult$1);
                                    if (k == coroutineSingletons) {
                                        nohVar5 = nohVar4;
                                        dd61Var = dd61Var5;
                                        obj = k;
                                        intentData4 = intentData3;
                                        pv0 pv0Var4 = (pv0) obj;
                                        routeDataInteractor$awaitResult$1.L$0 = null;
                                        routeDataInteractor$awaitResult$1.L$1 = intentData4;
                                        routeDataInteractor$awaitResult$1.L$2 = null;
                                        routeDataInteractor$awaitResult$1.L$3 = null;
                                        routeDataInteractor$awaitResult$1.L$4 = null;
                                        routeDataInteractor$awaitResult$1.L$5 = null;
                                        routeDataInteractor$awaitResult$1.L$6 = nohVar3;
                                        routeDataInteractor$awaitResult$1.L$7 = dd61Var;
                                        routeDataInteractor$awaitResult$1.L$8 = pv0Var4;
                                        routeDataInteractor$awaitResult$1.Z$0 = z2;
                                        routeDataInteractor$awaitResult$1.label = 4;
                                        k2 = nohVar5.k(routeDataInteractor$awaitResult$1);
                                        if (k2 == coroutineSingletons) {
                                            nohVar6 = nohVar3;
                                            dd61Var2 = dd61Var;
                                            pv0Var = pv0Var4;
                                            obj = k2;
                                            List list3 = (List) obj;
                                            List list4 = intentData4.d;
                                            routeDataInteractor$awaitResult$1.L$0 = null;
                                            routeDataInteractor$awaitResult$1.L$1 = intentData4;
                                            routeDataInteractor$awaitResult$1.L$2 = null;
                                            routeDataInteractor$awaitResult$1.L$3 = null;
                                            routeDataInteractor$awaitResult$1.L$4 = null;
                                            routeDataInteractor$awaitResult$1.L$5 = null;
                                            routeDataInteractor$awaitResult$1.L$6 = nohVar6;
                                            routeDataInteractor$awaitResult$1.L$7 = dd61Var2;
                                            routeDataInteractor$awaitResult$1.L$8 = pv0Var;
                                            routeDataInteractor$awaitResult$1.L$9 = list3;
                                            routeDataInteractor$awaitResult$1.L$10 = list4;
                                            routeDataInteractor$awaitResult$1.Z$0 = z2;
                                            routeDataInteractor$awaitResult$1.label = 5;
                                            k3 = nohVar6.k(routeDataInteractor$awaitResult$1);
                                            if (k3 == coroutineSingletons) {
                                                pv0Var2 = pv0Var;
                                                list = list4;
                                                IntentData intentData7 = intentData4;
                                                dd61Var3 = dd61Var2;
                                                list2 = list3;
                                                obj = k3;
                                                intentData5 = intentData7;
                                                w1l0 w1l0Var = (w1l0) obj;
                                                String str3 = w1l0Var == null ? w1l0Var.a : null;
                                                routeDataInteractor$awaitResult$1.L$0 = null;
                                                routeDataInteractor$awaitResult$1.L$1 = intentData5;
                                                routeDataInteractor$awaitResult$1.L$2 = null;
                                                routeDataInteractor$awaitResult$1.L$3 = null;
                                                routeDataInteractor$awaitResult$1.L$4 = null;
                                                routeDataInteractor$awaitResult$1.L$5 = null;
                                                routeDataInteractor$awaitResult$1.L$6 = null;
                                                routeDataInteractor$awaitResult$1.L$7 = dd61Var3;
                                                routeDataInteractor$awaitResult$1.L$8 = pv0Var2;
                                                routeDataInteractor$awaitResult$1.L$9 = list2;
                                                routeDataInteractor$awaitResult$1.L$10 = list;
                                                routeDataInteractor$awaitResult$1.L$11 = str3;
                                                routeDataInteractor$awaitResult$1.Z$0 = z2;
                                                routeDataInteractor$awaitResult$1.label = 6;
                                                k4 = nohVar6.k(routeDataInteractor$awaitResult$1);
                                                if (k4 != coroutineSingletons) {
                                                    str = str3;
                                                    pv0Var3 = pv0Var2;
                                                    dd61Var4 = dd61Var3;
                                                    intentData6 = intentData5;
                                                    obj = k4;
                                                    List list5 = list;
                                                    List list6 = list2;
                                                    w1l0 w1l0Var2 = (w1l0) obj;
                                                    String str4 = w1l0Var2 == null ? w1l0Var2.b : null;
                                                    String str5 = intentData6.h;
                                                    String str6 = intentData6.j;
                                                    String str7 = intentData6.k;
                                                    String str8 = intentData6.l;
                                                    String str9 = intentData6.m;
                                                    boolean z3 = intentData6.n == IntentData.SummaryState.EXPANDED;
                                                    boolean z4 = intentData6.o;
                                                    s1l0 s1l0Var = RouteData$Continuation.Companion;
                                                    str2 = intentData6.p;
                                                    s1l0Var.getClass();
                                                    if (!jl40.l(str2, "scheduleride")) {
                                                        routeData$Continuation = RouteData$Continuation.SCHEDULE_RIDE;
                                                    } else if (jl40.l(str2, "select_copter_city_tour")) {
                                                        routeData$Continuation = RouteData$Continuation.SELECT_COPTER_CITY_TOUR;
                                                    }
                                                    return new u1l0(dd61Var4, pv0Var3, list6, list5, str, str4, str5, str6, str7, str8, str9, z3, z4, routeData$Continuation, intentData6.v, intentData6.w, intentData6.x, intentData6.y, intentData6.u);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        case 1:
                            z2 = routeDataInteractor$awaitResult$1.Z$0;
                            h2 = (noh) routeDataInteractor$awaitResult$1.L$6;
                            nohVar = (noh) routeDataInteractor$awaitResult$1.L$4;
                            nohVar2 = (noh) routeDataInteractor$awaitResult$1.L$3;
                            h = (noh) routeDataInteractor$awaitResult$1.L$2;
                            intentData2 = (IntentData) routeDataInteractor$awaitResult$1.L$1;
                            kotlin.b.b(obj);
                            routeDataInteractor$awaitResult$1.L$0 = null;
                            routeDataInteractor$awaitResult$1.L$1 = intentData2;
                            routeDataInteractor$awaitResult$1.L$2 = null;
                            routeDataInteractor$awaitResult$1.L$3 = nohVar2;
                            routeDataInteractor$awaitResult$1.L$4 = nohVar;
                            routeDataInteractor$awaitResult$1.L$5 = null;
                            routeDataInteractor$awaitResult$1.L$6 = h2;
                            routeDataInteractor$awaitResult$1.Z$0 = z2;
                            routeDataInteractor$awaitResult$1.label = 2;
                            obj = h.k(routeDataInteractor$awaitResult$1);
                            if (obj == coroutineSingletons) {
                            }
                            break;
                        case 2:
                            z2 = routeDataInteractor$awaitResult$1.Z$0;
                            noh nohVar8 = (noh) routeDataInteractor$awaitResult$1.L$6;
                            noh nohVar9 = (noh) routeDataInteractor$awaitResult$1.L$4;
                            nohVar2 = (noh) routeDataInteractor$awaitResult$1.L$3;
                            intentData3 = (IntentData) routeDataInteractor$awaitResult$1.L$1;
                            kotlin.b.b(obj);
                            nohVar3 = nohVar8;
                            nohVar4 = nohVar9;
                            dd61 dd61Var52 = (dd61) obj;
                            routeDataInteractor$awaitResult$1.L$0 = null;
                            routeDataInteractor$awaitResult$1.L$1 = intentData3;
                            routeDataInteractor$awaitResult$1.L$2 = null;
                            routeDataInteractor$awaitResult$1.L$3 = null;
                            routeDataInteractor$awaitResult$1.L$4 = nohVar4;
                            routeDataInteractor$awaitResult$1.L$5 = null;
                            routeDataInteractor$awaitResult$1.L$6 = nohVar3;
                            routeDataInteractor$awaitResult$1.L$7 = dd61Var52;
                            routeDataInteractor$awaitResult$1.Z$0 = z2;
                            routeDataInteractor$awaitResult$1.label = 3;
                            k = nohVar2.k(routeDataInteractor$awaitResult$1);
                            if (k == coroutineSingletons) {
                            }
                            break;
                        case 3:
                            z2 = routeDataInteractor$awaitResult$1.Z$0;
                            dd61Var = (dd61) routeDataInteractor$awaitResult$1.L$7;
                            nohVar3 = (noh) routeDataInteractor$awaitResult$1.L$6;
                            nohVar5 = (noh) routeDataInteractor$awaitResult$1.L$4;
                            intentData4 = (IntentData) routeDataInteractor$awaitResult$1.L$1;
                            kotlin.b.b(obj);
                            pv0 pv0Var42 = (pv0) obj;
                            routeDataInteractor$awaitResult$1.L$0 = null;
                            routeDataInteractor$awaitResult$1.L$1 = intentData4;
                            routeDataInteractor$awaitResult$1.L$2 = null;
                            routeDataInteractor$awaitResult$1.L$3 = null;
                            routeDataInteractor$awaitResult$1.L$4 = null;
                            routeDataInteractor$awaitResult$1.L$5 = null;
                            routeDataInteractor$awaitResult$1.L$6 = nohVar3;
                            routeDataInteractor$awaitResult$1.L$7 = dd61Var;
                            routeDataInteractor$awaitResult$1.L$8 = pv0Var42;
                            routeDataInteractor$awaitResult$1.Z$0 = z2;
                            routeDataInteractor$awaitResult$1.label = 4;
                            k2 = nohVar5.k(routeDataInteractor$awaitResult$1);
                            if (k2 == coroutineSingletons) {
                            }
                            break;
                        case 4:
                            z2 = routeDataInteractor$awaitResult$1.Z$0;
                            pv0Var = (pv0) routeDataInteractor$awaitResult$1.L$8;
                            dd61Var2 = (dd61) routeDataInteractor$awaitResult$1.L$7;
                            noh nohVar10 = (noh) routeDataInteractor$awaitResult$1.L$6;
                            intentData4 = (IntentData) routeDataInteractor$awaitResult$1.L$1;
                            kotlin.b.b(obj);
                            nohVar6 = nohVar10;
                            List list32 = (List) obj;
                            List list42 = intentData4.d;
                            routeDataInteractor$awaitResult$1.L$0 = null;
                            routeDataInteractor$awaitResult$1.L$1 = intentData4;
                            routeDataInteractor$awaitResult$1.L$2 = null;
                            routeDataInteractor$awaitResult$1.L$3 = null;
                            routeDataInteractor$awaitResult$1.L$4 = null;
                            routeDataInteractor$awaitResult$1.L$5 = null;
                            routeDataInteractor$awaitResult$1.L$6 = nohVar6;
                            routeDataInteractor$awaitResult$1.L$7 = dd61Var2;
                            routeDataInteractor$awaitResult$1.L$8 = pv0Var;
                            routeDataInteractor$awaitResult$1.L$9 = list32;
                            routeDataInteractor$awaitResult$1.L$10 = list42;
                            routeDataInteractor$awaitResult$1.Z$0 = z2;
                            routeDataInteractor$awaitResult$1.label = 5;
                            k3 = nohVar6.k(routeDataInteractor$awaitResult$1);
                            if (k3 == coroutineSingletons) {
                            }
                            break;
                        case 5:
                            z2 = routeDataInteractor$awaitResult$1.Z$0;
                            list = (List) routeDataInteractor$awaitResult$1.L$10;
                            list2 = (List) routeDataInteractor$awaitResult$1.L$9;
                            pv0Var2 = (pv0) routeDataInteractor$awaitResult$1.L$8;
                            dd61Var3 = (dd61) routeDataInteractor$awaitResult$1.L$7;
                            nohVar6 = (noh) routeDataInteractor$awaitResult$1.L$6;
                            intentData5 = (IntentData) routeDataInteractor$awaitResult$1.L$1;
                            kotlin.b.b(obj);
                            w1l0 w1l0Var3 = (w1l0) obj;
                            if (w1l0Var3 == null) {
                            }
                            routeDataInteractor$awaitResult$1.L$0 = null;
                            routeDataInteractor$awaitResult$1.L$1 = intentData5;
                            routeDataInteractor$awaitResult$1.L$2 = null;
                            routeDataInteractor$awaitResult$1.L$3 = null;
                            routeDataInteractor$awaitResult$1.L$4 = null;
                            routeDataInteractor$awaitResult$1.L$5 = null;
                            routeDataInteractor$awaitResult$1.L$6 = null;
                            routeDataInteractor$awaitResult$1.L$7 = dd61Var3;
                            routeDataInteractor$awaitResult$1.L$8 = pv0Var2;
                            routeDataInteractor$awaitResult$1.L$9 = list2;
                            routeDataInteractor$awaitResult$1.L$10 = list;
                            routeDataInteractor$awaitResult$1.L$11 = str3;
                            routeDataInteractor$awaitResult$1.Z$0 = z2;
                            routeDataInteractor$awaitResult$1.label = 6;
                            k4 = nohVar6.k(routeDataInteractor$awaitResult$1);
                            if (k4 != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        case 6:
                            String str10 = (String) routeDataInteractor$awaitResult$1.L$11;
                            list = (List) routeDataInteractor$awaitResult$1.L$10;
                            list2 = (List) routeDataInteractor$awaitResult$1.L$9;
                            pv0 pv0Var5 = (pv0) routeDataInteractor$awaitResult$1.L$8;
                            dd61 dd61Var6 = (dd61) routeDataInteractor$awaitResult$1.L$7;
                            intentData6 = (IntentData) routeDataInteractor$awaitResult$1.L$1;
                            kotlin.b.b(obj);
                            str = str10;
                            pv0Var3 = pv0Var5;
                            dd61Var4 = dd61Var6;
                            List list52 = list;
                            List list62 = list2;
                            w1l0 w1l0Var22 = (w1l0) obj;
                            if (w1l0Var22 == null) {
                            }
                            String str52 = intentData6.h;
                            String str62 = intentData6.j;
                            String str72 = intentData6.k;
                            String str82 = intentData6.l;
                            String str92 = intentData6.m;
                            boolean z32 = intentData6.n == IntentData.SummaryState.EXPANDED;
                            boolean z42 = intentData6.o;
                            s1l0 s1l0Var2 = RouteData$Continuation.Companion;
                            str2 = intentData6.p;
                            s1l0Var2.getClass();
                            if (!jl40.l(str2, "scheduleride")) {
                            }
                            return new u1l0(dd61Var4, pv0Var3, list62, list52, str, str4, str52, str62, str72, str82, str92, z32, z42, routeData$Continuation, intentData6.v, intentData6.w, intentData6.x, intentData6.y, intentData6.u);
                        default:
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (routeDataInteractor$awaitResult$1.label) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        routeDataInteractor$awaitResult$1 = new RouteDataInteractor$awaitResult$1(cVar, continuationImpl);
        Object obj2 = routeDataInteractor$awaitResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        RouteData$Continuation routeData$Continuation2 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(noh nohVar, ContinuationImpl continuationImpl) {
        RouteDataInteractor$awaitPersonalStateTariff$1 routeDataInteractor$awaitPersonalStateTariff$1;
        int i;
        if (continuationImpl instanceof RouteDataInteractor$awaitPersonalStateTariff$1) {
            routeDataInteractor$awaitPersonalStateTariff$1 = (RouteDataInteractor$awaitPersonalStateTariff$1) continuationImpl;
            int i2 = routeDataInteractor$awaitPersonalStateTariff$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeDataInteractor$awaitPersonalStateTariff$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeDataInteractor$awaitPersonalStateTariff$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeDataInteractor$awaitPersonalStateTariff$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    routeDataInteractor$awaitPersonalStateTariff$1.L$0 = null;
                    routeDataInteractor$awaitPersonalStateTariff$1.label = 1;
                    obj = nohVar.k(routeDataInteractor$awaitPersonalStateTariff$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        ni31 ni31Var = (ni31) obj;
                        if (ni31Var != null) {
                            return new w1l0(ni31Var.a, ni31Var.b);
                        }
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                routeDataInteractor$awaitPersonalStateTariff$1.L$0 = null;
                routeDataInteractor$awaitPersonalStateTariff$1.L$1 = null;
                routeDataInteractor$awaitPersonalStateTariff$1.label = 2;
                obj = this.i.a((Zone) obj, routeDataInteractor$awaitPersonalStateTariff$1);
            }
        }
        routeDataInteractor$awaitPersonalStateTariff$1 = new RouteDataInteractor$awaitPersonalStateTariff$1(this, continuationImpl);
        Object obj3 = routeDataInteractor$awaitPersonalStateTariff$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeDataInteractor$awaitPersonalStateTariff$1.label;
        if (i != 0) {
        }
        routeDataInteractor$awaitPersonalStateTariff$1.L$0 = null;
        routeDataInteractor$awaitPersonalStateTariff$1.L$1 = null;
        routeDataInteractor$awaitPersonalStateTariff$1.label = 2;
        obj3 = this.i.a((Zone) obj3, routeDataInteractor$awaitPersonalStateTariff$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        if (r13 == r1) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(t7z t7zVar, ContinuationImpl continuationImpl) {
        RouteDataInteractor$fetchRouteData$1 routeDataInteractor$fetchRouteData$1;
        int i;
        zzs a;
        IntentData intentData;
        try {
            if (continuationImpl instanceof RouteDataInteractor$fetchRouteData$1) {
                routeDataInteractor$fetchRouteData$1 = (RouteDataInteractor$fetchRouteData$1) continuationImpl;
                int i2 = routeDataInteractor$fetchRouteData$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    routeDataInteractor$fetchRouteData$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = routeDataInteractor$fetchRouteData$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = routeDataInteractor$fetchRouteData$1.label;
                    if (i == 0) {
                        if (i == 1) {
                            kotlin.b.b(obj);
                            return (u1l0) obj;
                        }
                        if (i != 2) {
                            if (i != 3 && i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        this = (c) routeDataInteractor$fetchRouteData$1.L$1;
                        kotlin.b.b(obj);
                        routeDataInteractor$fetchRouteData$1.L$0 = null;
                        routeDataInteractor$fetchRouteData$1.L$1 = null;
                        routeDataInteractor$fetchRouteData$1.label = 3;
                        Object f = this.f((IntentData) obj, routeDataInteractor$fetchRouteData$1);
                        return f == coroutineSingletons ? coroutineSingletons : f;
                    }
                    kotlin.b.b(obj);
                    if (t7zVar instanceof n7z) {
                        if (!s8o.s(((n7z) t7zVar).a)) {
                            return new Result.Failure(new Exception("Not an app shortcut intent"));
                        }
                        routeDataInteractor$fetchRouteData$1.L$0 = null;
                        routeDataInteractor$fetchRouteData$1.label = 1;
                        obj = d((n7z) t7zVar, routeDataInteractor$fetchRouteData$1);
                        if (obj == coroutineSingletons) {
                        }
                        return (u1l0) obj;
                    }
                    boolean z = t7zVar instanceof r7z;
                    b bVar = this.a;
                    if (z) {
                        c2l0 c2l0Var = ((r7z) t7zVar).a;
                        Uri uri = c2l0Var.a;
                        routeDataInteractor$fetchRouteData$1.L$0 = null;
                        routeDataInteractor$fetchRouteData$1.L$1 = this;
                        routeDataInteractor$fetchRouteData$1.label = 2;
                        obj = bvf0.n(new IntentDataInteractor$intentDataFromRouteDeeplink$2(bVar, uri, c2l0Var, null), routeDataInteractor$fetchRouteData$1);
                    } else {
                        if (!(t7zVar instanceof o7z)) {
                            return new Result.Failure(new Exception(g8e.o("Unsupported model type for RouteDataInteractor: ", qoi0.a(t7zVar.getClass()).d())));
                        }
                        Uri uri2 = ((o7z) t7zVar).a;
                        h4l0 h4l0Var = bVar.b;
                        String schemeSpecificPart = uri2.getSchemeSpecificPart();
                        int H = evu0.H(schemeSpecificPart, "?", 0, false, 6);
                        if (H == -1) {
                            H = schemeSpecificPart.length();
                        }
                        String substring = schemeSpecificPart.substring(0, H);
                        String a2 = "0,0".equals(substring) ? og21.a(uri2, "q") : null;
                        if (a2 == null || a2.length() == 0) {
                            zzs.Companion.getClass();
                            a = uzs.a(null, substring, false);
                        } else {
                            int H2 = evu0.H(a2, Extension.O_BRAKE, 0, false, 6);
                            if (H2 <= 0 || H2 >= a2.length()) {
                                a = null;
                            } else {
                                uzs uzsVar = zzs.Companion;
                                String substring2 = a2.substring(0, H2);
                                uzsVar.getClass();
                                a = uzs.a(null, substring2, false);
                            }
                        }
                        if (a != null) {
                            h4l0Var.b(uri2.toString(), false);
                            intentData = new IntentData(a, bVar.a.s(uri2), 33554413);
                        } else {
                            if (a2 != null && a2.length() != 0) {
                                h4l0Var.b(uri2.toString(), true);
                            }
                            intentData = null;
                        }
                        routeDataInteractor$fetchRouteData$1.L$0 = null;
                        routeDataInteractor$fetchRouteData$1.label = 4;
                        Object f2 = f(intentData, routeDataInteractor$fetchRouteData$1);
                        if (f2 != coroutineSingletons) {
                            return f2;
                        }
                    }
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        routeDataInteractor$fetchRouteData$1 = new RouteDataInteractor$fetchRouteData$1(this, continuationImpl);
        Object obj2 = routeDataInteractor$fetchRouteData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeDataInteractor$fetchRouteData$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x007c, code lost:
    
        if (r12 != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0066, code lost:
    
        if (r12 == r0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010d A[EDGE_INSN: B:28:0x010d->B:24:0x010d BREAK  A[LOOP:0: B:18:0x00f9->B:27:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(n7z n7zVar, ContinuationImpl continuationImpl) {
        RouteDataInteractor$routeDataFromAppShortcutIntent$1 routeDataInteractor$routeDataFromAppShortcutIntent$1;
        int i;
        PlaceType placeType;
        Object c;
        PlaceType placeType2;
        dd61 dd61Var;
        ffp ffpVar;
        Iterator it;
        if (continuationImpl instanceof RouteDataInteractor$routeDataFromAppShortcutIntent$1) {
            routeDataInteractor$routeDataFromAppShortcutIntent$1 = (RouteDataInteractor$routeDataFromAppShortcutIntent$1) continuationImpl;
            int i2 = routeDataInteractor$routeDataFromAppShortcutIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeDataInteractor$routeDataFromAppShortcutIntent$1.label = i2 - Integer.MIN_VALUE;
                RouteDataInteractor$routeDataFromAppShortcutIntent$1 routeDataInteractor$routeDataFromAppShortcutIntent$12 = routeDataInteractor$routeDataFromAppShortcutIntent$1;
                Object obj = routeDataInteractor$routeDataFromAppShortcutIntent$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeDataInteractor$routeDataFromAppShortcutIntent$12.label;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    routeDataInteractor$routeDataFromAppShortcutIntent$12.L$0 = n7zVar;
                    routeDataInteractor$routeDataFromAppShortcutIntent$12.label = 1;
                    obj = e(routeDataInteractor$routeDataFromAppShortcutIntent$12);
                } else if (i == 1) {
                    n7zVar = (n7z) routeDataInteractor$routeDataFromAppShortcutIntent$12.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        placeType2 = (PlaceType) routeDataInteractor$routeDataFromAppShortcutIntent$12.L$3;
                        dd61Var = (dd61) routeDataInteractor$routeDataFromAppShortcutIntent$12.L$2;
                        kotlin.b.b(obj);
                        ffpVar = (ffp) obj;
                        if (ffpVar != null || (r12 = ffpVar.a) == null) {
                            Iterable iterable = EmptyList.a;
                        }
                        it = iterable.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((FavoriteAddress) next).getPlaceType() == placeType2) {
                                obj3 = next;
                                break;
                            }
                        }
                        return new u1l0(dd61Var, z81.f((FavoriteAddress) obj3));
                    }
                    n7zVar = (n7z) routeDataInteractor$routeDataFromAppShortcutIntent$12.L$0;
                    kotlin.b.b(obj);
                    dd61 dd61Var2 = (dd61) obj;
                    Intent intent = n7zVar.a;
                    String stringExtra = intent.getStringExtra("SHORTCUT_ACTION");
                    if (stringExtra == null || stringExtra.equals("SHORTCUT_ACTION_SET_DESTINATION")) {
                        String stringExtra2 = intent.getStringExtra("SHORTCUT_TARGET");
                        if (stringExtra2 != null) {
                            if (stringExtra2.equals("SHORTCUT_TARGET_HOME")) {
                                placeType = PlaceType.HOME;
                            } else if (stringExtra2.equals("SHORTCUT_TARGET_WORK")) {
                                placeType = PlaceType.WORK;
                            } else {
                                jst.e.n("AppShortcuts: can't extract destination address - unknown target");
                            }
                            if (placeType != null) {
                                return new u1l0(dd61Var2, null);
                            }
                            routeDataInteractor$routeDataFromAppShortcutIntent$12.L$0 = null;
                            routeDataInteractor$routeDataFromAppShortcutIntent$12.L$1 = null;
                            routeDataInteractor$routeDataFromAppShortcutIntent$12.L$2 = dd61Var2;
                            routeDataInteractor$routeDataFromAppShortcutIntent$12.L$3 = placeType;
                            routeDataInteractor$routeDataFromAppShortcutIntent$12.label = 3;
                            c = this.c.c(false, routeDataInteractor$routeDataFromAppShortcutIntent$12);
                            if (c != obj2) {
                                obj = c;
                                placeType2 = placeType;
                                dd61Var = dd61Var2;
                                ffpVar = (ffp) obj;
                                if (ffpVar != null) {
                                }
                                Iterable iterable2 = EmptyList.a;
                                it = iterable2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                    }
                                }
                                return new u1l0(dd61Var, z81.f((FavoriteAddress) obj3));
                            }
                            return obj2;
                        }
                        jst.e.n("AppShortcuts: can't extract destination address - no target");
                    } else {
                        jst.e.n("AppShortcuts: can't extract destination address - this is not destination Intent");
                    }
                    placeType = null;
                    if (placeType != null) {
                    }
                }
                routeDataInteractor$routeDataFromAppShortcutIntent$12.L$0 = n7zVar;
                routeDataInteractor$routeDataFromAppShortcutIntent$12.L$1 = null;
                routeDataInteractor$routeDataFromAppShortcutIntent$12.label = 2;
                obj = this.b.e((zzs) obj, null, false, false, routeDataInteractor$routeDataFromAppShortcutIntent$12);
            }
        }
        routeDataInteractor$routeDataFromAppShortcutIntent$1 = new RouteDataInteractor$routeDataFromAppShortcutIntent$1(this, continuationImpl);
        RouteDataInteractor$routeDataFromAppShortcutIntent$1 routeDataInteractor$routeDataFromAppShortcutIntent$122 = routeDataInteractor$routeDataFromAppShortcutIntent$1;
        Object obj4 = routeDataInteractor$routeDataFromAppShortcutIntent$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeDataInteractor$routeDataFromAppShortcutIntent$122.label;
        Object obj32 = null;
        if (i != 0) {
        }
        routeDataInteractor$routeDataFromAppShortcutIntent$122.L$0 = n7zVar;
        routeDataInteractor$routeDataFromAppShortcutIntent$122.L$1 = null;
        routeDataInteractor$routeDataFromAppShortcutIntent$122.label = 2;
        obj4 = this.b.e((zzs) obj4, null, false, false, routeDataInteractor$routeDataFromAppShortcutIntent$122);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        RouteDataInteractor$sourceGeoPointFromUserLocation$1 routeDataInteractor$sourceGeoPointFromUserLocation$1;
        int i;
        if (continuationImpl instanceof RouteDataInteractor$sourceGeoPointFromUserLocation$1) {
            routeDataInteractor$sourceGeoPointFromUserLocation$1 = (RouteDataInteractor$sourceGeoPointFromUserLocation$1) continuationImpl;
            int i2 = routeDataInteractor$sourceGeoPointFromUserLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeDataInteractor$sourceGeoPointFromUserLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeDataInteractor$sourceGeoPointFromUserLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeDataInteractor$sourceGeoPointFromUserLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    routeDataInteractor$sourceGeoPointFromUserLocation$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.g).g(routeDataInteractor$sourceGeoPointFromUserLocation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((mo21) obj).a();
            }
        }
        routeDataInteractor$sourceGeoPointFromUserLocation$1 = new RouteDataInteractor$sourceGeoPointFromUserLocation$1(this, continuationImpl);
        Object obj2 = routeDataInteractor$sourceGeoPointFromUserLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeDataInteractor$sourceGeoPointFromUserLocation$1.label;
        if (i != 0) {
        }
        return ((mo21) obj2).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(IntentData intentData, ContinuationImpl continuationImpl) {
        RouteDataInteractor$toRouteData$1 routeDataInteractor$toRouteData$1;
        int i;
        pzt0 pzt0Var;
        if (continuationImpl instanceof RouteDataInteractor$toRouteData$1) {
            routeDataInteractor$toRouteData$1 = (RouteDataInteractor$toRouteData$1) continuationImpl;
            int i2 = routeDataInteractor$toRouteData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeDataInteractor$toRouteData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeDataInteractor$toRouteData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeDataInteractor$toRouteData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (intentData == null) {
                        return new Result.Failure(new Exception("No intent data extracted"));
                    }
                    this.d.a = intentData.e;
                    boolean z = intentData.a != null;
                    if (z && (pzt0Var = this.e.c) != null) {
                        pzt0Var.a(null);
                    }
                    RouteDataInteractor$toRouteData$2 routeDataInteractor$toRouteData$2 = new RouteDataInteractor$toRouteData$2(this, intentData, z, null);
                    routeDataInteractor$toRouteData$1.L$0 = null;
                    routeDataInteractor$toRouteData$1.Z$0 = z;
                    routeDataInteractor$toRouteData$1.label = 1;
                    obj = bvf0.n(routeDataInteractor$toRouteData$2, routeDataInteractor$toRouteData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        routeDataInteractor$toRouteData$1 = new RouteDataInteractor$toRouteData$1(this, continuationImpl);
        Object obj2 = routeDataInteractor$toRouteData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeDataInteractor$toRouteData$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
