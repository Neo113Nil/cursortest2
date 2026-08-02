package com.yandex.mapkit.maps.core.geometry;

import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ&\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/yandex/mapkit/maps/core/geometry/GeometryUtils;", "", "<init>", "()V", "EARTH_RADIUS_IN_METERS", "", "metersBetween", "point1", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "point2", "lat1", "lon1", "lat2", "lon2", "getDestinationPoint", IssuingDistributionPointExtension.POINT, "course", "distance", "exported-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GeometryUtils {
    private static final double EARTH_RADIUS_IN_METERS = 6371000.0d;
    public static final GeometryUtils INSTANCE = new GeometryUtils();

    private GeometryUtils() {
    }

    public final Point getDestinationPoint(Point point, double course, double distance) {
        double degreesToRadians = GeometryUtilsKt.degreesToRadians(point.getLat());
        double degreesToRadians2 = GeometryUtilsKt.degreesToRadians(point.getLon());
        double degreesToRadians3 = GeometryUtilsKt.degreesToRadians(course);
        double d = distance / EARTH_RADIUS_IN_METERS;
        double asin = Math.asin((Math.cos(degreesToRadians3) * Math.sin(d) * Math.cos(degreesToRadians)) + (Math.cos(d) * Math.sin(degreesToRadians)));
        return Point.INSTANCE.invoke(GeometryUtilsKt.radiansToDegrees(asin), GeometryUtilsKt.radiansToDegrees(Math.atan2(Math.cos(degreesToRadians) * Math.sin(d) * Math.sin(degreesToRadians3), Math.cos(d) - (Math.sin(asin) * Math.sin(degreesToRadians))) + degreesToRadians2));
    }

    public final double metersBetween(double lat1, double lon1, double lat2, double lon2) {
        double degreesToRadians = GeometryUtilsKt.degreesToRadians(lat2 - lat1);
        double degreesToRadians2 = GeometryUtilsKt.degreesToRadians(lon2 - lon1);
        double sin = Math.sin(degreesToRadians / 2.0d);
        double cos = Math.cos(GeometryUtilsKt.degreesToRadians(lat2)) * Math.cos(GeometryUtilsKt.degreesToRadians(lat1));
        double sin2 = Math.sin(degreesToRadians2 / 2.0d);
        double d = (cos * sin2 * sin2) + (sin * sin);
        return Math.atan2(Math.sqrt(d), Math.sqrt(1.0d - d)) * 2.0d * EARTH_RADIUS_IN_METERS;
    }

    public final double metersBetween(Point point1, Point point2) {
        return metersBetween(point1.getLat(), point1.getLon(), point2.getLat(), point2.getLon());
    }
}
