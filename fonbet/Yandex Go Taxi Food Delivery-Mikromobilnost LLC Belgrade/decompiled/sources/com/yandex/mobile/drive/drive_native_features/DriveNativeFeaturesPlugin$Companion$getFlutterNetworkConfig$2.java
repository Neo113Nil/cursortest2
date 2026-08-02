package com.yandex.mobile.drive.drive_native_features;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qsr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqsr;", "it", "", "<anonymous>", "(Lqsr;)Z"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.drive_native_features.DriveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$2", f = "DriveNativeFeaturesPlugin.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class DriveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DriveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$2 driveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$2 = new DriveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$2(2, continuation);
        driveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$2.L$0 = obj;
        return driveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DriveNativeFeaturesPlugin$Companion$getFlutterNetworkConfig$2) create((qsr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qsr qsrVar = (qsr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(qsrVar != null);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
