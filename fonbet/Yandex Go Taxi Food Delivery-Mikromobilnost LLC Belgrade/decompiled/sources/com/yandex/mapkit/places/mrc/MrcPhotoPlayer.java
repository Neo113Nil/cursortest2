package com.yandex.mapkit.places.mrc;

import com.yandex.mapkit.GeoPhoto;
import com.yandex.mapkit.places.mrc.MrcPhotoLayer;
import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes15.dex */
public interface MrcPhotoPlayer {

    public interface MrcPhotoPlayerListener {
        void onPhotoOpenError(MrcPhotoPlayer mrcPhotoPlayer, Error error);

        void onPhotoUpdated(MrcPhotoPlayer mrcPhotoPlayer);
    }

    void addListener(MrcPhotoPlayerListener mrcPhotoPlayerListener);

    void disableMove();

    void enableMove();

    String getPhotoId();

    GeoPhoto.ShootingPoint getShootingPoint();

    MrcPhotoLayer.VisibleLayer getVisibleLayer();

    List<HistoricalPhoto> historicalPhotos();

    boolean isValid();

    boolean moveEnabled();

    void openPhoto(String str);

    void removeListener(MrcPhotoPlayerListener mrcPhotoPlayerListener);

    void reset();

    void setVisibleLayer(MrcPhotoLayer.VisibleLayer visibleLayer);
}
