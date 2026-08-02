package com.yandex.go.walking.navigation.impl.guidance.interactor;

import com.yandex.mapkit.geometry.Point;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zs7;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WalkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1 walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof WalkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1) {
            walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1 = (WalkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1) continuation;
            int i2 = walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Point target = ((zs7) obj).a.getTarget();
                    walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1.L$0 = null;
                    walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1.L$1 = null;
                    walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1.L$2 = null;
                    walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1.L$3 = null;
                    walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(target, walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1 = new WalkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceCameraInteractor$availableFocusActionByDistanceToUserFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
