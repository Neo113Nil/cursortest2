package com.yandex.mapkit.location;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes15.dex */
public interface LocationSuggestListener {
    void onLocationSuggestError(Error error);

    void onLocationSuggestReceived(List<Point> list);
}
