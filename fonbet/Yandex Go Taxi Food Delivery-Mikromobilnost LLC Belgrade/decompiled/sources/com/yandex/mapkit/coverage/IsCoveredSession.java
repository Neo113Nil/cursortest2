package com.yandex.mapkit.coverage;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface IsCoveredSession {

    public interface IsCoveredListener {
        void onCoveredError(Error error);

        void onCoveredResponse(boolean z);
    }

    void cancel();

    void retry(IsCoveredListener isCoveredListener);
}
