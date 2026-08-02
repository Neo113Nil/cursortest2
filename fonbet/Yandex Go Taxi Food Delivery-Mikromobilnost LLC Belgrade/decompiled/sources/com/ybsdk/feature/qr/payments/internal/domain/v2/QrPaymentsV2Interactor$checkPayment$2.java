package com.ybsdk.feature.qr.payments.internal.domain.v2;

import com.ybsdk.feature.qr.payments.api.QrSource;
import com.ybsdk.feature.qr.payments.internal.domain.model.QrPaymentBankInfo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Ldqg;", "Lmgb;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.domain.v2.QrPaymentsV2Interactor$checkPayment$2", f = "QrPaymentsV2Interactor.kt", l = {MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsV2Interactor$checkPayment$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ BigDecimal $amount;
    final /* synthetic */ String $boostStrategy;
    final /* synthetic */ QrPaymentBankInfo $qrPaymentBankInfo;
    final /* synthetic */ String $repaymentPlanId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsV2Interactor$checkPayment$2(b bVar, String str, BigDecimal bigDecimal, String str2, String str3, QrPaymentBankInfo qrPaymentBankInfo, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$agreementId = str;
        this.$amount = bigDecimal;
        this.$repaymentPlanId = str2;
        this.$boostStrategy = str3;
        this.$qrPaymentBankInfo = qrPaymentBankInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QrPaymentsV2Interactor$checkPayment$2 qrPaymentsV2Interactor$checkPayment$2 = new QrPaymentsV2Interactor$checkPayment$2(this.this$0, this.$agreementId, this.$amount, this.$repaymentPlanId, this.$boostStrategy, this.$qrPaymentBankInfo, continuation);
        qrPaymentsV2Interactor$checkPayment$2.L$0 = obj;
        return qrPaymentsV2Interactor$checkPayment$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrPaymentsV2Interactor$checkPayment$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            b bVar = this.this$0;
            com.ybsdk.feature.qr.payments.internal.data.b bVar2 = bVar.f;
            String str2 = this.$agreementId;
            BigDecimal bigDecimal = this.$amount;
            String str3 = this.$repaymentPlanId;
            String str4 = this.$boostStrategy;
            QrSource qrSource = bVar.b.c;
            QrPaymentBankInfo qrPaymentBankInfo = this.$qrPaymentBankInfo;
            this.label = 1;
            e = bVar2.e(str, str2, bigDecimal, str3, str4, qrSource, qrPaymentBankInfo, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e = ((Result) obj).getValue();
        }
        return new Result(e);
    }
}
