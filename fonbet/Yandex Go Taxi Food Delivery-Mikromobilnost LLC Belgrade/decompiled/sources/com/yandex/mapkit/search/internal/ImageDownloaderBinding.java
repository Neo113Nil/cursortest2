package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.search.ImageDownloader;
import com.yandex.mapkit.search.ImageListener;
import com.yandex.mapkit.search.ImageSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class ImageDownloaderBinding implements ImageDownloader {
    private final NativeObject nativeObject;

    public ImageDownloaderBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.ImageDownloader
    public native ImageSession requestImage(String str, ImageListener imageListener);
}
