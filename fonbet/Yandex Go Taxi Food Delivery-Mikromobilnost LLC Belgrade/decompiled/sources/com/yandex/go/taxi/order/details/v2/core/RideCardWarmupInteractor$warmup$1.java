package com.yandex.go.taxi.order.details.v2.core;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a3y0;
import defpackage.hst;
import defpackage.jst;
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
@mvg(c = "com.yandex.go.taxi.order.details.v2.core.RideCardWarmupInteractor$warmup$1", f = "RideCardWarmupInteractor.kt", l = {37, 40}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardWarmupInteractor$warmup$1 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    long J$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardWarmupInteractor$warmup$1(d dVar, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardWarmupInteractor$warmup$1(this.this$0, this.$order, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardWarmupInteractor$warmup$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.order.details.v2.fallback.common.a aVar = (com.yandex.go.taxi.order.details.v2.fallback.common.a) this.this$0.c.get();
            TaxiOrder taxiOrder = this.$order;
            this.label = 2;
            if (aVar.a(taxiOrder, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            kotlin.b.b(obj);
            this.this$0.d.getClass();
            a3y0.h(new String[]{"warmup"});
            hst hstVar = jst.e;
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
