package com.yandex.go.walking.navigation.impl.navigation_core.guidance.repository;

import defpackage.a341;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class h implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.h a;
    public final /* synthetic */ a341 b;

    public h(kotlinx.coroutines.flow.internal.h hVar, a341 a341Var) {
        this.a = hVar;
        this.b = a341Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        WalkNavGuidanceStateRepository$special$$inlined$map$3$1 walkNavGuidanceStateRepository$special$$inlined$map$3$1;
        int i;
        if (continuation instanceof WalkNavGuidanceStateRepository$special$$inlined$map$3$1) {
            walkNavGuidanceStateRepository$special$$inlined$map$3$1 = (WalkNavGuidanceStateRepository$special$$inlined$map$3$1) continuation;
            int i2 = walkNavGuidanceStateRepository$special$$inlined$map$3$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavGuidanceStateRepository$special$$inlined$map$3$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavGuidanceStateRepository$special$$inlined$map$3$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavGuidanceStateRepository$special$$inlined$map$3$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g gVar = new g(vprVar, this.b);
                    walkNavGuidanceStateRepository$special$$inlined$map$3$1.L$0 = null;
                    walkNavGuidanceStateRepository$special$$inlined$map$3$1.L$1 = null;
                    walkNavGuidanceStateRepository$special$$inlined$map$3$1.L$2 = null;
                    walkNavGuidanceStateRepository$special$$inlined$map$3$1.label = 1;
                    if (this.a.collect(gVar, walkNavGuidanceStateRepository$special$$inlined$map$3$1) == coroutineSingletons) {
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
        walkNavGuidanceStateRepository$special$$inlined$map$3$1 = new WalkNavGuidanceStateRepository$special$$inlined$map$3$1(this, continuation);
        Object obj2 = walkNavGuidanceStateRepository$special$$inlined$map$3$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceStateRepository$special$$inlined$map$3$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
