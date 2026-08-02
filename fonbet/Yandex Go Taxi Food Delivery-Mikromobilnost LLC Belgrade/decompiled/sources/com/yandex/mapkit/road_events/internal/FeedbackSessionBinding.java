package com.yandex.mapkit.road_events.internal;

import com.yandex.mapkit.road_events.FeedbackSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class FeedbackSessionBinding implements FeedbackSession {
    private final NativeObject nativeObject;

    public FeedbackSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.road_events.FeedbackSession
    public native void cancel();

    @Override // com.yandex.mapkit.road_events.FeedbackSession
    public native void retry(FeedbackSession.FeedbackListener feedbackListener);
}
