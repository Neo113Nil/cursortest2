package com.yandex.go.taxi.order.details.v2.analytics.perf;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/yandex/go/taxi/order/details/v2/analytics/perf/RideCardPerfAnalytics$FailureReason", "", "Lcom/yandex/go/taxi/order/details/v2/analytics/perf/RideCardPerfAnalytics$FailureReason;", "DETACH", "START_STATE_PROCESSING_TIMESTAMP", "COMPONENT_CREATION_TIME", "COMPONENT_CREATION_TIMESTAMP", "ATTACH_TIMESTAMP", "PRESENTATION", "STATE_PROCESSING_RECORD", "FIRST_SUBMIT_RECORD_START", "FIRST_SUBMIT_RECORD_END", "STATE_READY_RECORD", "LAST_SUBMIT_RECORD_START", "LAST_SUBMIT_RECORD_END", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardPerfAnalytics$FailureReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RideCardPerfAnalytics$FailureReason[] $VALUES;
    public static final RideCardPerfAnalytics$FailureReason ATTACH_TIMESTAMP;
    public static final RideCardPerfAnalytics$FailureReason COMPONENT_CREATION_TIME;
    public static final RideCardPerfAnalytics$FailureReason COMPONENT_CREATION_TIMESTAMP;
    public static final RideCardPerfAnalytics$FailureReason DETACH;
    public static final RideCardPerfAnalytics$FailureReason FIRST_SUBMIT_RECORD_END;
    public static final RideCardPerfAnalytics$FailureReason FIRST_SUBMIT_RECORD_START;
    public static final RideCardPerfAnalytics$FailureReason LAST_SUBMIT_RECORD_END;
    public static final RideCardPerfAnalytics$FailureReason LAST_SUBMIT_RECORD_START;
    public static final RideCardPerfAnalytics$FailureReason PRESENTATION;
    public static final RideCardPerfAnalytics$FailureReason START_STATE_PROCESSING_TIMESTAMP;
    public static final RideCardPerfAnalytics$FailureReason STATE_PROCESSING_RECORD;
    public static final RideCardPerfAnalytics$FailureReason STATE_READY_RECORD;

    static {
        RideCardPerfAnalytics$FailureReason rideCardPerfAnalytics$FailureReason = new RideCardPerfAnalytics$FailureReason("DETACH", 0);
        DETACH = rideCardPerfAnalytics$FailureReason;
        RideCardPerfAnalytics$FailureReason rideCardPerfAnalytics$FailureReason2 = new RideCardPerfAnalytics$FailureReason("START_STATE_PROCESSING_TIMESTAMP", 1);
        START_STATE_PROCESSING_TIMESTAMP = rideCardPerfAnalytics$FailureReason2;
        RideCardPerfAnalytics$FailureReason rideCardPerfAnalytics$FailureReason3 = new RideCardPerfAnalytics$FailureReason("COMPONENT_CREATION_TIME", 2);
        COMPONENT_CREATION_TIME = rideCardPerfAnalytics$FailureReason3;
        RideCardPerfAnalytics$FailureReason rideCardPerfAnalytics$FailureReason4 = new RideCardPerfAnalytics$FailureReason("COMPONENT_CREATION_TIMESTAMP", 3);
        COMPONENT_CREATION_TIMESTAMP = rideCardPerfAnalytics$FailureReason4;
        RideCardPerfAnalytics$FailureReason rideCardPerfAnalytics$FailureReason5 = new RideCardPerfAnalytics$FailureReason("ATTACH_TIMESTAMP", 4);
        ATTACH_TIMESTAMP = rideCardPerfAnalytics$FailureReason5;
        RideCardPerfAnalytics$FailureReason rideCardPerfAnalytics$FailureReason6 = new RideCardPerfAnalytics$FailureReason("PRESENTATION", 5);
        PRESENTATION = rideCardPerfAnalytics$FailureReason6;
        RideCardPerfAnalytics$FailureReason rideCardPerfAnalytics$FailureReason7 = new RideCardPerfAnalytics$FailureReason("STATE_PROCESSING_RECORD", 6);
        STATE_PROCESSING_RECORD = rideCardPerfAnalytics$FailureReason7;
        RideCardPerfAnalytics$FailureReason rideCardPerfAnalytics$FailureReason8 = new RideCardPerfAnalytics$FailureReason("FIRST_SUBMIT_RECORD_START", 7);
        FIRST_SUBMIT_RECORD_START = rideCardPerfAnalytics$FailureReason8;
        RideCardPerfAnalytics$FailureReason rideCardPerfAnalytics$FailureReason9 = new RideCardPerfAnalytics$FailureReason("FIRST_SUBMIT_RECORD_END", 8);
        FIRST_SUBMIT_RECORD_END = rideCardPerfAnalytics$FailureReason9;
        RideCardPerfAnalytics$FailureReason rideCardPerfAnalytics$FailureReason10 = new RideCardPerfAnalytics$FailureReason("STATE_READY_RECORD", 9);
        STATE_READY_RECORD = rideCardPerfAnalytics$FailureReason10;
        RideCardPerfAnalytics$FailureReason rideCardPerfAnalytics$FailureReason11 = new RideCardPerfAnalytics$FailureReason("LAST_SUBMIT_RECORD_START", 10);
        LAST_SUBMIT_RECORD_START = rideCardPerfAnalytics$FailureReason11;
        RideCardPerfAnalytics$FailureReason rideCardPerfAnalytics$FailureReason12 = new RideCardPerfAnalytics$FailureReason("LAST_SUBMIT_RECORD_END", 11);
        LAST_SUBMIT_RECORD_END = rideCardPerfAnalytics$FailureReason12;
        RideCardPerfAnalytics$FailureReason[] rideCardPerfAnalytics$FailureReasonArr = {rideCardPerfAnalytics$FailureReason, rideCardPerfAnalytics$FailureReason2, rideCardPerfAnalytics$FailureReason3, rideCardPerfAnalytics$FailureReason4, rideCardPerfAnalytics$FailureReason5, rideCardPerfAnalytics$FailureReason6, rideCardPerfAnalytics$FailureReason7, rideCardPerfAnalytics$FailureReason8, rideCardPerfAnalytics$FailureReason9, rideCardPerfAnalytics$FailureReason10, rideCardPerfAnalytics$FailureReason11, rideCardPerfAnalytics$FailureReason12};
        $VALUES = rideCardPerfAnalytics$FailureReasonArr;
        $ENTRIES = kotlin.enums.a.a(rideCardPerfAnalytics$FailureReasonArr);
    }

    public static RideCardPerfAnalytics$FailureReason valueOf(String str) {
        return (RideCardPerfAnalytics$FailureReason) Enum.valueOf(RideCardPerfAnalytics$FailureReason.class, str);
    }

    public static RideCardPerfAnalytics$FailureReason[] values() {
        return (RideCardPerfAnalytics$FailureReason[]) $VALUES.clone();
    }
}
