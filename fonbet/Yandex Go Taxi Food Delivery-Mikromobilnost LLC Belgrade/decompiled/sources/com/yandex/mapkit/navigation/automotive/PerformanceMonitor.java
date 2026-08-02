package com.yandex.mapkit.navigation.automotive;

import java.util.List;

/* loaded from: classes15.dex */
public interface PerformanceMonitor {

    public enum MetricTag {
        EMIT_FRAME_DURATION,
        LOCATION_PROCESSING_TIME
    }

    List<Float> quantiles(List<Float> list);

    void start();

    void stop();

    MetricTag tag();
}
