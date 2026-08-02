package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.map.Callback;
import com.yandex.mapkit.map.Model;
import com.yandex.mapkit.map.ModelStyle;
import com.yandex.runtime.DataProviderWithId;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class ModelBinding extends PlacemarkPresentationBinding implements Model {
    public ModelBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.Model
    public native ModelStyle getModelStyle();

    @Override // com.yandex.mapkit.map.Model
    public native void setData(DataProviderWithId dataProviderWithId);

    @Override // com.yandex.mapkit.map.Model
    public native void setData(DataProviderWithId dataProviderWithId, Callback callback);

    @Override // com.yandex.mapkit.map.Model
    public native void setModelStyle(ModelStyle modelStyle);
}
