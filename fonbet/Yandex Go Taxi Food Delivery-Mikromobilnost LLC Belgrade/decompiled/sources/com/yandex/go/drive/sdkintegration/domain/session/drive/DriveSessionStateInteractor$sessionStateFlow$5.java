package com.yandex.go.drive.sdkintegration.domain.session.drive;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.v3x;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ljnt;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.sdkintegration.domain.session.drive.DriveSessionStateInteractor$sessionStateFlow$5", f = "DriveSessionStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class DriveSessionStateInteractor$sessionStateFlow$5 extends SuspendLambda implements wls {
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DriveSessionStateInteractor$sessionStateFlow$5(2, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DriveSessionStateInteractor$sessionStateFlow$5 driveSessionStateInteractor$sessionStateFlow$5 = (DriveSessionStateInteractor$sessionStateFlow$5) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        driveSessionStateInteractor$sessionStateFlow$5.invokeSuspend(zy11Var);
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
        v3x.a.getClass();
        return zy11.a;
    }
}
