package com.ybsdk.feature.savings.internal.data;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.savings.internal.network.SavingsApi;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountGoalDto;
import com.ybsdk.feature.savings.internal.network.dto.SavingsAccountSettingsRequest;
import defpackage.f6m0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountSettingsResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.savings.internal.data.SavingsRepository$setSettings$2", f = "SavingsRepository.kt", l = {250}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsRepository$setSettings$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $accountTitle;
    final /* synthetic */ String $agreementId;
    final /* synthetic */ f6m0 $goal;
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ Boolean $locked;
    final /* synthetic */ String $selectedThemeId;
    final /* synthetic */ Boolean $shouldDeleteGoal;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsRepository$setSettings$2(f6m0 f6m0Var, b bVar, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Continuation continuation) {
        super(1, continuation);
        this.$goal = f6m0Var;
        this.this$0 = bVar;
        this.$idempotencyToken = str;
        this.$agreementId = str2;
        this.$accountTitle = str3;
        this.$selectedThemeId = str4;
        this.$shouldDeleteGoal = bool;
        this.$locked = bool2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SavingsRepository$setSettings$2(this.$goal, this.this$0, this.$idempotencyToken, this.$agreementId, this.$accountTitle, this.$selectedThemeId, this.$shouldDeleteGoal, this.$locked, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SavingsRepository$setSettings$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SavingsAccountGoalDto savingsAccountGoalDto;
        Object i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            f6m0 f6m0Var = this.$goal;
            if (f6m0Var != null) {
                MoneyEntity moneyEntity = f6m0Var.a;
                savingsAccountGoalDto = new SavingsAccountGoalDto(moneyEntity != null ? new Money(moneyEntity.getAmount(), moneyEntity.getCurrency()) : null, f6m0Var.b);
            } else {
                savingsAccountGoalDto = null;
            }
            SavingsApi savingsApi = this.this$0.a;
            String str = this.$idempotencyToken;
            SavingsAccountSettingsRequest savingsAccountSettingsRequest = new SavingsAccountSettingsRequest(this.$agreementId, this.$accountTitle, this.$selectedThemeId, savingsAccountGoalDto, this.$shouldDeleteGoal, this.$locked);
            this.label = 1;
            i = savingsApi.i(str, savingsAccountSettingsRequest, this);
            if (i == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            i = ((Result) obj).getValue();
        }
        return new Result(i);
    }
}
