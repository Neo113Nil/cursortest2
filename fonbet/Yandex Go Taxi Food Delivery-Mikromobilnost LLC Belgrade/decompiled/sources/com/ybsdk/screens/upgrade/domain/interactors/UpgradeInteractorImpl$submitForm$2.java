package com.ybsdk.screens.upgrade.domain.interactors;

import defpackage.db21;
import defpackage.ja21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "idempotencyToken", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.upgrade.domain.interactors.UpgradeInteractorImpl$submitForm$2", f = "UpgradeInteractorImpl.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UpgradeInteractorImpl$submitForm$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $applicationId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeInteractorImpl$submitForm$2(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$applicationId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpgradeInteractorImpl$submitForm$2 upgradeInteractorImpl$submitForm$2 = new UpgradeInteractorImpl$submitForm$2(this.this$0, this.$applicationId, continuation);
        upgradeInteractorImpl$submitForm$2.L$0 = obj;
        return upgradeInteractorImpl$submitForm$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpgradeInteractorImpl$submitForm$2) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = (String) this.L$0;
            c cVar = this.this$0;
            db21 db21Var = cVar.a;
            String str2 = this.$applicationId;
            ja21 ja21Var = (ja21) cVar.e.getValue();
            this.label = 1;
            d = ((com.ybsdk.screens.upgrade.data.a) db21Var).d(str, str2, ja21Var, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            d = ((Result) obj).getValue();
        }
        return new Result(d);
    }
}
