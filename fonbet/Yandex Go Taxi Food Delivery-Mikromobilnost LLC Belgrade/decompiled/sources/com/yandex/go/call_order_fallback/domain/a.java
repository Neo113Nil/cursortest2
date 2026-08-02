package com.yandex.go.call_order_fallback.domain;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0086, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CallOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1 callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof CallOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1) {
            callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1 = (CallOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1) continuation;
            int i2 = callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$0 = null;
                    callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$1 = null;
                    callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$2 = null;
                    callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$5 = null;
                    callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$6 = null;
                    callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.label = 1;
                    obj2 = c.b(this.b, callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$0 = null;
                callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$1 = null;
                callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$2 = null;
                callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$3 = null;
                callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$4 = null;
                callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$5 = null;
                callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$6 = null;
                callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1 = new CallOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$0 = null;
        callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$1 = null;
        callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$2 = null;
        callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$3 = null;
        callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$4 = null;
        callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$5 = null;
        callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.L$6 = null;
        callOrderFallbackInteractor$launchRouterFlow$$inlined$map$1$2$1.label = 2;
    }
}
