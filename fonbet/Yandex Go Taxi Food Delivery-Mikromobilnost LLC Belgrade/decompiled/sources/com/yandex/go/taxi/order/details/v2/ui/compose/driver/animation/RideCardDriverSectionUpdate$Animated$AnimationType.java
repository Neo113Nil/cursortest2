package com.yandex.go.taxi.order.details.v2.ui.compose.driver.animation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/taxi/order/details/v2/ui/compose/driver/animation/RideCardDriverSectionUpdate$Animated$AnimationType", "", "Lcom/yandex/go/taxi/order/details/v2/ui/compose/driver/animation/RideCardDriverSectionUpdate$Animated$AnimationType;", "FROM_SEARCHING", "TO_SEARCHING", "THROUGH_COLLAPSE", "WAITING_RESPONSE_TO_REJECTED", "WAITING_RESPONSE_TO_ASSIGNED_DRIVER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardDriverSectionUpdate$Animated$AnimationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RideCardDriverSectionUpdate$Animated$AnimationType[] $VALUES;
    public static final RideCardDriverSectionUpdate$Animated$AnimationType FROM_SEARCHING;
    public static final RideCardDriverSectionUpdate$Animated$AnimationType THROUGH_COLLAPSE;
    public static final RideCardDriverSectionUpdate$Animated$AnimationType TO_SEARCHING;
    public static final RideCardDriverSectionUpdate$Animated$AnimationType WAITING_RESPONSE_TO_ASSIGNED_DRIVER;
    public static final RideCardDriverSectionUpdate$Animated$AnimationType WAITING_RESPONSE_TO_REJECTED;

    static {
        RideCardDriverSectionUpdate$Animated$AnimationType rideCardDriverSectionUpdate$Animated$AnimationType = new RideCardDriverSectionUpdate$Animated$AnimationType("FROM_SEARCHING", 0);
        FROM_SEARCHING = rideCardDriverSectionUpdate$Animated$AnimationType;
        RideCardDriverSectionUpdate$Animated$AnimationType rideCardDriverSectionUpdate$Animated$AnimationType2 = new RideCardDriverSectionUpdate$Animated$AnimationType("TO_SEARCHING", 1);
        TO_SEARCHING = rideCardDriverSectionUpdate$Animated$AnimationType2;
        RideCardDriverSectionUpdate$Animated$AnimationType rideCardDriverSectionUpdate$Animated$AnimationType3 = new RideCardDriverSectionUpdate$Animated$AnimationType("THROUGH_COLLAPSE", 2);
        THROUGH_COLLAPSE = rideCardDriverSectionUpdate$Animated$AnimationType3;
        RideCardDriverSectionUpdate$Animated$AnimationType rideCardDriverSectionUpdate$Animated$AnimationType4 = new RideCardDriverSectionUpdate$Animated$AnimationType("WAITING_RESPONSE_TO_REJECTED", 3);
        WAITING_RESPONSE_TO_REJECTED = rideCardDriverSectionUpdate$Animated$AnimationType4;
        RideCardDriverSectionUpdate$Animated$AnimationType rideCardDriverSectionUpdate$Animated$AnimationType5 = new RideCardDriverSectionUpdate$Animated$AnimationType("WAITING_RESPONSE_TO_ASSIGNED_DRIVER", 4);
        WAITING_RESPONSE_TO_ASSIGNED_DRIVER = rideCardDriverSectionUpdate$Animated$AnimationType5;
        RideCardDriverSectionUpdate$Animated$AnimationType[] rideCardDriverSectionUpdate$Animated$AnimationTypeArr = {rideCardDriverSectionUpdate$Animated$AnimationType, rideCardDriverSectionUpdate$Animated$AnimationType2, rideCardDriverSectionUpdate$Animated$AnimationType3, rideCardDriverSectionUpdate$Animated$AnimationType4, rideCardDriverSectionUpdate$Animated$AnimationType5};
        $VALUES = rideCardDriverSectionUpdate$Animated$AnimationTypeArr;
        $ENTRIES = kotlin.enums.a.a(rideCardDriverSectionUpdate$Animated$AnimationTypeArr);
    }

    public static RideCardDriverSectionUpdate$Animated$AnimationType valueOf(String str) {
        return (RideCardDriverSectionUpdate$Animated$AnimationType) Enum.valueOf(RideCardDriverSectionUpdate$Animated$AnimationType.class, str);
    }

    public static RideCardDriverSectionUpdate$Animated$AnimationType[] values() {
        return (RideCardDriverSectionUpdate$Animated$AnimationType[]) $VALUES.clone();
    }
}
