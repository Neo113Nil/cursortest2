package com.yandex.go.taxi.order.details.v2.state;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/details/v2/state/RideCardState$ProcessingStep", "", "Lcom/yandex/go/taxi/order/details/v2/state/RideCardState$ProcessingStep;", "EMPTY", "PROCESSING", "READY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardState$ProcessingStep {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RideCardState$ProcessingStep[] $VALUES;
    public static final RideCardState$ProcessingStep EMPTY;
    public static final RideCardState$ProcessingStep PROCESSING;
    public static final RideCardState$ProcessingStep READY;

    static {
        RideCardState$ProcessingStep rideCardState$ProcessingStep = new RideCardState$ProcessingStep("EMPTY", 0);
        EMPTY = rideCardState$ProcessingStep;
        RideCardState$ProcessingStep rideCardState$ProcessingStep2 = new RideCardState$ProcessingStep("PROCESSING", 1);
        PROCESSING = rideCardState$ProcessingStep2;
        RideCardState$ProcessingStep rideCardState$ProcessingStep3 = new RideCardState$ProcessingStep("READY", 2);
        READY = rideCardState$ProcessingStep3;
        RideCardState$ProcessingStep[] rideCardState$ProcessingStepArr = {rideCardState$ProcessingStep, rideCardState$ProcessingStep2, rideCardState$ProcessingStep3};
        $VALUES = rideCardState$ProcessingStepArr;
        $ENTRIES = kotlin.enums.a.a(rideCardState$ProcessingStepArr);
    }

    public static RideCardState$ProcessingStep valueOf(String str) {
        return (RideCardState$ProcessingStep) Enum.valueOf(RideCardState$ProcessingStep.class, str);
    }

    public static RideCardState$ProcessingStep[] values() {
        return (RideCardState$ProcessingStep[]) $VALUES.clone();
    }
}
