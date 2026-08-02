package com.yandex.go.taxi.summary.verticalsummary.expriment;

import defpackage.cg31;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ cg31 b;
    public final /* synthetic */ String c;

    public e(tpr tprVar, cg31 cg31Var, String str) {
        this.a = tprVar;
        this.b = cg31Var;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        VerticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1 verticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof VerticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1) {
            verticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1 = (VerticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1) continuation;
            int i2 = verticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = verticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b, this.c);
                    verticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.L$0 = null;
                    verticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.L$1 = null;
                    verticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.L$2 = null;
                    verticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, verticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        verticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1 = new VerticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = verticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalSelectorOnSummaryExperimentRepository$isSupportedForVerticalFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
