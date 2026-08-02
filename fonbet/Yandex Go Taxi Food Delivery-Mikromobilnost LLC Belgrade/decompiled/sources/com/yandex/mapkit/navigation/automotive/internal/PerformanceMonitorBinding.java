package com.yandex.mapkit.navigation.automotive.internal;

import com.yandex.mapkit.navigation.automotive.PerformanceMonitor;
import com.yandex.runtime.NativeObject;
import java.util.List;

/* loaded from: classes15.dex */
public class PerformanceMonitorBinding implements PerformanceMonitor {
    private final NativeObject nativeObject;

    public PerformanceMonitorBinding(NativeObject nativeObject) {
        this.nativeObject = nativeObject;
    }

    @Override // com.yandex.mapkit.navigation.automotive.PerformanceMonitor
    public native List<Float> quantiles(List<Float> list);

    @Override // com.yandex.mapkit.navigation.automotive.PerformanceMonitor
    public native void start();

    @Override // com.yandex.mapkit.navigation.automotive.PerformanceMonitor
    public native void stop();

    @Override // com.yandex.mapkit.navigation.automotive.PerformanceMonitor
    public native PerformanceMonitor.MetricTag tag();
}
