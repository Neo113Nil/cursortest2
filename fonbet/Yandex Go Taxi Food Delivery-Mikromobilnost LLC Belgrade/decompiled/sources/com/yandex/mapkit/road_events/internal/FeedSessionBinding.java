package com.yandex.mapkit.road_events.internal;

import com.yandex.mapkit.road_events.FeedSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class FeedSessionBinding implements FeedSession {
    private final NativeObject nativeObject;

    public FeedSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.road_events.FeedSession
    public native void cancel();

    @Override // com.yandex.mapkit.road_events.FeedSession
    public native void fetchNextPage(FeedSession.FeedListener feedListener);

    @Override // com.yandex.mapkit.road_events.FeedSession
    public native boolean hasNextPage();
}
