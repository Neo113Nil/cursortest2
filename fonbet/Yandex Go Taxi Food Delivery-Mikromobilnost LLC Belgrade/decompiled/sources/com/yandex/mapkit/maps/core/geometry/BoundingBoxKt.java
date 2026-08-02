package com.yandex.mapkit.maps.core.geometry;

import com.yandex.mapkit.maps.core.geometry.Point;
import defpackage.kbs;
import defpackage.ny61;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010 \n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0086\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007\u001a\n\u0010\t\u001a\u00020\u0004*\u00020\u0002\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002\u001a8\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0002\u001a(\u0010\u0013\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0002\u001a2\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u001a\u0019\u0010\u0019\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0086\u0004\u001a\u0010\u0010\u001a\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00040\u001b¨\u0006\u001c"}, d2 = {"contains", "", "Lcom/yandex/mapkit/maps/core/geometry/BoundingBox;", IssuingDistributionPointExtension.POINT, "Lcom/yandex/mapkit/maps/core/geometry/Point;", "box", "lon", "", "lat", "getCenter", "intersects", "other", "segmentsIntersectsWithWrapAround", "a1", "a2", "b1", "b2", "boundMin", "boundMax", "segmentsIntersect", "expand", "leftMarginRatio", "rightMarginRatio", "topMarginRatio", "bottomMarginRatio", "isIdentical", "toBBox", "", "exported-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BoundingBoxKt {
    public static final boolean contains(BoundingBox boundingBox, double d, double d2) {
        if (boundingBox.getSouthWest().getLon() > boundingBox.getNorthEast().getLon()) {
            if (d > boundingBox.getNorthEast().getLon() && d < boundingBox.getSouthWest().getLon()) {
                return false;
            }
        } else if (d < boundingBox.getSouthWest().getLon() || d > boundingBox.getNorthEast().getLon()) {
            return false;
        }
        return d2 >= boundingBox.getSouthWest().getLat() && d2 <= boundingBox.getNorthEast().getLat();
    }

    public static final BoundingBox expand(BoundingBox boundingBox, double d, double d2, double d3, double d4) {
        double lat = boundingBox.getSouthWest().getLat();
        double lon = boundingBox.getSouthWest().getLon();
        double lat2 = boundingBox.getNorthEast().getLat();
        double lon2 = boundingBox.getNorthEast().getLon();
        double d5 = lon2 - lon;
        double d6 = lat2 - lat;
        return BoundingBox.INSTANCE.invoke(lat - (d6 * d4), lon - (d * d5), lat2 + (d3 * d6), lon2 + (d5 * d2));
    }

    public static /* synthetic */ BoundingBox expand$default(BoundingBox boundingBox, double d, double d2, double d3, double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = 0.2d;
        }
        if ((i & 2) != 0) {
            d2 = 0.2d;
        }
        if ((i & 4) != 0) {
            d3 = 0.2d;
        }
        if ((i & 8) != 0) {
            d4 = 0.2d;
        }
        return expand(boundingBox, d, d2, d3, d4);
    }

    public static final Point getCenter(BoundingBox boundingBox) {
        if (boundingBox.getNorthEast().getLat() < boundingBox.getSouthWest().getLat()) {
            kbs.f(boundingBox, "North east Latitude should be more than south west latitude. BoundingBox: ");
            return null;
        }
        boolean z = boundingBox.getNorthEast().getLon() < boundingBox.getSouthWest().getLon();
        Pair pair = z ? new Pair(Double.valueOf(boundingBox.getNorthEast().getLon()), Double.valueOf(boundingBox.getSouthWest().getLon())) : new Pair(Double.valueOf(boundingBox.getSouthWest().getLon()), Double.valueOf(boundingBox.getNorthEast().getLon()));
        double doubleValue = ((Number) pair.getFirst()).doubleValue();
        double doubleValue2 = ((Number) pair.getSecond()).doubleValue();
        Point.Companion companion = Point.INSTANCE;
        double lat = ((boundingBox.getNorthEast().getLat() - boundingBox.getSouthWest().getLat()) / 2.0d) + boundingBox.getSouthWest().getLat();
        double d = ((doubleValue2 - doubleValue) / 2.0d) + doubleValue + (z ? 180.0d : 0.0d);
        if (d > 180.0d) {
            d -= 360.0d;
        }
        return companion.invoke(lat, d);
    }

    public static final boolean intersects(BoundingBox boundingBox, BoundingBox boundingBox2) {
        return segmentsIntersectsWithWrapAround(boundingBox.getSouthWest().getLon(), boundingBox.getNorthEast().getLon(), boundingBox2.getSouthWest().getLon(), boundingBox2.getNorthEast().getLon(), -180.0d, 180.0d) && segmentsIntersectsWithWrapAround(boundingBox.getSouthWest().getLat(), boundingBox.getNorthEast().getLat(), boundingBox2.getSouthWest().getLat(), boundingBox2.getNorthEast().getLat(), -90.0d, 90.0d);
    }

    public static final boolean isIdentical(BoundingBox boundingBox, BoundingBox boundingBox2) {
        return (boundingBox == null || boundingBox2 == null) ? boundingBox == null && boundingBox2 == null : PointExtensionKt.isIdentical$default(boundingBox.getSouthWest(), boundingBox2.getSouthWest(), 0.0f, 2, null) && PointExtensionKt.isIdentical$default(boundingBox.getNorthEast(), boundingBox2.getNorthEast(), 0.0f, 2, null);
    }

    private static final boolean segmentsIntersect(double d, double d2, double d3, double d4) {
        if (d2 <= d) {
            ny61.g("Failed requirement.");
            return false;
        }
        if (d4 > d3) {
            return d2 >= d3 && d4 >= d;
        }
        ny61.g("Failed requirement.");
        return false;
    }

    private static final boolean segmentsIntersectsWithWrapAround(double d, double d2, double d3, double d4, double d5, double d6) {
        boolean z = d > d2;
        boolean z2 = d3 > d4;
        return (z || z2) ? (!z || z2) ? z || !z2 || segmentsIntersect(d, d2, d5, d4) || segmentsIntersect(d, d2, d3, d6) : segmentsIntersect(d5, d2, d3, d4) || segmentsIntersect(d, d6, d3, d4) : segmentsIntersect(d, d2, d3, d4);
    }

    public static final BoundingBox toBBox(List<? extends Point> list) {
        double d = Double.MIN_VALUE;
        double d2 = Double.MIN_VALUE;
        double d3 = Double.MAX_VALUE;
        double d4 = Double.MAX_VALUE;
        for (Point point : list) {
            double lat = point.getLat();
            if (lat >= d) {
                d = lat;
            }
            double lat2 = point.getLat();
            if (lat2 <= d3) {
                d3 = lat2;
            }
            double lon = point.getLon();
            if (lon <= d4) {
                d4 = lon;
            }
            double lon2 = point.getLon();
            if (lon2 >= d2) {
                d2 = lon2;
            }
        }
        return BoundingBox.INSTANCE.invoke(d3, d4, d, d2);
    }

    public static final boolean contains(BoundingBox boundingBox, BoundingBox boundingBox2) {
        return contains(boundingBox, boundingBox2.getSouthWest()) && contains(boundingBox, boundingBox2.getNorthEast());
    }

    public static final boolean contains(BoundingBox boundingBox, Point point) {
        return contains(boundingBox, point.getLon(), point.getLat());
    }
}
