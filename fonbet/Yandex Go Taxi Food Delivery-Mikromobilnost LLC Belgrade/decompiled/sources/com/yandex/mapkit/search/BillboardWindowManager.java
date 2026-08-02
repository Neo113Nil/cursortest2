package com.yandex.mapkit.search;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.BoundingBox;
import java.util.List;

/* loaded from: classes15.dex */
public interface BillboardWindowManager {
    void addListener(BillboardListener billboardListener);

    List<GeoObject> getAdvertObjects();

    void removeListener(BillboardListener billboardListener);

    void resetSearchArea();

    void setSearchArea(BoundingBox boundingBox);
}
