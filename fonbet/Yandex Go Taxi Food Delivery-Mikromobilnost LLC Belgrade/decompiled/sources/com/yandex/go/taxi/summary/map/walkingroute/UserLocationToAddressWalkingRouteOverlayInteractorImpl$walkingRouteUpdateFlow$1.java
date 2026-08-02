package com.yandex.go.taxi.summary.map.walkingroute;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.fi6;
import defpackage.fp21;
import defpackage.g8e;
import defpackage.gh00;
import defpackage.j741;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.map.WalkingRouteUiState;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/mapkit/transport/masstransit/Route;", "route", "Lzy11;", "<anonymous>", "(Lcom/yandex/mapkit/transport/masstransit/Route;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.map.walkingroute.UserLocationToAddressWalkingRouteOverlayInteractorImpl$walkingRouteUpdateFlow$1", f = "UserLocationToAddressWalkingRouteOverlayInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UserLocationToAddressWalkingRouteOverlayInteractorImpl$walkingRouteUpdateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isZoomEnabled;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserLocationToAddressWalkingRouteOverlayInteractorImpl$walkingRouteUpdateFlow$1(e eVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$isZoomEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserLocationToAddressWalkingRouteOverlayInteractorImpl$walkingRouteUpdateFlow$1 userLocationToAddressWalkingRouteOverlayInteractorImpl$walkingRouteUpdateFlow$1 = new UserLocationToAddressWalkingRouteOverlayInteractorImpl$walkingRouteUpdateFlow$1(this.this$0, this.$isZoomEnabled, continuation);
        userLocationToAddressWalkingRouteOverlayInteractorImpl$walkingRouteUpdateFlow$1.L$0 = obj;
        return userLocationToAddressWalkingRouteOverlayInteractorImpl$walkingRouteUpdateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UserLocationToAddressWalkingRouteOverlayInteractorImpl$walkingRouteUpdateFlow$1 userLocationToAddressWalkingRouteOverlayInteractorImpl$walkingRouteUpdateFlow$1 = (UserLocationToAddressWalkingRouteOverlayInteractorImpl$walkingRouteUpdateFlow$1) create((Route) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        userLocationToAddressWalkingRouteOverlayInteractorImpl$walkingRouteUpdateFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Route route = (Route) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        if (route != null) {
            fp21 fp21Var = eVar.d;
            boolean z = this.$isZoomEnabled;
            ((ru.yandex.taxi.map.c) fp21Var.b).a();
            j741 j741Var = fp21Var.b;
            double a = nzs.a(route);
            List<Point> points = route.getGeometry().getPoints();
            int i = fp21Var.c.d().h;
            if (i < 0) {
                g8e.B(jst.e, "USER_LOCATION_TO_SOURCE_WALK:INVALID_EXPERIMENT_ARGUMENT", null, oyr.i(i, "invalid routeInfoMinDurationSeconds: "), 2);
                i = 0;
            }
            ru.yandex.taxi.map.c cVar = (ru.yandex.taxi.map.c) j741Var;
            cVar.d(new WalkingRouteUiState(points, a >= ((double) i) ? route.getMetadata().getWeight().getTime().getText() : "", 0.0f, null, null, null, null, HProv.PP_SAME_MEDIA));
            cVar.c(((gh00) fp21Var.a).e.c.getZoom() > fp21Var.c.d().c());
            ((gh00) fp21Var.a).e(fp21Var.d);
            if (z) {
                List<Point> points2 = route.getGeometry().getPoints();
                fi6 fi6Var = new fi6();
                fi6Var.e(points2);
                ((gh00) fp21Var.a).A(fi6Var.g(), null);
            }
        } else {
            eVar.d.a();
        }
        return zy11.a;
    }
}
