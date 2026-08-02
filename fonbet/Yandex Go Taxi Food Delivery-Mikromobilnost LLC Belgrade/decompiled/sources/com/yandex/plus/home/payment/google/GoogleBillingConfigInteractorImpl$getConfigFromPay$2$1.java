package com.yandex.plus.home.payment.google;

import com.yandex.plus.home.api.exception.PlusHomeException;
import com.yandex.plus.pay.adapter.api.PlusPaySdkAdapter$GoogleBillingConfig;
import com.yandex.plus.pay.adapter.internal.q;
import defpackage.bfd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$GoogleBillingConfig;", "<anonymous>", "(Ltse;)Lcom/yandex/plus/pay/adapter/api/PlusPaySdkAdapter$GoogleBillingConfig;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.payment.google.GoogleBillingConfigInteractorImpl$getConfigFromPay$2$1", f = "GoogleBillingConfigInteractorImpl.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class GoogleBillingConfigInteractorImpl$getConfigFromPay$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ a $this_runSuspendCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleBillingConfigInteractorImpl$getConfigFromPay$2$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.$this_runSuspendCatching = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GoogleBillingConfigInteractorImpl$getConfigFromPay$2$1(this.$this_runSuspendCatching, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GoogleBillingConfigInteractorImpl$getConfigFromPay$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            bfd0 bfd0Var = this.$this_runSuspendCatching.a;
            this.label = 1;
            obj = ((q) bfd0Var).d(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        PlusPaySdkAdapter$GoogleBillingConfig plusPaySdkAdapter$GoogleBillingConfig = (PlusPaySdkAdapter$GoogleBillingConfig) obj;
        if (plusPaySdkAdapter$GoogleBillingConfig != null) {
            return plusPaySdkAdapter$GoogleBillingConfig;
        }
        throw new PlusHomeException(2);
    }
}
