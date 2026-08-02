package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.OrderCancelProcessingObserver;
import defpackage.jl40;
import defpackage.o2y0;
import defpackage.w511;

/* loaded from: classes14.dex */
public final class t {
    public final o2y0 a;
    public final OrderCancelProcessingObserver.ProcessingState b;

    public t(o2y0 o2y0Var, OrderCancelProcessingObserver.ProcessingState processingState) {
        this.a = o2y0Var;
        this.b = processingState;
    }

    public final boolean a(o2y0 o2y0Var) {
        int i = s.a[this.b.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i == 3) {
            return true;
        }
        if (i == 4) {
            return !jl40.l(this.a, o2y0Var);
        }
        w511.b();
        return false;
    }
}
