package com.ybsdk.screens.registration.applicationstatus.presentation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.p2e0;
import defpackage.s2e0;
import defpackage.sls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ls2e0;", "it", "Lzy11;", "<anonymous>", "(Ls2e0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.applicationstatus.presentation.RegistrationApplicationStatusViewModel$pollStatus$4", f = "RegistrationApplicationStatusViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RegistrationApplicationStatusViewModel$pollStatus$4 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onTakesTooLong;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationApplicationStatusViewModel$pollStatus$4(sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$onTakesTooLong = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RegistrationApplicationStatusViewModel$pollStatus$4 registrationApplicationStatusViewModel$pollStatus$4 = new RegistrationApplicationStatusViewModel$pollStatus$4(this.$onTakesTooLong, continuation);
        registrationApplicationStatusViewModel$pollStatus$4.L$0 = obj;
        return registrationApplicationStatusViewModel$pollStatus$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        RegistrationApplicationStatusViewModel$pollStatus$4 registrationApplicationStatusViewModel$pollStatus$4 = (RegistrationApplicationStatusViewModel$pollStatus$4) create((s2e0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        registrationApplicationStatusViewModel$pollStatus$4.invokeSuspend(zy11Var);
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
        s2e0 s2e0Var = (s2e0) this.L$0;
        if ((s2e0Var instanceof p2e0) && ((p2e0) s2e0Var).d) {
            this.$onTakesTooLong.invoke();
        }
        return zy11.a;
    }
}
