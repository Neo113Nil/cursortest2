package com.yandex.go.summary.interactor.expanded.state.content.tariffcard;

import defpackage.ltz0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class s0 implements tpr {
    public final /* synthetic */ com.yandex.go.tariffcard.experiment.u a;
    public final /* synthetic */ ltz0 b;

    public s0(com.yandex.go.tariffcard.experiment.u uVar, ltz0 ltz0Var) {
        this.a = uVar;
        this.b = ltz0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ToolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1 toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof ToolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1) {
            toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1 = (ToolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1) continuation;
            int i2 = toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = new r0(vprVar, this.b);
                    toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1.L$0 = null;
                    toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1.L$1 = null;
                    toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1.L$2 = null;
                    toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(r0Var, toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1 = new ToolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = toolbarUiStateInteractor$startToolbarButtonFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
