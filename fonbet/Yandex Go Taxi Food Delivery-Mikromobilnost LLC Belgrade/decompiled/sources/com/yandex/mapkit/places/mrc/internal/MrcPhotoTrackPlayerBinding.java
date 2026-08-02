package com.yandex.mapkit.places.mrc.internal;

import com.yandex.mapkit.GeoPhoto;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.places.mrc.MrcPhotoTrack;
import com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;

/* loaded from: classes15.dex */
public class MrcPhotoTrackPlayerBinding implements MrcPhotoTrackPlayer {
    protected Subscription<MrcPhotoTrackPlayer.MrcPhotoTrackPlayerListener> mrcPhotoTrackPlayerListenerSubscription = new Subscription<MrcPhotoTrackPlayer.MrcPhotoTrackPlayerListener>(this) { // from class: com.yandex.mapkit.places.mrc.internal.MrcPhotoTrackPlayerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(MrcPhotoTrackPlayer.MrcPhotoTrackPlayerListener mrcPhotoTrackPlayerListener) {
            return MrcPhotoTrackPlayerBinding.createMrcPhotoTrackPlayerListener(mrcPhotoTrackPlayerListener);
        }
    };
    private final NativeObject nativeObject;

    public MrcPhotoTrackPlayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createMrcPhotoTrackPlayerListener(MrcPhotoTrackPlayer.MrcPhotoTrackPlayerListener mrcPhotoTrackPlayerListener);

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native void addListener(MrcPhotoTrackPlayer.MrcPhotoTrackPlayerListener mrcPhotoTrackPlayerListener);

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native void disableMove();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native void enableMove();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native String getPhotoId();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native MrcPhotoTrack getPhotoTrack();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native MrcPhotoTrackPlayer.PlaybackSpeed getPlaybackSpeed();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native PolylinePosition getPosition();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native GeoPhoto.ShootingPoint getShootingPoint();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native boolean isIsPlaying();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native void openPhotoAt(PolylinePosition polylinePosition);

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native void play();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native void removeListener(MrcPhotoTrackPlayer.MrcPhotoTrackPlayerListener mrcPhotoTrackPlayerListener);

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native void reset();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native void setPhotoTrack(MrcPhotoTrack mrcPhotoTrack);

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native void setPlaybackSpeed(MrcPhotoTrackPlayer.PlaybackSpeed playbackSpeed);

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer
    public native void stop();
}
