package com.yandex.go.layers.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ g b;

    public d(n0 n0Var, g gVar) {
        this.a = n0Var;
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LayersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1 layersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1;
        int i;
        if (continuation instanceof LayersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1) {
            layersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1 = (LayersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1) continuation;
            int i2 = layersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                layersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = layersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = layersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    layersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1.L$0 = null;
                    layersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1.L$1 = null;
                    layersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1.L$2 = null;
                    layersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(cVar, layersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1) == coroutineSingletons) {
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
        layersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1 = new LayersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1(this, continuation);
        Object obj2 = layersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = layersActionsInteractorImpl$immediateStateChangeListener_delegate$lambda$0$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
