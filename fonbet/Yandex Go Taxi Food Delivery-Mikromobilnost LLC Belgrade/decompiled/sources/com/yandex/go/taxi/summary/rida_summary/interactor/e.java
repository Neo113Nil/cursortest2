package com.yandex.go.taxi.summary.rida_summary.interactor;

import defpackage.avj0;
import defpackage.iyh0;
import defpackage.m7k0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.yxf0;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ yxf0 b;

    public e(vpr vprVar, yxf0 yxf0Var) {
        this.a = vprVar;
        this.b = yxf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RidaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RidaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) {
            ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = (RidaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    m7k0 m7k0Var = new m7k0(((avj0) ((zuj0) this.b.a)).h(iyh0.rida_summary_auto_accept_switch_title), ((Boolean) obj).booleanValue());
                    ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(m7k0Var, ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = new RidaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ridaAutoAcceptSwitchUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
