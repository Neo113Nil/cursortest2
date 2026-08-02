package com.yandex.go.layers.api.presentation.mapkit;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/layers/api/presentation/mapkit/MapKitObjectType;", "", "MASS_TRANSIT_STOP", "ORGANISATION", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MapKitObjectType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MapKitObjectType[] $VALUES;
    public static final MapKitObjectType MASS_TRANSIT_STOP;
    public static final MapKitObjectType ORGANISATION;
    public static final MapKitObjectType UNKNOWN;

    static {
        MapKitObjectType mapKitObjectType = new MapKitObjectType("MASS_TRANSIT_STOP", 0);
        MASS_TRANSIT_STOP = mapKitObjectType;
        MapKitObjectType mapKitObjectType2 = new MapKitObjectType("ORGANISATION", 1);
        ORGANISATION = mapKitObjectType2;
        MapKitObjectType mapKitObjectType3 = new MapKitObjectType("UNKNOWN", 2);
        UNKNOWN = mapKitObjectType3;
        MapKitObjectType[] mapKitObjectTypeArr = {mapKitObjectType, mapKitObjectType2, mapKitObjectType3};
        $VALUES = mapKitObjectTypeArr;
        $ENTRIES = a.a(mapKitObjectTypeArr);
    }

    public static MapKitObjectType valueOf(String str) {
        return (MapKitObjectType) Enum.valueOf(MapKitObjectType.class, str);
    }

    public static MapKitObjectType[] values() {
        return (MapKitObjectType[]) $VALUES.clone();
    }
}
