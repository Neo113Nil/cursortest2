package com.yandex.go.layers.domain;

import defpackage.nm00;
import defpackage.ny61;
import defpackage.uud0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;

    public e(vpr vprVar, g gVar) {
        this.a = vprVar;
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LayersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1 layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof LayersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1) {
            layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1 = (LayersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1) continuation;
            int i2 = layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    nm00 nm00Var = (nm00) obj;
                    if (!g.b(this.b, nm00Var)) {
                        List list = nm00Var.c;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (!((uud0) it.next()).getA().isEmpty()) {
                                    layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1.L$0 = null;
                                    layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1.L$1 = null;
                                    layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1.L$2 = null;
                                    layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1.L$3 = null;
                                    layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1.label = 1;
                                    if (this.a.emit(obj, layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            }
                        }
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
        layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1 = new LayersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = layersActionsInteractorImpl$switchStateChangeListener_delegate$lambda$0$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
