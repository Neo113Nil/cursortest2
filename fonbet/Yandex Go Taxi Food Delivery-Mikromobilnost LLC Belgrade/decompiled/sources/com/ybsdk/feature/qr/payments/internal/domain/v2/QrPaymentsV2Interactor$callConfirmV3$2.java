package com.ybsdk.feature.qr.payments.internal.domain.v2;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.qr.payments.api.QrSource;
import com.ybsdk.feature.qr.payments.internal.domain.model.QrPaymentBankInfo;
import defpackage.a5f;
import defpackage.g8e;
import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.tm60;
import defpackage.uza;
import defpackage.wls;
import defpackage.zy11;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lsk11;", "Lcag0;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.domain.v2.QrPaymentsV2Interactor$callConfirmV3$2", f = "QrPaymentsV2Interactor.kt", l = {HProv.PP_EXPORT_CSP}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsV2Interactor$callConfirmV3$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $boostStrategy;
    final /* synthetic */ String $checkId;
    final /* synthetic */ Money $money;
    final /* synthetic */ String $operationId;
    final /* synthetic */ QrPaymentBankInfo $qrPaymentBankInfo;
    final /* synthetic */ QrSource $qrSource;
    final /* synthetic */ String $qrcLink;
    final /* synthetic */ String $repaymentPlanId;
    final /* synthetic */ String $resultAgreementId;
    final /* synthetic */ String $verificationToken;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsV2Interactor$callConfirmV3$2(b bVar, String str, String str2, String str3, String str4, Money money, String str5, String str6, String str7, QrSource qrSource, QrPaymentBankInfo qrPaymentBankInfo, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$qrcLink = str;
        this.$verificationToken = str2;
        this.$operationId = str3;
        this.$checkId = str4;
        this.$money = money;
        this.$resultAgreementId = str5;
        this.$repaymentPlanId = str6;
        this.$boostStrategy = str7;
        this.$qrSource = qrSource;
        this.$qrPaymentBankInfo = qrPaymentBankInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        QrPaymentsV2Interactor$callConfirmV3$2 qrPaymentsV2Interactor$callConfirmV3$2 = new QrPaymentsV2Interactor$callConfirmV3$2(this.this$0, this.$qrcLink, this.$verificationToken, this.$operationId, this.$checkId, this.$money, this.$resultAgreementId, this.$repaymentPlanId, this.$boostStrategy, this.$qrSource, this.$qrPaymentBankInfo, continuation);
        qrPaymentsV2Interactor$callConfirmV3$2.L$0 = obj;
        return qrPaymentsV2Interactor$callConfirmV3$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrPaymentsV2Interactor$callConfirmV3$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            b bVar = this.this$0;
            com.ybsdk.feature.qr.payments.internal.data.b bVar2 = bVar.f;
            String str2 = this.$qrcLink;
            String str3 = this.$verificationToken;
            String str4 = this.$operationId;
            String str5 = this.$checkId;
            Money money = this.$money;
            String str6 = bVar.d.b;
            if (str6 == null) {
                return new Result(new Result.Failure(new Throwable("Null sessionUuid for generating hmac in confirm v3")));
            }
            String str7 = this.$resultAgreementId;
            String str8 = this.$repaymentPlanId;
            BigDecimal amount = money.getAmount();
            String currency = money.getCurrency();
            Locale locale = tm60.a;
            String a = tm60.a(amount);
            if (str8 == null) {
                str8 = "";
            }
            String lowerCase = g8e.r(oyr.w(str, a, currency, "QR_PURCHASE", str7), str2, str8, str5, str3 == null ? "" : str3).toLowerCase(Locale.ROOT);
            Mac mac = Mac.getInstance("HmacSHA256");
            Charset charset = uza.a;
            mac.init(new SecretKeySpec(str6.getBytes(charset), "HmacSHA256"));
            String K = j73.K(mac.doFinal(lowerCase.getBytes(charset)), "", new a5f(5), 30);
            String str9 = this.$resultAgreementId;
            String str10 = this.$repaymentPlanId;
            String str11 = this.$boostStrategy;
            QrSource qrSource = this.$qrSource;
            QrPaymentBankInfo qrPaymentBankInfo = this.$qrPaymentBankInfo;
            this.label = 1;
            h = bVar2.h(str2, str3, str, str4, str5, money, K, str9, str10, str11, qrSource, qrPaymentBankInfo, this);
            if (h == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            h = ((Result) obj).getValue();
        }
        return new Result(h);
    }
}
