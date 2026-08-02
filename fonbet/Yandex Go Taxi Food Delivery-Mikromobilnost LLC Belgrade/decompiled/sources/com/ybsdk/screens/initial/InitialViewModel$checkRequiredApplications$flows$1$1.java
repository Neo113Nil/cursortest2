package com.ybsdk.screens.initial;

import android.content.Context;
import com.ybsdk.common.entities.ApplicationTypeEntity;
import com.ybsdk.common.entities.SessionApplicationEntity;
import com.ybsdk.core.analytics.generated.delegates.RegistrationEvents$RegistrationResultResult;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q2e0;
import defpackage.s2e0;
import defpackage.wls;
import defpackage.z94;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls2e0;", "pollingState", "Lzy11;", "<anonymous>", "(Ls2e0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.initial.InitialViewModel$checkRequiredApplications$flows$1$1", f = "InitialViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InitialViewModel$checkRequiredApplications$flows$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ SessionApplicationEntity $application;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitialViewModel$checkRequiredApplications$flows$1$1(SessionApplicationEntity sessionApplicationEntity, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$application = sessionApplicationEntity;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InitialViewModel$checkRequiredApplications$flows$1$1 initialViewModel$checkRequiredApplications$flows$1$1 = new InitialViewModel$checkRequiredApplications$flows$1$1(this.$application, this.this$0, continuation);
        initialViewModel$checkRequiredApplications$flows$1$1.L$0 = obj;
        return initialViewModel$checkRequiredApplications$flows$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        InitialViewModel$checkRequiredApplications$flows$1$1 initialViewModel$checkRequiredApplications$flows$1$1 = (InitialViewModel$checkRequiredApplications$flows$1$1) create((s2e0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        initialViewModel$checkRequiredApplications$flows$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if ((((s2e0) this.L$0) instanceof q2e0) && this.$application.getType() == ApplicationTypeEntity.REGISTRATION) {
            d dVar = this.this$0;
            String applicationId = this.$application.getApplicationId();
            Context context = dVar.a0;
            z94.u(dVar.I.b0, RegistrationEvents$RegistrationResultResult.OK, null, applicationId);
        }
        return zy11.a;
    }
}
