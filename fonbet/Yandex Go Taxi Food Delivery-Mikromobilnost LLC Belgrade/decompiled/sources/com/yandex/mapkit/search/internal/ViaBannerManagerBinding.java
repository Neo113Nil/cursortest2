package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.search.ViaBannerManager;
import com.yandex.mapkit.search.ViaBannerSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class ViaBannerManagerBinding implements ViaBannerManager {
    private final NativeObject nativeObject;

    public ViaBannerManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.ViaBannerManager
    public native ViaBannerSession requestViaBanner(Polyline polyline, ViaBannerSession.ViaBannerListener viaBannerListener);
}
