package com.yandex.go.walking.navigation.impl.ui.overlay;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/walking/navigation/impl/ui/overlay/WaypointType;", "", "START_POINT", "END_POINT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class WaypointType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WaypointType[] $VALUES;
    public static final WaypointType END_POINT;
    public static final WaypointType START_POINT;

    static {
        WaypointType waypointType = new WaypointType("START_POINT", 0);
        START_POINT = waypointType;
        WaypointType waypointType2 = new WaypointType("END_POINT", 1);
        END_POINT = waypointType2;
        WaypointType[] waypointTypeArr = {waypointType, waypointType2};
        $VALUES = waypointTypeArr;
        $ENTRIES = kotlin.enums.a.a(waypointTypeArr);
    }

    public static WaypointType valueOf(String str) {
        return (WaypointType) Enum.valueOf(WaypointType.class, str);
    }

    public static WaypointType[] values() {
        return (WaypointType[]) $VALUES.clone();
    }
}
