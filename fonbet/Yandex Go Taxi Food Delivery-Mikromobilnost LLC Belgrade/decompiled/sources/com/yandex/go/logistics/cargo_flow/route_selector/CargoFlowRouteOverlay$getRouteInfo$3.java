package com.yandex.go.logistics.cargo_flow.route_selector;

import com.yandex.mapkit.directions.driving.VehicleType;
import defpackage.b64;
import defpackage.cl7;
import defpackage.cv00;
import defpackage.d0l0;
import defpackage.dvw;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu8;
import defpackage.tse;
import defpackage.uz;
import defpackage.vj;
import defpackage.wj;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzk0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.map_common.map.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "La4l0;", "<anonymous>", "(Ltse;)La4l0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.logistics.cargo_flow.route_selector.CargoFlowRouteOverlay$getRouteInfo$3", f = "CargoFlowRouteOverlay.kt", l = {372}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CargoFlowRouteOverlay$getRouteInfo$3 extends SuspendLambda implements wls {
    final /* synthetic */ d0l0 $routeToDraw;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CargoFlowRouteOverlay$getRouteInfo$3(b bVar, d0l0 d0l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$routeToDraw = d0l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CargoFlowRouteOverlay$getRouteInfo$3(this.this$0, this.$routeToDraw, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CargoFlowRouteOverlay$getRouteInfo$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, uz] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        d0l0 d0l0Var = this.$routeToDraw;
        this.label = 1;
        bVar.getClass();
        j18 j18Var = new j18(1, dvw.b(this));
        Ref$ObjectRef y = b64.y(j18Var);
        vj vjVar = new vj(4, y);
        cl7 cl7Var = new cl7(j18Var, vjVar);
        CargoFlowRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2 cargoFlowRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2 = new CargoFlowRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0);
        CargoFlowRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3 cargoFlowRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3 = new CargoFlowRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3(1, cl7Var, cl7.class, "error", "error(Ljava/lang/Throwable;)V", 0);
        cv00 cv00Var = bVar.z;
        zzk0 zzk0Var = d0l0.Companion;
        ((o) cv00Var).f(d0l0Var.d(false, false), Boolean.FALSE, new qu8(0, cargoFlowRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$3, cargoFlowRouteOverlay$getMapKitRouteInfo$$inlined$suspendCallbackApi$2, d0l0Var), null, null, VehicleType.TAXI);
        y.element = new uz(8, bVar);
        if (cl7Var.c()) {
            vjVar.invoke();
        } else {
            j18Var.w(new wj(cl7Var, 4));
        }
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
