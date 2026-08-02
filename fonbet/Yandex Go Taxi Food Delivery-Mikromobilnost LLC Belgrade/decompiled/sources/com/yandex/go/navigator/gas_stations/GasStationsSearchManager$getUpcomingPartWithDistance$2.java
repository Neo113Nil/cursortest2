package com.yandex.go.navigator.gas_stations;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import defpackage.el00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.map_common.map.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lcom/yandex/mapkit/geometry/Geometry;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Ltse;)Lcom/yandex/mapkit/geometry/Geometry;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.gas_stations.GasStationsSearchManager$getUpcomingPartWithDistance$2", f = "GasStationsSearchManager.kt", l = {325}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GasStationsSearchManager$getUpcomingPartWithDistance$2 extends SuspendLambda implements wls {
    final /* synthetic */ double $distance;
    final /* synthetic */ DrivingRoute $drivingRoute;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GasStationsSearchManager$getUpcomingPartWithDistance$2(DrivingRoute drivingRoute, double d, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$drivingRoute = drivingRoute;
        this.$distance = d;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GasStationsSearchManager$getUpcomingPartWithDistance$2(this.$drivingRoute, this.$distance, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GasStationsSearchManager$getUpcomingPartWithDistance$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ad  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Polyline polyline;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.$drivingRoute.getMetadata().getWeight().getDistance().getValue() >= this.$distance) {
                int segmentIndex = this.$drivingRoute.getPosition().getSegmentIndex();
                PolylinePosition positionOnRoute = this.$drivingRoute.getRoutePosition().advance(this.$distance).positionOnRoute(this.$drivingRoute.getRouteId());
                int segmentIndex2 = positionOnRoute != null ? positionOnRoute.getSegmentIndex() : segmentIndex;
                el00 el00Var = this.this$0.l;
                List<Point> points = this.$drivingRoute.getGeometry().getPoints();
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                for (Object obj2 : points) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        scc.m();
                        throw null;
                    }
                    if (segmentIndex <= i2 && i2 <= segmentIndex2) {
                        arrayList.add(obj2);
                    }
                    i2 = i3;
                }
                this.I$0 = segmentIndex;
                this.I$1 = segmentIndex2;
                this.label = 1;
                Object k = k.k(el00Var, arrayList, this);
                polyline = k;
                if (k == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            if (r2 == null) {
                r2 = this.$drivingRoute.getGeometry();
            }
            return Geometry.fromPolyline(r2);
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        polyline = ((Result) obj).getValue();
        r2 = polyline instanceof Result.Failure ? null : polyline;
        if (r2 == null) {
        }
        return Geometry.fromPolyline(r2);
    }
}
