package com.yandex.mapkit.map;

import android.graphics.PointF;
import com.yandex.mapkit.geometry.BoundingBox;
import java.util.List;

/* loaded from: classes7.dex */
public interface CameraBounds {
    BoundingBox getLatLngBounds();

    float getMaxZoom();

    float getMinZoom();

    boolean isValid();

    void resetMinMaxZoomPreference();

    void setLatLngBounds(BoundingBox boundingBox);

    void setMaxZoomPreference(float f);

    void setMinZoomPreference(float f);

    void setTiltFunction(List<PointF> list);
}
