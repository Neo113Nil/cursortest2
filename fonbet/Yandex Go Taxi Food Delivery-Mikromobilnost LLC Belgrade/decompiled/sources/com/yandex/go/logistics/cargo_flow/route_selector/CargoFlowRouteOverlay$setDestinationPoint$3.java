package com.yandex.go.logistics.cargo_flow.route_selector;

import defpackage.f4c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sbv;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.logistics.cargo_flow.route_selector.CargoFlowRouteOverlay$setDestinationPoint$3", f = "CargoFlowRouteOverlay.kt", l = {246}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class CargoFlowRouteOverlay$setDestinationPoint$3 extends SuspendLambda implements wls {
    final /* synthetic */ sbv $pinImage;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CargoFlowRouteOverlay$setDestinationPoint$3(b bVar, sbv sbvVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$pinImage = sbvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CargoFlowRouteOverlay$setDestinationPoint$3(this.this$0, this.$pinImage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CargoFlowRouteOverlay$setDestinationPoint$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            c cVar = bVar.F;
            f4c0 f4c0Var = bVar.J;
            sbv sbvVar = this.$pinImage;
            this.label = 1;
            if (cVar.a(f4c0Var, sbvVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
