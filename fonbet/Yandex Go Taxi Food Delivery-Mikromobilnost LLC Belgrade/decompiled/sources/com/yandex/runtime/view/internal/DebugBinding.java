package com.yandex.runtime.view.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.view.Debug;

/* loaded from: classes2.dex */
public class DebugBinding implements Debug {
    private final NativeObject nativeObject;

    public DebugBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.view.Debug
    public native void forceMemoryWarning();

    @Override // com.yandex.runtime.view.Debug
    public native String getGpuCapabilities();

    @Override // com.yandex.runtime.view.Debug
    public native boolean isValid();
}
