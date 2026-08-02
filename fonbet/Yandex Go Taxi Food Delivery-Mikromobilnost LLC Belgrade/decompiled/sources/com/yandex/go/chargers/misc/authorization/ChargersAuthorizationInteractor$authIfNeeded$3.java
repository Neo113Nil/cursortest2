package com.yandex.go.chargers.misc.authorization;

import defpackage.fl3;
import defpackage.hl3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhl3;", "authStatus", "", "<anonymous>", "(Lhl3;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.misc.authorization.ChargersAuthorizationInteractor$authIfNeeded$3", f = "ChargersAuthorizationInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersAuthorizationInteractor$authIfNeeded$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersAuthorizationInteractor$authIfNeeded$3 chargersAuthorizationInteractor$authIfNeeded$3 = new ChargersAuthorizationInteractor$authIfNeeded$3(2, continuation);
        chargersAuthorizationInteractor$authIfNeeded$3.L$0 = obj;
        return chargersAuthorizationInteractor$authIfNeeded$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersAuthorizationInteractor$authIfNeeded$3) create((hl3) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hl3 hl3Var = (hl3) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(hl3Var instanceof fl3);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
