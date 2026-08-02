package com.yandex.mapkit.map;

import com.yandex.mapkit.ConflictResolutionMode;

/* loaded from: classes15.dex */
public interface RootMapObjectCollection extends MapObjectCollection {
    void addPlacemarkVisibilityListener(PlacemarkVisibilityListener placemarkVisibilityListener);

    ConflictResolutionMode getConflictResolutionMode();

    void removePlacemarkVisibilityListener(PlacemarkVisibilityListener placemarkVisibilityListener);

    void setConflictResolutionMode(ConflictResolutionMode conflictResolutionMode);
}
