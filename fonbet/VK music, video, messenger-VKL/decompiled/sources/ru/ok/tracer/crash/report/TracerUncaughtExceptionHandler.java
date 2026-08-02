package ru.ok.tracer.crash.report;

import java.lang.Thread;

/* compiled from: TracerUncaughtExceptionHandler.kt */
/* loaded from: classes9.dex */
public final class TracerUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        TracerCrashReport.reportUncaughtException$tracer_crash_report_release(th);
    }
}
