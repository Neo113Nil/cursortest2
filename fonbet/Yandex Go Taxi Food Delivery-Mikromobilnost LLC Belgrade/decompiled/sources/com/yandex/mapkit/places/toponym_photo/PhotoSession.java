package com.yandex.mapkit.places.toponym_photo;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface PhotoSession {

    public interface PhotoListener {
        void onPhotoError(Error error);

        void onPhotoReceived(PhotoDescription photoDescription);
    }

    void cancel();

    void retry(PhotoListener photoListener);
}
