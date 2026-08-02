package com.yandex.go.taxi.summary.verticalsummary.repository;

import android.graphics.Rect;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        VerticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1 verticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof VerticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1) {
            verticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1 = (VerticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = verticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = verticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Iterator it = ((Map) obj).values().iterator();
                    if (!it.hasNext()) {
                        w511.x("Empty collection can't be reduced.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        Rect rect = (Rect) it.next();
                        Rect rect2 = (Rect) next;
                        next = new Rect(rect2.left + rect.left, rect2.top + rect.top, rect2.right + rect.right, rect2.bottom + rect.bottom);
                    }
                    verticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1.L$0 = null;
                    verticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1.L$1 = null;
                    verticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1.L$2 = null;
                    verticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1.L$3 = null;
                    verticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(next, verticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        verticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1 = new VerticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = verticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verticalSummaryFocusCoordinatorRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
