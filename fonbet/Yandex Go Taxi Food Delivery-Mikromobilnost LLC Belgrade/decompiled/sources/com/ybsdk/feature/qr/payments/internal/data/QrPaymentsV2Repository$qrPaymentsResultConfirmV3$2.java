package com.ybsdk.feature.qr.payments.internal.data;

import com.ybsdk.feature.qr.payments.internal.network.QrPaymentsApi;
import com.ybsdk.feature.qr.payments.internal.network.dto.confirm.QrPaymentConfirmVersion3Request;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.ynb1;
import defpackage.yu50;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/TwoFactorAuthResponse;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.qr.payments.internal.data.QrPaymentsV2Repository$qrPaymentsResultConfirmV3$2", f = "QrPaymentsV2Repository.kt", l = {164}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsV2Repository$qrPaymentsResultConfirmV3$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $operationId;
    final /* synthetic */ QrPaymentConfirmVersion3Request $request;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsV2Repository$qrPaymentsResultConfirmV3$2(b bVar, String str, String str2, String str3, QrPaymentConfirmVersion3Request qrPaymentConfirmVersion3Request, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$idempotencyToken = str;
        this.$verificationToken = str2;
        this.$operationId = str3;
        this.$request = qrPaymentConfirmVersion3Request;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new QrPaymentsV2Repository$qrPaymentsResultConfirmV3$2(this.this$0, this.$idempotencyToken, this.$verificationToken, this.$operationId, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((QrPaymentsV2Repository$qrPaymentsResultConfirmV3$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            QrPaymentsApi qrPaymentsApi = this.this$0.a;
            String str = this.$idempotencyToken;
            String str2 = yu50.a;
            Map<String, String> b = ynb1.b(new Pair(yu50.a, this.$verificationToken), new Pair(yu50.e, this.$operationId));
            QrPaymentConfirmVersion3Request qrPaymentConfirmVersion3Request = this.$request;
            this.label = 1;
            f = qrPaymentsApi.f(str, b, qrPaymentConfirmVersion3Request, this);
            if (f == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            f = ((Result) obj).getValue();
        }
        return new Result(f);
    }
}
