package com.ybsdk.feature.qr.payments.internal.data;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.qr.payments.internal.network.QrPaymentsApi;
import com.ybsdk.feature.qr.payments.internal.network.dto.info.GetPaymentInfoV3Request;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Result;", "Liyd0;", "Lw1a0;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.data.QrPaymentsInfoRepository$getQrPaymentsInfo$2", f = "QrPaymentsInfoRepository.kt", l = {46, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsInfoRepository$getQrPaymentsInfo$2 extends SuspendLambda implements tls {
    final /* synthetic */ int $attemptNumber;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $qrcLink;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsInfoRepository$getQrPaymentsInfo$2(a aVar, String str, String str2, int i, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$qrcLink = str;
        this.$idempotencyToken = str2;
        this.$attemptNumber = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new QrPaymentsInfoRepository$getQrPaymentsInfo$2(this.this$0, this.$qrcLink, this.$idempotencyToken, this.$attemptNumber, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((QrPaymentsInfoRepository$getQrPaymentsInfo$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r9 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        Object failure;
        iyd0 iyd0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            QrPaymentsApi qrPaymentsApi = aVar.a;
            GetPaymentInfoV3Request getPaymentInfoV3Request = new GetPaymentInfoV3Request(this.$qrcLink, null, aVar.c);
            String str = this.$idempotencyToken;
            int i2 = this.$attemptNumber;
            this.label = 1;
            d = qrPaymentsApi.d(str, getPaymentInfoV3Request, i2, this);
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
            d = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        String str2 = this.$qrcLink;
        Throwable a = Result.a(d);
        if (a != null) {
            failure = new Result.Failure(a);
            return new Result(failure);
        }
        iyd0 iyd0Var2 = (iyd0) d;
        DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var2.a;
        this.L$0 = iyd0Var2;
        this.label = 2;
        Object a2 = a.a(aVar2, dataWithStatusResponse, str2, this);
        if (a2 != coroutineSingletons) {
            failure = a2;
            iyd0Var = iyd0Var2;
            if (!(failure instanceof Result.Failure)) {
            }
            return new Result(failure);
        }
        return coroutineSingletons;
    }
}
