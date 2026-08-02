package com.ybsdk.feature.qr.payments.internal.data;

import com.ybsdk.feature.qr.payments.internal.network.v2.dto.check.CheckPaymentResponseV2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/CheckPaymentResponseV2;", "it", "Lmgb;", "<anonymous>", "(Lcom/ybsdk/feature/qr/payments/internal/network/v2/dto/check/CheckPaymentResponseV2;)Lmgb;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.data.QrPaymentsV2Repository$checkPayment$2$1$1", f = "QrPaymentsV2Repository.kt", l = {HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsV2Repository$checkPayment$2$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsV2Repository$checkPayment$2$1$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QrPaymentsV2Repository$checkPayment$2$1$1 qrPaymentsV2Repository$checkPayment$2$1$1 = new QrPaymentsV2Repository$checkPayment$2$1$1(this.this$0, continuation);
        qrPaymentsV2Repository$checkPayment$2$1$1.L$0 = obj;
        return qrPaymentsV2Repository$checkPayment$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrPaymentsV2Repository$checkPayment$2$1$1) create((CheckPaymentResponseV2) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        CheckPaymentResponseV2 checkPaymentResponseV2 = (CheckPaymentResponseV2) this.L$0;
        b bVar = this.this$0;
        this.label = 1;
        Object a = b.a(bVar, checkPaymentResponseV2, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
