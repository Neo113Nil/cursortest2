package com.yandex.mapkit.places.toponym_photo;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface UploadSession {

    public interface UploadListener {
        void onUploadError(Error error);

        void onUploadSuccess();
    }

    void cancel();

    void retry(UploadListener uploadListener);
}
