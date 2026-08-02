package com.yandex.runtime.view.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.view.FpsRenderCounts;
import com.yandex.runtime.view.RenderCountMonitor;
import java.util.List;

/* loaded from: classes2.dex */
public class RenderCountMonitorBinding implements RenderCountMonitor {
    private final NativeObject nativeObject;

    public RenderCountMonitorBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.runtime.view.RenderCountMonitor
    public native boolean isValid();

    @Override // com.yandex.runtime.view.RenderCountMonitor
    public native List<FpsRenderCounts> stop();
}
