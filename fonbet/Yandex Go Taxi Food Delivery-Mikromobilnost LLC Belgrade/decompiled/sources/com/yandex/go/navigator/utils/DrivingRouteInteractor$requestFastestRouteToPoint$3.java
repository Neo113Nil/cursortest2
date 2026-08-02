package com.yandex.go.navigator.utils;

import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.directions.driving.DrivingOptions;
import com.yandex.mapkit.directions.driving.DrivingRouter;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.mapkit.geometry.Point;
import defpackage.dvw;
import defpackage.el00;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rlm;
import defpackage.scc;
import defpackage.tse;
import defpackage.vlm;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.map_common.map.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/mapkit/directions/driving/DrivingRoute;", "<anonymous>", "(Ltse;)Lcom/yandex/mapkit/directions/driving/DrivingRoute;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.utils.DrivingRouteInteractor$requestFastestRouteToPoint$3", f = "DrivingRouteInteractor.kt", l = {49, 50, 52, MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DrivingRouteInteractor$requestFastestRouteToPoint$3 extends SuspendLambda implements wls {
    final /* synthetic */ Point $fromPoint;
    final /* synthetic */ Point $point;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrivingRouteInteractor$requestFastestRouteToPoint$3(d dVar, Point point, Point point2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$point = point;
        this.$fromPoint = point2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DrivingRouteInteractor$requestFastestRouteToPoint$3(this.this$0, this.$point, this.$fromPoint, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DrivingRouteInteractor$requestFastestRouteToPoint$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
    
        if (r11 == r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DrivingRouter drivingRouter;
        Object obj2;
        RequestPoint requestPoint;
        RequestPoint requestPoint2;
        Object obj3;
        DrivingRouter drivingRouter2;
        RequestPoint requestPoint3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            DrivingSession drivingSession = (DrivingSession) this.this$0.e.get(this.$point);
            if (drivingSession != null) {
                drivingSession.cancel();
            }
            this.this$0.e.remove(this.$point);
            vlm vlmVar = this.this$0.a;
            this.label = 1;
            obj = vlmVar.a(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    drivingRouter = (DrivingRouter) this.L$0;
                    kotlin.b.b(obj);
                    obj2 = ((Result) obj).getValue();
                    if (obj2 instanceof Result.Failure) {
                        obj2 = null;
                    }
                    requestPoint = (RequestPoint) obj2;
                    if (requestPoint != null) {
                        el00 el00Var = this.this$0.d;
                        Point point = this.$point;
                        RequestPointType requestPointType = RequestPointType.WAYPOINT;
                        this.L$0 = drivingRouter;
                        this.L$1 = requestPoint;
                        this.label = 3;
                        Object n = k.n(el00Var, point, requestPointType, null, this);
                        if (n != coroutineSingletons) {
                            DrivingRouter drivingRouter3 = drivingRouter;
                            requestPoint2 = requestPoint;
                            obj3 = n;
                            drivingRouter2 = drivingRouter3;
                            if (obj3 instanceof Result.Failure) {
                            }
                            requestPoint3 = (RequestPoint) obj3;
                            if (requestPoint3 != null) {
                            }
                        }
                    }
                    return null;
                }
                if (i != 3) {
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                requestPoint2 = (RequestPoint) this.L$1;
                drivingRouter2 = (DrivingRouter) this.L$0;
                kotlin.b.b(obj);
                obj3 = ((Result) obj).getValue();
                if (obj3 instanceof Result.Failure) {
                    obj3 = null;
                }
                requestPoint3 = (RequestPoint) obj3;
                if (requestPoint3 != null) {
                    d dVar = this.this$0;
                    Point point2 = this.$point;
                    this.L$0 = drivingRouter2;
                    this.L$1 = requestPoint2;
                    this.L$2 = requestPoint3;
                    this.L$3 = dVar;
                    this.L$4 = point2;
                    this.label = 4;
                    j18 j18Var = new j18(1, dvw.b(this));
                    j18Var.u();
                    dVar.e.put(point2, drivingRouter2.requestRoutes(scc.g(requestPoint2, requestPoint3), new DrivingOptions(), new VehicleOptions(), new rlm(dVar, point2, j18Var)));
                    Object s = j18Var.s();
                    return s == coroutineSingletons ? coroutineSingletons : s;
                }
                return null;
            }
            kotlin.b.b(obj);
        }
        DrivingRouter drivingRouter4 = (DrivingRouter) obj;
        el00 el00Var2 = this.this$0.d;
        Point point3 = this.$fromPoint;
        RequestPointType requestPointType2 = RequestPointType.WAYPOINT;
        this.L$0 = drivingRouter4;
        this.label = 2;
        Object n2 = k.n(el00Var2, point3, requestPointType2, null, this);
        if (n2 != coroutineSingletons) {
            drivingRouter = drivingRouter4;
            obj2 = n2;
            if (obj2 instanceof Result.Failure) {
            }
            requestPoint = (RequestPoint) obj2;
            if (requestPoint != null) {
            }
            return null;
        }
    }
}
