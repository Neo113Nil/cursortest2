package com.yandex.go.taxi.order.models.api.route;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/route/MapRouteAppearance$Type", "", "Lcom/yandex/go/taxi/order/models/api/route/MapRouteAppearance$Type;", "BEZIER", "WALK_ROUTE", "UNSUPPORTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapRouteAppearance$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MapRouteAppearance$Type[] $VALUES;
    public static final MapRouteAppearance$Type BEZIER;
    public static final MapRouteAppearance$Type UNSUPPORTED;
    public static final MapRouteAppearance$Type WALK_ROUTE;

    static {
        MapRouteAppearance$Type mapRouteAppearance$Type = new MapRouteAppearance$Type("BEZIER", 0);
        BEZIER = mapRouteAppearance$Type;
        MapRouteAppearance$Type mapRouteAppearance$Type2 = new MapRouteAppearance$Type("WALK_ROUTE", 1);
        WALK_ROUTE = mapRouteAppearance$Type2;
        MapRouteAppearance$Type mapRouteAppearance$Type3 = new MapRouteAppearance$Type("UNSUPPORTED", 2);
        UNSUPPORTED = mapRouteAppearance$Type3;
        MapRouteAppearance$Type[] mapRouteAppearance$TypeArr = {mapRouteAppearance$Type, mapRouteAppearance$Type2, mapRouteAppearance$Type3};
        $VALUES = mapRouteAppearance$TypeArr;
        $ENTRIES = kotlin.enums.a.a(mapRouteAppearance$TypeArr);
    }

    public static MapRouteAppearance$Type valueOf(String str) {
        return (MapRouteAppearance$Type) Enum.valueOf(MapRouteAppearance$Type.class, str);
    }

    public static MapRouteAppearance$Type[] values() {
        return (MapRouteAppearance$Type[]) $VALUES.clone();
    }
}
