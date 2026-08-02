package com.yandex.mapkit.directions.carparks;

import com.yandex.mapkit.geometry.Point;

/* loaded from: classes15.dex */
public interface CarparksNearbyLayer {
    void hide();

    boolean isValid();

    boolean isVisible();

    void resetCarparksStyles();

    boolean setCarparksStyle(int i, String str);

    boolean setCarparksStyle(String str);

    void show(Point point, double d);
}
