package com.yandex.mapkit.places.toponym_photo;

import com.yandex.mapkit.places.toponym_photo.ImageSession;
import com.yandex.mapkit.places.toponym_photo.PhotoSession;
import com.yandex.mapkit.places.toponym_photo.UploadSession;

/* loaded from: classes15.dex */
public interface ToponymPhotoService {
    void clearImageCache();

    ImageSession image(String str, String str2, ImageSession.ImageListener imageListener);

    PhotoSession photo(String str, PhotoSession.PhotoListener photoListener);

    FeedSession photos(String str);

    UploadSession uploadPhoto(byte[] bArr, String str, PhotoMetadata photoMetadata, UploadSession.UploadListener uploadListener);
}
