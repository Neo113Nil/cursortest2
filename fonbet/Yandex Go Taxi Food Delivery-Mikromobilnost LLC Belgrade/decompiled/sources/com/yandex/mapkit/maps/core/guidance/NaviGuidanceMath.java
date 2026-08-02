package com.yandex.mapkit.maps.core.guidance;

import com.yandex.mapkit.maps.core.geometry.Point;
import kotlin.Metadata;
import kotlin.Pair;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u0018J(\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002J\u0010\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0002J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u0005H\u0002J0\u0010$\u001a\u00020\u00052\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150&H\u0002J\u001c\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150&2\u0006\u0010\u001c\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/yandex/mapkit/maps/core/guidance/NaviGuidanceMath;", "", "<init>", "()V", "GPS_PI", "", "GPS_PI_4", "GPS_PI_DIV_180", "R", "EARTH_EQUATOR_LENGTH_2", "DEFAULT_FACTOR", "LAT_CONVERSION", "E_K", "getNaviGuidanceZoom", "", "lengthwise", "transverse", "azimuth", "position", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "mapWidth", "", "mapHeight", "mapScale", "(DDLjava/lang/Double;Lcom/yandex/mapkit/maps/core/geometry/Point;IIF)F", "getViewAreaLength", "calculateViewCenter", "shiftPoint", IssuingDistributionPointExtension.POINT, "lenLat", "lenLon", "degToRad", "value", "mToDLat", "mToDLon", "lat", "dist", "a", "Lkotlin/Pair;", "b", "toXY", "exported-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NaviGuidanceMath {
    private static final double DEFAULT_FACTOR = 53.5865939582453d;
    private static final double EARTH_EQUATOR_LENGTH_2 = 2.0037508342789244E7d;
    private static final double E_K = 0.08181919084262157d;
    private static final double GPS_PI = 3.141592653589d;
    private static final double GPS_PI_4 = 0.78539816339725d;
    private static final double GPS_PI_DIV_180 = 0.01745329251993889d;
    public static final NaviGuidanceMath INSTANCE = new NaviGuidanceMath();
    private static final double LAT_CONVERSION = 111319.49079324547d;
    private static final double R = 6378137.0d;

    private NaviGuidanceMath() {
    }

    private final Point calculateViewCenter(double lengthwise, double azimuth, Point position) {
        double degToRad = degToRad(azimuth);
        return shiftPoint(position, Math.cos(degToRad) * lengthwise, Math.sin(degToRad) * lengthwise);
    }

    private final double degToRad(double value) {
        return value * GPS_PI_DIV_180;
    }

    private final double dist(Pair<Integer, Integer> a, Pair<Integer, Integer> b) {
        return Math.hypot(((Number) b.c()).intValue() - ((Number) a.c()).intValue(), ((Number) b.f()).intValue() - ((Number) a.f()).intValue());
    }

    public static final float getNaviGuidanceZoom(double lengthwise, double transverse, Double azimuth, Point position, int mapWidth, int mapHeight, float mapScale) {
        return 23.0f - ((float) ((Math.log(INSTANCE.getViewAreaLength(lengthwise / 2.0d, transverse, azimuth != null ? azimuth.doubleValue() : 0.0d, position) / (Math.min(mapWidth, mapHeight) / (Math.max(mapScale, 2.0f) * 128.0f))) / Math.log(2.0d)) - 7.0d));
    }

    private final double getViewAreaLength(double lengthwise, double transverse, double azimuth, Point position) {
        Point calculateViewCenter = calculateViewCenter(lengthwise, azimuth, position);
        return dist(toXY(shiftPoint(calculateViewCenter, -lengthwise, -transverse)), toXY(shiftPoint(calculateViewCenter, lengthwise, transverse)));
    }

    private final double mToDLat(double value) {
        return value / LAT_CONVERSION;
    }

    private final double mToDLon(double value, double lat) {
        return mToDLat(value) / Math.cos(lat * GPS_PI_DIV_180);
    }

    private final Point shiftPoint(Point point, double lenLat, double lenLon) {
        return Point.INSTANCE.invoke(point.getLat() + mToDLat(lenLat), point.getLon() + mToDLon(lenLon, point.getLat()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r10 < (-180.0d)) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r0 < (-89.3d)) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Pair<Integer, Integer> toXY(Point point) {
        double lat = point.getLat();
        double lon = point.getLon();
        double d = lat <= 89.3d ? -89.3d : 89.3d;
        lat = d;
        double d2 = lon <= 180.0d ? -180.0d : 180.0d;
        lon = d2;
        double d3 = lat * GPS_PI_DIV_180;
        return new Pair<>(Integer.valueOf((int) (((lon * GPS_PI_DIV_180 * R) + EARTH_EQUATOR_LENGTH_2) * DEFAULT_FACTOR)), Integer.valueOf((int) (-(((Math.log(Math.tan((d3 * 0.5d) + GPS_PI_4) / Math.pow(Math.tan((Math.asin(Math.sin(d3) * E_K) * 0.5d) + GPS_PI_4), E_K)) * R) - EARTH_EQUATOR_LENGTH_2) * DEFAULT_FACTOR))));
    }
}
