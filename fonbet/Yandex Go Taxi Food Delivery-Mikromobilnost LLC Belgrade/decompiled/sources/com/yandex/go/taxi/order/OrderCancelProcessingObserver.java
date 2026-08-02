package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.models.api.ChangeOrderState$Pending;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.bvf0;
import defpackage.k4o;
import defpackage.o2y0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class OrderCancelProcessingObserver {
    public final r0 a = bvf0.c(new t(null, ProcessingState.DEFAULT));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/OrderCancelProcessingObserver$ProcessingState;", "", "STARTED", "COMPLETE", "ERROR", "DEFAULT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ProcessingState {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ProcessingState[] $VALUES;
        public static final ProcessingState COMPLETE;
        public static final ProcessingState DEFAULT;
        public static final ProcessingState ERROR;
        public static final ProcessingState STARTED;

        static {
            ProcessingState processingState = new ProcessingState("STARTED", 0);
            STARTED = processingState;
            ProcessingState processingState2 = new ProcessingState("COMPLETE", 1);
            COMPLETE = processingState2;
            ProcessingState processingState3 = new ProcessingState("ERROR", 2);
            ERROR = processingState3;
            ProcessingState processingState4 = new ProcessingState("DEFAULT", 3);
            DEFAULT = processingState4;
            ProcessingState[] processingStateArr = {processingState, processingState2, processingState3, processingState4};
            $VALUES = processingStateArr;
            $ENTRIES = kotlin.enums.a.a(processingStateArr);
        }

        public static ProcessingState valueOf(String str) {
            return (ProcessingState) Enum.valueOf(ProcessingState.class, str);
        }

        public static ProcessingState[] values() {
            return (ProcessingState[]) $VALUES.clone();
        }
    }

    public final void a(o2y0 o2y0Var) {
        Object value;
        TaxiOrder taxiOrder;
        r0 r0Var = o2y0Var.a;
        do {
            value = r0Var.getValue();
            taxiOrder = (TaxiOrder) value;
            taxiOrder.L(new ChangeOrderState$Pending(null, ChangeOrderState$Source.CANCEL));
        } while (!r0Var.k(value, taxiOrder));
        o2y0Var.f();
        t tVar = new t(o2y0Var, ProcessingState.ERROR);
        r0 r0Var2 = this.a;
        r0Var2.getClass();
        r0Var2.m(null, tVar);
    }
}
