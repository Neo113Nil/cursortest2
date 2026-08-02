package com.yandex.go.taxi.order.map;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import defpackage.a901;
import defpackage.dms;
import defpackage.e901;
import defpackage.h8l0;
import defpackage.iwa1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ool0;
import defpackage.scc;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lh8l0;", "route", "Le901;", "uiState", "", "La901;", "trafficLightsWithSignal", "", "isTrafficLightsWithSignalExperimentEnabled", "<anonymous>", "(Lh8l0;Le901;Ljava/util/List;Z)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.RoadObjectsInteractor$trackTriggerToShowBubble$1", f = "RoadObjectsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RoadObjectsInteractor$trackTriggerToShowBubble$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        RoadObjectsInteractor$trackTriggerToShowBubble$1 roadObjectsInteractor$trackTriggerToShowBubble$1 = new RoadObjectsInteractor$trackTriggerToShowBubble$1(5, (Continuation) obj5);
        roadObjectsInteractor$trackTriggerToShowBubble$1.L$0 = (h8l0) obj;
        roadObjectsInteractor$trackTriggerToShowBubble$1.L$1 = (e901) obj2;
        roadObjectsInteractor$trackTriggerToShowBubble$1.L$2 = (List) obj3;
        roadObjectsInteractor$trackTriggerToShowBubble$1.Z$0 = booleanValue;
        return roadObjectsInteractor$trackTriggerToShowBubble$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
    
        if (r2 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
    
        r4 = new kotlin.Triple(r2, java.lang.Double.valueOf(r8), java.lang.Integer.valueOf(r5));
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Point point;
        Point b;
        double d;
        Point point2;
        double d2;
        h8l0 h8l0Var = (h8l0) this.L$0;
        e901 e901Var = (e901) this.L$1;
        List list = (List) this.L$2;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Triple triple = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z) {
            List list2 = e901Var.a;
            a901 a901Var = (a901) kotlin.collections.a.R(list);
            point = (Point) kotlin.collections.a.R(kotlin.collections.a.m0(scc.h(a901Var != null ? a901Var.b : null), list2));
        } else {
            point = (Point) kotlin.collections.a.R(e901Var.a);
        }
        if (point == null) {
            return Boolean.FALSE;
        }
        PolylinePosition polylinePosition = h8l0Var.b;
        ool0 ool0Var = h8l0Var.a;
        if (polylinePosition != null && (b = iwa1.b(ool0Var.getGeometry(), polylinePosition)) != null) {
            List<Point> points = ool0Var.getGeometry().getPoints();
            Polyline polyline = ru.yandex.taxi.map.utils.a.b;
            int f = scc.f(points);
            int i = 0;
            while (true) {
                d = 0.0d;
                if (i >= f) {
                    i = 0;
                    point2 = null;
                    d2 = 0.0d;
                    break;
                }
                Point point3 = points.get(i);
                i++;
                Point point4 = points.get(i);
                boolean u = ru.yandex.taxi.map.utils.a.u(point3, point4, b);
                boolean u2 = ru.yandex.taxi.map.utils.a.u(point3, point4, point);
                if (u && u2) {
                    triple = new Triple(b, Double.valueOf(ru.yandex.taxi.map.utils.a.k(b, point)), Integer.valueOf(scc.f(points)));
                    break;
                }
                if (u) {
                    d2 = ru.yandex.taxi.map.utils.a.k(b, point4);
                    point2 = b;
                    break;
                }
                if (u2) {
                    d2 = ru.yandex.taxi.map.utils.a.k(point, point4);
                    point2 = point;
                    break;
                }
            }
            if (triple != null) {
                Point point5 = (Point) triple.getFirst();
                double doubleValue = ((Number) triple.getSecond()).doubleValue();
                int intValue = ((Number) triple.getThird()).intValue();
                d = (doubleValue + (ru.yandex.taxi.map.utils.a.d(point5, b) ? ru.yandex.taxi.map.utils.a.o(intValue, points, point) : ru.yandex.taxi.map.utils.a.o(intValue, points, b))) * 1000.0d;
            }
            return Boolean.valueOf(d < ((double) e901Var.e.b));
        }
        return Boolean.FALSE;
    }
}
