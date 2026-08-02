package com.yandex.mapkit.search.internal;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.search.ZeroSpeedBannerManager;
import com.yandex.mapkit.search.ZeroSpeedBannerSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class ZeroSpeedBannerManagerBinding implements ZeroSpeedBannerManager {
    private final NativeObject nativeObject;

    public ZeroSpeedBannerManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.search.ZeroSpeedBannerManager
    public native ZeroSpeedBannerSession requestZeroSpeedBanner(Point point, Polyline polyline, ZeroSpeedBannerSession.ZeroSpeedBannerListener zeroSpeedBannerListener);
}
