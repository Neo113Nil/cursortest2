package com.yandex.go.external_service.delegates;

import defpackage.dvx;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldvx;", "info", "Lzy11;", "<anonymous>", "(Ldvx;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.external_service.delegates.MainDelegate$launchInfoFlow$2", f = "MainDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MainDelegate$launchInfoFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MainDelegate$launchInfoFlow$2 mainDelegate$launchInfoFlow$2 = new MainDelegate$launchInfoFlow$2(2, continuation);
        mainDelegate$launchInfoFlow$2.L$0 = obj;
        return mainDelegate$launchInfoFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MainDelegate$launchInfoFlow$2 mainDelegate$launchInfoFlow$2 = (MainDelegate$launchInfoFlow$2) create((dvx) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mainDelegate$launchInfoFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dvx dvxVar = (dvx) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        jst.e.n("EatsKitDelegates.Main on launch info: isAuthorized=" + dvxVar.a());
        return zy11.a;
    }
}
