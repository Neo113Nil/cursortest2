package com.yandex.mapkit.map.internal;

import com.yandex.mapkit.map.MapDebug;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.view.internal.DebugBinding;

/* loaded from: classes2.dex */
public class MapDebugBinding extends DebugBinding implements MapDebug {
    public MapDebugBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.MapDebug
    public native String getMemUsage();
}
