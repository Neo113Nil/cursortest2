package com.yandex.mapkit.maps.core.geometry;

import defpackage.evu0;
import defpackage.g8e;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"format", "", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "tryParsePoint", "exported-geometry_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PointKt {
    public static final String format(Point point) {
        return g8e.p(AndroidPointKt.formatForCoordinate(point.getLat()), Extension.FIX_SPACE, AndroidPointKt.formatForCoordinate(point.getLon()));
    }

    public static final Point tryParsePoint(String str) {
        List W;
        W = evu0.W(str, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
        if (W.size() != 2) {
            return null;
        }
        return Point.INSTANCE.invoke(Double.parseDouble((String) W.get(0)), Double.parseDouble((String) W.get(1)));
    }
}
