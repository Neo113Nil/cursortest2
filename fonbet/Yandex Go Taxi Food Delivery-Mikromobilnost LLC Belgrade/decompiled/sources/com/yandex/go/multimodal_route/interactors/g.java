package com.yandex.go.multimodal_route.interactors;

import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.geometry.SubpolylineHelper;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.Section;
import defpackage.ew40;
import defpackage.fw40;
import defpackage.ny61;
import defpackage.pt40;
import defpackage.qt40;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uu40;
import defpackage.uyj;
import defpackage.wiq0;
import defpackage.zgc0;
import defpackage.zzs;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class g implements fw40 {
    public final uu40 a;
    public final qt40 b;
    public final tpr c;

    public g(uu40 uu40Var, qt40 qt40Var, wiq0 wiq0Var, tt2 tt2Var) {
        this.a = uu40Var;
        this.b = qt40Var;
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new f(((k) wiq0Var).g())), new MultimodalTaxiRouteInteractorImpl$special$$inlined$flatMapLatest$1(null, this));
        tt2Var.getClass();
        this.c = kotlinx.coroutines.flow.e.F(X, uyj.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, ContinuationImpl continuationImpl) {
        MultimodalTaxiRouteInteractorImpl$resolveRoute$1 multimodalTaxiRouteInteractorImpl$resolveRoute$1;
        int i;
        Object b;
        Route route;
        Object obj;
        Subpolyline geometry;
        Polyline subpolyline;
        List<Point> points;
        Point point;
        Point point2;
        if (continuationImpl instanceof MultimodalTaxiRouteInteractorImpl$resolveRoute$1) {
            multimodalTaxiRouteInteractorImpl$resolveRoute$1 = (MultimodalTaxiRouteInteractorImpl$resolveRoute$1) continuationImpl;
            int i2 = multimodalTaxiRouteInteractorImpl$resolveRoute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalTaxiRouteInteractorImpl$resolveRoute$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = multimodalTaxiRouteInteractorImpl$resolveRoute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalTaxiRouteInteractorImpl$resolveRoute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = (String) kotlin.collections.a.R(list);
                    if (str != null) {
                        multimodalTaxiRouteInteractorImpl$resolveRoute$1.L$0 = null;
                        multimodalTaxiRouteInteractorImpl$resolveRoute$1.L$1 = null;
                        multimodalTaxiRouteInteractorImpl$resolveRoute$1.label = 1;
                        b = ((c) this.a).b(str, multimodalTaxiRouteInteractorImpl$resolveRoute$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj2);
                b = ((Result) obj2).getValue();
                if (b instanceof Result.Failure) {
                    b = null;
                }
                route = (Route) b;
                if (route != null) {
                    this.b.getClass();
                    pt40 pt40Var = new pt40(route);
                    Iterator<T> it = route.getSections().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((Section) obj).getMetadata().getData().getTaxi() != null) {
                            break;
                        }
                    }
                    Section section = (Section) obj;
                    if (section != null && (geometry = section.getGeometry()) != null && (subpolyline = SubpolylineHelper.subpolyline(route.getGeometry(), geometry)) != null && (points = subpolyline.getPoints()) != null && (point = (Point) kotlin.collections.a.R(points)) != null && (point2 = (Point) kotlin.collections.a.b0(points)) != null) {
                        zgc0 zgc0Var = PlainAddress.Companion;
                        zzs zzsVar = new zzs(point.getLatitude(), point.getLongitude(), 0, null, null, 28);
                        zgc0Var.getClass();
                        return new ew40(pt40Var, zgc0.a(zzsVar), zgc0.a(new zzs(point2.getLatitude(), point2.getLongitude(), 0, null, null, 28)), point2);
                    }
                }
                return null;
            }
        }
        multimodalTaxiRouteInteractorImpl$resolveRoute$1 = new MultimodalTaxiRouteInteractorImpl$resolveRoute$1(this, continuationImpl);
        Object obj22 = multimodalTaxiRouteInteractorImpl$resolveRoute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalTaxiRouteInteractorImpl$resolveRoute$1.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
        route = (Route) b;
        if (route != null) {
        }
        return null;
    }
}
