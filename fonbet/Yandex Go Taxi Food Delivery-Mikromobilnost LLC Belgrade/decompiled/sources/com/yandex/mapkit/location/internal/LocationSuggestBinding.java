package com.yandex.mapkit.location.internal;

import com.yandex.mapkit.location.LocationSuggest;
import com.yandex.mapkit.location.LocationSuggestListener;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class LocationSuggestBinding implements LocationSuggest {
    private final NativeObject nativeObject;

    public LocationSuggestBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.location.LocationSuggest
    public native boolean isValid();

    @Override // com.yandex.mapkit.location.LocationSuggest
    public native void requestLocationSuggest(LocationSuggestListener locationSuggestListener);
}
