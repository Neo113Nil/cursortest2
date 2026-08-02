package ru.ok.tracer.crash.report;

import android.content.Context;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import ru.ok.tracer.Severity;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.base.stacktrace.ThrowableUtils;
import ru.ok.tracer.crash.report.CrashReportConfiguration;
import ru.ok.tracer.crash.report.TracerCrashReport;
import ru.ok.tracer.session.SessionStateStorage;
import ru.ok.tracer.session.TagsStorage;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerThreads;
import ru.ok.tracer.utils.UncaughtExceptionHandlers;
import xsna.emb;
import xsna.qlb0;
import xsna.s3q0;

/* compiled from: TracerCrashReport.kt */
/* loaded from: classes11.dex */
public final class TracerCrashReport {
    public static final TracerCrashReport INSTANCE = new TracerCrashReport();
    private static CrashLoggerInternal crashLoggerInternal;
    private static boolean isConfigDisabled;

    private TracerCrashReport() {
    }

    private static final byte[] contentOf(Throwable th) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, emb.b), 8192);
        try {
            ThrowableUtils.appendStackTraceTo(th, bufferedWriter);
            s3q0 s3q0Var = s3q0.a;
            bufferedWriter.close();
            return byteArrayOutputStream.toByteArray();
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(CrashReportConfiguration crashReportConfiguration, Context context, SessionStateStorage sessionStateStorage, TagsStorage tagsStorage, LogStorage logStorage, CrashStorage crashStorage, AnrSnapshotStorage anrSnapshotStorage, CrashFreeConfiguration crashFreeConfiguration, SessionStateUploader sessionStateUploader, CrashUploader crashUploader) {
        if (crashReportConfiguration.getSendAnr$tracer_crash_report_release()) {
            AnrReporter.INSTANCE.check(context, sessionStateStorage, tagsStorage, logStorage, crashStorage, anrSnapshotStorage);
        }
        if (crashReportConfiguration.getNativeEnabled$tracer_crash_report_release()) {
            TracerNativeCrashReport.INSTANCE.check$tracer_crash_report_release(context, sessionStateStorage, tagsStorage, logStorage, crashStorage);
        }
        if (crashFreeConfiguration.getEnabled$tracer_crash_report_release()) {
            sessionStateUploader.collectAndUpload();
        }
        if (crashReportConfiguration.getAnrSnapshotsEnabled$tracer_crash_report_release()) {
            anrSnapshotStorage.clean();
            new AnrWatchdogThread(anrSnapshotStorage, crashReportConfiguration.getAnrSnapshotsDelayMs$tracer_crash_report_release(), crashReportConfiguration.getAnrSnapshotsIntervalMs$tracer_crash_report_release()).start();
        }
        if (INSTANCE.isDisabled$tracer_crash_report_release()) {
            crashStorage.deleteAll();
            return;
        }
        List<CrashDescription> readAll = crashStorage.readAll();
        if (!readAll.isEmpty()) {
            crashUploader.upload(readAll);
        }
        logStorage.clearPrevLogs();
        tagsStorage.clearPrevTags();
    }

    public static final void log(String str) {
        if (INSTANCE.isDisabled$tracer_crash_report_release()) {
            return;
        }
        try {
            CrashLoggerInternal crashLoggerInternal2 = crashLoggerInternal;
            if (crashLoggerInternal2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            crashLoggerInternal2.log(str);
        } catch (IllegalStateException unused) {
            INSTANCE.getClass();
        }
    }

    public static final void report(Throwable th) {
        report$default(th, null, 2, null);
    }

    public static /* synthetic */ void report$default(Throwable th, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        report(th, str);
    }

    private static final void reportCaughtException(Severity severity, Throwable th, String str) {
        if (INSTANCE.isDisabled$tracer_crash_report_release()) {
            Logger.d$default("Tracer is disabled", null, 2, null);
            return;
        }
        try {
            CrashLoggerInternal crashLoggerInternal2 = crashLoggerInternal;
            if (crashLoggerInternal2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            crashLoggerInternal2.reportNonFatal(severity, contentOf(th), str);
        } catch (IllegalStateException unused) {
            INSTANCE.getClass();
        }
    }

    public static final void reportThread(Severity severity, long j) {
        reportThread$default(severity, j, (String) null, 4, (Object) null);
    }

    public static /* synthetic */ void reportThread$default(Severity severity, Thread thread, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        reportThread(severity, thread, str);
    }

    public static final void reportUncaughtException$tracer_crash_report_release(Throwable th) {
        if (INSTANCE.isDisabled$tracer_crash_report_release()) {
            Logger.d$default("Tracer is disabled", null, 2, null);
            return;
        }
        try {
            CrashLoggerInternal crashLoggerInternal2 = crashLoggerInternal;
            if (crashLoggerInternal2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            crashLoggerInternal2.reportCrash(contentOf(th));
        } catch (IllegalStateException unused) {
            INSTANCE.getClass();
        }
    }

    private static final Thread threadById(long j) {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        while (threadGroup.getParent() != null) {
            threadGroup = threadGroup.getParent();
        }
        Thread[] threadArr = new Thread[threadGroup.activeCount() * 2];
        int enumerate = threadGroup.enumerate(threadArr, true);
        while (enumerate >= threadArr.length) {
            threadArr = new Thread[threadArr.length * 2];
            enumerate = threadGroup.enumerate(threadArr, true);
        }
        for (int i = 0; i < enumerate; i++) {
            Thread thread = threadArr[i];
            if (thread != null && thread.getId() == j) {
                return thread;
            }
        }
        Logger.e$default(qlb0.a(j, "Thread with id=", " not found"), null, 2, null);
        return null;
    }

    public final void init$tracer_crash_report_release(final Context context) {
        final CrashReportConfiguration crashReportConfiguration = CrashReportConfiguration.Companion.get$tracer_crash_report_release();
        if (!crashReportConfiguration.getEnabled$tracer_crash_report_release()) {
            isConfigDisabled = true;
            return;
        }
        if (crashReportConfiguration.getNativeEnabled$tracer_crash_report_release()) {
            TracerNativeCrashReport.INSTANCE.installExceptionHandler$tracer_crash_report_release(context);
        }
        final CrashFreeConfiguration crashFreeConfiguration = CrashFreeConfiguration.Companion.get$tracer_crash_report_release();
        Tracer tracer = Tracer.INSTANCE;
        final SessionStateStorage stateStorage = tracer.getStateStorage();
        final TagsStorage tagsStorage = tracer.getTagsStorage();
        final CrashStorage crashStorage = new CrashStorage(context);
        final LogStorage logStorage = new LogStorage(context, crashReportConfiguration.getPreservePrevLogs$tracer_crash_report_release(), crashReportConfiguration.getMaxLogsLength$tracer_crash_report_release());
        final CrashUploader crashUploader = new CrashUploader();
        final SessionStateUploader sessionStateUploader = new SessionStateUploader(stateStorage, context);
        final AnrSnapshotStorage anrSnapshotStorage = new AnrSnapshotStorage(crashReportConfiguration.getAnrSnapshotsMaxCount$tracer_crash_report_release(), context);
        crashLoggerInternal = new CrashLoggerInternal(crashStorage, stateStorage, tagsStorage, logStorage, sessionStateUploader, crashUploader);
        TracerThreads.INSTANCE.runOnIo(new Runnable() { // from class: xsna.aep0
            @Override // java.lang.Runnable
            public final void run() {
                TracerCrashReport.init$lambda$0(CrashReportConfiguration.this, context, stateStorage, tagsStorage, logStorage, crashStorage, anrSnapshotStorage, crashFreeConfiguration, sessionStateUploader, crashUploader);
            }
        });
        UncaughtExceptionHandlers.prependDefault(new TracerUncaughtExceptionHandler());
    }

    public final boolean isDisabled$tracer_crash_report_release() {
        return isConfigDisabled || Tracer.isDisabled();
    }

    public static final void report(Severity severity, Throwable th) {
        report$default(severity, th, null, 4, null);
    }

    public static /* synthetic */ void report$default(Severity severity, Throwable th, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        report(severity, th, str);
    }

    public static final void reportThread(Severity severity, Thread thread) {
        reportThread$default(severity, thread, (String) null, 4, (Object) null);
    }

    public static /* synthetic */ void reportThread$default(Severity severity, long j, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        reportThread(severity, j, str);
    }

    public static final void report(Throwable th, String str) {
        reportCaughtException(null, th, str);
    }

    public static final void reportThread(Severity severity, Thread thread, String str) {
        reportThread(severity, thread, thread.getId(), str);
    }

    public static final void report(Severity severity, Throwable th, String str) {
        reportCaughtException(severity, th, str);
    }

    public static final void reportThread(Severity severity, long j, String str) {
        reportThread(severity, null, j, str);
    }

    private static final void reportThread(Severity severity, Thread thread, long j, String str) {
        if (INSTANCE.isDisabled$tracer_crash_report_release()) {
            Logger.d$default("Tracer is disabled", null, 2, null);
            return;
        }
        try {
            CrashLoggerInternal crashLoggerInternal2 = crashLoggerInternal;
            if (crashLoggerInternal2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (thread == null && (thread = threadById(j)) == null) {
                return;
            }
            crashLoggerInternal2.reportNonFatal(severity, contentOf(thread), str);
        } catch (IllegalStateException unused) {
            INSTANCE.getClass();
        }
    }

    private static final byte[] contentOf(Thread thread) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, emb.b), 8192);
        try {
            bufferedWriter.append((CharSequence) ("Thread: \"" + thread.getName() + "\" prio=" + thread.getPriority() + " tid=" + thread.getId() + " " + thread.getState() + "\n"));
            for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                ThrowableUtils.appendTo$default(stackTraceElement, bufferedWriter, 0, null, 6, null);
            }
            s3q0 s3q0Var = s3q0.a;
            bufferedWriter.close();
            return byteArrayOutputStream.toByteArray();
        } finally {
        }
    }
}
