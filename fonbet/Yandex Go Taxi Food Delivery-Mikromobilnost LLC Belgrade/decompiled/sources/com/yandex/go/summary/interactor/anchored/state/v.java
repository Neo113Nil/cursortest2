package com.yandex.go.summary.interactor.anchored.state;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class v implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ y b;

    public v(r0 r0Var, y yVar) {
        this.a = r0Var;
        this.b = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ToolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1 toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof ToolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1) {
            toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1 = (ToolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1) continuation;
            int i2 = toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    u uVar = new u(vprVar, this.b);
                    toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1.L$0 = null;
                    toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1.L$1 = null;
                    toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1.L$2 = null;
                    toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(uVar, toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1 = new ToolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = toolbarUiStateInteractor$endButtonUiStateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
