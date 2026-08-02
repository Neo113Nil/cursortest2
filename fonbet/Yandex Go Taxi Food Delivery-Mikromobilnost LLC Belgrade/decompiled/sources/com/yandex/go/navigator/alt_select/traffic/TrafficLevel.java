package com.yandex.go.navigator.alt_select.traffic;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/alt_select/traffic/TrafficLevel;", "", "FREE", "LIGHT", "HARD", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TrafficLevel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TrafficLevel[] $VALUES;
    public static final TrafficLevel FREE;
    public static final TrafficLevel HARD;
    public static final TrafficLevel LIGHT;

    static {
        TrafficLevel trafficLevel = new TrafficLevel("FREE", 0);
        FREE = trafficLevel;
        TrafficLevel trafficLevel2 = new TrafficLevel("LIGHT", 1);
        LIGHT = trafficLevel2;
        TrafficLevel trafficLevel3 = new TrafficLevel("HARD", 2);
        HARD = trafficLevel3;
        TrafficLevel[] trafficLevelArr = {trafficLevel, trafficLevel2, trafficLevel3};
        $VALUES = trafficLevelArr;
        $ENTRIES = kotlin.enums.a.a(trafficLevelArr);
    }

    public static TrafficLevel valueOf(String str) {
        return (TrafficLevel) Enum.valueOf(TrafficLevel.class, str);
    }

    public static TrafficLevel[] values() {
        return (TrafficLevel[]) $VALUES.clone();
    }
}
