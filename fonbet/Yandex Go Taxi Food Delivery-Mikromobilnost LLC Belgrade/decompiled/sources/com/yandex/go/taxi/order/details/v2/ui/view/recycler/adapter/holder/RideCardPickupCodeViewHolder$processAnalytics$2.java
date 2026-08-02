package com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wrs0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.ui.view.recycler.adapter.holder.RideCardPickupCodeViewHolder$processAnalytics$2", f = "RideCardPickupCodeViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardPickupCodeViewHolder$processAnalytics$2 extends SuspendLambda implements wls {
    final /* synthetic */ wrs0 $analytics;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardPickupCodeViewHolder$processAnalytics$2(s sVar, wrs0 wrs0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sVar;
        this.$analytics = wrs0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardPickupCodeViewHolder$processAnalytics$2(this.this$0, this.$analytics, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RideCardPickupCodeViewHolder$processAnalytics$2 rideCardPickupCodeViewHolder$processAnalytics$2 = (RideCardPickupCodeViewHolder$processAnalytics$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        rideCardPickupCodeViewHolder$processAnalytics$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.T.e(this.$analytics);
        return zy11.a;
    }
}
