package com.yandex.go.drive.sdkintegration.domain.session.unified_polling;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class b implements tpr {
    public final /* synthetic */ mth a;

    public b(mth mthVar) {
        this.a = mthVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UnifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1 unifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof UnifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1) {
            unifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1 = (UnifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = unifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                unifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = unifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = unifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    unifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    unifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    unifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    unifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, unifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        unifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1 = new UnifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = unifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unifiedPollingSessionStateInteractor$collectDriveStateAndPreloadNativeSessionIfNeeded$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
