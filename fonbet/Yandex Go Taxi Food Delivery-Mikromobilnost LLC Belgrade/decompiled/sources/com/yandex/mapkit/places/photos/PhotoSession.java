package com.yandex.mapkit.places.photos;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface PhotoSession {

    public interface PhotoListener {
        void onPhotosFeedError(Error error);

        void onPhotosFeedReceived(PhotosFeed photosFeed);
    }

    void cancel();

    void fetchNextPage(PhotoListener photoListener);

    boolean hasNextPage();
}
