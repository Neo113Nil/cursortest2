package com.ybsdk.feature.qr.payments.internal.screens.subscription.data;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.qr.payments.internal.network.dto.QrPaymentsTwoFactorAuthResponse;
import com.ybsdk.feature.qr.payments.internal.network.dto.subscription.SubscriptionConfirmVersion2Request;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Ljbg0;", "Lsag0;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.screens.subscription.data.QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2", f = "QrPaymentsSubscriptionRepository.kt", l = {44, 53}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2 extends SuspendLambda implements wls {
    final /* synthetic */ Object $agreementResult;
    final /* synthetic */ String $operationId;
    final /* synthetic */ String $qrcLink;
    final /* synthetic */ String $verificationToken;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2(Object obj, String str, a aVar, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.$agreementResult = obj;
        this.$qrcLink = str;
        this.this$0 = aVar;
        this.$verificationToken = str2;
        this.$operationId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2 qrPaymentsSubscriptionRepository$subscriptionConfirmV2$2 = new QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2(this.$agreementResult, this.$qrcLink, this.this$0, this.$verificationToken, this.$operationId, continuation);
        qrPaymentsSubscriptionRepository$subscriptionConfirmV2$2.L$0 = obj;
        return qrPaymentsSubscriptionRepository$subscriptionConfirmV2$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007c, code lost:
    
        if (r12 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r13 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Object failure;
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                failure = ((Result) obj).getValue();
                return new Result(failure);
            }
            a aVar2 = (a) this.L$0;
            b.b(obj);
            c = ((Result) obj).getValue();
            aVar = aVar2;
            Throwable a = Result.a(c);
            if (a == null) {
                QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2$1$2$1 qrPaymentsSubscriptionRepository$subscriptionConfirmV2$2$1$2$1 = new QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2$1$2$1(2, aVar, a.class, "toBottomSheetPaymentsStatus", "toBottomSheetPaymentsStatus(Lcom/ybsdk/feature/qr/payments/internal/network/dto/SubscriptionResult;)Lcom/ybsdk/feature/qr/payments/internal/screens/subscription/data/entities/QrPaymentsStatusEntity;", 4);
                this.L$0 = null;
                this.label = 2;
                failure = com.ybsdk.feature.qr.payments.internal.network.a.a((QrPaymentsTwoFactorAuthResponse) c, qrPaymentsSubscriptionRepository$subscriptionConfirmV2$2$1$2$1, this);
            } else {
                failure = new Result.Failure(a);
            }
            return new Result(failure);
        }
        b.b(obj);
        String str = (String) this.L$0;
        Object obj2 = this.$agreementResult;
        String str2 = this.$qrcLink;
        aVar = this.this$0;
        String str3 = this.$verificationToken;
        String str4 = this.$operationId;
        Throwable a2 = Result.a(obj2);
        if (a2 != null) {
            failure = new Result.Failure(a2);
            return new Result(failure);
        }
        QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2$1$1 qrPaymentsSubscriptionRepository$subscriptionConfirmV2$2$1$1 = new QrPaymentsSubscriptionRepository$subscriptionConfirmV2$2$1$1(aVar, str3, str4, str, new SubscriptionConfirmVersion2Request(str2, (String) obj2, aVar.c), null);
        this.L$0 = aVar;
        this.label = 1;
        c = c.c(qrPaymentsSubscriptionRepository$subscriptionConfirmV2$2$1$1, this);
    }
}
