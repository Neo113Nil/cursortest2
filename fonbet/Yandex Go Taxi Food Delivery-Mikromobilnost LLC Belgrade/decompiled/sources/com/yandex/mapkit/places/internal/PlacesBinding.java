package com.yandex.mapkit.places.internal;

import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.places.Places;
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
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.view.PlatformView;

/* loaded from: classes15.dex */
public class PlacesBinding implements Places {
    private final NativeObject nativeObject;

    public PlacesBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.Places
    public native MrcPhotoLayer createMrcPhotoLayer(MapWindow mapWindow);

    @Override // com.yandex.mapkit.places.Places
    public native MrcPhotoPlayer createMrcPhotoPlayer(PlatformView platformView);

    @Override // com.yandex.mapkit.places.Places
    public native MrcPhotoService createMrcPhotoService();

    @Override // com.yandex.mapkit.places.Places
    public native MrcPhotoTrackPlayer createMrcPhotoTrackPlayer(PlatformView platformView);

    @Override // com.yandex.mapkit.places.Places
    public native MrcPhotoTrackService createMrcPhotoTrackService();

    @Override // com.yandex.mapkit.places.Places
    public native PanoramaLayer createPanoramaLayer(MapWindow mapWindow);

    @Override // com.yandex.mapkit.places.Places
    public native Player createPanoramaPlayer(PlatformView platformView);

    @Override // com.yandex.mapkit.places.Places
    public native Player createPanoramaPlayer(PlatformView platformView, float f);

    @Override // com.yandex.mapkit.places.Places
    public native PanoramaService createPanoramaService();

    @Override // com.yandex.mapkit.places.Places
    public native PhotosManager createPhotosManager();

    @Override // com.yandex.mapkit.places.Places
    public native ToponymPhotoLayer createToponymPhotoLayer(MapWindow mapWindow);

    @Override // com.yandex.mapkit.places.Places
    public native ToponymPhotoService createToponymPhotoService();

    @Override // com.yandex.mapkit.places.Places
    public native boolean isValid();
}
