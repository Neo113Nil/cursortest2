package com.yandex.go.places.models.domain.entities.map;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/places/models/domain/entities/map/PlacesMapConfig$RevealingState", "", "Lcom/yandex/go/places/models/domain/entities/map/PlacesMapConfig$RevealingState;", "EXPANDED", "ANCHORED", "COLLAPSED", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesMapConfig$RevealingState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlacesMapConfig$RevealingState[] $VALUES;
    public static final PlacesMapConfig$RevealingState ANCHORED;
    public static final PlacesMapConfig$RevealingState COLLAPSED;
    public static final PlacesMapConfig$RevealingState EXPANDED;

    static {
        PlacesMapConfig$RevealingState placesMapConfig$RevealingState = new PlacesMapConfig$RevealingState("EXPANDED", 0);
        EXPANDED = placesMapConfig$RevealingState;
        PlacesMapConfig$RevealingState placesMapConfig$RevealingState2 = new PlacesMapConfig$RevealingState("ANCHORED", 1);
        ANCHORED = placesMapConfig$RevealingState2;
        PlacesMapConfig$RevealingState placesMapConfig$RevealingState3 = new PlacesMapConfig$RevealingState("COLLAPSED", 2);
        COLLAPSED = placesMapConfig$RevealingState3;
        PlacesMapConfig$RevealingState[] placesMapConfig$RevealingStateArr = {placesMapConfig$RevealingState, placesMapConfig$RevealingState2, placesMapConfig$RevealingState3};
        $VALUES = placesMapConfig$RevealingStateArr;
        $ENTRIES = a.a(placesMapConfig$RevealingStateArr);
    }

    public static PlacesMapConfig$RevealingState valueOf(String str) {
        return (PlacesMapConfig$RevealingState) Enum.valueOf(PlacesMapConfig$RevealingState.class, str);
    }

    public static PlacesMapConfig$RevealingState[] values() {
        return (PlacesMapConfig$RevealingState[]) $VALUES.clone();
    }
}
