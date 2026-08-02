package com.yandex.go.superapp.unified_polling;

import defpackage.dy11;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ dy11 b;

    public e(vpr vprVar, dy11 dy11Var) {
        this.a = vprVar;
        this.b = dy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UnifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1 unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof UnifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1) {
            unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1 = (UnifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!jl40.l(this.b, (dy11) obj)) {
                        unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1.L$0 = null;
                        unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1.L$1 = null;
                        unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1.L$2 = null;
                        unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1.L$3 = null;
                        unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1 = new UnifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unifiedPollingApiImplementation$startTracking$1$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
