package com.yandex.mapkit.places.mrc;

import com.yandex.mapkit.GeoPhoto;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface MrcPhotoTrackPlayer {

    public interface MrcPhotoTrackPlayerListener {
        void onError(MrcPhotoTrackPlayer mrcPhotoTrackPlayer, Error error);

        void onUpdate(MrcPhotoTrackPlayer mrcPhotoTrackPlayer);
    }

    public enum PlaybackSpeed {
        X1,
        X2,
        X4,
        X8
    }

    void addListener(MrcPhotoTrackPlayerListener mrcPhotoTrackPlayerListener);

    void disableMove();

    void enableMove();

    String getPhotoId();

    MrcPhotoTrack getPhotoTrack();

    PlaybackSpeed getPlaybackSpeed();

    PolylinePosition getPosition();

    GeoPhoto.ShootingPoint getShootingPoint();

    boolean isIsPlaying();

    boolean isValid();

    void openPhotoAt(PolylinePosition polylinePosition);

    void play();

    void removeListener(MrcPhotoTrackPlayerListener mrcPhotoTrackPlayerListener);

    void reset();

    void setPhotoTrack(MrcPhotoTrack mrcPhotoTrack);

    void setPlaybackSpeed(PlaybackSpeed playbackSpeed);

    void stop();
}
