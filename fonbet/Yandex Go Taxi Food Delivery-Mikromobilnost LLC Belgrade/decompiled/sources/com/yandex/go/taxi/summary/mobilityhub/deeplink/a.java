package com.yandex.go.taxi.summary.mobilityhub.deeplink;

import com.yandex.go.taxi.summary.mobilityhub.interactor.j0;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.WayPoint;
import defpackage.dd61;
import defpackage.fx60;
import defpackage.jo0;
import defpackage.k220;
import defpackage.ny61;
import defpackage.o241;
import defpackage.oep0;
import defpackage.pn2;
import defpackage.pv0;
import defpackage.tcc;
import defpackage.tw30;
import defpackage.v770;
import defpackage.wv20;
import defpackage.xes0;
import defpackage.xv20;
import defpackage.ycc;
import defpackage.yvf0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.deeplinks.e;
import ru.yandex.taxi.map_common.map.p;
import ru.yandex.taxi.masstransit.datasource.routing.c;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes8.dex */
public final class a extends xv20 {
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final p e;
    public final xes0 f;
    public final fx60 g;
    public final e h;

    public a(pn2 pn2Var, k220 k220Var, o241 o241Var, p pVar, xes0 xes0Var, fx60 fx60Var, e eVar) {
        this.b = pn2Var;
        this.c = k220Var;
        this.d = o241Var;
        this.e = pVar;
        this.f = xes0Var;
        this.g = fx60Var;
        this.h = eVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (wv20) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, wv20 wv20Var, ContinuationImpl continuationImpl) {
        HubDeeplinkHandler$handleDeeplink$1 hubDeeplinkHandler$handleDeeplink$1;
        Object obj;
        int i;
        SimpleSpinnerModalView a;
        oep0 oep0Var2;
        wv20 wv20Var2;
        Object f;
        oep0 oep0Var3;
        Route route;
        Route route2;
        oep0 oep0Var4;
        if (continuationImpl instanceof HubDeeplinkHandler$handleDeeplink$1) {
            hubDeeplinkHandler$handleDeeplink$1 = (HubDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = hubDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hubDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = hubDeeplinkHandler$handleDeeplink$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hubDeeplinkHandler$handleDeeplink$1.label;
                List list = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    a = this.f.a();
                    hubDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    hubDeeplinkHandler$handleDeeplink$1.L$1 = wv20Var;
                    hubDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    hubDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    hubDeeplinkHandler$handleDeeplink$1.L$4 = a;
                    hubDeeplinkHandler$handleDeeplink$1.label = 1;
                    if (this.e.c(hubDeeplinkHandler$handleDeeplink$1) != obj) {
                        oep0Var2 = oep0Var;
                        wv20Var2 = wv20Var;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        route2 = (Route) hubDeeplinkHandler$handleDeeplink$1.L$5;
                        a = (SimpleSpinnerModalView) hubDeeplinkHandler$handleDeeplink$1.L$4;
                        oep0Var4 = (oep0) hubDeeplinkHandler$handleDeeplink$1.L$0;
                        kotlin.b.b(obj2);
                        list = (List) obj2;
                        a.dismiss();
                        zy11 zy11Var = zy11.a;
                        if (route2 != null && list != null) {
                            this.g.a(Events$Zalogin$LoginContext.DEEPLINK, new jo0(oep0Var4, this, route2, list, 15));
                        }
                        return zy11Var;
                    }
                    a = (SimpleSpinnerModalView) hubDeeplinkHandler$handleDeeplink$1.L$4;
                    oep0Var3 = (oep0) hubDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj2);
                    route = (Route) obj2;
                    if (route != null) {
                        route2 = route;
                        oep0Var4 = oep0Var3;
                        a.dismiss();
                        zy11 zy11Var2 = zy11.a;
                        if (route2 != null) {
                        }
                        return zy11Var2;
                    }
                    List wayPoints = route.getWayPoints();
                    hubDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var3;
                    hubDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    hubDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    hubDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    hubDeeplinkHandler$handleDeeplink$1.L$4 = a;
                    hubDeeplinkHandler$handleDeeplink$1.L$5 = route;
                    hubDeeplinkHandler$handleDeeplink$1.L$6 = null;
                    hubDeeplinkHandler$handleDeeplink$1.label = 3;
                    Object e = e(wayPoints, hubDeeplinkHandler$handleDeeplink$1);
                    if (e != obj) {
                        route2 = route;
                        obj2 = e;
                        oep0Var4 = oep0Var3;
                        list = (List) obj2;
                        a.dismiss();
                        zy11 zy11Var22 = zy11.a;
                        if (route2 != null) {
                            this.g.a(Events$Zalogin$LoginContext.DEEPLINK, new jo0(oep0Var4, this, route2, list, 15));
                        }
                        return zy11Var22;
                    }
                    return obj;
                }
                a = (SimpleSpinnerModalView) hubDeeplinkHandler$handleDeeplink$1.L$4;
                wv20Var2 = (wv20) hubDeeplinkHandler$handleDeeplink$1.L$1;
                oep0 oep0Var5 = (oep0) hubDeeplinkHandler$handleDeeplink$1.L$0;
                kotlin.b.b(obj2);
                oep0Var2 = oep0Var5;
                hubDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var2;
                hubDeeplinkHandler$handleDeeplink$1.L$1 = null;
                hubDeeplinkHandler$handleDeeplink$1.L$2 = null;
                hubDeeplinkHandler$handleDeeplink$1.L$3 = null;
                hubDeeplinkHandler$handleDeeplink$1.L$4 = a;
                hubDeeplinkHandler$handleDeeplink$1.label = 2;
                f = f(wv20Var2, hubDeeplinkHandler$handleDeeplink$1);
                if (f != obj) {
                    oep0Var3 = oep0Var2;
                    obj2 = f;
                    route = (Route) obj2;
                    if (route != null) {
                    }
                }
                return obj;
            }
        }
        hubDeeplinkHandler$handleDeeplink$1 = new HubDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj22 = hubDeeplinkHandler$handleDeeplink$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hubDeeplinkHandler$handleDeeplink$1.label;
        List list2 = null;
        if (i != 0) {
        }
        hubDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var2;
        hubDeeplinkHandler$handleDeeplink$1.L$1 = null;
        hubDeeplinkHandler$handleDeeplink$1.L$2 = null;
        hubDeeplinkHandler$handleDeeplink$1.L$3 = null;
        hubDeeplinkHandler$handleDeeplink$1.L$4 = a;
        hubDeeplinkHandler$handleDeeplink$1.label = 2;
        f = f(wv20Var2, hubDeeplinkHandler$handleDeeplink$1);
        if (f != obj) {
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, ContinuationImpl continuationImpl) {
        HubDeeplinkHandler$mapAddresses$1 hubDeeplinkHandler$mapAddresses$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object e;
        List list2;
        ArrayList arrayList;
        List K;
        ArrayList arrayList2;
        Collection collection;
        List list3;
        if (continuationImpl instanceof HubDeeplinkHandler$mapAddresses$1) {
            hubDeeplinkHandler$mapAddresses$1 = (HubDeeplinkHandler$mapAddresses$1) continuationImpl;
            int i2 = hubDeeplinkHandler$mapAddresses$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hubDeeplinkHandler$mapAddresses$1.label = i2 - Integer.MIN_VALUE;
                obj = hubDeeplinkHandler$mapAddresses$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hubDeeplinkHandler$mapAddresses$1.label;
                e eVar = this.h;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list4 = list;
                    ArrayList arrayList3 = new ArrayList(tcc.n(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(ru.yandex.taxi.map.utils.a.E(((WayPoint) it.next()).getPosition(), null));
                    }
                    if (arrayList3.size() < 2) {
                        return null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    zzs zzsVar = (zzs) kotlin.collections.a.P(arrayList3);
                    hubDeeplinkHandler$mapAddresses$1.L$0 = null;
                    hubDeeplinkHandler$mapAddresses$1.L$1 = arrayList3;
                    hubDeeplinkHandler$mapAddresses$1.L$2 = arrayList4;
                    hubDeeplinkHandler$mapAddresses$1.label = 1;
                    e = eVar.e(zzsVar, null, false, false, hubDeeplinkHandler$mapAddresses$1);
                    if (e != coroutineSingletons) {
                        list2 = arrayList4;
                        arrayList = arrayList3;
                        obj = e;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list3 = (List) hubDeeplinkHandler$mapAddresses$1.L$2;
                        kotlin.b.b(obj);
                        list3.add(((pv0) obj).a);
                        return list3;
                    }
                    collection = (Collection) hubDeeplinkHandler$mapAddresses$1.L$5;
                    list2 = (List) hubDeeplinkHandler$mapAddresses$1.L$2;
                    ?? r4 = (List) hubDeeplinkHandler$mapAddresses$1.L$1;
                    kotlin.b.b(obj);
                    arrayList2 = r4;
                    ycc.r((Iterable) obj, collection);
                    arrayList = arrayList2;
                    zzs zzsVar2 = (zzs) kotlin.collections.a.Z(arrayList);
                    hubDeeplinkHandler$mapAddresses$1.L$0 = null;
                    hubDeeplinkHandler$mapAddresses$1.L$1 = null;
                    hubDeeplinkHandler$mapAddresses$1.L$2 = list2;
                    hubDeeplinkHandler$mapAddresses$1.L$3 = null;
                    hubDeeplinkHandler$mapAddresses$1.L$4 = null;
                    hubDeeplinkHandler$mapAddresses$1.L$5 = null;
                    hubDeeplinkHandler$mapAddresses$1.label = 3;
                    obj = e.b(eVar, zzsVar2, hubDeeplinkHandler$mapAddresses$1, 30);
                    if (obj != coroutineSingletons) {
                        list3 = list2;
                        list3.add(((pv0) obj).a);
                        return list3;
                    }
                    return coroutineSingletons;
                }
                List list5 = (List) hubDeeplinkHandler$mapAddresses$1.L$2;
                ?? r2 = (List) hubDeeplinkHandler$mapAddresses$1.L$1;
                kotlin.b.b(obj);
                list2 = list5;
                arrayList = r2;
                List list6 = list2;
                list6.add(((dd61) obj).b().a);
                K = kotlin.collections.a.K(kotlin.collections.a.J(arrayList, 1));
                if (!K.isEmpty()) {
                    hubDeeplinkHandler$mapAddresses$1.L$0 = null;
                    hubDeeplinkHandler$mapAddresses$1.L$1 = arrayList;
                    hubDeeplinkHandler$mapAddresses$1.L$2 = list2;
                    hubDeeplinkHandler$mapAddresses$1.L$3 = null;
                    hubDeeplinkHandler$mapAddresses$1.L$4 = null;
                    hubDeeplinkHandler$mapAddresses$1.L$5 = list6;
                    hubDeeplinkHandler$mapAddresses$1.label = 2;
                    obj = eVar.c(null, K, hubDeeplinkHandler$mapAddresses$1);
                    if (obj != coroutineSingletons) {
                        arrayList2 = arrayList;
                        collection = list6;
                        ycc.r((Iterable) obj, collection);
                        arrayList = arrayList2;
                    }
                    return coroutineSingletons;
                }
                zzs zzsVar22 = (zzs) kotlin.collections.a.Z(arrayList);
                hubDeeplinkHandler$mapAddresses$1.L$0 = null;
                hubDeeplinkHandler$mapAddresses$1.L$1 = null;
                hubDeeplinkHandler$mapAddresses$1.L$2 = list2;
                hubDeeplinkHandler$mapAddresses$1.L$3 = null;
                hubDeeplinkHandler$mapAddresses$1.L$4 = null;
                hubDeeplinkHandler$mapAddresses$1.L$5 = null;
                hubDeeplinkHandler$mapAddresses$1.label = 3;
                obj = e.b(eVar, zzsVar22, hubDeeplinkHandler$mapAddresses$1, 30);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        hubDeeplinkHandler$mapAddresses$1 = new HubDeeplinkHandler$mapAddresses$1(this, continuationImpl);
        obj = hubDeeplinkHandler$mapAddresses$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hubDeeplinkHandler$mapAddresses$1.label;
        e eVar2 = this.h;
        if (i != 0) {
        }
        List list62 = list2;
        list62.add(((dd61) obj).b().a);
        K = kotlin.collections.a.K(kotlin.collections.a.J(arrayList, 1));
        if (!K.isEmpty()) {
        }
        zzs zzsVar222 = (zzs) kotlin.collections.a.Z(arrayList);
        hubDeeplinkHandler$mapAddresses$1.L$0 = null;
        hubDeeplinkHandler$mapAddresses$1.L$1 = null;
        hubDeeplinkHandler$mapAddresses$1.L$2 = list2;
        hubDeeplinkHandler$mapAddresses$1.L$3 = null;
        hubDeeplinkHandler$mapAddresses$1.L$4 = null;
        hubDeeplinkHandler$mapAddresses$1.L$5 = null;
        hubDeeplinkHandler$mapAddresses$1.label = 3;
        obj = e.b(eVar2, zzsVar222, hubDeeplinkHandler$mapAddresses$1, 30);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        if (r6 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (r6 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(wv20 wv20Var, ContinuationImpl continuationImpl) {
        HubDeeplinkHandler$resolveRoute$1 hubDeeplinkHandler$resolveRoute$1;
        int i;
        Object b;
        Object c;
        if (continuationImpl instanceof HubDeeplinkHandler$resolveRoute$1) {
            hubDeeplinkHandler$resolveRoute$1 = (HubDeeplinkHandler$resolveRoute$1) continuationImpl;
            int i2 = hubDeeplinkHandler$resolveRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hubDeeplinkHandler$resolveRoute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = hubDeeplinkHandler$resolveRoute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hubDeeplinkHandler$resolveRoute$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        c = ((Result) obj).getValue();
                        return (Route) (c instanceof Result.Failure ? null : c);
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                    return (Route) (b instanceof Result.Failure ? null : b);
                }
                kotlin.b.b(obj);
                String b2 = wv20Var.b();
                String a = wv20Var.a();
                if (b2.equals(HubDeeplinkHandler$TransportType.TRANSPORT.getValue())) {
                    tw30 tw30Var = (tw30) this.c.get();
                    hubDeeplinkHandler$resolveRoute$1.L$0 = null;
                    hubDeeplinkHandler$resolveRoute$1.L$1 = null;
                    hubDeeplinkHandler$resolveRoute$1.L$2 = null;
                    hubDeeplinkHandler$resolveRoute$1.label = 1;
                    c = ((c) tw30Var).c(a, null, hubDeeplinkHandler$resolveRoute$1);
                } else {
                    if (!b2.equals(HubDeeplinkHandler$TransportType.PEDESTRIAN.getValue())) {
                        return null;
                    }
                    j0 j0Var = (j0) this.d.get();
                    hubDeeplinkHandler$resolveRoute$1.L$0 = null;
                    hubDeeplinkHandler$resolveRoute$1.L$1 = null;
                    hubDeeplinkHandler$resolveRoute$1.L$2 = null;
                    hubDeeplinkHandler$resolveRoute$1.label = 2;
                    b = j0Var.b(a, hubDeeplinkHandler$resolveRoute$1);
                }
                return coroutineSingletons;
            }
        }
        hubDeeplinkHandler$resolveRoute$1 = new HubDeeplinkHandler$resolveRoute$1(this, continuationImpl);
        Object obj2 = hubDeeplinkHandler$resolveRoute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hubDeeplinkHandler$resolveRoute$1.label;
        if (i == 0) {
        }
    }
}
