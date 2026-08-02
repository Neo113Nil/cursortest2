package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.search.SuggestOptions;
import com.yandex.mapkit.search.SuggestSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class SuggestSessionBinding implements SuggestSession {
    private final NativeObject nativeObject;

    public SuggestSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.SuggestSession
    public native void reset();

    @Override // com.yandex.mapkit.search.SuggestSession
    public native void suggest(String str, BoundingBox boundingBox, SuggestOptions suggestOptions, SuggestSession.SuggestListener suggestListener);
}
