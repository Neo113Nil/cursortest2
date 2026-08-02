package com.yandex.go.summary.interactor.core;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class i implements tpr {
    public final /* synthetic */ mth a;

    public i(mth mthVar) {
        this.a = mthVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SummaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1 summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1;
        int i;
        if (continuation instanceof SummaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1) {
            summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1 = (SummaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1) continuation;
            int i2 = summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = new h(vprVar);
                    summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1.L$0 = null;
                    summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1.L$1 = null;
                    summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1.L$2 = null;
                    summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(hVar, summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1) == coroutineSingletons) {
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
        summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1 = new SummaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1(this, continuation);
        Object obj2 = summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
