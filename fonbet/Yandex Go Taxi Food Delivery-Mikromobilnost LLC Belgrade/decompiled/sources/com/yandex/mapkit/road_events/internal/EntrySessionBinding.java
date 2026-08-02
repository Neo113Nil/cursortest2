package com.yandex.mapkit.road_events.internal;

import com.yandex.mapkit.road_events.EntrySession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class EntrySessionBinding implements EntrySession {
    private final NativeObject nativeObject;

    public EntrySessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.road_events.EntrySession
    public native void cancel();

    @Override // com.yandex.mapkit.road_events.EntrySession
    public native void retry(EntrySession.EntryListener entryListener);
}
