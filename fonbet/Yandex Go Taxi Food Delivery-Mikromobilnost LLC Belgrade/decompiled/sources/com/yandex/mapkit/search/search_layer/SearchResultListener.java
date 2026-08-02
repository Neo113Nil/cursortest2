package com.yandex.mapkit.search.search_layer;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface SearchResultListener {
    void onAllResultsClear();

    void onPresentedResultsUpdate();

    void onSearchError(Error error, RequestType requestType);

    void onSearchStart(RequestType requestType);

    void onSearchSuccess(RequestType requestType);
}
