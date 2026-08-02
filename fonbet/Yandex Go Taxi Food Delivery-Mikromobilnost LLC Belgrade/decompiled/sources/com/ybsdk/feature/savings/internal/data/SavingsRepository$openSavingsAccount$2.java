package com.ybsdk.feature.savings.internal.data;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.savings.internal.network.SavingsApi;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountOpenRequest;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/core/utils/dto/DataWithStatusResponse;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpenResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.savings.internal.data.SavingsRepository$openSavingsAccount$2", f = "SavingsRepository.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsRepository$openSavingsAccount$2 extends SuspendLambda implements tls {
    final /* synthetic */ MoneyEntity $amount;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ String $sourceAgreementId;
    final /* synthetic */ String $tariffId;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsRepository$openSavingsAccount$2(b bVar, String str, String str2, String str3, MoneyEntity moneyEntity, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$idempotencyToken = str;
        this.$tariffId = str2;
        this.$sourceAgreementId = str3;
        this.$amount = moneyEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SavingsRepository$openSavingsAccount$2(this.this$0, this.$idempotencyToken, this.$tariffId, this.$sourceAgreementId, this.$amount, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SavingsRepository$openSavingsAccount$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            SavingsApi savingsApi = this.this$0.a;
            String str = this.$idempotencyToken;
            String str2 = this.$tariffId;
            String str3 = this.$sourceAgreementId;
            MoneyEntity moneyEntity = this.$amount;
            SavingsAccountOpenRequest savingsAccountOpenRequest = new SavingsAccountOpenRequest(str2, str3, moneyEntity != null ? new Money(moneyEntity.getAmount(), moneyEntity.getCurrency()) : null);
            this.label = 1;
            e = savingsApi.e(str, savingsAccountOpenRequest, this);
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
