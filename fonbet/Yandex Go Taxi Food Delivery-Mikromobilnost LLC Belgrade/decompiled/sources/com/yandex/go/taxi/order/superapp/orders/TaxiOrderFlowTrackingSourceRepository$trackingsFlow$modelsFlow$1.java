package com.yandex.go.taxi.order.superapp.orders;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xux0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "Lq6y0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.superapp.orders.TaxiOrderFlowTrackingSourceRepository$trackingsFlow$modelsFlow$1", f = "TaxiOrderFlowTrackingSourceRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class TaxiOrderFlowTrackingSourceRepository$trackingsFlow$modelsFlow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ v this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderFlowTrackingSourceRepository$trackingsFlow$modelsFlow$1(v vVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderFlowTrackingSourceRepository$trackingsFlow$modelsFlow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TaxiOrderFlowTrackingSourceRepository$trackingsFlow$modelsFlow$1 taxiOrderFlowTrackingSourceRepository$trackingsFlow$modelsFlow$1 = (TaxiOrderFlowTrackingSourceRepository$trackingsFlow$modelsFlow$1) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        taxiOrderFlowTrackingSourceRepository$trackingsFlow$modelsFlow$1.invokeSuspend(zy11Var);
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
        v vVar = this.this$0;
        for (n nVar : vVar.p.values()) {
            nVar.b(new xux0(1, vVar, nVar));
        }
        return zy11.a;
    }
}
