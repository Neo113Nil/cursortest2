package com.yandex.mapkit.coverage.internal;

import com.yandex.mapkit.coverage.IsCoveredSession;
import com.yandex.runtime.NativeObject;

/* loaded from: classes15.dex */
public class IsCoveredSessionBinding implements IsCoveredSession {
    private final NativeObject nativeObject;

    public IsCoveredSessionBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.coverage.IsCoveredSession
    public native void cancel();

    @Override // com.yandex.mapkit.coverage.IsCoveredSession
    public native void retry(IsCoveredSession.IsCoveredListener isCoveredListener);
}
