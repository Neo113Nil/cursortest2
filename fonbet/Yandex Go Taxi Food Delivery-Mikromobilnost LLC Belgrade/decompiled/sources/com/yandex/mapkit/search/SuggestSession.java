package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.runtime.Error;

/* loaded from: classes7.dex */
public interface SuggestSession {

    /* loaded from: classes15.dex */
    public interface SuggestListener {
        void onError(Error error);

        void onResponse(SuggestResponse suggestResponse);
    }

    void reset();

    void suggest(String str, BoundingBox boundingBox, SuggestOptions suggestOptions, SuggestListener suggestListener);
}
