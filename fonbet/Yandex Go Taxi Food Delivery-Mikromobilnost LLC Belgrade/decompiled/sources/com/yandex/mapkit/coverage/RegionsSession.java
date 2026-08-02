package com.yandex.mapkit.coverage;

import com.yandex.runtime.Error;
import java.util.List;

/* loaded from: classes15.dex */
public interface RegionsSession {

    public interface RegionsListener {
        void onRegionsError(Error error);

        void onRegionsResponse(List<Region> list);
    }

    void cancel();

    void retry(RegionsListener regionsListener);
}
