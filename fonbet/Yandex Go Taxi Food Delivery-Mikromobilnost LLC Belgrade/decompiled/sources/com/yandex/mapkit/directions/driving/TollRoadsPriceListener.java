package com.yandex.mapkit.directions.driving;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface TollRoadsPriceListener {
    void onTollRoadsPriceUpdateError(Error error);

    void onTollRoadsPriceUpdated();
}
