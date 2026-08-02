package com.yandex.go.places.models.domain.entities.map;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName", "", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$PlacesMapScreenName;", "PLACES_MAIN", "PLACES_ORGANIZATIONS_LIST", "PLACES_ORGANIZATIONS_LIST_V2", "PLACES_ORGANIZATION_CARD", "PLACES_NEARBY", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesMapConfig$PlacesMapScreenName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlacesMapConfig$PlacesMapScreenName[] $VALUES;
    public static final PlacesMapConfig$PlacesMapScreenName PLACES_MAIN;
    public static final PlacesMapConfig$PlacesMapScreenName PLACES_NEARBY;
    public static final PlacesMapConfig$PlacesMapScreenName PLACES_ORGANIZATIONS_LIST;
    public static final PlacesMapConfig$PlacesMapScreenName PLACES_ORGANIZATIONS_LIST_V2;
    public static final PlacesMapConfig$PlacesMapScreenName PLACES_ORGANIZATION_CARD;

    static {
        PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName = new PlacesMapConfig$PlacesMapScreenName("PLACES_MAIN", 0);
        PLACES_MAIN = placesMapConfig$PlacesMapScreenName;
        PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName2 = new PlacesMapConfig$PlacesMapScreenName("PLACES_ORGANIZATIONS_LIST", 1);
        PLACES_ORGANIZATIONS_LIST = placesMapConfig$PlacesMapScreenName2;
        PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName3 = new PlacesMapConfig$PlacesMapScreenName("PLACES_ORGANIZATIONS_LIST_V2", 2);
        PLACES_ORGANIZATIONS_LIST_V2 = placesMapConfig$PlacesMapScreenName3;
        PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName4 = new PlacesMapConfig$PlacesMapScreenName("PLACES_ORGANIZATION_CARD", 3);
        PLACES_ORGANIZATION_CARD = placesMapConfig$PlacesMapScreenName4;
        PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName5 = new PlacesMapConfig$PlacesMapScreenName("PLACES_NEARBY", 4);
        PLACES_NEARBY = placesMapConfig$PlacesMapScreenName5;
        PlacesMapConfig$PlacesMapScreenName[] placesMapConfig$PlacesMapScreenNameArr = {placesMapConfig$PlacesMapScreenName, placesMapConfig$PlacesMapScreenName2, placesMapConfig$PlacesMapScreenName3, placesMapConfig$PlacesMapScreenName4, placesMapConfig$PlacesMapScreenName5};
        $VALUES = placesMapConfig$PlacesMapScreenNameArr;
        $ENTRIES = a.a(placesMapConfig$PlacesMapScreenNameArr);
    }

    public static PlacesMapConfig$PlacesMapScreenName valueOf(String str) {
        return (PlacesMapConfig$PlacesMapScreenName) Enum.valueOf(PlacesMapConfig$PlacesMapScreenName.class, str);
    }

    public static PlacesMapConfig$PlacesMapScreenName[] values() {
        return (PlacesMapConfig$PlacesMapScreenName[]) $VALUES.clone();
    }
}
