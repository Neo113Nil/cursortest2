package com.yandex.mapkit.places.mrc;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.places.mrc.MrcPhotoTrack;
import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface MrcPhotoTrackService {

    public interface MrcPhotoTrackListener {
        void onPhotoTrackError(Error error);

        void onPhotoTrackResult(MrcPhotoTrack mrcPhotoTrack);
    }

    public interface MrcPhotoTrackSession {
        void cancel();

        void retry(MrcPhotoTrackListener mrcPhotoTrackListener);
    }

    MrcPhotoTrackSession getMrcPhotoTrack(MrcPhotoTrack.TrackType trackType, Polyline polyline, MrcPhotoTrackListener mrcPhotoTrackListener);
}
