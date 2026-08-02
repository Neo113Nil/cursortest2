package ru.ok.tracer.crash.report;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import ru.ok.tracer.TracerInitializer;
import ru.ok.tracer.startup.Initializer;

/* compiled from: CrashReportInitializer.kt */
/* loaded from: classes11.dex */
public final class CrashReportInitializer implements Initializer<TracerCrashReport> {
    @Override // ru.ok.tracer.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.singletonList(TracerInitializer.class);
    }

    @Override // ru.ok.tracer.startup.Initializer
    public TracerCrashReport create(Context context) {
        TracerCrashReport tracerCrashReport = TracerCrashReport.INSTANCE;
        tracerCrashReport.init$tracer_crash_report_release(context);
        return tracerCrashReport;
    }
}
