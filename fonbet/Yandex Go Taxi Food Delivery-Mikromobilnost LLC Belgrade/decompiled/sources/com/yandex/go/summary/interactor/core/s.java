package com.yandex.go.summary.interactor.core;

import defpackage.hnr0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class s implements tpr {
    public final /* synthetic */ tpr a;

    public s(hnr0 hnr0Var) {
        this.a = hnr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SummaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1 summaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof SummaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1) {
            summaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1 = (SummaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = summaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r rVar = new r(vprVar);
                    summaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    summaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    summaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    summaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(rVar, summaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        summaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1 = new SummaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = summaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryLifecycleActionsInteractor$launchOnAttachActions$2$7$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
