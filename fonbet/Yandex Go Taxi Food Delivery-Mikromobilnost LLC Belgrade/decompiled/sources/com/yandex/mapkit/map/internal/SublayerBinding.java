package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.ConflictResolutionMode;
import com.yandex.mapkit.map.Sublayer;
import com.yandex.mapkit.map.SublayerFeatureFilter;
import com.yandex.mapkit.map.SublayerFeatureType;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class SublayerBinding implements Sublayer {
    private final NativeObject nativeObject;

    public SublayerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.map.Sublayer
    public native ConflictResolutionMode getConflictResolutionMode();

    @Override // com.yandex.mapkit.map.Sublayer
    public native SublayerFeatureType getFeatureType();

    @Override // com.yandex.mapkit.map.Sublayer
    public native SublayerFeatureFilter getFilter();

    @Override // com.yandex.mapkit.map.Sublayer
    public native String getLayerId();

    @Override // com.yandex.mapkit.map.Sublayer
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.Sublayer
    public native boolean isVisible();

    @Override // com.yandex.mapkit.map.Sublayer
    public native void setConflictResolutionMode(ConflictResolutionMode conflictResolutionMode);

    @Override // com.yandex.mapkit.map.Sublayer
    public native void setFeatureType(SublayerFeatureType sublayerFeatureType);

    @Override // com.yandex.mapkit.map.Sublayer
    public native void setLayerId(String str);

    @Override // com.yandex.mapkit.map.Sublayer
    public native void setVisible(boolean z);
}
