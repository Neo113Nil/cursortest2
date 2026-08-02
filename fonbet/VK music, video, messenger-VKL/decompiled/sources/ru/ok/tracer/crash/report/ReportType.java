package ru.ok.tracer.crash.report;

import ru.ok.tracer.Severity;
import ru.ok.tracer.lite.crash.report.upload.CrashUploaderLiteKt;
import xsna.epx;
import xsna.zcl;

/* compiled from: ReportType.kt */
/* loaded from: classes9.dex */
public enum ReportType {
    CRASH("JVM_STACKTRACE", "CRASH", "CRASH"),
    NON_FATAL("JVM_STACKTRACE", CrashUploaderLiteKt.SEVERITY_NON_FATAL, CrashUploaderLiteKt.SEVERITY_NON_FATAL),
    FATAL("JVM_STACKTRACE", CrashUploaderLiteKt.SEVERITY_NON_FATAL, "FATAL"),
    ERROR("JVM_STACKTRACE", CrashUploaderLiteKt.SEVERITY_NON_FATAL, "ERROR"),
    WARNING("JVM_STACKTRACE", CrashUploaderLiteKt.SEVERITY_NON_FATAL, "WARNING"),
    NOTICE("JVM_STACKTRACE", CrashUploaderLiteKt.SEVERITY_NON_FATAL, "NOTICE"),
    INFO("JVM_STACKTRACE", CrashUploaderLiteKt.SEVERITY_NON_FATAL, "INFO"),
    DEBUG("JVM_STACKTRACE", CrashUploaderLiteKt.SEVERITY_NON_FATAL, "DEBUG"),
    MINIDUMP("MINIDUMP", "MINIDUMP", "CRASH"),
    ANR("ANDROID_ANR", "ANR", null, 4, null);

    public static final Companion Companion = new Companion(null);
    private final String format;
    private final String severity;
    private final String type;

    /* compiled from: ReportType.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final ReportType fromSeverity(Severity severity) {
            return epx.f(severity, Severity.FATAL) ? ReportType.FATAL : epx.f(severity, Severity.ERROR) ? ReportType.ERROR : epx.f(severity, Severity.WARNING) ? ReportType.WARNING : epx.f(severity, Severity.NOTICE) ? ReportType.NOTICE : epx.f(severity, Severity.INFO) ? ReportType.INFO : epx.f(severity, Severity.DEBUG) ? ReportType.DEBUG : ReportType.NON_FATAL;
        }

        private Companion() {
        }
    }

    ReportType(String str, String str2, String str3) {
        this.format = str;
        this.type = str2;
        this.severity = str3;
    }

    public static final ReportType fromSeverity(Severity severity) {
        return Companion.fromSeverity(severity);
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getSeverity() {
        return this.severity;
    }

    public final String getType() {
        return this.type;
    }

    /* synthetic */ ReportType(String str, String str2, String str3, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
