package com.yandex.go.explorer.impl.experiments;

import defpackage.c1o;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class g {
    public final rqo a;
    public final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new c1o(6, this));

    public g(rqo rqoVar) {
        this.a = rqoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ExplorerExperimentRepository$getZoomToResolutionList$1 explorerExperimentRepository$getZoomToResolutionList$1;
        int i;
        if (continuationImpl instanceof ExplorerExperimentRepository$getZoomToResolutionList$1) {
            explorerExperimentRepository$getZoomToResolutionList$1 = (ExplorerExperimentRepository$getZoomToResolutionList$1) continuationImpl;
            int i2 = explorerExperimentRepository$getZoomToResolutionList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                explorerExperimentRepository$getZoomToResolutionList$1.label = i2 - Integer.MIN_VALUE;
                Object obj = explorerExperimentRepository$getZoomToResolutionList$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = explorerExperimentRepository$getZoomToResolutionList$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 t1b0Var = (t1b0) this.b.getValue();
                    explorerExperimentRepository$getZoomToResolutionList$1.label = 1;
                    obj = t1b0Var.b(explorerExperimentRepository$getZoomToResolutionList$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((ExplorerExperiment) obj).e;
            }
        }
        explorerExperimentRepository$getZoomToResolutionList$1 = new ExplorerExperimentRepository$getZoomToResolutionList$1(this, continuationImpl);
        Object obj2 = explorerExperimentRepository$getZoomToResolutionList$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = explorerExperimentRepository$getZoomToResolutionList$1.label;
        if (i != 0) {
        }
        return ((ExplorerExperiment) obj2).e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ExplorerExperimentRepository$isEnabled$1 explorerExperimentRepository$isEnabled$1;
        int i;
        if (continuationImpl instanceof ExplorerExperimentRepository$isEnabled$1) {
            explorerExperimentRepository$isEnabled$1 = (ExplorerExperimentRepository$isEnabled$1) continuationImpl;
            int i2 = explorerExperimentRepository$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                explorerExperimentRepository$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = explorerExperimentRepository$isEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = explorerExperimentRepository$isEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 t1b0Var = (t1b0) this.b.getValue();
                    explorerExperimentRepository$isEnabled$1.label = 1;
                    obj = t1b0Var.b(explorerExperimentRepository$isEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((ExplorerExperiment) obj).c);
            }
        }
        explorerExperimentRepository$isEnabled$1 = new ExplorerExperimentRepository$isEnabled$1(this, continuationImpl);
        Object obj2 = explorerExperimentRepository$isEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = explorerExperimentRepository$isEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((ExplorerExperiment) obj2).c);
    }
}
