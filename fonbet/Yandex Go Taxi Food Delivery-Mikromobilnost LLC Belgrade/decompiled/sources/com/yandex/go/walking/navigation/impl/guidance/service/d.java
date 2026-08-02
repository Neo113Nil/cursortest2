package com.yandex.go.walking.navigation.impl.guidance.service;

import defpackage.eci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ e b;

    public d(eci0 eci0Var, e eVar) {
        this.a = eci0Var;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        WalkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1 walkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1;
        int i;
        if (continuation instanceof WalkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1) {
            walkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1 = (WalkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1) continuation;
            int i2 = walkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    walkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1.L$0 = null;
                    walkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1.L$1 = null;
                    walkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1.L$2 = null;
                    walkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, walkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1) == coroutineSingletons) {
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
        walkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1 = new WalkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1(this, continuation);
        Object obj2 = walkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceServiceInteractor$awaitPermission$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
