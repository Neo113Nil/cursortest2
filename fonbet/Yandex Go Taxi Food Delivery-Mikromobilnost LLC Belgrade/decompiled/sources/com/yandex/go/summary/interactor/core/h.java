package com.yandex.go.summary.interactor.core;

import defpackage.ch6;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;

    public h(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1 summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof SummaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1) {
            summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1 = (SummaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1) continuation;
            int i2 = summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    ch6 ch6Var = (ch6) rsnVar.a;
                    ch6 ch6Var2 = (ch6) rsnVar.b;
                    if (ch6Var != null) {
                        int i3 = ch6Var.a;
                        boolean z = ch6Var.b;
                        boolean z2 = false;
                        boolean z3 = (z || !ch6Var2.b || i3 == -2) ? false : true;
                        boolean z4 = !ch6Var.c && ch6Var2.c && ch6Var2.a == -2 && !z;
                        if (i3 != -2 && ch6Var2.a == -2 && !ch6Var2.c) {
                            z2 = true;
                        }
                        if (z3 || z4 || z2) {
                            summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1.L$0 = null;
                            summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1.L$1 = null;
                            summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1.L$2 = null;
                            summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1.L$3 = null;
                            summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1.label = 1;
                            if (this.a.emit(obj, summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
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
        summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1 = new SummaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryBottomSheetStateInteractor$collectEtaHighlightingMulticlass$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
