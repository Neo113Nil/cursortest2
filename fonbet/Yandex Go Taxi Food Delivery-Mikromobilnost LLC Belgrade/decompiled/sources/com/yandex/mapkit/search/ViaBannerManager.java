package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.search.ViaBannerSession;

/* loaded from: classes15.dex */
public interface ViaBannerManager {
    ViaBannerSession requestViaBanner(Polyline polyline, ViaBannerSession.ViaBannerListener viaBannerListener);
}
