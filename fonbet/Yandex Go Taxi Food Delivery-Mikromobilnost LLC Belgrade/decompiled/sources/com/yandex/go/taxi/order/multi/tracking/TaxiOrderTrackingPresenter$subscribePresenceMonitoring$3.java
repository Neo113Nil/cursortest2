package com.yandex.go.taxi.order.multi.tracking;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.multi.tracking.TaxiOrderTrackingPresenter$subscribePresenceMonitoring$3", f = "TaxiOrderTrackingPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderTrackingPresenter$subscribePresenceMonitoring$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderTrackingPresenter$subscribePresenceMonitoring$3(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderTrackingPresenter$subscribePresenceMonitoring$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TaxiOrderTrackingPresenter$subscribePresenceMonitoring$3 taxiOrderTrackingPresenter$subscribePresenceMonitoring$3 = (TaxiOrderTrackingPresenter$subscribePresenceMonitoring$3) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        taxiOrderTrackingPresenter$subscribePresenceMonitoring$3.invokeSuspend(zy11Var);
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
        r0 r0Var = this.this$0.I.b;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
        return zy11.a;
    }
}
