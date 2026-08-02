package com.ybsdk.feature.savings.internal.interactors;

import com.ybsdk.feature.savings.internal.entities.SavingsAccountCreationStatusEntity$Status;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.u4m0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu4m0;", "", "<anonymous>", "(Lu4m0;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.interactors.SavingsAccountCreationInteractor$pollStatus$2", f = "SavingsAccountCreationInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SavingsAccountCreationInteractor$pollStatus$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SavingsAccountCreationInteractor$pollStatus$2 savingsAccountCreationInteractor$pollStatus$2 = new SavingsAccountCreationInteractor$pollStatus$2(2, continuation);
        savingsAccountCreationInteractor$pollStatus$2.L$0 = obj;
        return savingsAccountCreationInteractor$pollStatus$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SavingsAccountCreationInteractor$pollStatus$2) create((u4m0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        SavingsAccountCreationStatusEntity$Status savingsAccountCreationStatusEntity$Status = ((u4m0) this.L$0).b;
        return Boolean.valueOf(savingsAccountCreationStatusEntity$Status == SavingsAccountCreationStatusEntity$Status.SUCCESS || savingsAccountCreationStatusEntity$Status == SavingsAccountCreationStatusEntity$Status.TIMEOUT || savingsAccountCreationStatusEntity$Status == SavingsAccountCreationStatusEntity$Status.FAIL);
    }
}
