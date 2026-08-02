package com.yandex.go.route.interactor;

import com.yandex.go.route.experiment.MapRouteAppearanceExperiment;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$Type;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.jbh;
import defpackage.lr00;
import defpackage.mo5;
import defpackage.noe;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.q6l0;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wiq0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n;

/* loaded from: classes13.dex */
public final class a implements lr00 {
    public final wiq0 a;
    public final b b;
    public final tt2 c;
    public final ru.yandex.taxi.walkroute.a d;
    public final mo5 e;
    public final noe f;
    public final qqo g;

    public a(wiq0 wiq0Var, b bVar, tt2 tt2Var, ru.yandex.taxi.walkroute.a aVar, mo5 mo5Var, noe noeVar, rqo rqoVar) {
        this.a = wiq0Var;
        this.b = bVar;
        this.c = tt2Var;
        this.d = aVar;
        this.e = mo5Var;
        this.f = noeVar;
        this.g = ((jbh) rqoVar).c(MapRouteAppearanceExperiment.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zzs zzsVar, zzs zzsVar2, ContinuationImpl continuationImpl) {
        MapRouteAppearanceInteractorImpl$getWalkRoutePoints$1 mapRouteAppearanceInteractorImpl$getWalkRoutePoints$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof MapRouteAppearanceInteractorImpl$getWalkRoutePoints$1) {
            mapRouteAppearanceInteractorImpl$getWalkRoutePoints$1 = (MapRouteAppearanceInteractorImpl$getWalkRoutePoints$1) continuationImpl;
            int i2 = mapRouteAppearanceInteractorImpl$getWalkRoutePoints$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapRouteAppearanceInteractorImpl$getWalkRoutePoints$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapRouteAppearanceInteractorImpl$getWalkRoutePoints$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapRouteAppearanceInteractorImpl$getWalkRoutePoints$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mapRouteAppearanceInteractorImpl$getWalkRoutePoints$1.L$0 = null;
                    mapRouteAppearanceInteractorImpl$getWalkRoutePoints$1.L$1 = null;
                    mapRouteAppearanceInteractorImpl$getWalkRoutePoints$1.label = 1;
                    obj = this.d.b(zzsVar, zzsVar2, mapRouteAppearanceInteractorImpl$getWalkRoutePoints$1);
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
                it = ((Iterable) obj).iterator();
                if (it.hasNext()) {
                    ny61.p();
                    return null;
                }
                Object next = it.next();
                if (it.hasNext()) {
                    double a = nzs.a((Route) next);
                    do {
                        Object next2 = it.next();
                        double a2 = nzs.a((Route) next2);
                        if (Double.compare(a, a2) > 0) {
                            next = next2;
                            a = a2;
                        }
                    } while (it.hasNext());
                }
                List<Point> points = ((Route) next).getGeometry().getPoints();
                ArrayList arrayList = new ArrayList(tcc.n(points, 10));
                for (Point point : points) {
                    arrayList.add(new zzs(point.getLatitude(), point.getLongitude(), 0, null, null, 28));
                }
                return new q6l0(arrayList, null, null, null, null, null, null, true, MapRouteAppearance$Type.WALK_ROUTE);
            }
        }
        mapRouteAppearanceInteractorImpl$getWalkRoutePoints$1 = new MapRouteAppearanceInteractorImpl$getWalkRoutePoints$1(this, continuationImpl);
        Object obj2 = mapRouteAppearanceInteractorImpl$getWalkRoutePoints$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapRouteAppearanceInteractorImpl$getWalkRoutePoints$1.label;
        if (i != 0) {
        }
        it = ((Iterable) obj2).iterator();
        if (it.hasNext()) {
        }
    }

    public final tpr b() {
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(((k) this.a).j.b(), this.b.k(), new n(this.g.a(), new MapRouteAppearanceInteractorImpl$routeFlow$1(this, null)), new MapRouteAppearanceInteractorImpl$routeFlow$2(this, null)));
        this.c.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }
}
