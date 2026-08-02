package com.yandex.go.taxi.summary.shared.models;

import defpackage.ny61;
import defpackage.oxs0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ oxs0 b;

    public b(vpr vprVar, oxs0 oxs0Var) {
        this.a = vprVar;
        this.b = oxs0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SmallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1 smallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SmallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1) {
            smallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1 = (SmallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1) continuation;
            int i2 = smallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                smallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = smallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = smallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    oxs0 oxs0Var = this.b;
                    oxs0Var.getClass();
                    Boolean valueOf = Boolean.valueOf(((SmallSummaryConfigExperiment) obj).c >= ((Number) oxs0Var.c.getValue()).floatValue());
                    smallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1.L$0 = null;
                    smallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1.L$1 = null;
                    smallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1.L$2 = null;
                    smallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1.L$3 = null;
                    smallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, smallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        smallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1 = new SmallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = smallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = smallSummaryConfigExperimentRepository$isSmallScreenFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
