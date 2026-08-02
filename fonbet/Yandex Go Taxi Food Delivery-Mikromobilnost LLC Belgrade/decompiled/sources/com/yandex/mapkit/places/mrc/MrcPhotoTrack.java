package com.yandex.mapkit.places.mrc;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;

/* loaded from: classes15.dex */
public interface MrcPhotoTrack {

    public enum TrackType {
        AUTOMOTIVE,
        PEDESTRIAN
    }

    Polyline getTrackPolyline();

    TrackType getTrackType();

    PolylinePosition snapToCoverage(Point point);
}
