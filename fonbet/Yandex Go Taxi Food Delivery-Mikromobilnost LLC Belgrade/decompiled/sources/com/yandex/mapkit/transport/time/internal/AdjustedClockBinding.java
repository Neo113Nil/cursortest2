package com.yandex.mapkit.transport.time.internal;

import com.yandex.mapkit.transport.time.AdjustedClock;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class AdjustedClockBinding implements AdjustedClock {
    private final NativeObject nativeObject;

    public AdjustedClockBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.transport.time.AdjustedClock
    public native boolean isValid();

    @Override // com.yandex.mapkit.transport.time.AdjustedClock
    public native long now();

    @Override // com.yandex.mapkit.transport.time.AdjustedClock
    public native void pause();

    @Override // com.yandex.mapkit.transport.time.AdjustedClock
    public native void resume();
}
