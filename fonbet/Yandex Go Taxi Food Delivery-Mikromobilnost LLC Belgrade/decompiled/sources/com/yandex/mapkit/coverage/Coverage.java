package com.yandex.mapkit.coverage;

import com.yandex.mapkit.coverage.IsCoveredSession;
import com.yandex.mapkit.coverage.RegionsSession;
import com.yandex.mapkit.geometry.LinearRing;
import com.yandex.mapkit.geometry.Point;

/* loaded from: classes15.dex */
public interface Coverage {
    IsCoveredSession isCovered(LinearRing linearRing, int i, IsCoveredSession.IsCoveredListener isCoveredListener);

    IsCoveredSession isCovered(Point point, int i, IsCoveredSession.IsCoveredListener isCoveredListener);

    RegionsSession regions(Point point, int i, RegionsSession.RegionsListener regionsListener);

    void setActiveArea(LinearRing linearRing, int i);
}
