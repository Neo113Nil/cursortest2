package com.yandex.go.superapp.unified_polling;

import defpackage.dy11;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ dy11 b;

    public f(r0 r0Var, dy11 dy11Var) {
        this.a = r0Var;
        this.b = dy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UnifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1 unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1;
        int i;
        if (continuation instanceof UnifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1) {
            unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1 = (UnifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1) continuation;
            int i2 = unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b);
                    unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1.L$0 = null;
                    unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1.L$1 = null;
                    unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1.L$2 = null;
                    unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(eVar, unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1) == coroutineSingletons) {
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
        unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1 = new UnifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1(this, continuation);
        Object obj2 = unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
