package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.htz0;
import defpackage.ny61;
import defpackage.osz0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class p0 implements vpr {
    public final /* synthetic */ vpr a;

    public p0(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ToolbarUiStateInteractor$special$$inlined$map$1$2$1 toolbarUiStateInteractor$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ToolbarUiStateInteractor$special$$inlined$map$1$2$1) {
            toolbarUiStateInteractor$special$$inlined$map$1$2$1 = (ToolbarUiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = toolbarUiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                toolbarUiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = toolbarUiStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = toolbarUiStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    htz0 htz0Var = new htz0((osz0) obj);
                    toolbarUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    toolbarUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    toolbarUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    toolbarUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    toolbarUiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(htz0Var, toolbarUiStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        toolbarUiStateInteractor$special$$inlined$map$1$2$1 = new ToolbarUiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = toolbarUiStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = toolbarUiStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
