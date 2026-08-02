package com.ybsdk.screens.registration.applicationstatus.presentation;

import defpackage.aqi0;
import defpackage.gqi0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusViewModel$onErrorPrimaryButtonClick$4", f = "RegistrationApplicationStatusViewModel.kt", l = {386}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RegistrationApplicationStatusViewModel$onErrorPrimaryButtonClick$4 extends SuspendLambda implements wls {
    final /* synthetic */ gqi0 $currentState;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationApplicationStatusViewModel$onErrorPrimaryButtonClick$4(c cVar, gqi0 gqi0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$currentState = gqi0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RegistrationApplicationStatusViewModel$onErrorPrimaryButtonClick$4(this.this$0, this.$currentState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RegistrationApplicationStatusViewModel$onErrorPrimaryButtonClick$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            aqi0 aqi0Var = (aqi0) this.$currentState;
            String str = aqi0Var.e;
            String str2 = aqi0Var.b;
            this.label = 1;
            if (c.b0(cVar, str, str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
