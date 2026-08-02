package com.yandex.go.taxi.order.details.v2.state.elements.payment;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Payment;
import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.payment.RideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1", f = "RideCardPaymentItemDataSource.kt", l = {215, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class RideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ fef $currencyRules$inlined;
    final /* synthetic */ RideCardItemDto$Payment $item$inlined;
    final /* synthetic */ SlotItemDto $slotItemDto$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1(Continuation continuation, c cVar, RideCardItemDto$Payment rideCardItemDto$Payment, SlotItemDto slotItemDto, fef fefVar) {
        super(3, continuation);
        this.this$0 = cVar;
        this.$item$inlined = rideCardItemDto$Payment;
        this.$slotItemDto$inlined = slotItemDto;
        this.$currencyRules$inlined = fefVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1 rideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1 = new RideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0, this.$item$inlined, this.$slotItemDto$inlined, this.$currencyRules$inlined);
        rideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        rideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return rideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r14, r0, r12) == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r14 == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1 rideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List list = (List) ((Pair) obj2).getFirst();
            c cVar = this.this$0;
            RideCardItemDto$Payment rideCardItemDto$Payment = this.$item$inlined;
            SlotItemDto slotItemDto = this.$slotItemDto$inlined;
            fef fefVar = this.$currencyRules$inlined;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            rideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1 = this;
            obj = c.a(cVar, rideCardItemDto$Payment, slotItemDto, list, fefVar, rideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            rideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1 = this;
        }
        rideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1.L$0 = null;
        rideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1.L$1 = null;
        rideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1.L$2 = null;
        rideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1.L$3 = null;
        rideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1.L$4 = null;
        rideCardPaymentItemDataSource$stateFlow$$inlined$flatMapLatest$1.label = 2;
    }
}
