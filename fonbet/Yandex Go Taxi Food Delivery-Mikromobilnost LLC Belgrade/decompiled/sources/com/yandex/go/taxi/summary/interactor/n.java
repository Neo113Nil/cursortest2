package com.yandex.go.taxi.summary.interactor;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class n implements vpr {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$2$1 summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$2$1) {
            summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$2$1 = (SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$2$1) continuation;
            int i2 = summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                kotlin.b.b(obj2);
                return zy11.a;
            }
        }
        summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$2$1 = new SummarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summarySourceDestinationModelInteractor$updateSourceDestinationFlow$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        kotlin.b.b(obj22);
        return zy11.a;
    }
}
