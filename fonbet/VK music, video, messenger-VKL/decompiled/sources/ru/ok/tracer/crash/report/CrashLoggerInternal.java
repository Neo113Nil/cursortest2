package ru.ok.tracer.crash.report;

import android.os.Looper;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import ru.ok.tracer.Severity;
import ru.ok.tracer.SystemState;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.base.drop.DropManager;
import ru.ok.tracer.base.limits.TokenBucket;
import ru.ok.tracer.session.SessionState;
import ru.ok.tracer.session.SessionStateStorage;
import ru.ok.tracer.session.TagsStorage;
import ru.ok.tracer.utils.Logger;
import ru.ok.tracer.utils.TracerThreads;
import ru.ok.tracer.utils.config.ConfigStorage;
import xsna.drm0;
import xsna.epx;
import xsna.erm0;
import xsna.o4;
import xsna.pn00;
import xsna.x;
import xsna.z;

/* compiled from: CrashLoggerInternal.kt */
/* loaded from: classes9.dex */
public final class CrashLoggerInternal {
    private final CrashStorage crashStorage;
    private final CrashUploader crashUploader;
    private final LogStorage logStorage;
    private final TokenBucket nonFatalBucket;
    private final AtomicInteger nonFatalDropCount;
    private final SessionStateStorage stateStorage;
    private final SessionStateUploader stateUploader;
    private final TagsStorage tagsStorage;

    public CrashLoggerInternal(CrashStorage crashStorage, SessionStateStorage sessionStateStorage, TagsStorage tagsStorage, LogStorage logStorage, SessionStateUploader sessionStateUploader, CrashUploader crashUploader) {
        this.crashStorage = crashStorage;
        this.stateStorage = sessionStateStorage;
        this.tagsStorage = tagsStorage;
        this.logStorage = logStorage;
        this.stateUploader = sessionStateUploader;
        this.crashUploader = crashUploader;
        this.nonFatalBucket = CrashReportConfiguration.Companion.get$tracer_crash_report_release().getNonFatalRateLimitEnabled$tracer_crash_report_release() ? new TokenBucket(10, 3600000L, TimeUnit.MILLISECONDS) : TokenBucket.Companion.oneShot(8);
        this.nonFatalDropCount = new AtomicInteger();
    }

    private final DropManager getDropManager() {
        return Tracer.INSTANCE.getDropManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportCrash$lambda$0(CrashLoggerInternal crashLoggerInternal, CrashDescription crashDescription, CountDownLatch countDownLatch) {
        crashLoggerInternal.crashUploader.upload(Collections.singletonList(crashDescription));
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportNonFatal$lambda$1(CrashLoggerInternal crashLoggerInternal) {
        crashLoggerInternal.getDropManager().drop("non_fatal", CrashReportConfiguration.Companion.get$tracer_crash_report_release().getNonFatalRateLimitEnabled$tracer_crash_report_release() ? "max_non_fatals_per_interval_reached" : "max_non_fatals_per_session_reached", crashLoggerInternal.nonFatalDropCount.getAndSet(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportNonFatal$lambda$2(CrashLoggerInternal crashLoggerInternal, CrashDescription crashDescription) {
        crashLoggerInternal.crashUploader.upload(Collections.singletonList(crashDescription));
    }

    private final SystemState withCurrentOpenTelemetryContext(SystemState systemState) {
        Map<String, String> collectContext = OpenTelemetryHelper.INSTANCE.collectContext();
        return (collectContext == null || collectContext.isEmpty()) ? systemState : SystemState.copy$default(systemState, null, 0L, null, null, null, null, null, null, null, null, false, null, false, pn00.n(systemState.getProperties(), collectContext), null, 24575, null);
    }

    private final SystemState withIssueKey(SystemState systemState, String str) {
        return (str == null || str.length() == 0) ? systemState : SystemState.copy$default(systemState, null, 0L, null, null, null, null, null, null, null, null, false, null, false, pn00.o(systemState.getProperties(), new Pair("issueKey", str)), null, 24575, null);
    }

    public final void log(String str) {
        this.logStorage.log(str);
    }

    public final void reportCrash(byte[] bArr) {
        if (TracerCrashReport.INSTANCE.isDisabled$tracer_crash_report_release()) {
            Logger.v$default("Crash report disabled", null, 2, null);
            return;
        }
        this.stateStorage.setCurrentSessionStatus(SessionState.Status.CRASH);
        if (ConfigStorage.isLimited$default(ConfigStorage.INSTANCE, FEATURE_CRASH_REPORTKt.getFEATURE_CRASH_REPORT(), null, 2, null)) {
            Logger.d$default("Crash reporting limited", null, 2, null);
            return;
        }
        CrashDescription save = this.crashStorage.save(ReportType.CRASH, bArr, withCurrentOpenTelemetryContext(this.stateStorage.getCurrentSystemState()).withCurrentDate(), this.tagsStorage.getTags(), Thread.getAllStackTraces(), this.logStorage.getLogs());
        if (save != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            TracerThreads.INSTANCE.runOnIo(new x(this, save, countDownLatch, 1));
            long j = epx.f(Looper.myLooper(), Looper.getMainLooper()) ? 5000L : 100000000L;
            this.stateUploader.waitSessionUpload(j);
            if (countDownLatch.await(j, TimeUnit.MILLISECONDS)) {
                Logger.d$default("Crash uploaded asap", null, 2, null);
            } else {
                Logger.d$default("Can't upload crash asap", null, 2, null);
            }
        }
    }

    public final void reportNonFatal(Severity severity, byte[] bArr, String str) {
        String obj;
        String str2 = null;
        if (TracerCrashReport.INSTANCE.isDisabled$tracer_crash_report_release()) {
            Logger.v$default("Crash report disabled", null, 2, null);
            return;
        }
        this.stateStorage.ensureCurrentSessionMaxSeverity(severity);
        if (ConfigStorage.isLimited$default(ConfigStorage.INSTANCE, FEATURE_CRASH_REPORTKt.getFEATURE_CRASH_REPORT(), null, 2, null)) {
            Logger.d$default("Crash reporting limited", null, 2, null);
            return;
        }
        if (!TokenBucket.allow$default(this.nonFatalBucket, 0, 1, null)) {
            Logger.d$default("Can't handle non fatal exception. Max non fatal count is reached.", null, 2, null);
            this.nonFatalDropCount.incrementAndGet();
            TracerThreads.INSTANCE.runInBgSequential(new o4(this, 7));
            return;
        }
        if (str != null && (obj = drm0.p0(str).toString()) != null) {
            if (obj.length() <= 0) {
                obj = null;
            }
            if (obj != null) {
                str2 = erm0.D0(32, obj);
            }
        }
        CrashDescription save$default = CrashStorage.save$default(this.crashStorage, ReportType.Companion.fromSeverity(severity), bArr, withCurrentOpenTelemetryContext(withIssueKey(this.stateStorage.getCurrentSystemState(), str2)).withCurrentDate(), this.tagsStorage.getTags(), null, this.logStorage.getLogs(), 16, null);
        if (save$default != null) {
            TracerThreads.INSTANCE.runOnIo(new z(1, this, save$default));
        }
    }
}
