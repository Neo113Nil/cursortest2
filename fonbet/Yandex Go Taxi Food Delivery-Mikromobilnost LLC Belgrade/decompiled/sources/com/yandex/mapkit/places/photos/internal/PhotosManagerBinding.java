package com.yandex.mapkit.places.photos.internal;

import com.yandex.mapkit.places.photos.ImageSession;
import com.yandex.mapkit.places.photos.PhotoSession;
import com.yandex.mapkit.places.photos.PhotosManager;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes15.dex */
public class PhotosManagerBinding implements PhotosManager {
    private final NativeObject nativeObject;

    public PhotosManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.photos.PhotosManager
    public native void clear();

    @Override // com.yandex.mapkit.places.photos.PhotosManager
    public native ImageSession image(String str, String str2, ImageSession.ImageListener imageListener);

    @Override // com.yandex.mapkit.places.photos.PhotosManager
    public native PhotoSession photos(String str);

    @Override // com.yandex.mapkit.places.photos.PhotosManager
    public native PhotoSession photos(String str, List<String> list);

    @Override // com.yandex.mapkit.places.photos.PhotosManager
    public native PhotoSession photos(String str, List<String> list, List<String> list2);
}
