package ru.ok.tracer;

import android.app.Application;
import java.util.Map;
import ru.ok.tracer.utils.DefaultTracerLoggerDelegate;
import ru.ok.tracer.utils.TracerLoggerDelegate;
import xsna.jgp;

/* compiled from: TracerApplication.kt */
/* loaded from: classes9.dex */
public abstract class TracerApplication extends Application implements HasTracerConfiguration, HasTracerSystemInfo, HasTracerLogger {
    @Override // ru.ok.tracer.HasTracerLogger
    public TracerLoggerDelegate getTracerLoggerDelegate() {
        return DefaultTracerLoggerDelegate.Companion;
    }

    @Override // ru.ok.tracer.HasTracerSystemInfo
    public Map<String, String> getTracerSystemInfo() {
        return jgp.b;
    }
}
