package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.Point;

/* loaded from: classes15.dex */
public interface MenuManager {
    void addListener(MenuListener menuListener);

    MenuInfo getMenuInfo();

    void removeListener(MenuListener menuListener);

    void setPosition(Point point);
}
