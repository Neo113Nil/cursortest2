package com.yandex.go.taxi.summary.rida_summary.interactor;

import defpackage.gci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.yxf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ yxf0 b;

    public f(gci0 gci0Var, yxf0 yxf0Var) {
        this.a = gci0Var;
        this.b = yxf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RidaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1 ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof RidaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1) {
            ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1 = (RidaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1) continuation;
            int i2 = ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b);
                    ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$0 = null;
                    ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$1 = null;
                    ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1.L$2 = null;
                    ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1 = new RidaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
