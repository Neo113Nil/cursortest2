package com.yandex.mapkit.places.mrc.internal;

import com.yandex.mapkit.GeoPhoto;
import com.yandex.mapkit.places.mrc.HistoricalPhoto;
import com.yandex.mapkit.places.mrc.MrcPhotoLayer;
import com.yandex.mapkit.places.mrc.MrcPhotoPlayer;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.subscription.Subscription;
import java.util.List;

/* loaded from: classes15.dex */
public class MrcPhotoPlayerBinding implements MrcPhotoPlayer {
    protected Subscription<MrcPhotoPlayer.MrcPhotoPlayerListener> mrcPhotoPlayerListenerSubscription = new Subscription<MrcPhotoPlayer.MrcPhotoPlayerListener>(this) { // from class: com.yandex.mapkit.places.mrc.internal.MrcPhotoPlayerBinding.1
        @Override // com.yandex.runtime.subscription.Subscription
        public NativeObject createNativeListener(MrcPhotoPlayer.MrcPhotoPlayerListener mrcPhotoPlayerListener) {
            return MrcPhotoPlayerBinding.createMrcPhotoPlayerListener(mrcPhotoPlayerListener);
        }
    };
    private final NativeObject nativeObject;

    public MrcPhotoPlayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native NativeObject createMrcPhotoPlayerListener(MrcPhotoPlayer.MrcPhotoPlayerListener mrcPhotoPlayerListener);

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native void addListener(MrcPhotoPlayer.MrcPhotoPlayerListener mrcPhotoPlayerListener);

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native void disableMove();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native void enableMove();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native String getPhotoId();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native GeoPhoto.ShootingPoint getShootingPoint();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native MrcPhotoLayer.VisibleLayer getVisibleLayer();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native List<HistoricalPhoto> historicalPhotos();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native boolean moveEnabled();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native void openPhoto(String str);

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native void removeListener(MrcPhotoPlayer.MrcPhotoPlayerListener mrcPhotoPlayerListener);

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native void reset();

    @Override // com.yandex.mapkit.places.mrc.MrcPhotoPlayer
    public native void setVisibleLayer(MrcPhotoLayer.VisibleLayer visibleLayer);
}
