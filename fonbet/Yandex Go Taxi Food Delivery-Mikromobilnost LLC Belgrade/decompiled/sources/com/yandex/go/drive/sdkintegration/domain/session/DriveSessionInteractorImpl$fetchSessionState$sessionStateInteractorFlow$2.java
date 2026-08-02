package com.yandex.go.drive.sdkintegration.domain.session;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1r0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt1r0;", "it", "Lzy11;", "<anonymous>", "(Lt1r0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.sdkintegration.domain.session.DriveSessionInteractorImpl$fetchSessionState$sessionStateInteractorFlow$2", f = "DriveSessionInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class DriveSessionInteractorImpl$fetchSessionState$sessionStateInteractorFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveSessionInteractorImpl$fetchSessionState$sessionStateInteractorFlow$2(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DriveSessionInteractorImpl$fetchSessionState$sessionStateInteractorFlow$2 driveSessionInteractorImpl$fetchSessionState$sessionStateInteractorFlow$2 = new DriveSessionInteractorImpl$fetchSessionState$sessionStateInteractorFlow$2(this.this$0, continuation);
        driveSessionInteractorImpl$fetchSessionState$sessionStateInteractorFlow$2.L$0 = obj;
        return driveSessionInteractorImpl$fetchSessionState$sessionStateInteractorFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DriveSessionInteractorImpl$fetchSessionState$sessionStateInteractorFlow$2 driveSessionInteractorImpl$fetchSessionState$sessionStateInteractorFlow$2 = (DriveSessionInteractorImpl$fetchSessionState$sessionStateInteractorFlow$2) create((t1r0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        driveSessionInteractorImpl$fetchSessionState$sessionStateInteractorFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        t1r0 t1r0Var = (t1r0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.h.set(t1r0Var);
        return zy11.a;
    }
}
