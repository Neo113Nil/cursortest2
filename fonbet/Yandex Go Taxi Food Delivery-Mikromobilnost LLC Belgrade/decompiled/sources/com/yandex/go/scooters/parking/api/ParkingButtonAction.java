package com.yandex.go.scooters.parking.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/scooters/parking/api/ParkingButtonAction;", "", "BUILD_ROUTE", "DONE", "go-client-android.features.scooters.parking:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ParkingButtonAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ParkingButtonAction[] $VALUES;
    public static final ParkingButtonAction BUILD_ROUTE;
    public static final ParkingButtonAction DONE;

    static {
        ParkingButtonAction parkingButtonAction = new ParkingButtonAction("BUILD_ROUTE", 0);
        BUILD_ROUTE = parkingButtonAction;
        ParkingButtonAction parkingButtonAction2 = new ParkingButtonAction("DONE", 1);
        DONE = parkingButtonAction2;
        ParkingButtonAction[] parkingButtonActionArr = {parkingButtonAction, parkingButtonAction2};
        $VALUES = parkingButtonActionArr;
        $ENTRIES = a.a(parkingButtonActionArr);
    }

    public static ParkingButtonAction valueOf(String str) {
        return (ParkingButtonAction) Enum.valueOf(ParkingButtonAction.class, str);
    }

    public static ParkingButtonAction[] values() {
        return (ParkingButtonAction[]) $VALUES.clone();
    }
}
