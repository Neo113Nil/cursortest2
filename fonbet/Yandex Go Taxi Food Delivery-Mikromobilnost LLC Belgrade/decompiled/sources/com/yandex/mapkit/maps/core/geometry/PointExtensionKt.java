package com.yandex.mapkit.maps.core.geometry;

import com.yandex.mapkit.maps.core.utils.extensions.CommonExtensions;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u001b\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0002*\u0002H\u0001¢\u0006\u0002\u0010\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002\u001a\u001e\u0010\b\u001a\u00020\u0005*\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0007\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"requireFinite", "T", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "(Lcom/yandex/mapkit/maps/core/geometry/Point;)Lcom/yandex/mapkit/maps/core/geometry/Point;", "isFinite", "", "EPSILON_GEO", "", "isIdentical", IssuingDistributionPointExtension.POINT, "epsilon", "exported-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PointExtensionKt {
    public static final float EPSILON_GEO = 1.0E-6f;

    public static final boolean isFinite(Point point) {
        return Math.abs(point.getLat()) <= Double.MAX_VALUE && Math.abs(point.getLon()) <= Double.MAX_VALUE;
    }

    public static final boolean isIdentical(Point point, Point point2, float f) {
        if (point2 == null) {
            return false;
        }
        double d = f;
        return Math.abs(point.getLat() - point2.getLat()) < d && Math.abs(point.getLon() - point2.getLon()) < d;
    }

    public static /* synthetic */ boolean isIdentical$default(Point point, Point point2, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 1.0E-6f;
        }
        return isIdentical(point, point2, f);
    }

    public static final <T extends Point> T requireFinite(T t) {
        if (t != null) {
            CommonExtensions.requireFinite(t.getLat());
            CommonExtensions.requireFinite(t.getLon());
        }
        return t;
    }
}
