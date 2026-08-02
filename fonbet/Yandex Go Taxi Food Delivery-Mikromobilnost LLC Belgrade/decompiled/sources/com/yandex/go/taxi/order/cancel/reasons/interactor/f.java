package com.yandex.go.taxi.order.cancel.reasons.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.yx7;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes14.dex */
public final class f implements tpr {
    public final /* synthetic */ g a;
    public final /* synthetic */ yx7 b;

    public f(g gVar, yx7 yx7Var) {
        this.a = gVar;
        this.b = yx7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        CancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1 cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1;
        int i;
        if (continuation instanceof CancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1) {
            cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1 = (CancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1) continuation;
            int i2 = cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b);
                    cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1.L$0 = null;
                    cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1.L$1 = null;
                    cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1.L$2 = null;
                    cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1.label = 1;
                    if (this.a.collect(eVar, cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1) == coroutineSingletons) {
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
        cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1 = new CancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1(this, continuation);
        Object obj2 = cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelReasonsV2Interactor$uiStateFlow$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
