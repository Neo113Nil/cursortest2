package com.yandex.go.navigator.driving;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "isExpired", "timer", ""}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.driving.DrivingModalPresenter$showUserInterfaceFlow$1", f = "DrivingModalPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DrivingModalPresenter$showUserInterfaceFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ long J$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        long longValue = ((Number) obj2).longValue();
        DrivingModalPresenter$showUserInterfaceFlow$1 drivingModalPresenter$showUserInterfaceFlow$1 = new DrivingModalPresenter$showUserInterfaceFlow$1(3, (Continuation) obj3);
        drivingModalPresenter$showUserInterfaceFlow$1.Z$0 = booleanValue;
        drivingModalPresenter$showUserInterfaceFlow$1.J$0 = longValue;
        return drivingModalPresenter$showUserInterfaceFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(!z || j > 0);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
