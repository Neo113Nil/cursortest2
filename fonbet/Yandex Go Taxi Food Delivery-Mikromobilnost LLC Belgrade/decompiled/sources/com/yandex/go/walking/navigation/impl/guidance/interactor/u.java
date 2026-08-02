package com.yandex.go.walking.navigation.impl.guidance.interactor;

import defpackage.akt0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class u implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ x b;

    public u(tpr[] tprVarArr, x xVar) {
        this.a = tprVarArr;
        this.b = xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        WalkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1 walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1;
        int i;
        if (continuation instanceof WalkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1) {
            walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1 = (WalkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1) continuation;
            int i2 = walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    akt0 akt0Var = new akt0(tprVarArr, 19);
                    WalkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$3 walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$3 = new WalkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$3(this.b, null);
                    walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1.L$0 = null;
                    walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1.L$1 = null;
                    walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1.L$2 = null;
                    walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, akt0Var, walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$3, walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1 = new WalkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1(this, continuation);
        Object obj2 = walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavGuidanceUiStateInteractor$uiStateFlow$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
