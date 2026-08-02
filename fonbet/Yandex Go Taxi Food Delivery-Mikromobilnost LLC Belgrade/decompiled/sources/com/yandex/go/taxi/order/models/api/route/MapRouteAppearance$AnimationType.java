package com.yandex.go.taxi.order.models.api.route;

import defpackage.gsq0;
import defpackage.hr00;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.t5z;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/taxi/order/models/api/route/MapRouteAppearance$AnimationType", "", "Lcom/yandex/go/taxi/order/models/api/route/MapRouteAppearance$AnimationType;", "Companion", "hr00", "EASY_BOTH", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MapRouteAppearance$AnimationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MapRouteAppearance$AnimationType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final hr00 Companion;
    public static final MapRouteAppearance$AnimationType EASY_BOTH;
    public static final MapRouteAppearance$AnimationType UNKNOWN;

    static {
        MapRouteAppearance$AnimationType mapRouteAppearance$AnimationType = new MapRouteAppearance$AnimationType("EASY_BOTH", 0);
        EASY_BOTH = mapRouteAppearance$AnimationType;
        MapRouteAppearance$AnimationType mapRouteAppearance$AnimationType2 = new MapRouteAppearance$AnimationType("UNKNOWN", 1);
        UNKNOWN = mapRouteAppearance$AnimationType2;
        MapRouteAppearance$AnimationType[] mapRouteAppearance$AnimationTypeArr = {mapRouteAppearance$AnimationType, mapRouteAppearance$AnimationType2};
        $VALUES = mapRouteAppearance$AnimationTypeArr;
        $ENTRIES = kotlin.enums.a.a(mapRouteAppearance$AnimationTypeArr);
        Companion = new hr00();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t5z(19));
    }

    public static MapRouteAppearance$AnimationType valueOf(String str) {
        return (MapRouteAppearance$AnimationType) Enum.valueOf(MapRouteAppearance$AnimationType.class, str);
    }

    public static MapRouteAppearance$AnimationType[] values() {
        return (MapRouteAppearance$AnimationType[]) $VALUES.clone();
    }
}
