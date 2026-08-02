package com.yandex.plus.core.debug.panel.internal.presentation.view;

import defpackage.cfj;
import defpackage.hlz;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DebugPanelLogsView$observe$$inlined$map$1$2$1 debugPanelLogsView$observe$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DebugPanelLogsView$observe$$inlined$map$1$2$1) {
            debugPanelLogsView$observe$$inlined$map$1$2$1 = (DebugPanelLogsView$observe$$inlined$map$1$2$1) continuation;
            int i2 = debugPanelLogsView$observe$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                debugPanelLogsView$observe$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = debugPanelLogsView$observe$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = debugPanelLogsView$observe$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    cfj cfjVar = ((hlz) obj).d;
                    debugPanelLogsView$observe$$inlined$map$1$2$1.L$0 = null;
                    debugPanelLogsView$observe$$inlined$map$1$2$1.L$1 = null;
                    debugPanelLogsView$observe$$inlined$map$1$2$1.L$2 = null;
                    debugPanelLogsView$observe$$inlined$map$1$2$1.L$3 = null;
                    debugPanelLogsView$observe$$inlined$map$1$2$1.I$0 = 0;
                    debugPanelLogsView$observe$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(cfjVar, debugPanelLogsView$observe$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        debugPanelLogsView$observe$$inlined$map$1$2$1 = new DebugPanelLogsView$observe$$inlined$map$1$2$1(this, continuation);
        Object obj22 = debugPanelLogsView$observe$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = debugPanelLogsView$observe$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
