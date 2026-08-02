package com.ybsdk.feature.credit.deposit.internal.domain;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.boostdeposit.internal.network.dto.BoostDepositTransactionCreateRequest;
import com.ybsdk.feature.credit.deposit.api.BoostDepositScreenParams;
import com.ybsdk.feature.credit.deposit.api.CreditScreenParams;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lxaf;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.credit.deposit.internal.domain.CreditDepositInteractor$createTransaction$5", f = "CreditDepositInteractor.kt", l = {200}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CreditDepositInteractor$createTransaction$5 extends SuspendLambda implements wls {
    final /* synthetic */ BigDecimal $amount;
    final /* synthetic */ String $currency;
    final /* synthetic */ String $paymentMethodId;
    final /* synthetic */ String $paymentMethodType;
    final /* synthetic */ CreditScreenParams $screenParams;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditDepositInteractor$createTransaction$5(CreditScreenParams creditScreenParams, BigDecimal bigDecimal, String str, String str2, String str3, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$screenParams = creditScreenParams;
        this.$amount = bigDecimal;
        this.$currency = str;
        this.$paymentMethodType = str2;
        this.$paymentMethodId = str3;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CreditDepositInteractor$createTransaction$5 creditDepositInteractor$createTransaction$5 = new CreditDepositInteractor$createTransaction$5(this.$screenParams, this.$amount, this.$currency, this.$paymentMethodType, this.$paymentMethodId, this.this$0, continuation);
        creditDepositInteractor$createTransaction$5.L$0 = obj;
        return creditDepositInteractor$createTransaction$5;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreditDepositInteractor$createTransaction$5) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str = (String) this.L$0;
            BoostDepositTransactionCreateRequest boostDepositTransactionCreateRequest = new BoostDepositTransactionCreateRequest(((BoostDepositScreenParams) this.$screenParams).getAgreementId(), ((BoostDepositScreenParams) this.$screenParams).getScenario(), new Money(this.$amount, this.$currency), this.$paymentMethodType, this.$paymentMethodId);
            com.ybsdk.feature.credit.deposit.internal.data.a aVar = this.this$0.a;
            this.label = 1;
            e = aVar.e(str, boostDepositTransactionCreateRequest, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            e = ((Result) obj).getValue();
        }
        return new Result(e);
    }
}
