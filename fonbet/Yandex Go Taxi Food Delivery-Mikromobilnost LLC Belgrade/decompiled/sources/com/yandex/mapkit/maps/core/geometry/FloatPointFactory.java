package com.yandex.mapkit.maps.core.geometry;

import android.graphics.PointF;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/yandex/mapkit/maps/core/geometry/FloatPointFactory;", "", "<init>", "()V", "create", "Landroid/graphics/PointF;", "Lcom/yandex/mapkit/maps/core/geometry/FloatPoint;", RemoteBioParameters.X, "", RemoteBioParameters.Y, "exported-geometry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FloatPointFactory {
    public static final FloatPointFactory INSTANCE = new FloatPointFactory();

    private FloatPointFactory() {
    }

    public final PointF create(float x, float y) {
        return new PointF(x, y);
    }
}
