package com.ybsdk.feature.credit.deposit.internal.screens.deposit;

import com.ybsdk.feature.credit.deposit.api.CreditScreenParams;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lx9f;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositViewModel$checkAmount$2", f = "CreditDepositViewModel.kt", l = {NetworkRequestException.REGIONAL_RESTRICTION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CreditDepositViewModel$checkAmount$2 extends SuspendLambda implements tls {
    final /* synthetic */ BigDecimal $amountBigDecimal;
    final /* synthetic */ String $currency;
    final /* synthetic */ String $selectedWalletCardType;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditDepositViewModel$checkAmount$2(a aVar, BigDecimal bigDecimal, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$amountBigDecimal = bigDecimal;
        this.$currency = str;
        this.$selectedWalletCardType = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new CreditDepositViewModel$checkAmount$2(this.this$0, this.$amountBigDecimal, this.$currency, this.$selectedWalletCardType, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((CreditDepositViewModel$checkAmount$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            com.ybsdk.feature.credit.deposit.internal.domain.a aVar2 = aVar.D;
            CreditScreenParams creditScreenParams = aVar.B;
            BigDecimal bigDecimal = this.$amountBigDecimal;
            String str = this.$currency;
            String str2 = this.$selectedWalletCardType;
            this.label = 1;
            a = aVar2.a(creditScreenParams, bigDecimal, str, str2, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
