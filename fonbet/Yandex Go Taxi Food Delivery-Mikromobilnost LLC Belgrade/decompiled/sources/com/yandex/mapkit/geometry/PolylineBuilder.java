package com.yandex.mapkit.geometry;

/* loaded from: classes15.dex */
public interface PolylineBuilder {
    void append(Point point);

    void append(Polyline polyline);

    Polyline build();
}
