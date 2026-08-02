package com.yandex.mapkit.places.toponym_photo;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface FeedSession {

    public interface FeedListener {
        void onPhotosFeedError(Error error);

        void onPhotosFeedReceived(Feed feed);
    }

    void cancel();

    void fetchNextPage(FeedListener feedListener);

    boolean hasNextPage();
}
