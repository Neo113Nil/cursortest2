package com.yandex.go.walking.navigation.impl.guidance.interactor;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;

    public l(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WalkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1 walkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof WalkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1) {
            walkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1 = (WalkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = walkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = walkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((Number) obj).doubleValue() >= 100.0d) {
                        walkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1.L$0 = null;
                        walkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1.L$1 = null;
                        walkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1.L$2 = null;
                        walkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1.L$3 = null;
                        walkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, walkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        walkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1 = new WalkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = walkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceInProgressAnalyticsInteractor$start$1$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
