package com.yandex.mapkit.personalized_poi.internal;

import com.yandex.mapkit.personalized_poi.PersonalizedPoiLayer;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class PersonalizedPoiLayerBinding implements PersonalizedPoiLayer {
    private final NativeObject nativeObject;

    public PersonalizedPoiLayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.personalized_poi.PersonalizedPoiLayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.personalized_poi.PersonalizedPoiLayer
    public native boolean isVisible();

    @Override // com.yandex.mapkit.personalized_poi.PersonalizedPoiLayer
    public native void setVisible(boolean z);
}
