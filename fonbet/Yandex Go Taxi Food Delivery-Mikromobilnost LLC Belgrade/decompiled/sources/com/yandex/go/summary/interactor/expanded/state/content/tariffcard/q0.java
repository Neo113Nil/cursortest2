package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class q0 implements tpr {
    public final /* synthetic */ tpr a;

    public q0(tpr tprVar) {
        this.a = tprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ToolbarUiStateInteractor$special$$inlined$map$1$1 toolbarUiStateInteractor$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof ToolbarUiStateInteractor$special$$inlined$map$1$1) {
            toolbarUiStateInteractor$special$$inlined$map$1$1 = (ToolbarUiStateInteractor$special$$inlined$map$1$1) continuation;
            int i2 = toolbarUiStateInteractor$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                toolbarUiStateInteractor$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = toolbarUiStateInteractor$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = toolbarUiStateInteractor$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p0 p0Var = new p0(vprVar);
                    toolbarUiStateInteractor$special$$inlined$map$1$1.L$0 = null;
                    toolbarUiStateInteractor$special$$inlined$map$1$1.L$1 = null;
                    toolbarUiStateInteractor$special$$inlined$map$1$1.L$2 = null;
                    toolbarUiStateInteractor$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(p0Var, toolbarUiStateInteractor$special$$inlined$map$1$1) == coroutineSingletons) {
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
        toolbarUiStateInteractor$special$$inlined$map$1$1 = new ToolbarUiStateInteractor$special$$inlined$map$1$1(this, continuation);
        Object obj2 = toolbarUiStateInteractor$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = toolbarUiStateInteractor$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
