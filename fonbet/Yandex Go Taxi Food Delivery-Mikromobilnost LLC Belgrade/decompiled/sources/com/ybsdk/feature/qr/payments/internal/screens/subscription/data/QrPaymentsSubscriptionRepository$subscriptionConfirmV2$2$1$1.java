package com.ybsdk.feature.qr.payments.internal.screens.subscription.data;

import com.ybsdk.feature.qr.payments.internal.network.QrPaymentsApi;
import com.ybsdk.feature.qr.payments.internal.network.dto.subscription.SubscriptionConfirmVersion2Request;
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
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00040\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/QrPaymentsTwoFactorAuthResponse;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/SubscriptionResult;", "Lcom/ybsdk/feature/qr/payments/internal/network/dto/subscription/SubscriptionConfirmVersion2Response;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.qr.payments.internal.screens.subscription.data.QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2$1$1", f = "QrPaymentsSubscriptionRepository.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2$1$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $operationId;
    final /* synthetic */ SubscriptionConfirmVersion2Request $request;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2$1$1(a aVar, String str, String str2, String str3, SubscriptionConfirmVersion2Request subscriptionConfirmVersion2Request, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$verificationToken = str;
        this.$operationId = str2;
        this.$idempotencyToken = str3;
        this.$request = subscriptionConfirmVersion2Request;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2$1$1(this.this$0, this.$verificationToken, this.$operationId, this.$idempotencyToken, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2$1$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            QrPaymentsApi qrPaymentsApi = this.this$0.a;
            String str = yu50.a;
            Map<String, String> b2 = ynb1.b(new Pair(yu50.a, this.$verificationToken), new Pair(yu50.e, this.$operationId));
            String str2 = this.$idempotencyToken;
            SubscriptionConfirmVersion2Request subscriptionConfirmVersion2Request = this.$request;
            this.label = 1;
            b = qrPaymentsApi.b(str2, b2, subscriptionConfirmVersion2Request, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        return new Result(b);
    }
}
