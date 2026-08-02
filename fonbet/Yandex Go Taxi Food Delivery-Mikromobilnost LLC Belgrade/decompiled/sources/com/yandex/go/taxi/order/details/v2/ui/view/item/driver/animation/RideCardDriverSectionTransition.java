package com.yandex.go.taxi.order.details.v2.ui.view.item.driver.animation;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/go/taxi/order/details/v2/ui/view/item/driver/animation/RideCardDriverSectionTransition;", "", "PLAIN_CONTENT_CHANGE", "SEARCHING_TO_WAITING_RESPONSE", "SEARCHING_TO_REJECTED", "SEARCHING_TO_ASSIGNED_DRIVER", "WAITING_RESPONSE_TO_REJECTED", "WAITING_RESPONSE_TO_ASSIGNED_DRIVER", "WAITING_RESPONSE_TO_SEARCHING", "WAITING_RESPONSE_CANDIDATE_CHANGE", "REJECTED_TO_SEARCHING", "REJECTED_TO_WAITING_RESPONSE", "REJECTED_TO_ASSIGNED_DRIVER", "REJECTED_CANDIDATE_CHANGE", "ASSIGNED_DRIVER_TO_SEARCHING", "ASSIGNED_DRIVER_TO_WAITING_RESPONSE", "ASSIGNED_DRIVER_TO_REJECTED", "ASSIGNED_DRIVER_CONTENT_CHANGE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardDriverSectionTransition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RideCardDriverSectionTransition[] $VALUES;
    public static final RideCardDriverSectionTransition ASSIGNED_DRIVER_CONTENT_CHANGE;
    public static final RideCardDriverSectionTransition ASSIGNED_DRIVER_TO_REJECTED;
    public static final RideCardDriverSectionTransition ASSIGNED_DRIVER_TO_SEARCHING;
    public static final RideCardDriverSectionTransition ASSIGNED_DRIVER_TO_WAITING_RESPONSE;
    public static final RideCardDriverSectionTransition PLAIN_CONTENT_CHANGE;
    public static final RideCardDriverSectionTransition REJECTED_CANDIDATE_CHANGE;
    public static final RideCardDriverSectionTransition REJECTED_TO_ASSIGNED_DRIVER;
    public static final RideCardDriverSectionTransition REJECTED_TO_SEARCHING;
    public static final RideCardDriverSectionTransition REJECTED_TO_WAITING_RESPONSE;
    public static final RideCardDriverSectionTransition SEARCHING_TO_ASSIGNED_DRIVER;
    public static final RideCardDriverSectionTransition SEARCHING_TO_REJECTED;
    public static final RideCardDriverSectionTransition SEARCHING_TO_WAITING_RESPONSE;
    public static final RideCardDriverSectionTransition WAITING_RESPONSE_CANDIDATE_CHANGE;
    public static final RideCardDriverSectionTransition WAITING_RESPONSE_TO_ASSIGNED_DRIVER;
    public static final RideCardDriverSectionTransition WAITING_RESPONSE_TO_REJECTED;
    public static final RideCardDriverSectionTransition WAITING_RESPONSE_TO_SEARCHING;

    static {
        RideCardDriverSectionTransition rideCardDriverSectionTransition = new RideCardDriverSectionTransition("PLAIN_CONTENT_CHANGE", 0);
        PLAIN_CONTENT_CHANGE = rideCardDriverSectionTransition;
        RideCardDriverSectionTransition rideCardDriverSectionTransition2 = new RideCardDriverSectionTransition("SEARCHING_TO_WAITING_RESPONSE", 1);
        SEARCHING_TO_WAITING_RESPONSE = rideCardDriverSectionTransition2;
        RideCardDriverSectionTransition rideCardDriverSectionTransition3 = new RideCardDriverSectionTransition("SEARCHING_TO_REJECTED", 2);
        SEARCHING_TO_REJECTED = rideCardDriverSectionTransition3;
        RideCardDriverSectionTransition rideCardDriverSectionTransition4 = new RideCardDriverSectionTransition("SEARCHING_TO_ASSIGNED_DRIVER", 3);
        SEARCHING_TO_ASSIGNED_DRIVER = rideCardDriverSectionTransition4;
        RideCardDriverSectionTransition rideCardDriverSectionTransition5 = new RideCardDriverSectionTransition("WAITING_RESPONSE_TO_REJECTED", 4);
        WAITING_RESPONSE_TO_REJECTED = rideCardDriverSectionTransition5;
        RideCardDriverSectionTransition rideCardDriverSectionTransition6 = new RideCardDriverSectionTransition("WAITING_RESPONSE_TO_ASSIGNED_DRIVER", 5);
        WAITING_RESPONSE_TO_ASSIGNED_DRIVER = rideCardDriverSectionTransition6;
        RideCardDriverSectionTransition rideCardDriverSectionTransition7 = new RideCardDriverSectionTransition("WAITING_RESPONSE_TO_SEARCHING", 6);
        WAITING_RESPONSE_TO_SEARCHING = rideCardDriverSectionTransition7;
        RideCardDriverSectionTransition rideCardDriverSectionTransition8 = new RideCardDriverSectionTransition("WAITING_RESPONSE_CANDIDATE_CHANGE", 7);
        WAITING_RESPONSE_CANDIDATE_CHANGE = rideCardDriverSectionTransition8;
        RideCardDriverSectionTransition rideCardDriverSectionTransition9 = new RideCardDriverSectionTransition("REJECTED_TO_SEARCHING", 8);
        REJECTED_TO_SEARCHING = rideCardDriverSectionTransition9;
        RideCardDriverSectionTransition rideCardDriverSectionTransition10 = new RideCardDriverSectionTransition("REJECTED_TO_WAITING_RESPONSE", 9);
        REJECTED_TO_WAITING_RESPONSE = rideCardDriverSectionTransition10;
        RideCardDriverSectionTransition rideCardDriverSectionTransition11 = new RideCardDriverSectionTransition("REJECTED_TO_ASSIGNED_DRIVER", 10);
        REJECTED_TO_ASSIGNED_DRIVER = rideCardDriverSectionTransition11;
        RideCardDriverSectionTransition rideCardDriverSectionTransition12 = new RideCardDriverSectionTransition("REJECTED_CANDIDATE_CHANGE", 11);
        REJECTED_CANDIDATE_CHANGE = rideCardDriverSectionTransition12;
        RideCardDriverSectionTransition rideCardDriverSectionTransition13 = new RideCardDriverSectionTransition("ASSIGNED_DRIVER_TO_SEARCHING", 12);
        ASSIGNED_DRIVER_TO_SEARCHING = rideCardDriverSectionTransition13;
        RideCardDriverSectionTransition rideCardDriverSectionTransition14 = new RideCardDriverSectionTransition("ASSIGNED_DRIVER_TO_WAITING_RESPONSE", 13);
        ASSIGNED_DRIVER_TO_WAITING_RESPONSE = rideCardDriverSectionTransition14;
        RideCardDriverSectionTransition rideCardDriverSectionTransition15 = new RideCardDriverSectionTransition("ASSIGNED_DRIVER_TO_REJECTED", 14);
        ASSIGNED_DRIVER_TO_REJECTED = rideCardDriverSectionTransition15;
        RideCardDriverSectionTransition rideCardDriverSectionTransition16 = new RideCardDriverSectionTransition("ASSIGNED_DRIVER_CONTENT_CHANGE", 15);
        ASSIGNED_DRIVER_CONTENT_CHANGE = rideCardDriverSectionTransition16;
        RideCardDriverSectionTransition[] rideCardDriverSectionTransitionArr = {rideCardDriverSectionTransition, rideCardDriverSectionTransition2, rideCardDriverSectionTransition3, rideCardDriverSectionTransition4, rideCardDriverSectionTransition5, rideCardDriverSectionTransition6, rideCardDriverSectionTransition7, rideCardDriverSectionTransition8, rideCardDriverSectionTransition9, rideCardDriverSectionTransition10, rideCardDriverSectionTransition11, rideCardDriverSectionTransition12, rideCardDriverSectionTransition13, rideCardDriverSectionTransition14, rideCardDriverSectionTransition15, rideCardDriverSectionTransition16};
        $VALUES = rideCardDriverSectionTransitionArr;
        $ENTRIES = a.a(rideCardDriverSectionTransitionArr);
    }

    public static RideCardDriverSectionTransition valueOf(String str) {
        return (RideCardDriverSectionTransition) Enum.valueOf(RideCardDriverSectionTransition.class, str);
    }

    public static RideCardDriverSectionTransition[] values() {
        return (RideCardDriverSectionTransition[]) $VALUES.clone();
    }
}
