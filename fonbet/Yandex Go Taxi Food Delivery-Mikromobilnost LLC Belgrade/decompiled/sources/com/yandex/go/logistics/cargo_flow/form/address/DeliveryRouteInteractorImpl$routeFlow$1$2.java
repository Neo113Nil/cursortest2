package com.yandex.go.logistics.cargo_flow.form.address;

import defpackage.cni;
import defpackage.d0l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ld0l0;", "route", "Lcni;", "info", "Le0l0;", "<anonymous>", "(Ld0l0;Lcni;)Le0l0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.logistics.cargo_flow.form.address.DeliveryRouteInteractorImpl$routeFlow$1$2", f = "DeliveryRouteInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DeliveryRouteInteractorImpl$routeFlow$1$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryRouteInteractorImpl$routeFlow$1$2(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliveryRouteInteractorImpl$routeFlow$1$2 deliveryRouteInteractorImpl$routeFlow$1$2 = new DeliveryRouteInteractorImpl$routeFlow$1$2(this.this$0, (Continuation) obj3);
        deliveryRouteInteractorImpl$routeFlow$1$2.L$0 = (d0l0) obj;
        deliveryRouteInteractorImpl$routeFlow$1$2.L$1 = (cni) obj2;
        return deliveryRouteInteractorImpl$routeFlow$1$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d0l0 d0l0Var = (d0l0) this.L$0;
        cni cniVar = (cni) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.getClass();
        return c.h(d0l0Var, cniVar);
    }
}
