package com.yandex.go.taxi.order.map.overlay.traffic;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/map/overlay/traffic/TrafficLightWithSignal$Signal", "", "Lcom/yandex/go/taxi/order/map/overlay/traffic/TrafficLightWithSignal$Signal;", "RED", "GREEN", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TrafficLightWithSignal$Signal {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TrafficLightWithSignal$Signal[] $VALUES;
    public static final TrafficLightWithSignal$Signal GREEN;
    public static final TrafficLightWithSignal$Signal RED;
    public static final TrafficLightWithSignal$Signal UNKNOWN;

    static {
        TrafficLightWithSignal$Signal trafficLightWithSignal$Signal = new TrafficLightWithSignal$Signal("RED", 0);
        RED = trafficLightWithSignal$Signal;
        TrafficLightWithSignal$Signal trafficLightWithSignal$Signal2 = new TrafficLightWithSignal$Signal("GREEN", 1);
        GREEN = trafficLightWithSignal$Signal2;
        TrafficLightWithSignal$Signal trafficLightWithSignal$Signal3 = new TrafficLightWithSignal$Signal("UNKNOWN", 2);
        UNKNOWN = trafficLightWithSignal$Signal3;
        TrafficLightWithSignal$Signal[] trafficLightWithSignal$SignalArr = {trafficLightWithSignal$Signal, trafficLightWithSignal$Signal2, trafficLightWithSignal$Signal3};
        $VALUES = trafficLightWithSignal$SignalArr;
        $ENTRIES = kotlin.enums.a.a(trafficLightWithSignal$SignalArr);
    }

    public static TrafficLightWithSignal$Signal valueOf(String str) {
        return (TrafficLightWithSignal$Signal) Enum.valueOf(TrafficLightWithSignal$Signal.class, str);
    }

    public static TrafficLightWithSignal$Signal[] values() {
        return (TrafficLightWithSignal$Signal[]) $VALUES.clone();
    }
}
