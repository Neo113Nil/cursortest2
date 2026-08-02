package com.yandex.mapkit.places.mrc;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.places.mrc.MrcPhotoLayer;
import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface MrcPhotoService {

    public interface SearchListener {
        void onPhotoSearchError(Error error);

        void onPhotoSearchResult(String str);
    }

    public interface SearchSession {
        void cancel();

        void retry(SearchListener searchListener);
    }

    SearchSession findNearestPhoto(MrcPhotoLayer.VisibleLayer visibleLayer, Point point, int i, SearchListener searchListener);
}
