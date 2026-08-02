package com.yandex.go.walking.navigation.impl.navigation_core.guidance.repository;

import defpackage.a341;
import defpackage.eci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ a341 b;

    public b(eci0 eci0Var, a341 a341Var) {
        this.a = eci0Var;
        this.b = a341Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        WalkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1 walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof WalkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1) {
            walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1 = (WalkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1) continuation;
            int i2 = walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1.L$0 = null;
                    walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1.L$1 = null;
                    walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1.L$2 = null;
                    walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1 = new WalkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceStateRepository$guidanceModeFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
