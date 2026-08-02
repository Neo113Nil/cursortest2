package com.yandex.go.delivery.tracking.map_overlay;

import defpackage.mvg;
import defpackage.nxa0;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnxa0;", "performerRouteVo", "Lzy11;", "<anonymous>", "(Lnxa0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.tracking.map_overlay.DeliveryRoutePresenter$launchRouteVoUpdater$2", f = "DeliveryRoutePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryRoutePresenter$launchRouteVoUpdater$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryRoutePresenter$launchRouteVoUpdater$2(q qVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryRoutePresenter$launchRouteVoUpdater$2 deliveryRoutePresenter$launchRouteVoUpdater$2 = new DeliveryRoutePresenter$launchRouteVoUpdater$2(this.this$0, continuation);
        deliveryRoutePresenter$launchRouteVoUpdater$2.L$0 = obj;
        return deliveryRoutePresenter$launchRouteVoUpdater$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryRoutePresenter$launchRouteVoUpdater$2 deliveryRoutePresenter$launchRouteVoUpdater$2 = (DeliveryRoutePresenter$launchRouteVoUpdater$2) create((nxa0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryRoutePresenter$launchRouteVoUpdater$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        nxa0 nxa0Var = (nxa0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.a.a(nxa0Var);
        return zy11.a;
    }
}
