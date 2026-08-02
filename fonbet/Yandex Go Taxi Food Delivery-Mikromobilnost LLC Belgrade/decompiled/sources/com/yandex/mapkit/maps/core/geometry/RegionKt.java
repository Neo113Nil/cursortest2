package com.yandex.mapkit.maps.core.geometry;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"center", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "Lcom/yandex/mapkit/maps/core/geometry/Region;", "exported-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RegionKt {
    public static final Point center(Region region) {
        return Point.INSTANCE.invoke((region.getBottomRight().getLat() + region.getTopLeft().getLat()) / 2.0d, (region.getBottomRight().getLon() + region.getTopLeft().getLon()) / 2.0d);
    }
}
