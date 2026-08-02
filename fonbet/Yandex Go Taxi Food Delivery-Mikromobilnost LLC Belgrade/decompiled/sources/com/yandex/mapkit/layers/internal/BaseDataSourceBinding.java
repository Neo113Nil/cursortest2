package com.yandex.mapkit.layers.internal;

import com.yandex.mapkit.layers.BaseDataSource;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class BaseDataSourceBinding implements BaseDataSource {
    private final NativeObject nativeObject;

    public BaseDataSourceBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.layers.BaseDataSource
    public native String getId();

    @Override // com.yandex.mapkit.layers.BaseDataSource
    public native boolean isValid();
}
