package com.yandex.mapkit.places.toponym_photo.internal;

import com.yandex.mapkit.places.toponym_photo.FeedSession;
import com.yandex.mapkit.places.toponym_photo.ImageSession;
import com.yandex.mapkit.places.toponym_photo.PhotoMetadata;
import com.yandex.mapkit.places.toponym_photo.PhotoSession;
import com.yandex.mapkit.places.toponym_photo.ToponymPhotoService;
import com.yandex.mapkit.places.toponym_photo.UploadSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class ToponymPhotoServiceBinding implements ToponymPhotoService {
    private final NativeObject nativeObject;

    public ToponymPhotoServiceBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.toponym_photo.ToponymPhotoService
    public native void clearImageCache();

    @Override // com.yandex.mapkit.places.toponym_photo.ToponymPhotoService
    public native ImageSession image(String str, String str2, ImageSession.ImageListener imageListener);

    @Override // com.yandex.mapkit.places.toponym_photo.ToponymPhotoService
    public native PhotoSession photo(String str, PhotoSession.PhotoListener photoListener);

    @Override // com.yandex.mapkit.places.toponym_photo.ToponymPhotoService
    public native FeedSession photos(String str);

    @Override // com.yandex.mapkit.places.toponym_photo.ToponymPhotoService
    public native UploadSession uploadPhoto(byte[] bArr, String str, PhotoMetadata photoMetadata, UploadSession.UploadListener uploadListener);
}
