package com.yandex.go.taxi.order.details.v2.core.availability;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/taxi/order/details/v2/core/availability/RideCardAvailability$Fallback$Reason", "", "Lcom/yandex/go/taxi/order/details/v2/core/availability/RideCardAvailability$Fallback$Reason;", "PRESENTATION_NOT_SUPPORTED", "NO_STATUS_INFO", "NO_RIDE_CARD_INFO", "EMPTY_ITEMS", "EMPTY_PRESENTATION_DETAILS", "EMPTY_PRESENTATION_COMPACT", "CHECK_IN", "FEATURE_TOGGLE_FORCE_LEGACY_CARD", "A11Y", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardAvailability$Fallback$Reason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RideCardAvailability$Fallback$Reason[] $VALUES;
    public static final RideCardAvailability$Fallback$Reason A11Y;
    public static final RideCardAvailability$Fallback$Reason CHECK_IN;
    public static final RideCardAvailability$Fallback$Reason EMPTY_ITEMS;
    public static final RideCardAvailability$Fallback$Reason EMPTY_PRESENTATION_COMPACT;
    public static final RideCardAvailability$Fallback$Reason EMPTY_PRESENTATION_DETAILS;
    public static final RideCardAvailability$Fallback$Reason FEATURE_TOGGLE_FORCE_LEGACY_CARD;
    public static final RideCardAvailability$Fallback$Reason NO_RIDE_CARD_INFO;
    public static final RideCardAvailability$Fallback$Reason NO_STATUS_INFO;
    public static final RideCardAvailability$Fallback$Reason PRESENTATION_NOT_SUPPORTED;

    static {
        RideCardAvailability$Fallback$Reason rideCardAvailability$Fallback$Reason = new RideCardAvailability$Fallback$Reason("PRESENTATION_NOT_SUPPORTED", 0);
        PRESENTATION_NOT_SUPPORTED = rideCardAvailability$Fallback$Reason;
        RideCardAvailability$Fallback$Reason rideCardAvailability$Fallback$Reason2 = new RideCardAvailability$Fallback$Reason("NO_STATUS_INFO", 1);
        NO_STATUS_INFO = rideCardAvailability$Fallback$Reason2;
        RideCardAvailability$Fallback$Reason rideCardAvailability$Fallback$Reason3 = new RideCardAvailability$Fallback$Reason("NO_RIDE_CARD_INFO", 2);
        NO_RIDE_CARD_INFO = rideCardAvailability$Fallback$Reason3;
        RideCardAvailability$Fallback$Reason rideCardAvailability$Fallback$Reason4 = new RideCardAvailability$Fallback$Reason("EMPTY_ITEMS", 3);
        EMPTY_ITEMS = rideCardAvailability$Fallback$Reason4;
        RideCardAvailability$Fallback$Reason rideCardAvailability$Fallback$Reason5 = new RideCardAvailability$Fallback$Reason("EMPTY_PRESENTATION_DETAILS", 4);
        EMPTY_PRESENTATION_DETAILS = rideCardAvailability$Fallback$Reason5;
        RideCardAvailability$Fallback$Reason rideCardAvailability$Fallback$Reason6 = new RideCardAvailability$Fallback$Reason("EMPTY_PRESENTATION_COMPACT", 5);
        EMPTY_PRESENTATION_COMPACT = rideCardAvailability$Fallback$Reason6;
        RideCardAvailability$Fallback$Reason rideCardAvailability$Fallback$Reason7 = new RideCardAvailability$Fallback$Reason("CHECK_IN", 6);
        CHECK_IN = rideCardAvailability$Fallback$Reason7;
        RideCardAvailability$Fallback$Reason rideCardAvailability$Fallback$Reason8 = new RideCardAvailability$Fallback$Reason("FEATURE_TOGGLE_FORCE_LEGACY_CARD", 7);
        FEATURE_TOGGLE_FORCE_LEGACY_CARD = rideCardAvailability$Fallback$Reason8;
        RideCardAvailability$Fallback$Reason rideCardAvailability$Fallback$Reason9 = new RideCardAvailability$Fallback$Reason("A11Y", 8);
        A11Y = rideCardAvailability$Fallback$Reason9;
        RideCardAvailability$Fallback$Reason[] rideCardAvailability$Fallback$ReasonArr = {rideCardAvailability$Fallback$Reason, rideCardAvailability$Fallback$Reason2, rideCardAvailability$Fallback$Reason3, rideCardAvailability$Fallback$Reason4, rideCardAvailability$Fallback$Reason5, rideCardAvailability$Fallback$Reason6, rideCardAvailability$Fallback$Reason7, rideCardAvailability$Fallback$Reason8, rideCardAvailability$Fallback$Reason9};
        $VALUES = rideCardAvailability$Fallback$ReasonArr;
        $ENTRIES = kotlin.enums.a.a(rideCardAvailability$Fallback$ReasonArr);
    }

    public static RideCardAvailability$Fallback$Reason valueOf(String str) {
        return (RideCardAvailability$Fallback$Reason) Enum.valueOf(RideCardAvailability$Fallback$Reason.class, str);
    }

    public static RideCardAvailability$Fallback$Reason[] values() {
        return (RideCardAvailability$Fallback$Reason[]) $VALUES.clone();
    }
}
