package com.ybsdk.screens.registration.domain.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.q2e0;
import defpackage.s2e0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls2e0;", "Lee9;", "pollingState", "Lzy11;", "<anonymous>", "(Ls2e0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.registration.domain.interactors.ApplicationsInteractor$startChangePhonePolling$2", f = "ApplicationsInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ApplicationsInteractor$startChangePhonePolling$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationsInteractor$startChangePhonePolling$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ApplicationsInteractor$startChangePhonePolling$2 applicationsInteractor$startChangePhonePolling$2 = new ApplicationsInteractor$startChangePhonePolling$2(this.this$0, continuation);
        applicationsInteractor$startChangePhonePolling$2.L$0 = obj;
        return applicationsInteractor$startChangePhonePolling$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ApplicationsInteractor$startChangePhonePolling$2 applicationsInteractor$startChangePhonePolling$2 = (ApplicationsInteractor$startChangePhonePolling$2) create((s2e0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        applicationsInteractor$startChangePhonePolling$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (((s2e0) this.L$0) instanceof q2e0) {
            this.this$0.c.d.a.l(null);
        }
        return zy11.a;
    }
}
