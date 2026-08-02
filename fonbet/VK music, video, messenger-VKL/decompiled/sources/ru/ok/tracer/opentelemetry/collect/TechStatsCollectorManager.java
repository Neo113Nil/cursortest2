package ru.ok.tracer.opentelemetry.collect;

import android.os.Handler;
import android.os.Looper;
import ru.ok.tracer.BuildConfig;
import ru.ok.tracer.opentelemetry.OpenTelemetryConfiguration;
import xsna.jk3;
import xsna.q8x;

/* compiled from: TechStatsCollectorManager.kt */
/* loaded from: classes9.dex */
public final class TechStatsCollectorManager {
    public static final TechStatsCollectorManager INSTANCE = new TechStatsCollectorManager();
    private static final OpenTelemetryConfiguration config;
    private static final Handler handler;
    private static final TechStatsCollectorManager$runnable$1 runnable;
    private static final q8x scope;

    static {
        int i = q8x.a;
        scope = q8x.a(BuildConfig.LIBRARY_PACKAGE_NAME, "1.3.3", null, jk3.e);
        config = OpenTelemetryConfiguration.Companion.get();
        handler = new Handler(Looper.getMainLooper());
        runnable = new TechStatsCollectorManager$runnable$1();
    }

    private TechStatsCollectorManager() {
    }

    public final q8x getScope$tracer_opentelemetry_release() {
        return scope;
    }

    public final void start() {
        OpenTelemetryConfiguration openTelemetryConfiguration = config;
        if (openTelemetryConfiguration.getCollectCpuEnabled$tracer_opentelemetry_release() || openTelemetryConfiguration.getCollectNetworkEnabled$tracer_opentelemetry_release()) {
            handler.post(runnable);
        }
    }

    public final void stop() {
        handler.removeCallbacksAndMessages(null);
    }
}
