package com.yandex.go.taxi.summary.interactor;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class o implements tpr {
    public final /* synthetic */ jqr a;

    public o(jqr jqrVar) {
        this.a = jqrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1 summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1;
        int i;
        if (continuation instanceof SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1) {
            summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1 = (SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1) continuation;
            int i2 = summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n nVar = new n();
                    summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1.L$0 = null;
                    summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1.L$1 = null;
                    summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1.L$2 = null;
                    summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(nVar, summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1) == coroutineSingletons) {
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
        summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1 = new SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1(this, continuation);
        Object obj2 = summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
