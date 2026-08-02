package com.yandex.mapkit.places.photos.internal;

import com.yandex.mapkit.places.photos.PhotoSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class PhotoSessionBinding implements PhotoSession {
    private final NativeObject nativeObject;

    public PhotoSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.places.photos.PhotoSession
    public native void cancel();

    @Override // com.yandex.mapkit.places.photos.PhotoSession
    public native void fetchNextPage(PhotoSession.PhotoListener photoListener);

    @Override // com.yandex.mapkit.places.photos.PhotoSession
    public native boolean hasNextPage();
}
