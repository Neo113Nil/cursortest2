package com.yandex.mapkit.maps.core.geometry;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"formatForCoordinate", "", "", "createPoint", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "lat", "lon", "exported-geometry_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AndroidPointKt {
    public static final Point createPoint(double d, double d2) {
        return Point.INSTANCE.invoke(d, d2);
    }

    public static final String formatForCoordinate(double d) {
        return String.format(Locale.ENGLISH, "%.6f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
    }
}
