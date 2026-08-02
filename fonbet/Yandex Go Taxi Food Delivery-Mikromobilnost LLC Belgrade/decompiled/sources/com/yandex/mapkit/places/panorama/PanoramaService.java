package com.yandex.mapkit.places.panorama;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.Error;

/* loaded from: classes13.dex */
public interface PanoramaService {

    public interface SearchListener {
        void onPanoramaSearchError(Error error);

        void onPanoramaSearchResult(String str);
    }

    /* loaded from: classes15.dex */
    public interface SearchSession {
        void cancel();

        void retry(SearchListener searchListener);
    }

    SearchSession findNearest(Point point, SearchListener searchListener);
}
