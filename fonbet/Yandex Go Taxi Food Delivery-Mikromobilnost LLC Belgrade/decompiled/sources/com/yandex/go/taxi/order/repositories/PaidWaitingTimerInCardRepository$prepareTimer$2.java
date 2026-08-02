package com.yandex.go.taxi.order.repositories;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.lez0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Llez0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.repositories.PaidWaitingTimerInCardRepository$prepareTimer$2", f = "PaidWaitingTimerInCardRepository.kt", l = {HProv.PP_REFCOUNT}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class PaidWaitingTimerInCardRepository$prepareTimer$2 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidWaitingTimerInCardRepository$prepareTimer$2(n nVar, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = nVar;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaidWaitingTimerInCardRepository$prepareTimer$2 paidWaitingTimerInCardRepository$prepareTimer$2 = new PaidWaitingTimerInCardRepository$prepareTimer$2(this.this$0, this.$order, continuation);
        paidWaitingTimerInCardRepository$prepareTimer$2.L$0 = obj;
        return paidWaitingTimerInCardRepository$prepareTimer$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaidWaitingTimerInCardRepository$prepareTimer$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            lez0 lez0Var = new lez0(0, 0, "", "", n.c(this.this$0, this.$order));
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(lez0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
