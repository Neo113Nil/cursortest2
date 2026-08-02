package com.yandex.mapkit.places.mrc.internal;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.places.mrc.MrcPhotoTrack;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class MrcPhotoTrackBinding implements MrcPhotoTrack {
    private final NativeObject nativeObject;

    public MrcPhotoTrackBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrack
    public native Polyline getTrackPolyline();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrack
    public native MrcPhotoTrack.TrackType getTrackType();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrack
    public native PolylinePosition snapToCoverage(Point point);
}
