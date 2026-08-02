package com.yandex.go.taxi.summary.interactor;

import defpackage.ny61;
import defpackage.oct0;
import defpackage.qct0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.address.experiment.r;

/* loaded from: classes14.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;

    public h(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1 summaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof SummaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1) {
            summaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1 = (SummaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = summaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = summaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    qct0 qct0Var = (qct0) obj;
                    r rVar = qct0Var instanceof oct0 ? ((oct0) qct0Var).a : null;
                    if (rVar != null) {
                        summaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        summaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        summaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        summaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        summaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        summaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(rVar, summaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        summaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1 = new SummaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = summaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryRouteBlockStateInteractor$visibleRouteBlockDataFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
