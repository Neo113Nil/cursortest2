package com.yandex.go.navigator.notifications.cartech;

import defpackage.fet0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.o7u0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/navigator/notifications/cartech/StationType;", "", "Companion", "o7u0", "FUEL", "GAS", "CAR_WASH", "CAR_WASH_BOOKING", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StationType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final StationType CAR_WASH;
    public static final StationType CAR_WASH_BOOKING;
    public static final o7u0 Companion;
    public static final StationType FUEL;
    public static final StationType GAS;

    static {
        StationType stationType = new StationType("FUEL", 0);
        FUEL = stationType;
        StationType stationType2 = new StationType("GAS", 1);
        GAS = stationType2;
        StationType stationType3 = new StationType("CAR_WASH", 2);
        CAR_WASH = stationType3;
        StationType stationType4 = new StationType("CAR_WASH_BOOKING", 3);
        CAR_WASH_BOOKING = stationType4;
        StationType[] stationTypeArr = {stationType, stationType2, stationType3, stationType4};
        $VALUES = stationTypeArr;
        $ENTRIES = kotlin.enums.a.a(stationTypeArr);
        Companion = new o7u0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fet0(22));
    }

    public static StationType valueOf(String str) {
        return (StationType) Enum.valueOf(StationType.class, str);
    }

    public static StationType[] values() {
        return (StationType[]) $VALUES.clone();
    }
}
