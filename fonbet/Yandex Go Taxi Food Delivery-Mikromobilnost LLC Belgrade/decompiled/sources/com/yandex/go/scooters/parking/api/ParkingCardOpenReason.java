package com.yandex.go.scooters.parking.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/parking/api/ParkingCardOpenReason;", "", "OFFER_SCREEN", "MAP_ON_ORDER", "MAP_ON_PREORDER", "CAMERA_ON_COMPLETION", "go-client-android.features.scooters.parking:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ParkingCardOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ParkingCardOpenReason[] $VALUES;
    public static final ParkingCardOpenReason CAMERA_ON_COMPLETION;
    public static final ParkingCardOpenReason MAP_ON_ORDER;
    public static final ParkingCardOpenReason MAP_ON_PREORDER;
    public static final ParkingCardOpenReason OFFER_SCREEN;

    static {
        ParkingCardOpenReason parkingCardOpenReason = new ParkingCardOpenReason("OFFER_SCREEN", 0);
        OFFER_SCREEN = parkingCardOpenReason;
        ParkingCardOpenReason parkingCardOpenReason2 = new ParkingCardOpenReason("MAP_ON_ORDER", 1);
        MAP_ON_ORDER = parkingCardOpenReason2;
        ParkingCardOpenReason parkingCardOpenReason3 = new ParkingCardOpenReason("MAP_ON_PREORDER", 2);
        MAP_ON_PREORDER = parkingCardOpenReason3;
        ParkingCardOpenReason parkingCardOpenReason4 = new ParkingCardOpenReason("CAMERA_ON_COMPLETION", 3);
        CAMERA_ON_COMPLETION = parkingCardOpenReason4;
        ParkingCardOpenReason[] parkingCardOpenReasonArr = {parkingCardOpenReason, parkingCardOpenReason2, parkingCardOpenReason3, parkingCardOpenReason4};
        $VALUES = parkingCardOpenReasonArr;
        $ENTRIES = a.a(parkingCardOpenReasonArr);
    }

    public static ParkingCardOpenReason valueOf(String str) {
        return (ParkingCardOpenReason) Enum.valueOf(ParkingCardOpenReason.class, str);
    }

    public static ParkingCardOpenReason[] values() {
        return (ParkingCardOpenReason[]) $VALUES.clone();
    }
}
