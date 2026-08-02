package com.yandex.go.payments_widgets.yandex_bank;

import defpackage.aba0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments_widgets.yandex_bank.PaymentMethodsHideBalancePreferencesImpl$isBalanceHiddenFlow$$inlined$start$1", f = "PaymentMethodsHideBalancePreferencesImpl.kt", l = {67}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class PaymentMethodsHideBalancePreferencesImpl$isBalanceHiddenFlow$$inlined$start$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ aba0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsHideBalancePreferencesImpl$isBalanceHiddenFlow$$inlined$start$1(Continuation continuation, aba0 aba0Var) {
        super(2, continuation);
        this.this$0 = aba0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaymentMethodsHideBalancePreferencesImpl$isBalanceHiddenFlow$$inlined$start$1 paymentMethodsHideBalancePreferencesImpl$isBalanceHiddenFlow$$inlined$start$1 = new PaymentMethodsHideBalancePreferencesImpl$isBalanceHiddenFlow$$inlined$start$1(continuation, this.this$0);
        paymentMethodsHideBalancePreferencesImpl$isBalanceHiddenFlow$$inlined$start$1.L$0 = obj;
        return paymentMethodsHideBalancePreferencesImpl$isBalanceHiddenFlow$$inlined$start$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsHideBalancePreferencesImpl$isBalanceHiddenFlow$$inlined$start$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Boolean valueOf = Boolean.valueOf(this.this$0.a.a("FIELD_IS_BALANCE_HIDED", false));
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(valueOf, this) == coroutineSingletons) {
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
