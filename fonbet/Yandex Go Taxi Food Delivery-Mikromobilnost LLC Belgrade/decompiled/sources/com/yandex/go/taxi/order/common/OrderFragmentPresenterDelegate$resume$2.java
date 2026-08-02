package com.yandex.go.taxi.order.common;

import com.yandex.go.taxi.order.perf.experiment.TaxiOrderPerfTweaksExperiment;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import defpackage.fs70;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.common.OrderFragmentPresenterDelegate$resume$2", f = "OrderFragmentPresenterDelegate.kt", l = {144}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderFragmentPresenterDelegate$resume$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderFragmentPresenterDelegate$resume$2(f fVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderFragmentPresenterDelegate$resume$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderFragmentPresenterDelegate$resume$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            TaxiOrderPerfTweaksExperiment.DelayType delayType = ((com.yandex.go.taxi.order.perf.experiment.d) this.this$0.t).b().j;
            int i2 = delayType == null ? -1 : com.yandex.go.taxi.order.perf.experiment.c.a[delayType.ordinal()];
            TaxiOrderSessionCheckpoint taxiOrderSessionCheckpoint = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : TaxiOrderSessionCheckpoint.LCP : TaxiOrderSessionCheckpoint.LCP_DEFAULTS : TaxiOrderSessionCheckpoint.FCP;
            com.yandex.go.taxi.order.perf.a aVar = this.this$0.u;
            fs70 fs70Var = new fs70(16);
            this.L$0 = null;
            this.label = 1;
            if (aVar.a(taxiOrderSessionCheckpoint, fs70Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.b.a();
        return zy11.a;
    }
}
