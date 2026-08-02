package com.yandex.mapkit.resource_url_provider;

import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class DefaultUrlProvider implements ResourceUrlProvider {
    private final NativeObject nativeObject = createNative();

    private static native NativeObject createNative();

    @Override // com.yandex.mapkit.resource_url_provider.ResourceUrlProvider
    public native String formatUrl(String str);

    public native void setUrlBase(String str);
}
