package com.yandex.mapkit.maps.core.geometry;

import android.os.Parcelable;
import com.yandex.mapkit.maps.core.serialization.PolygonSerializer;
import defpackage.gsq0;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@gsq0(with = PolygonSerializer.class)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \b2\u00060\u0001j\u0002`\u0002:\u0001\bR\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/yandex/mapkit/maps/core/geometry/Polygon;", "Landroid/os/Parcelable;", "Lkotlinx/parcelize/Parcelable;", "coordinates", "", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "getCoordinates", "()Ljava/util/List;", "Companion", "exported-geometry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface Polygon extends Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/yandex/mapkit/maps/core/geometry/Polygon$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/yandex/mapkit/maps/core/geometry/Polygon;", "exported-geometry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final KSerializer serializer() {
            return PolygonSerializer.INSTANCE;
        }
    }

    List<Point> getCoordinates();
}
