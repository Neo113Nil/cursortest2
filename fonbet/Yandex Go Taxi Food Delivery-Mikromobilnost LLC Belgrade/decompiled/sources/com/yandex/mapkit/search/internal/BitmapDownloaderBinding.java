package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.search.BitmapDownloader;
import com.yandex.mapkit.search.BitmapSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes7.dex */
public class BitmapDownloaderBinding implements BitmapDownloader {
    private final NativeObject nativeObject;

    public BitmapDownloaderBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.BitmapDownloader
    public native BitmapSession requestBitmap(String str, float f, BitmapSession.BitmapListener bitmapListener);
}
