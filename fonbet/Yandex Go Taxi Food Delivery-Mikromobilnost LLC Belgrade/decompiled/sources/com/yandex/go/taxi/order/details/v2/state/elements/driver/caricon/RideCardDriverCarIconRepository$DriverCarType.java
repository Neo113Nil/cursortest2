package com.yandex.go.taxi.order.details.v2.state.elements.driver.caricon;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/details/v2/state/elements/driver/caricon/RideCardDriverCarIconRepository$DriverCarType", "", "Lcom/yandex/go/taxi/order/details/v2/state/elements/driver/caricon/RideCardDriverCarIconRepository$DriverCarType;", "FULL", "SIMPLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RideCardDriverCarIconRepository$DriverCarType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RideCardDriverCarIconRepository$DriverCarType[] $VALUES;
    public static final RideCardDriverCarIconRepository$DriverCarType FULL;
    public static final RideCardDriverCarIconRepository$DriverCarType SIMPLE;

    static {
        RideCardDriverCarIconRepository$DriverCarType rideCardDriverCarIconRepository$DriverCarType = new RideCardDriverCarIconRepository$DriverCarType("FULL", 0);
        FULL = rideCardDriverCarIconRepository$DriverCarType;
        RideCardDriverCarIconRepository$DriverCarType rideCardDriverCarIconRepository$DriverCarType2 = new RideCardDriverCarIconRepository$DriverCarType("SIMPLE", 1);
        SIMPLE = rideCardDriverCarIconRepository$DriverCarType2;
        RideCardDriverCarIconRepository$DriverCarType[] rideCardDriverCarIconRepository$DriverCarTypeArr = {rideCardDriverCarIconRepository$DriverCarType, rideCardDriverCarIconRepository$DriverCarType2};
        $VALUES = rideCardDriverCarIconRepository$DriverCarTypeArr;
        $ENTRIES = kotlin.enums.a.a(rideCardDriverCarIconRepository$DriverCarTypeArr);
    }

    public static RideCardDriverCarIconRepository$DriverCarType valueOf(String str) {
        return (RideCardDriverCarIconRepository$DriverCarType) Enum.valueOf(RideCardDriverCarIconRepository$DriverCarType.class, str);
    }

    public static RideCardDriverCarIconRepository$DriverCarType[] values() {
        return (RideCardDriverCarIconRepository$DriverCarType[]) $VALUES.clone();
    }
}
