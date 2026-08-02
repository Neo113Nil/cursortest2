package com.yandex.mapkit.maps.core.geometry;

import android.os.Parcelable;
import com.yandex.mapkit.maps.core.geometry.Point;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \t2\u00060\u0001j\u0002`\u0002:\u0001\tR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/yandex/mapkit/maps/core/geometry/BoundingBox;", "Landroid/os/Parcelable;", "Lkotlinx/parcelize/Parcelable;", "southWest", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "getSouthWest", "()Lcom/yandex/mapkit/maps/core/geometry/Point;", "northEast", "getNorthEast", "Companion", "exported-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BoundingBox extends Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Point getNorthEast();

    Point getSouthWest();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002J)\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0086\u0002¨\u0006\u000e"}, d2 = {"Lcom/yandex/mapkit/maps/core/geometry/BoundingBox$Companion;", "", "<init>", "()V", "invoke", "Lcom/yandex/mapkit/maps/core/geometry/BoundingBox;", "southWest", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "northEast", "southWestLat", "", "southWestLon", "northEastLat", "northEastLon", "exported-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final BoundingBox invoke(double southWestLat, double southWestLon, double northEastLat, double northEastLon) {
            Companion companion = $$INSTANCE;
            Point.Companion companion2 = Point.INSTANCE;
            return companion.invoke(companion2.invoke(southWestLat, southWestLon), companion2.invoke(northEastLat, northEastLon));
        }

        public final BoundingBox invoke(Point southWest, Point northEast) {
            return new CommonBoundingBox(southWest, northEast);
        }
    }
}
