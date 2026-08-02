package com.ybsdk.feature.savings.internal.interactors;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lp7m0;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.interactors.SavingsAccountCreationInteractor$create$2", f = "SavingsAccountCreationInteractor.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsAccountCreationInteractor$create$2 extends SuspendLambda implements wls {
    final /* synthetic */ MoneyEntity $amount;
    final /* synthetic */ String $sourceAgreementId;
    final /* synthetic */ String $tariffId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsAccountCreationInteractor$create$2(c cVar, String str, String str2, MoneyEntity moneyEntity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$tariffId = str;
        this.$sourceAgreementId = str2;
        this.$amount = moneyEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SavingsAccountCreationInteractor$create$2 savingsAccountCreationInteractor$create$2 = new SavingsAccountCreationInteractor$create$2(this.this$0, this.$tariffId, this.$sourceAgreementId, this.$amount, continuation);
        savingsAccountCreationInteractor$create$2.L$0 = obj;
        return savingsAccountCreationInteractor$create$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsAccountCreationInteractor$create$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            com.ybsdk.feature.savings.internal.data.b bVar = this.this$0.a;
            String str2 = this.$tariffId;
            String str3 = this.$sourceAgreementId;
            MoneyEntity moneyEntity = this.$amount;
            this.label = 1;
            g = bVar.g(str, str2, str3, moneyEntity, this);
            if (g == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            g = ((Result) obj).getValue();
        }
        return new Result(g);
    }
}
