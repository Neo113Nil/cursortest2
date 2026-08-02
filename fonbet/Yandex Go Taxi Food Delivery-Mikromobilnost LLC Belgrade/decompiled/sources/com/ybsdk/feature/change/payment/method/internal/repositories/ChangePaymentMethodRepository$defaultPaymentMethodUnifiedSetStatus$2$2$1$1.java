package com.ybsdk.feature.change.payment.method.internal.repositories;

import com.ybsdk.feature.change.payment.method.internal.network.dto.DefaultPaymentMethodUnifiedSetStatus;
import com.ybsdk.feature.change.payment.method.internal.network.dto.DefaultPaymentMethodUnifiedStatus;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xgb1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetStatus;", ACSPConstants.STATUS, "Lkotlin/Result;", "Lahh;", "<anonymous>", "(Lcom/ybsdk/feature/change/payment/method/internal/network/dto/DefaultPaymentMethodUnifiedSetStatus;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.change.payment.method.internal.repositories.ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2$2$1$1", f = "ChangePaymentMethodRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2$2$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2$2$1$1 changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2$2$1$1 = new ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2$2$1$1(2, continuation);
        changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2$2$1$1.L$0 = obj;
        return changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2$2$1$1) create((DefaultPaymentMethodUnifiedSetStatus) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        DefaultPaymentMethodUnifiedSetStatus defaultPaymentMethodUnifiedSetStatus = (DefaultPaymentMethodUnifiedSetStatus) this.L$0;
        if (defaultPaymentMethodUnifiedSetStatus.getStatus() == DefaultPaymentMethodUnifiedStatus.FAILED) {
            String errorCode = defaultPaymentMethodUnifiedSetStatus.getErrorCode();
            if (errorCode == null) {
                errorCode = "Error default payment method unified set status";
            }
            f = new Result.Failure(new IllegalStateException(errorCode));
        } else {
            f = xgb1.f(defaultPaymentMethodUnifiedSetStatus);
        }
        return new Result(f);
    }
}
