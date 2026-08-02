package com.yandex.go.delivery.tracking.map_overlay;

import defpackage.bms;
import defpackage.lxa0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sth;
import defpackage.uth;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luth;", "mode", "Llxa0;", "multiorderRoute", "detailsRoute", "<anonymous>", "(Luth;Llxa0;Llxa0;)Llxa0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.tracking.map_overlay.DeliveryRoutePresenter$currentRouteParamsFlow$1", f = "DeliveryRoutePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DeliveryRoutePresenter$currentRouteParamsFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        DeliveryRoutePresenter$currentRouteParamsFlow$1 deliveryRoutePresenter$currentRouteParamsFlow$1 = new DeliveryRoutePresenter$currentRouteParamsFlow$1(4, (Continuation) obj4);
        deliveryRoutePresenter$currentRouteParamsFlow$1.L$0 = (uth) obj;
        deliveryRoutePresenter$currentRouteParamsFlow$1.L$1 = (lxa0) obj2;
        deliveryRoutePresenter$currentRouteParamsFlow$1.L$2 = (lxa0) obj3;
        return deliveryRoutePresenter$currentRouteParamsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uth uthVar = (uth) this.L$0;
        lxa0 lxa0Var = (lxa0) this.L$1;
        lxa0 lxa0Var2 = (lxa0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return (!(uthVar instanceof sth) || lxa0Var2 == null) ? lxa0Var : lxa0Var2;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
