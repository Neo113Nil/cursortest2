package com.yandex.go.summary.ui.compose.common.bottomsheet;

import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wg6;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements tpr {
    public final /* synthetic */ rol0 a;
    public final /* synthetic */ wg6 b;
    public final /* synthetic */ int c;

    public d(rol0 rol0Var, wg6 wg6Var, int i) {
        this.a = rol0Var;
        this.b = wg6Var;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SummaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1 summaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof SummaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1) {
            summaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1 = (SummaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = summaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = summaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b, this.c);
                    summaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    summaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    summaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    summaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, summaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        summaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1 = new SummaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = summaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryModalBottomSheetKt$SendAnchoredBottomSheetHeightChangedUiActionEffect$1$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
