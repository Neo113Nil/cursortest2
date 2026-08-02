package com.yandex.mapkit.places;

import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.places.mrc.MrcPhotoLayer;
import com.yandex.mapkit.places.mrc.MrcPhotoPlayer;
import com.yandex.mapkit.places.mrc.MrcPhotoService;
import com.yandex.mapkit.places.mrc.MrcPhotoTrackPlayer;
import com.yandex.mapkit.places.mrc.MrcPhotoTrackService;
import com.yandex.mapkit.places.panorama.PanoramaLayer;
import com.yandex.mapkit.places.panorama.PanoramaService;
import com.yandex.mapkit.places.panorama.Player;
import com.yandex.mapkit.places.photos.PhotosManager;
import com.yandex.mapkit.places.toponym_photo.ToponymPhotoLayer;
import com.yandex.mapkit.places.toponym_photo.ToponymPhotoService;
import com.yandex.runtime.view.PlatformView;

/* loaded from: classes15.dex */
public interface Places {
    MrcPhotoLayer createMrcPhotoLayer(MapWindow mapWindow);

    MrcPhotoPlayer createMrcPhotoPlayer(PlatformView platformView);

    MrcPhotoService createMrcPhotoService();

    MrcPhotoTrackPlayer createMrcPhotoTrackPlayer(PlatformView platformView);

    MrcPhotoTrackService createMrcPhotoTrackService();

    PanoramaLayer createPanoramaLayer(MapWindow mapWindow);

    Player createPanoramaPlayer(PlatformView platformView);

    Player createPanoramaPlayer(PlatformView platformView, float f);

    PanoramaService createPanoramaService();

    PhotosManager createPhotosManager();

    ToponymPhotoLayer createToponymPhotoLayer(MapWindow mapWindow);

    ToponymPhotoService createToponymPhotoService();

    boolean isValid();
}
