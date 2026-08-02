package com.yandex.mapkit.road_events.internal;

import com.yandex.mapkit.road_events.RoadEventSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class RoadEventSessionBinding implements RoadEventSession {
    private final NativeObject nativeObject;

    public RoadEventSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.road_events.RoadEventSession
    public native void cancel();

    @Override // com.yandex.mapkit.road_events.RoadEventSession
    public native void retry(RoadEventSession.RoadEventListener roadEventListener);
}
