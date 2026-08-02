package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.search.ZeroSpeedBannerSession;

/* loaded from: classes15.dex */
public interface ZeroSpeedBannerManager {
    ZeroSpeedBannerSession requestZeroSpeedBanner(Point point, Polyline polyline, ZeroSpeedBannerSession.ZeroSpeedBannerListener zeroSpeedBannerListener);
}
