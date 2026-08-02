package com.ybsdk.feature.savings.internal.screens.create;

import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsRegistrationCreatingApplicationResultResult;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.savings.internal.interactors.c;
import defpackage.ds31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o4m0;
import defpackage.p7m0;
import defpackage.pz40;
import defpackage.t4m0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.screens.create.SavingsAccountCreationViewModel$createSavingAccount$2", f = "SavingsAccountCreationViewModel.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsAccountCreationViewModel$createSavingAccount$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsAccountCreationViewModel$createSavingAccount$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SavingsAccountCreationViewModel$createSavingAccount$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsAccountCreationViewModel$createSavingAccount$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SavingsAccountCreationViewModel$createSavingAccount$2 savingsAccountCreationViewModel$createSavingAccount$2;
        Object a;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            c cVar = aVar.F;
            String tariffId = aVar.B.getTariffId();
            String sourceAgreementId = this.this$0.B.getSourceAgreementId();
            MoneyEntity amount = this.this$0.B.getAmount();
            a aVar2 = this.this$0;
            this.label = 1;
            savingsAccountCreationViewModel$createSavingAccount$2 = this;
            a = cVar.a(tariffId, sourceAgreementId, amount, aVar2, savingsAccountCreationViewModel$createSavingAccount$2);
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
            savingsAccountCreationViewModel$createSavingAccount$2 = this;
        }
        a aVar3 = savingsAccountCreationViewModel$createSavingAccount$2.this$0;
        if (!(a instanceof Result.Failure)) {
            aVar3.E.f0.N(SavingsEvents$SavingsRegistrationCreatingApplicationResultResult.OK, null);
            tje.N(ds31.a(aVar3), null, null, new SavingsAccountCreationViewModel$startStatusPolling$1(aVar3, ((p7m0) a).a, null), 3);
        }
        a aVar4 = savingsAccountCreationViewModel$createSavingAccount$2.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            aVar4.E.f0.N(SavingsEvents$SavingsRegistrationCreatingApplicationResultResult.ERROR, a2.getLocalizedMessage());
            x4c.g("Failed to open savings account", a2, null, null, 12);
            pz40 Y = aVar4.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, t4m0.a((t4m0) value, new o4m0(a2))));
        }
        return zy11.a;
    }
}
