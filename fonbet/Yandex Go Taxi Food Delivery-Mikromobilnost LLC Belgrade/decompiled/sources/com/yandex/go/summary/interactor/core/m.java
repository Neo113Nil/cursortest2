package com.yandex.go.summary.interactor.core;

import defpackage.av1;
import defpackage.f4e;
import defpackage.fnx0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;

    public m(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1 summaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof SummaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1) {
            summaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1 = (SummaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = summaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = summaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    av1 d = ru.yandex.taxi.tariffs.model.b.d(((fnx0) obj).c);
                    f4e f4eVar = d != null ? d.c : null;
                    if (f4eVar != null) {
                        summaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = null;
                        summaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1.L$1 = null;
                        summaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1.L$2 = null;
                        summaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3 = null;
                        summaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1.L$4 = null;
                        summaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(f4eVar, summaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
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
        summaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1 = new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = summaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryLifecycleActionsInteractor$launchOnAttachActions$2$23$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
