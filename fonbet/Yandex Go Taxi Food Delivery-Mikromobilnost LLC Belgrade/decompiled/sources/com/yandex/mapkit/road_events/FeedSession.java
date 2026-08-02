package com.yandex.mapkit.road_events;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface FeedSession {

    public interface FeedListener {
        void onFeedError(Error error);

        void onFeedReceived(Feed feed);
    }

    void cancel();

    void fetchNextPage(FeedListener feedListener);

    boolean hasNextPage();
}
