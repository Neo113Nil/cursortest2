package com.ybsdk.feature.qr.payments.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.qr.payments.internal.network.QrPaymentsApi;
import com.ybsdk.feature.qr.payments.internal.network.v2.dto.info.GetPaymentInfoRequest;
import defpackage.iyd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Ll8g0;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.data.QrPaymentsV2Repository$getPaymentInfo$2", f = "QrPaymentsV2Repository.kt", l = {99, 103}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsV2Repository$getPaymentInfo$2 extends SuspendLambda implements tls {
    final /* synthetic */ int $attemptNumber;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ GetPaymentInfoRequest $request;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsV2Repository$getPaymentInfo$2(b bVar, String str, GetPaymentInfoRequest getPaymentInfoRequest, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$idempotencyToken = str;
        this.$request = getPaymentInfoRequest;
        this.$attemptNumber = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new QrPaymentsV2Repository$getPaymentInfo$2(this.this$0, this.$idempotencyToken, this.$request, this.$attemptNumber, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((QrPaymentsV2Repository$getPaymentInfo$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r8 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        Object failure;
        iyd0 iyd0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            QrPaymentsApi qrPaymentsApi = this.this$0.a;
            String str = this.$idempotencyToken;
            GetPaymentInfoRequest getPaymentInfoRequest = this.$request;
            int i2 = this.$attemptNumber;
            this.label = 1;
            c = qrPaymentsApi.c(str, getPaymentInfoRequest, i2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                iyd0Var = (iyd0) this.L$0;
                kotlin.b.b(obj);
                failure = ((Result) obj).getValue();
                if (!(failure instanceof Result.Failure)) {
                    failure = new iyd0(iyd0Var.b, failure);
                }
                return new Result(failure);
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
        }
        b bVar = this.this$0;
        Throwable a = Result.a(c);
        if (a != null) {
            failure = new Result.Failure(a);
            return new Result(failure);
        }
        iyd0 iyd0Var2 = (iyd0) c;
        DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var2.a;
        this.L$0 = iyd0Var2;
        this.label = 2;
        Object d = b.d(bVar, dataWithStatusResponse, this);
        if (d != coroutineSingletons) {
            failure = d;
            iyd0Var = iyd0Var2;
            if (!(failure instanceof Result.Failure)) {
            }
            return new Result(failure);
        }
        return coroutineSingletons;
    }
}
