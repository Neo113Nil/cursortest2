package com.yandex.go.taxi.order.cancel.reasons.interactor;

import defpackage.hx7;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.yx7;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ yx7 b;

    public e(vpr vprVar, yx7 yx7Var) {
        this.a = vprVar;
        this.b = yx7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1 cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof CancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1) {
            cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1 = (CancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1) continuation;
            int i2 = cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    yx7 yx7Var = this.b;
                    hx7 hx7Var = yx7Var.b;
                    o2y0 o2y0Var = yx7Var.e;
                    hx7Var.getClass();
                    List a = hx7.a(o2y0Var);
                    cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1.L$0 = null;
                    cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1.L$1 = null;
                    cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1.L$2 = null;
                    cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1.L$3 = null;
                    cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(a, cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1) == coroutineSingletons) {
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
        cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1 = new CancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
