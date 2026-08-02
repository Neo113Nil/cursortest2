package com.yandex.go.walking.navigation.impl.guidance.interactor;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.z041;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class q implements vpr {
    public final /* synthetic */ vpr a;

    public q(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WalkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1 walkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof WalkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1) {
            walkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1 = (WalkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1) continuation;
            int i2 = walkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = walkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    float floatValue = ((Number) obj).floatValue();
                    z041 z041Var = new z041(!(floatValue == 0.0f), floatValue);
                    walkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1.L$0 = null;
                    walkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1.L$1 = null;
                    walkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1.L$2 = null;
                    walkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1.L$3 = null;
                    walkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(z041Var, walkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1) == coroutineSingletons) {
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
        walkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1 = new WalkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = walkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceUiStateInteractor$compassFabStateFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
