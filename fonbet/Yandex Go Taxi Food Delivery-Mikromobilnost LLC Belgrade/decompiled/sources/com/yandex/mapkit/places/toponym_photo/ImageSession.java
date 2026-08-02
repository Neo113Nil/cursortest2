package com.yandex.mapkit.places.toponym_photo;

import android.graphics.Bitmap;
import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface ImageSession {

    public interface ImageListener {
        void onImageError(Error error);

        void onImageReceived(Bitmap bitmap);
    }

    void cancel();

    void retry(ImageListener imageListener);
}
