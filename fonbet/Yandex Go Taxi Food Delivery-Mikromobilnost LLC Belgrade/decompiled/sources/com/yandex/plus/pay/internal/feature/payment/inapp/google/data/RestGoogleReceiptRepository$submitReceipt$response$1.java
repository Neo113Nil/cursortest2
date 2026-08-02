package com.yandex.plus.pay.internal.feature.payment.inapp.google.data;

import com.yandex.plus.home.common.network.NetworkResponse;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import defpackage.eja1;
import defpackage.jka0;
import defpackage.mvg;
import defpackage.mwj0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yk;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lmwj0;", "Lcom/yandex/plus/pay/data/mb/dto/PaymentSubmitResultDto;", "<anonymous>", "(Ltse;)Lmwj0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.payment.inapp.google.data.RestGoogleReceiptRepository$submitReceipt$response$1", f = "RestGoogleReceiptRepository.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RestGoogleReceiptRepository$submitReceipt$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ jka0 $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestGoogleReceiptRepository$submitReceipt$response$1(a aVar, jka0 jka0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$request = jka0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RestGoogleReceiptRepository$submitReceipt$response$1(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RestGoogleReceiptRepository$submitReceipt$response$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mwj0 t;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ExternalMediaBillingApi externalMediaBillingApi = this.this$0.a;
            jka0 jka0Var = this.$request;
            this.label = 1;
            obj = externalMediaBillingApi.d(jka0Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        t = eja1.t((NetworkResponse) obj, new yk(16));
        return t;
    }
}
