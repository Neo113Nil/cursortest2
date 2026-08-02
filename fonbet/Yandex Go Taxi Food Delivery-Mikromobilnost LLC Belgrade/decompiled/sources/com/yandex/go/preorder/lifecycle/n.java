package com.yandex.go.preorder.lifecycle;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class n implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ p b;

    public n(vpr vprVar, p pVar) {
        this.a = vprVar;
        this.b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1 sourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof SourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1) {
            sourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1 = (SourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1) continuation;
            int i2 = sourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = sourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (this.b.a.a()) {
                        sourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1.L$0 = null;
                        sourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1.L$1 = null;
                        sourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1.L$2 = null;
                        sourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1.L$3 = null;
                        sourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, sourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        sourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1 = new SourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = sourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourcePointSdcLifecycleListener$onResume$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
