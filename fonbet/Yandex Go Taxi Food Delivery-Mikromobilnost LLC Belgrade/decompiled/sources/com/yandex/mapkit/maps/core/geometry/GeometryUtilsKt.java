package com.yandex.mapkit.maps.core.geometry;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\u001a\u0018\u0010\u0003\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, d2 = {"degreesToRadians", "", "radiansToDegrees", "containsPolygon", "", "", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "location", "exported-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GeometryUtilsKt {
    public static final boolean containsPolygon(List<? extends Point> list, Point point) {
        int size = list.size() - 1;
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            boolean z2 = list.get(i).getLat() <= point.getLat() && point.getLat() < list.get(size).getLat();
            boolean z3 = list.get(size).getLat() <= point.getLat() && point.getLat() < list.get(i).getLat();
            if (z2 || z3) {
                if (point.getLon() < list.get(i).getLon() + ((list.get(size).getLon() - list.get(i).getLon()) * ((point.getLat() - list.get(i).getLat()) / (list.get(size).getLat() - list.get(i).getLat())))) {
                    z = !z;
                }
            }
            size = i;
        }
        return z;
    }

    public static final double degreesToRadians(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    public static final double radiansToDegrees(double d) {
        return (d * 180.0d) / 3.141592653589793d;
    }
}
