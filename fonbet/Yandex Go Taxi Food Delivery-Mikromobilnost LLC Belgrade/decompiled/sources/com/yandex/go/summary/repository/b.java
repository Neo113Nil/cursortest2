package com.yandex.go.summary.repository;

import android.graphics.Rect;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import java.util.Collection;
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1 summaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1;
        int i;
        Rect rect;
        if (continuation instanceof SummaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1) {
            summaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1 = (SummaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = summaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = summaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Collection values = ((Map) obj).values();
                    if (values.isEmpty()) {
                        rect = null;
                    } else {
                        Iterator it = values.iterator();
                        if (!it.hasNext()) {
                            w511.x("Empty collection can't be reduced.");
                            return null;
                        }
                        Object next = it.next();
                        while (it.hasNext()) {
                            Rect rect2 = (Rect) it.next();
                            Rect rect3 = (Rect) next;
                            next = new Rect(rect3.left + rect2.left, rect3.top + rect2.top, rect3.right + rect2.right, rect3.bottom + rect2.bottom);
                        }
                        rect = (Rect) next;
                    }
                    if (rect != null) {
                        summaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1.L$0 = null;
                        summaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1.L$1 = null;
                        summaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1.L$2 = null;
                        summaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1.L$3 = null;
                        summaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1.L$4 = null;
                        summaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(rect, summaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        summaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1 = new SummaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = summaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryFocusCoordinatorRepository$special$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
