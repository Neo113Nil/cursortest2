package com.yandex.go.taxi.order.details.v2.state.elements.progress_bar;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tss0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ltss0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.progress_bar.RideCardProgressBarItemDataSource$trailState$2", f = "RideCardProgressBarItemDataSource.kt", l = {101}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardProgressBarItemDataSource$trailState$2 extends SuspendLambda implements wls {
    final /* synthetic */ tss0 $iconSpotTrail;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardProgressBarItemDataSource$trailState$2(tss0 tss0Var, Continuation continuation) {
        super(2, continuation);
        this.$iconSpotTrail = tss0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardProgressBarItemDataSource$trailState$2 rideCardProgressBarItemDataSource$trailState$2 = new RideCardProgressBarItemDataSource$trailState$2(this.$iconSpotTrail, continuation);
        rideCardProgressBarItemDataSource$trailState$2.L$0 = obj;
        return rideCardProgressBarItemDataSource$trailState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardProgressBarItemDataSource$trailState$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tss0 tss0Var = this.$iconSpotTrail;
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(tss0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
