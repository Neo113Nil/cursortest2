package com.yandex.go.delivery.tracking.map_overlay;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.v4r0;
import defpackage.zls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lxli;", "multiorderDeliveries", "detailsDeliveries", "<anonymous>", "(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.tracking.map_overlay.DeliveriesMapPresenter$getDeliveriesFlow$3", f = "DeliveriesMapPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DeliveriesMapPresenter$getDeliveriesFlow$3 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliveriesMapPresenter$getDeliveriesFlow$3 deliveriesMapPresenter$getDeliveriesFlow$3 = new DeliveriesMapPresenter$getDeliveriesFlow$3(3, (Continuation) obj3);
        deliveriesMapPresenter$getDeliveriesFlow$3.L$0 = (Set) obj;
        deliveriesMapPresenter$getDeliveriesFlow$3.L$1 = (Set) obj2;
        return deliveriesMapPresenter$getDeliveriesFlow$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Set set = (Set) this.L$0;
        Set set2 = (Set) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return v4r0.h(set, set2);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
