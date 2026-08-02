package ru.ok.tracer.opentelemetry.collect;

import android.os.Handler;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.opentelemetry.OpenTelemetryConfiguration;
import ru.ok.tracer.utils.TracerThreads;
import xsna.bi5;

/* compiled from: TechStatsCollectorManager.kt */
/* loaded from: classes9.dex */
public final class TechStatsCollectorManager$runnable$1 implements Runnable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void run$lambda$0(TechStatsCollectorManager$runnable$1 techStatsCollectorManager$runnable$1) {
        OpenTelemetryConfiguration openTelemetryConfiguration;
        OpenTelemetryConfiguration openTelemetryConfiguration2;
        Handler handler;
        OpenTelemetryConfiguration openTelemetryConfiguration3;
        if (Tracer.isDisabled()) {
            return;
        }
        openTelemetryConfiguration = TechStatsCollectorManager.config;
        if (openTelemetryConfiguration.getCollectCpuEnabled$tracer_opentelemetry_release()) {
            CpuTimeProducer.INSTANCE.collect();
        }
        openTelemetryConfiguration2 = TechStatsCollectorManager.config;
        if (openTelemetryConfiguration2.getCollectNetworkEnabled$tracer_opentelemetry_release()) {
            NetworkIoProducer.INSTANCE.collect();
        }
        handler = TechStatsCollectorManager.handler;
        openTelemetryConfiguration3 = TechStatsCollectorManager.config;
        handler.postDelayed(techStatsCollectorManager$runnable$1, openTelemetryConfiguration3.getCollectIntervalMillis$tracer_opentelemetry_release());
    }

    @Override // java.lang.Runnable
    public void run() {
        TracerThreads.INSTANCE.runInBgSequential(new bi5(this, 9));
    }
}
