package com.ybsdk.feature.savings.internal.helpers;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.date.YbDateFormat;
import defpackage.f6m0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.vqg;
import defpackage.zy11;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lzy11;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.helpers.SavingsAccountActionsHelperImpl$changeGoal$1", f = "SavingsAccountActionsHelperImpl.kt", l = {164}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsAccountActionsHelperImpl$changeGoal$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $agreementId;
    final /* synthetic */ MoneyEntity $amount;
    final /* synthetic */ Date $date;
    final /* synthetic */ String $idempotencyToken;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsAccountActionsHelperImpl$changeGoal$1(MoneyEntity moneyEntity, Date date, a aVar, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.$amount = moneyEntity;
        this.$date = date;
        this.this$0 = aVar;
        this.$agreementId = str;
        this.$idempotencyToken = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SavingsAccountActionsHelperImpl$changeGoal$1(this.$amount, this.$date, this.this$0, this.$agreementId, this.$idempotencyToken, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SavingsAccountActionsHelperImpl$changeGoal$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object n;
        Date date;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        f6m0 f6m0Var = null;
        if (i == 0) {
            b.b(obj);
            MoneyEntity moneyEntity = this.$amount;
            if (moneyEntity != null && (date = this.$date) != null) {
                f6m0Var = new f6m0(moneyEntity, vqg.a(date, YbDateFormat.SHORT_SERVER_DATE_ONLY));
            }
            f6m0 f6m0Var2 = f6m0Var;
            com.ybsdk.feature.savings.internal.data.b bVar = this.this$0.b;
            String str = this.$agreementId;
            String str2 = this.$idempotencyToken;
            Boolean valueOf = Boolean.valueOf(f6m0Var2 == null);
            this.label = 1;
            n = com.ybsdk.feature.savings.internal.data.b.n(bVar, str, str2, null, f6m0Var2, valueOf, null, null, this, 100);
            if (n == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            n = ((Result) obj).getValue();
        }
        return new Result(n);
    }
}
