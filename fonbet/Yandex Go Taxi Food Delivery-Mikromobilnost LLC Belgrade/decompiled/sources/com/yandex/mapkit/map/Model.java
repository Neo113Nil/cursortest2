package com.yandex.mapkit.map;

import com.yandex.runtime.DataProviderWithId;

/* loaded from: classes15.dex */
public interface Model extends PlacemarkPresentation {
    ModelStyle getModelStyle();

    void setData(DataProviderWithId dataProviderWithId);

    void setData(DataProviderWithId dataProviderWithId, Callback callback);

    void setModelStyle(ModelStyle modelStyle);
}
