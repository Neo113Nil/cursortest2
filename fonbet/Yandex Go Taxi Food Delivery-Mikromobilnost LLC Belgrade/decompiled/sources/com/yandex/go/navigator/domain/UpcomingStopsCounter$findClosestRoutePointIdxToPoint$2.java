package com.yandex.go.navigator.domain;

import com.yandex.mapkit.geometry.Geo;
import com.yandex.mapkit.geometry.Point;
import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)I"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.domain.UpcomingStopsCounter$findClosestRoutePointIdxToPoint$2", f = "UpcomingStopsCounter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class UpcomingStopsCounter$findClosestRoutePointIdxToPoint$2 extends SuspendLambda implements wls {
    final /* synthetic */ Point $point;
    final /* synthetic */ List<Point> $route;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpcomingStopsCounter$findClosestRoutePointIdxToPoint$2(List list, Point point, Continuation continuation) {
        super(2, continuation);
        this.$route = list;
        this.$point = point;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpcomingStopsCounter$findClosestRoutePointIdxToPoint$2 upcomingStopsCounter$findClosestRoutePointIdxToPoint$2 = new UpcomingStopsCounter$findClosestRoutePointIdxToPoint$2(this.$route, this.$point, continuation);
        upcomingStopsCounter$findClosestRoutePointIdxToPoint$2.L$0 = obj;
        return upcomingStopsCounter$findClosestRoutePointIdxToPoint$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpcomingStopsCounter$findClosestRoutePointIdxToPoint$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<Point> list = this.$route;
        Point point = this.$point;
        double d = Double.MAX_VALUE;
        int i = -1;
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            bvf0.t(tseVar);
            double distance = Geo.distance(point, (Point) obj2);
            if (distance < d) {
                i = i2;
                d = distance;
            }
            i2 = i3;
        }
        return new Integer(i);
    }
}
