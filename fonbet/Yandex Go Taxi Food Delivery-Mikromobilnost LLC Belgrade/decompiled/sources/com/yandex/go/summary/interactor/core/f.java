package com.yandex.go.summary.interactor.core;

import defpackage.ch6;
import defpackage.dtr0;
import defpackage.jdv0;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ jdv0 b;

    public f(vpr vprVar, jdv0 jdv0Var) {
        this.a = vprVar;
        this.b = jdv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1 summaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SummaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1) {
            summaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1 = (SummaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1) continuation;
            int i2 = summaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = summaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    ch6 ch6Var = (ch6) rsnVar.a;
                    ch6 ch6Var2 = (ch6) rsnVar.b;
                    this.b.getClass();
                    int i3 = ch6Var2.a;
                    int i4 = (i3 != -2 || ch6Var2.b) ? 6 : 3;
                    dtr0 dtr0Var = ch6Var != null ? new dtr0(ch6Var.a) : null;
                    Pair pair = new Pair(new Integer(i4), Boolean.valueOf((ch6Var2.c && (dtr0Var != null && dtr0Var.a == i3)) ? false : true));
                    summaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1.L$0 = null;
                    summaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1.L$1 = null;
                    summaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1.L$2 = null;
                    summaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1.L$3 = null;
                    summaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, summaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1) == coroutineSingletons) {
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
        summaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1 = new SummaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1(this, continuation);
        Object obj22 = summaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryBottomSheetStateInteractor$collectAnchorBottomSheetBehaviorStateChangedAnalytics$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
