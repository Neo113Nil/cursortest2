package com.ybsdk.feature.savings.internal.interactors;

import com.ybsdk.feature.savings.internal.entities.SavingsAccountCreationStatusEntity$Status;
import defpackage.iyd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tq11;
import defpackage.u4m0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltq11;", "attemptNumber", "Lkotlin/Result;", "Liyd0;", "Lu4m0;", "<anonymous>", "(Ltq11;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.interactors.SavingsAccountCreationInteractor$pollStatus$3", f = "SavingsAccountCreationInteractor.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsAccountCreationInteractor$pollStatus$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $requestId;
    final /* synthetic */ tls $updateProcessingStateCallback;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsAccountCreationInteractor$pollStatus$3(c cVar, String str, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$requestId = str;
        this.$updateProcessingStateCallback = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SavingsAccountCreationInteractor$pollStatus$3 savingsAccountCreationInteractor$pollStatus$3 = new SavingsAccountCreationInteractor$pollStatus$3(this.this$0, this.$requestId, this.$updateProcessingStateCallback, continuation);
        savingsAccountCreationInteractor$pollStatus$3.I$0 = ((tq11) obj).a;
        return savingsAccountCreationInteractor$pollStatus$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = ((tq11) obj).a;
        SavingsAccountCreationInteractor$pollStatus$3 savingsAccountCreationInteractor$pollStatus$3 = new SavingsAccountCreationInteractor$pollStatus$3(this.this$0, this.$requestId, this.$updateProcessingStateCallback, (Continuation) obj2);
        savingsAccountCreationInteractor$pollStatus$3.I$0 = i;
        return savingsAccountCreationInteractor$pollStatus$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = this.I$0;
            com.ybsdk.feature.savings.internal.data.b bVar = this.this$0.a;
            String str = this.$requestId;
            this.label = 1;
            j = bVar.j(i2, str, this);
            if (j == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            j = ((Result) obj).getValue();
        }
        Result result = new Result(j);
        c cVar = this.this$0;
        tls tlsVar = this.$updateProcessingStateCallback;
        Object value = result.getValue();
        if (value instanceof Result.Failure) {
            value = null;
        }
        iyd0 iyd0Var = (iyd0) value;
        cVar.c = iyd0Var != null ? (u4m0) iyd0Var.a : null;
        u4m0 u4m0Var = cVar.c;
        if ((u4m0Var != null ? u4m0Var.b : null) == SavingsAccountCreationStatusEntity$Status.PROCESSING) {
            tlsVar.invoke(cVar.c);
        }
        return result;
    }
}
