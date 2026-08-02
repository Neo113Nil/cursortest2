package com.yandex.go.taxi.order.delegates;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
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
@mvg(c = "com.yandex.go.taxi.order.delegates.CallDelegateImpl$callDriver$1", f = "CallDelegateImpl.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class CallDelegateImpl$callDriver$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $phone;
    final /* synthetic */ TaxiOrder $taxiOrder;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallDelegateImpl$callDriver$1(a aVar, TaxiOrder taxiOrder, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$taxiOrder = taxiOrder;
        this.$phone = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CallDelegateImpl$callDriver$1(this.this$0, this.$taxiOrder, this.$phone, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CallDelegateImpl$callDriver$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            TaxiOrder taxiOrder = this.$taxiOrder;
            String str = this.$phone;
            this.label = 1;
            if (a.b(aVar, taxiOrder, str, this) == coroutineSingletons) {
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
