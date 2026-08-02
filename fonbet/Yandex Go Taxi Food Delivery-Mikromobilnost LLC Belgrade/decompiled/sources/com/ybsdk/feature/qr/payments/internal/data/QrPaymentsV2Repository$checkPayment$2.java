package com.ybsdk.feature.qr.payments.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.qr.payments.internal.network.QrPaymentsApi;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.check.CheckPaymentRequestV2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Ldqg;", "Lmgb;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.data.QrPaymentsV2Repository$checkPayment$2", f = "QrPaymentsV2Repository.kt", l = {HProv.PP_SECURITY_LEVEL, HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsV2Repository$checkPayment$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ CheckPaymentRequestV2 $request;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsV2Repository$checkPayment$2(b bVar, String str, CheckPaymentRequestV2 checkPaymentRequestV2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$idempotencyToken = str;
        this.$request = checkPaymentRequestV2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new QrPaymentsV2Repository$checkPayment$2(this.this$0, this.$idempotencyToken, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((QrPaymentsV2Repository$checkPayment$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r6 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r7 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object h;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            QrPaymentsApi qrPaymentsApi = this.this$0.a;
            String str = this.$idempotencyToken;
            CheckPaymentRequestV2 checkPaymentRequestV2 = this.$request;
            this.label = 1;
            h = qrPaymentsApi.h(str, checkPaymentRequestV2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                failure = ((Result) obj).getValue();
                return new Result(failure);
            }
            kotlin.b.b(obj);
            h = ((Result) obj).getValue();
        }
        b bVar = this.this$0;
        Throwable a = Result.a(h);
        if (a == null) {
            QrPaymentsV2Repository$checkPayment$2$1$1 qrPaymentsV2Repository$checkPayment$2$1$1 = new QrPaymentsV2Repository$checkPayment$2$1$1(bVar, null);
            this.label = 2;
            failure = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) h, qrPaymentsV2Repository$checkPayment$2$1$1, this);
        } else {
            failure = new Result.Failure(a);
        }
        return new Result(failure);
    }
}
