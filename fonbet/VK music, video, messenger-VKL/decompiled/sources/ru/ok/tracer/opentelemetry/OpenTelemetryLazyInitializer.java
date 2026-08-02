package ru.ok.tracer.opentelemetry;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import ru.ok.tracer.TracerInitializer;
import ru.ok.tracer.opentelemetry.collect.TechStatsCollectorManager;
import ru.ok.tracer.startup.Initializer;
import xsna.m1u;

/* compiled from: OpenTelemetryLazyInitializer.kt */
/* loaded from: classes11.dex */
public final class OpenTelemetryLazyInitializer implements Initializer<Object> {
    @Override // ru.ok.tracer.startup.Initializer
    public Object create(Context context) {
        OpenTelemetryConfiguration openTelemetryConfiguration = OpenTelemetryConfiguration.Companion.get();
        if (openTelemetryConfiguration.getInstallGlobal$tracer_opentelemetry_release()) {
            m1u.d(TracerOpenTelemetry.INSTANCE);
        }
        if (!openTelemetryConfiguration.getAutoStartCollect$tracer_opentelemetry_release()) {
            return null;
        }
        if (!openTelemetryConfiguration.getCollectCpuEnabled$tracer_opentelemetry_release() && !openTelemetryConfiguration.getCollectNetworkEnabled$tracer_opentelemetry_release()) {
            return null;
        }
        TechStatsCollectorManager.INSTANCE.start();
        return null;
    }

    @Override // ru.ok.tracer.startup.Initializer
    public List<Class<TracerInitializer>> dependencies() {
        return Collections.singletonList(TracerInitializer.class);
    }
}
