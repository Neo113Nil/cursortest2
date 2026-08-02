package com.yandex.go.walking.navigation.impl.guidance.interactor;

import com.yandex.go.walking.navigation.impl.model.WalkNavFocusButtonState;
import defpackage.ny61;
import defpackage.p341;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class s implements vpr {
    public final /* synthetic */ vpr a;

    public s(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WalkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1 walkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1;
        int i;
        WalkNavFocusButtonState walkNavFocusButtonState;
        if (continuation instanceof WalkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1) {
            walkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1 = (WalkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = walkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = walkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i3 = p341.a[((FocusAction) obj).ordinal()];
                    if (i3 == 1) {
                        walkNavFocusButtonState = WalkNavFocusButtonState.FOCUS_USER_LOCATION;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        walkNavFocusButtonState = WalkNavFocusButtonState.FOCUS_ROUTE;
                    }
                    walkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1.L$0 = null;
                    walkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1.L$1 = null;
                    walkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1.L$2 = null;
                    walkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1.L$3 = null;
                    walkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(walkNavFocusButtonState, walkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        walkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1 = new WalkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = walkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceUiStateInteractor$focusFabStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
