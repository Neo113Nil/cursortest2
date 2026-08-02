package com.yandex.go.delivery.tracking.map_overlay;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Point;
import defpackage.cxa0;
import defpackage.mvg;
import defpackage.nxa0;
import defpackage.ny61;
import defpackage.odi;
import defpackage.tcc;
import defpackage.wls;
import defpackage.yji;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnxa0;", "performerRouteVo", "Lzy11;", "<anonymous>", "(Lnxa0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.tracking.map_overlay.DeliveryRoutePresenter$launchRouteVoUpdater$3", f = "DeliveryRoutePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryRoutePresenter$launchRouteVoUpdater$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryRoutePresenter$launchRouteVoUpdater$3(q qVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryRoutePresenter$launchRouteVoUpdater$3 deliveryRoutePresenter$launchRouteVoUpdater$3 = new DeliveryRoutePresenter$launchRouteVoUpdater$3(this.this$0, continuation);
        deliveryRoutePresenter$launchRouteVoUpdater$3.L$0 = obj;
        return deliveryRoutePresenter$launchRouteVoUpdater$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryRoutePresenter$launchRouteVoUpdater$3 deliveryRoutePresenter$launchRouteVoUpdater$3 = (DeliveryRoutePresenter$launchRouteVoUpdater$3) create((nxa0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryRoutePresenter$launchRouteVoUpdater$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        nxa0 nxa0Var = (nxa0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        q qVar = this.this$0;
        String str = qVar.c;
        odi odiVar = qVar.b;
        if (nxa0Var.d) {
            ArrayList arrayList = nxa0Var.c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((yji) obj2).d) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                yji yjiVar = (yji) it.next();
                arrayList3.add(new Point(yjiVar.a, yjiVar.b));
            }
            cxa0 cxa0Var = nxa0Var.b;
            List<Point> list = EmptyList.a;
            List<Point> singletonList = cxa0Var != null ? Collections.singletonList(new Point(cxa0Var.a, cxa0Var.b)) : list;
            DrivingRoute drivingRoute = nxa0Var.a.a;
            if (drivingRoute != null) {
                List<Point> points = drivingRoute.getGeometry().getPoints();
                list = points.subList(drivingRoute.getPosition().getSegmentIndex(), points.size());
            }
            odiVar.d.put(str, kotlin.collections.a.m0(list, kotlin.collections.a.m0(singletonList, arrayList3)));
            odiVar.e.g(tcc.o(odiVar.d.values()));
        } else {
            ConcurrentHashMap concurrentHashMap = odiVar.d;
            concurrentHashMap.remove(str);
            odiVar.e.g(tcc.o(concurrentHashMap.values()));
        }
        return zy11.a;
    }
}
