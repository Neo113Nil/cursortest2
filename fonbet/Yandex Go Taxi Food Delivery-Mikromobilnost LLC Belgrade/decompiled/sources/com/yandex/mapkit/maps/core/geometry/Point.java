package com.yandex.mapkit.maps.core.geometry;

import android.os.Parcelable;
import com.yandex.mapkit.maps.core.serialization.PointCommaSerializer;
import defpackage.gsq0;
import defpackage.r150;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@gsq0(with = PointCommaSerializer.class)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\bg\u0018\u0000 \t2\u00060\u0001j\u0002`\u0002:\u0001\tR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/yandex/mapkit/maps/core/geometry/Point;", "Landroid/os/Parcelable;", "Lkotlinx/parcelize/Parcelable;", "lat", "", "getLat", "()D", "lon", "getLon", "MpFactory", "exported-geometry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface Point extends Parcelable {

    /* renamed from: MpFactory, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @r150
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/mapkit/maps/core/geometry/Point$MpFactory;", "", "<init>", "()V", "invoke", "Lcom/yandex/mapkit/maps/core/geometry/Point;", "lat", "", "lon", "serializer", "Lkotlinx/serialization/KSerializer;", "exported-geometry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.yandex.mapkit.maps.core.geometry.Point$MpFactory, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Point invoke(double lat, double lon) {
            return new CommonPoint(lat, lon);
        }

        public final KSerializer serializer() {
            return PointCommaSerializer.INSTANCE;
        }
    }

    double getLat();

    double getLon();
}
