package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.map.Sublayer;
import com.yandex.mapkit.map.SublayerFeatureType;
import com.yandex.mapkit.map.SublayerManager;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class SublayerManagerBinding implements SublayerManager {
    private final NativeObject nativeObject;

    public SublayerManagerBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.map.SublayerManager
    public native Sublayer appendSublayer(String str, SublayerFeatureType sublayerFeatureType);

    @Override // com.yandex.mapkit.map.SublayerManager
    public native Integer findFirstOf(String str);

    @Override // com.yandex.mapkit.map.SublayerManager
    public native Integer findFirstOf(String str, SublayerFeatureType sublayerFeatureType);

    @Override // com.yandex.mapkit.map.SublayerManager
    public native Sublayer get(int i);

    @Override // com.yandex.mapkit.map.SublayerManager
    public native Sublayer insertSublayerAfter(int i, String str, SublayerFeatureType sublayerFeatureType);

    @Override // com.yandex.mapkit.map.SublayerManager
    public native Sublayer insertSublayerBefore(int i, String str, SublayerFeatureType sublayerFeatureType);

    @Override // com.yandex.mapkit.map.SublayerManager
    public native boolean isValid();

    @Override // com.yandex.mapkit.map.SublayerManager
    public native void moveAfter(int i, int i2);

    @Override // com.yandex.mapkit.map.SublayerManager
    public native void moveBefore(int i, int i2);

    @Override // com.yandex.mapkit.map.SublayerManager
    public native void moveToEnd(int i);

    @Override // com.yandex.mapkit.map.SublayerManager
    public native void remove(int i);

    @Override // com.yandex.mapkit.map.SublayerManager
    public native int size();
}
