package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.Point;

/* loaded from: classes8.dex */
public interface MapObjectDragListener {
    void onMapObjectDrag(MapObject mapObject, Point point);

    void onMapObjectDragEnd(MapObject mapObject);

    void onMapObjectDragStart(MapObject mapObject);
}
