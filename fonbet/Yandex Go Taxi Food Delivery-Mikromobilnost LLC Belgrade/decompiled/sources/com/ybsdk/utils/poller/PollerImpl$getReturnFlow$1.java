package com.ybsdk.utils.poller;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s2e0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"BLOCK", "Lvpr;", "Ls2e0;", ClidProvider.STATE, "", "<anonymous>", "(Lvpr;Ls2e0;)Z"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.utils.poller.PollerImpl$getReturnFlow$1", f = "PollerImpl.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PollerImpl$getReturnFlow$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PollerImpl$getReturnFlow$1 pollerImpl$getReturnFlow$1 = new PollerImpl$getReturnFlow$1(3, (Continuation) obj3);
        pollerImpl$getReturnFlow$1.L$0 = (vpr) obj;
        pollerImpl$getReturnFlow$1.L$1 = (s2e0) obj2;
        return pollerImpl$getReturnFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s2e0 s2e0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            s2e0 s2e0Var2 = (s2e0) this.L$1;
            this.L$0 = s2e0Var2;
            this.label = 1;
            if (vprVar.emit(s2e0Var2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            s2e0Var = s2e0Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s2e0Var = (s2e0) this.L$0;
            kotlin.b.b(obj);
        }
        return Boolean.valueOf(!e.a(s2e0Var));
    }
}
