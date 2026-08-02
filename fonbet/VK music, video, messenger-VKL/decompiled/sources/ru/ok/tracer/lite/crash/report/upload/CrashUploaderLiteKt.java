package ru.ok.tracer.lite.crash.report.upload;

import ru.ok.tracer.lite.Severity;

/* compiled from: CrashUploaderLite.kt */
/* loaded from: classes9.dex */
public final class CrashUploaderLiteKt {
    private static final String API_TYPE_NON_FATAL = "NON_FATAL";
    private static final String FORMAT_JVM_STACKTRACE = "JVM_STACKTRACE";
    public static final String SEVERITY_NON_FATAL = "NON_FATAL";

    public static final String toApiString(Severity severity) {
        if (severity.equals(Severity.FATAL)) {
            return "FATAL";
        }
        if (severity.equals(Severity.ERROR)) {
            return "ERROR";
        }
        if (severity.equals(Severity.WARNING)) {
            return "WARNING";
        }
        if (severity.equals(Severity.NOTICE)) {
            return "NOTICE";
        }
        if (severity.equals(Severity.INFO)) {
            return "INFO";
        }
        Severity.Companion companion = Severity.Companion;
        return "DEBUG";
    }
}
