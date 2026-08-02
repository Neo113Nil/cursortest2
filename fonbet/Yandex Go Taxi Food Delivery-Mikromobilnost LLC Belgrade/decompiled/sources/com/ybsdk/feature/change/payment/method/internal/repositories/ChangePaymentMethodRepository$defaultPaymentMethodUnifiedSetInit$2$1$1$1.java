package com.ybsdk.feature.change.payment.method.internal.repositories;

import com.ybsdk.feature.change.payment.method.internal.network.dto.DefaultPaymentMethodUnifiedSetInitResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetInitResponse;", "initData"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.change.payment.method.internal.repositories.ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2$1$1$1", f = "ChangePaymentMethodRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2$1$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2$1$1$1 changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2$1$1$1 = new ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2$1$1$1(2, continuation);
        changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2$1$1$1.L$0 = obj;
        return changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2$1$1$1) create((DefaultPaymentMethodUnifiedSetInitResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return (DefaultPaymentMethodUnifiedSetInitResponse) this.L$0;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
