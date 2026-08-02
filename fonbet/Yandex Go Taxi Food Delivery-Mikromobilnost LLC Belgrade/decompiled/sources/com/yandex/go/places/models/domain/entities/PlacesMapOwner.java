package com.yandex.go.places.models.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/places/models/domain/entities/PlacesMapOwner;", "", "SUPER_APP_DISCOVERY_MAP_FEATURE", "PLACES_FEATURE", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesMapOwner {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlacesMapOwner[] $VALUES;
    public static final PlacesMapOwner PLACES_FEATURE;
    public static final PlacesMapOwner SUPER_APP_DISCOVERY_MAP_FEATURE;

    static {
        PlacesMapOwner placesMapOwner = new PlacesMapOwner("SUPER_APP_DISCOVERY_MAP_FEATURE", 0);
        SUPER_APP_DISCOVERY_MAP_FEATURE = placesMapOwner;
        PlacesMapOwner placesMapOwner2 = new PlacesMapOwner("PLACES_FEATURE", 1);
        PLACES_FEATURE = placesMapOwner2;
        PlacesMapOwner[] placesMapOwnerArr = {placesMapOwner, placesMapOwner2};
        $VALUES = placesMapOwnerArr;
        $ENTRIES = a.a(placesMapOwnerArr);
    }

    public static PlacesMapOwner valueOf(String str) {
        return (PlacesMapOwner) Enum.valueOf(PlacesMapOwner.class, str);
    }

    public static PlacesMapOwner[] values() {
        return (PlacesMapOwner[]) $VALUES.clone();
    }
}
