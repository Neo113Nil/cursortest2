package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.Point;

/* loaded from: classes15.dex */
public interface AdvertMenuManager {
    void addListener(AdvertMenuListener advertMenuListener);

    AdvertMenuInfo getAdvertMenuInfo();

    void removeListener(AdvertMenuListener advertMenuListener);

    void setPosition(Point point);
}
