package com.yandex.go.logistics.cargo_flow.route_selector;

import defpackage.a4l0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sbv;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.logistics.cargo_flow.route_selector.CargoFlowRouteOverlay$drawRoute$2", f = "CargoFlowRouteOverlay.kt", l = {HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CargoFlowRouteOverlay$drawRoute$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<sbv> $pinIcons;
    final /* synthetic */ List<Integer> $routeStopsIndexesToDraw;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CargoFlowRouteOverlay$drawRoute$2(b bVar, List list, List list2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$routeStopsIndexesToDraw = list;
        this.$pinIcons = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CargoFlowRouteOverlay$drawRoute$2(this.this$0, this.$routeStopsIndexesToDraw, this.$pinIcons, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CargoFlowRouteOverlay$drawRoute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            mth mthVar = new mth(new m0(bVar.E.f(), ((com.yandex.go.route.interactor.a) bVar.B).b(), new CargoFlowRouteOverlay$getRoute$1(bVar, this.$routeStopsIndexesToDraw, null)), 6);
            this.label = 1;
            obj = e.y(mthVar, this);
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
        b.Hg(this.this$0, (a4l0) obj, this.$pinIcons);
        return zy11.a;
    }
}
