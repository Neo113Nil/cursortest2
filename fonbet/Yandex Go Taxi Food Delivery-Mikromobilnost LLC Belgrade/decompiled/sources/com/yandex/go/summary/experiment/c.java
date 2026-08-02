package com.yandex.go.summary.experiment;

import defpackage.hhd;
import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ hhd b;
    public final /* synthetic */ String c;

    public c(mth mthVar, hhd hhdVar, String str) {
        this.a = mthVar;
        this.b = hhdVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ComposeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1 composeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof ComposeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1) {
            composeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1 = (ComposeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1) continuation;
            int i2 = composeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                composeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = composeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = composeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b, this.c);
                    composeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.L$0 = null;
                    composeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.L$1 = null;
                    composeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.L$2 = null;
                    composeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, composeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        composeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1 = new ComposeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = composeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = composeSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
