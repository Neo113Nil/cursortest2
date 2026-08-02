package com.yandex.go.walking.navigation.impl.navigation_core.guidance.repository;

import com.yandex.mapkit.navigation.transport.Guidance;
import com.yandex.mapkit.navigation.transport.GuidanceMode;
import com.yandex.mapkit.navigation.transport.Navigation;
import defpackage.a341;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ a341 b;

    public a(vpr vprVar, a341 a341Var) {
        this.a = vprVar;
        this.b = a341Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WalkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1 walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1;
        int i;
        Guidance guidance;
        if (continuation instanceof WalkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1) {
            walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1 = (WalkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1) continuation;
            int i2 = walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Navigation navigation = this.b.b.c;
                    GuidanceMode guidanceMode = (navigation == null || (guidance = navigation.getGuidance()) == null) ? null : guidance.getGuidanceMode();
                    walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1.L$0 = null;
                    walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1.L$1 = null;
                    walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1.L$2 = null;
                    walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1.L$3 = null;
                    walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(guidanceMode, walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1 = new WalkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
