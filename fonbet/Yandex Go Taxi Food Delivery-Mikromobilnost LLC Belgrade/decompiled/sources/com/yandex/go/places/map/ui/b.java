package com.yandex.go.places.map.ui;

import com.yandex.mapkit.maps.core.geometry.Point;
import defpackage.fi9;
import defpackage.tpr;
import kotlinx.coroutines.flow.e;

/* loaded from: classes13.dex */
public abstract class b {
    public static final fi9 a(tpr tprVar, long j) {
        return e.i(new PinsUtilsKt$throttleFirstAndLast$1(tprVar, j, null));
    }

    public static final Point b(com.yandex.mapkit.geometry.Point point) {
        return Point.INSTANCE.invoke(point.getLatitude(), point.getLongitude());
    }
}
