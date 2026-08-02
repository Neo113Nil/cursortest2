package com.yandex.go.taxi.summary.api.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/summary/api/ui/MapPositionAction;", "", "DEFAULT", "CENTER_ON_USER_LOCATION", "SHOW_PICKUP_POINTS", JCP.RAW_PREFIX, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapPositionAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MapPositionAction[] $VALUES;
    public static final MapPositionAction CENTER_ON_USER_LOCATION;
    public static final MapPositionAction DEFAULT;
    public static final MapPositionAction NONE;
    public static final MapPositionAction SHOW_PICKUP_POINTS;

    static {
        MapPositionAction mapPositionAction = new MapPositionAction("DEFAULT", 0);
        DEFAULT = mapPositionAction;
        MapPositionAction mapPositionAction2 = new MapPositionAction("CENTER_ON_USER_LOCATION", 1);
        CENTER_ON_USER_LOCATION = mapPositionAction2;
        MapPositionAction mapPositionAction3 = new MapPositionAction("SHOW_PICKUP_POINTS", 2);
        SHOW_PICKUP_POINTS = mapPositionAction3;
        MapPositionAction mapPositionAction4 = new MapPositionAction(JCP.RAW_PREFIX, 3);
        NONE = mapPositionAction4;
        MapPositionAction[] mapPositionActionArr = {mapPositionAction, mapPositionAction2, mapPositionAction3, mapPositionAction4};
        $VALUES = mapPositionActionArr;
        $ENTRIES = a.a(mapPositionActionArr);
    }

    public static MapPositionAction valueOf(String str) {
        return (MapPositionAction) Enum.valueOf(MapPositionAction.class, str);
    }

    public static MapPositionAction[] values() {
        return (MapPositionAction[]) $VALUES.clone();
    }
}
