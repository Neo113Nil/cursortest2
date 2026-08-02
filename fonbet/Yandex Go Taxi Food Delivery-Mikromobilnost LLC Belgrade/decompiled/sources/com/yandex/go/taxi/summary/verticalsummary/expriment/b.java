package com.yandex.go.taxi.summary.verticalsummary.expriment;

import com.yandex.go.zone.model.Zone;
import defpackage.cg31;
import defpackage.ny61;
import defpackage.qn11;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar, cg31 cg31Var) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        VerticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1 verticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof VerticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1) {
            verticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1 = (VerticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1) continuation;
            int i2 = verticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = verticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    VerticalSelectorOnSummaryExperiment.Companion.getClass();
                    qn11 qn11Var = VerticalSelectorOnSummaryExperiment.g;
                    qn11 b = ((Zone) obj).b(VerticalSelectorOnSummaryExperiment.class);
                    if (b != null) {
                        qn11Var = b;
                    }
                    verticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1.L$0 = null;
                    verticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1.L$1 = null;
                    verticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1.L$2 = null;
                    verticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1.L$3 = null;
                    verticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit((VerticalSelectorOnSummaryExperiment) qn11Var, verticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        verticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1 = new VerticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = verticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalSelectorOnSummaryExperimentRepository$fullExperimentFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
