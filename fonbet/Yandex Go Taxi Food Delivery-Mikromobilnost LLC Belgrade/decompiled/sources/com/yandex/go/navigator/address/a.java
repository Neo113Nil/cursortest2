package com.yandex.go.navigator.address;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.atd0;
import defpackage.bvf0;
import defpackage.jst;
import defpackage.ne50;
import defpackage.ny61;
import defpackage.oe50;
import defpackage.pv0;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.xby;
import defpackage.zzs;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.go.route.interactor.b a;
    public final atd0 b;

    public a(com.yandex.go.route.interactor.b bVar, atd0 atd0Var) {
        this.a = bVar;
        this.b = atd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[Catch: all -> 0x0032, CancellationException -> 0x0071, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0071, all -> 0x0032, blocks: (B:11:0x002e, B:12:0x005c, B:14:0x0060, B:22:0x003f), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(zzs zzsVar, RoutePointType routePointType, ContinuationImpl continuationImpl) {
        NavigationRouteFromPreorderInteractor$requestAddress$1 navigationRouteFromPreorderInteractor$requestAddress$1;
        int i;
        try {
            if (continuationImpl instanceof NavigationRouteFromPreorderInteractor$requestAddress$1) {
                navigationRouteFromPreorderInteractor$requestAddress$1 = (NavigationRouteFromPreorderInteractor$requestAddress$1) continuationImpl;
                int i2 = navigationRouteFromPreorderInteractor$requestAddress$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    navigationRouteFromPreorderInteractor$requestAddress$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = navigationRouteFromPreorderInteractor$requestAddress$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = navigationRouteFromPreorderInteractor$requestAddress$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        tpr c = atd0.c(this.b, zzsVar, routePointType, null, Action.PIN_DROP, null, null, 48);
                        navigationRouteFromPreorderInteractor$requestAddress$1.L$0 = null;
                        navigationRouteFromPreorderInteractor$requestAddress$1.L$1 = null;
                        navigationRouteFromPreorderInteractor$requestAddress$1.label = 1;
                        obj = kotlinx.coroutines.flow.e.A(c, navigationRouteFromPreorderInteractor$requestAddress$1);
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
                    pv0 pv0Var = (pv0) obj;
                    return pv0Var != null ? pv0Var.a : null;
                }
            }
            if (i != 0) {
            }
            pv0 pv0Var2 = (pv0) obj;
            return pv0Var2 != null ? pv0Var2.a : null;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "NavigatorAddress", null, th, "Error when try to finalize address", 2);
            return null;
        }
        navigationRouteFromPreorderInteractor$requestAddress$1 = new NavigationRouteFromPreorderInteractor$requestAddress$1(this, continuationImpl);
        Object obj2 = navigationRouteFromPreorderInteractor$requestAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigationRouteFromPreorderInteractor$requestAddress$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        NavigationRouteFromPreorderInteractor$srcAddress$1 navigationRouteFromPreorderInteractor$srcAddress$1;
        int i;
        ZoneAddress zoneAddress;
        Address address;
        if (continuationImpl instanceof NavigationRouteFromPreorderInteractor$srcAddress$1) {
            navigationRouteFromPreorderInteractor$srcAddress$1 = (NavigationRouteFromPreorderInteractor$srcAddress$1) continuationImpl;
            int i2 = navigationRouteFromPreorderInteractor$srcAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigationRouteFromPreorderInteractor$srcAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigationRouteFromPreorderInteractor$srcAddress$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigationRouteFromPreorderInteractor$srcAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Address h = this.a.c().h();
                    if (h != null) {
                        RoutePointType routePointType = RoutePointType.SERVICE_NAVIGATOR_A;
                        navigationRouteFromPreorderInteractor$srcAddress$1.L$0 = null;
                        navigationRouteFromPreorderInteractor$srcAddress$1.label = 1;
                        obj = a(h.B(), routePointType, navigationRouteFromPreorderInteractor$srcAddress$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Address address2 = (Address) obj;
                zoneAddress = address2 == null ? new ZoneAddress(address2, (Zone) null) : null;
                if (zoneAddress != null && (address = zoneAddress.a) != null) {
                    return new oe50(address);
                }
                return null;
            }
        }
        navigationRouteFromPreorderInteractor$srcAddress$1 = new NavigationRouteFromPreorderInteractor$srcAddress$1(this, continuationImpl);
        Object obj3 = navigationRouteFromPreorderInteractor$srcAddress$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigationRouteFromPreorderInteractor$srcAddress$1.label;
        if (i != 0) {
        }
        Address address22 = (Address) obj3;
        if (address22 == null) {
        }
        if (zoneAddress != null) {
            return new oe50(address);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[LOOP:0: B:11:0x0062->B:13:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(ContinuationImpl continuationImpl) {
        NavigationRouteFromPreorderInteractor$stopsAddresses$1 navigationRouteFromPreorderInteractor$stopsAddresses$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof NavigationRouteFromPreorderInteractor$stopsAddresses$1) {
            navigationRouteFromPreorderInteractor$stopsAddresses$1 = (NavigationRouteFromPreorderInteractor$stopsAddresses$1) continuationImpl;
            int i2 = navigationRouteFromPreorderInteractor$stopsAddresses$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                navigationRouteFromPreorderInteractor$stopsAddresses$1.label = i2 - Integer.MIN_VALUE;
                Object obj = navigationRouteFromPreorderInteractor$stopsAddresses$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = navigationRouteFromPreorderInteractor$stopsAddresses$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = this.a.c().b;
                    RoutePointType routePointType = RoutePointType.SERVICE_NAVIGATOR_B;
                    navigationRouteFromPreorderInteractor$stopsAddresses$1.L$0 = null;
                    navigationRouteFromPreorderInteractor$stopsAddresses$1.label = 1;
                    obj = bvf0.n(new NavigationRouteFromPreorderInteractor$updateDestinations$2(list, this, routePointType, null), navigationRouteFromPreorderInteractor$stopsAddresses$1);
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
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ne50((Address) it.next()));
                }
                return arrayList;
            }
        }
        navigationRouteFromPreorderInteractor$stopsAddresses$1 = new NavigationRouteFromPreorderInteractor$stopsAddresses$1(this, continuationImpl);
        Object obj2 = navigationRouteFromPreorderInteractor$stopsAddresses$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = navigationRouteFromPreorderInteractor$stopsAddresses$1.label;
        if (i != 0) {
        }
        List list22 = (List) obj2;
        ArrayList arrayList2 = new ArrayList(tcc.n(list22, 10));
        it = list22.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }
}
