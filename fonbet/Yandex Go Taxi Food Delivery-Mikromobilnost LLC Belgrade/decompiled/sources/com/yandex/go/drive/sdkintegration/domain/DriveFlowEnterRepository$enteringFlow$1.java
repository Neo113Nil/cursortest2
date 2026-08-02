package com.yandex.go.drive.sdkintegration.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "it", "<anonymous>", "(Lvpr;Z)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.sdkintegration.domain.DriveFlowEnterRepository$enteringFlow$1", f = "DriveFlowEnterRepository.kt", l = {17}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DriveFlowEnterRepository$enteringFlow$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        DriveFlowEnterRepository$enteringFlow$1 driveFlowEnterRepository$enteringFlow$1 = new DriveFlowEnterRepository$enteringFlow$1(3, (Continuation) obj3);
        driveFlowEnterRepository$enteringFlow$1.L$0 = (vpr) obj;
        driveFlowEnterRepository$enteringFlow$1.Z$0 = booleanValue;
        return driveFlowEnterRepository$enteringFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Boolean valueOf = Boolean.valueOf(z);
            this.L$0 = null;
            this.Z$0 = z;
            this.label = 1;
            if (vprVar.emit(valueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return Boolean.valueOf(!z);
    }
}
