package com.yandex.go.navigator.driving.top_view;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.geo.PolylineUtils;
import com.yandex.mapkit.navigation.automotive.UpcomingManoeuvre;
import defpackage.ce00;
import defpackage.dms;
import defpackage.hua1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rc60;
import defpackage.y521;
import defpackage.ywz0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lsif0;", "<unused var>", "", "Lcom/yandex/mapkit/navigation/automotive/UpcomingManoeuvre;", "maneuvers", "Lcom/yandex/mapkit/directions/driving/DrivingRoute;", "currentRoute", "", "isVisible", "Lbe00;", "<anonymous>", "(Lsif0;Ljava/util/List;Lcom/yandex/mapkit/directions/driving/DrivingRoute;Z)Lbe00;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.driving.top_view.TopViewPresenter$upcomingManeuverUiState$1", f = "TopViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TopViewPresenter$upcomingManeuverUiState$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ ywz0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopViewPresenter$upcomingManeuverUiState$1(ywz0 ywz0Var, Continuation continuation) {
        super(5, continuation);
        this.this$0 = ywz0Var;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        TopViewPresenter$upcomingManeuverUiState$1 topViewPresenter$upcomingManeuverUiState$1 = new TopViewPresenter$upcomingManeuverUiState$1(this.this$0, (Continuation) obj5);
        topViewPresenter$upcomingManeuverUiState$1.L$0 = (List) obj2;
        topViewPresenter$upcomingManeuverUiState$1.L$1 = (DrivingRoute) obj3;
        topViewPresenter$upcomingManeuverUiState$1.Z$0 = booleanValue;
        return topViewPresenter$upcomingManeuverUiState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PolylinePosition positionOnRoute;
        List list = (List) this.L$0;
        DrivingRoute drivingRoute = (DrivingRoute) this.L$1;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (drivingRoute != null && !z) {
            ce00 ce00Var = this.this$0.B;
            ce00Var.getClass();
            UpcomingManoeuvre upcomingManoeuvre = (UpcomingManoeuvre) kotlin.collections.a.R(list);
            if (upcomingManoeuvre != null && (positionOnRoute = upcomingManoeuvre.getPosition().positionOnRoute(drivingRoute.getRouteId())) != null) {
                int distanceBetweenPolylinePositions = (int) PolylineUtils.distanceBetweenPolylinePositions(drivingRoute.getGeometry(), drivingRoute.getPosition(), positionOnRoute);
                int i = distanceBetweenPolylinePositions - (distanceBetweenPolylinePositions % 10);
                if (i != 0) {
                    return new y521(hua1.c(ce00Var.a, i), upcomingManoeuvre.getAnnotation().getAction(), upcomingManoeuvre.getAnnotation().getToponym());
                }
            }
        }
        return rc60.a;
    }
}
