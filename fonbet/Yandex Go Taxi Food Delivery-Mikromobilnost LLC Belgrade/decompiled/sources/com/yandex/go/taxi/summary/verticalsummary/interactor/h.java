package com.yandex.go.taxi.summary.verticalsummary.interactor;

import android.graphics.Rect;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.uio0;
import defpackage.vhv0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ uio0 b;

    public h(vpr vprVar, uio0 uio0Var) {
        this.a = vprVar;
        this.b = uio0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        VerticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1 verticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof VerticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1) {
            verticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1 = (VerticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1) continuation;
            int i2 = verticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = verticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vhv0 vhv0Var = (vhv0) obj;
                    boolean z = vhv0Var.a;
                    uio0 uio0Var = this.b;
                    int intValue = z ? 0 : ((Number) ((i3y) uio0Var.b).getValue()).intValue();
                    int i3 = vhv0Var.c;
                    int intValue2 = i3 > 0 ? ((Number) ((i3y) uio0Var.e).getValue()).intValue() + i3 : 0;
                    int max = Math.max(vhv0Var.d - ((Number) ((i3y) uio0Var.f).getValue()).intValue(), 0);
                    int intValue3 = vhv0Var.a ? ((Number) ((i3y) uio0Var.d).getValue()).intValue() : 0;
                    Rect rect = vhv0Var.b;
                    Rect rect2 = new Rect(rect.left, rect.height() + intValue + intValue2 + max, rect.right, rect.height() + intValue3);
                    verticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    verticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    verticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    verticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    verticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(rect2, verticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        verticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1 = new VerticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = verticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalSummaryExternalFocusMarginsInteractor$stateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
