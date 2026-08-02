package ru.ok.tracer.lite.crash.report;

import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import ru.ok.tracer.base.drop.DropManager;
import ru.ok.tracer.base.limits.TokenBucket;
import ru.ok.tracer.lite.Severity;
import ru.ok.tracer.lite.TagsStorageLite;
import ru.ok.tracer.lite.TracerLite;
import ru.ok.tracer.lite.crash.report.TracerCrashReportLite;
import ru.ok.tracer.lite.crash.report.upload.CrashUploaderLite;
import ru.ok.tracer.lite.crash.report.upload.CrashUploaderLiteKt;
import ru.ok.tracer.lite.limits.TracerLiteLimits;
import ru.ok.tracer.lite.upload.TracerDropHolder;
import ru.ok.tracer.lite.utils.TracerExecutorsHolder;
import xsna.drm0;
import xsna.erm0;
import xsna.gzs;
import xsna.id;
import xsna.izs;
import xsna.msy;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: TracerCrashReportLite.kt */
/* loaded from: classes11.dex */
public final class TracerCrashReportLite {
    public static final /* synthetic */ int a = 0;
    private final Configuration configuration;
    private final TracerLiteLimits limits;
    private final LogStorageLite logStorage;
    private final TokenBucket nonFatalBucket;
    private final AtomicInteger nonFatalDropCount;
    private final Lazy nonFatalsEnabled$delegate;
    private final TracerLite tracer;
    private volatile boolean tracerIsDisabled;
    private final CrashUploaderLite uploader;
    private static final Companion Companion = new Companion(null);
    private static final ConcurrentHashMap<String, TokenBucket> nonFatalBuckets = new ConcurrentHashMap<>();

    /* compiled from: TracerCrashReportLite.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: TracerCrashReportLite.kt */
    public static final class Configuration {
        public static final Companion Companion = new Companion(null);
        private final int maxLogsLength;
        private final boolean nonFatalRateLimitEnabled;
        private final boolean obfuscatedNonFatalsEnabled;

        /* compiled from: TracerCrashReportLite.kt */
        public static final class Builder {
            private int experimentalMaxLogLength = 65536;
            private boolean experimentalNonFatalRateLimitEnabled;
            private boolean obfuscatedNonFatalsEnabled;

            public final Configuration build() {
                return new Configuration(this, null);
            }

            public final int getExperimentalMaxLogLength() {
                return this.experimentalMaxLogLength;
            }

            public final boolean getExperimentalNonFatalRateLimitEnabled() {
                return this.experimentalNonFatalRateLimitEnabled;
            }

            public final boolean getObfuscatedNonFatalsEnabled() {
                return this.obfuscatedNonFatalsEnabled;
            }

            public final void setExperimentalMaxLogLength(int i) {
                this.experimentalMaxLogLength = i;
            }

            public final void setExperimentalNonFatalRateLimitEnabled(boolean z) {
                this.experimentalNonFatalRateLimitEnabled = z;
            }

            public final void setObfuscatedNonFatalsEnabled(boolean z) {
                this.obfuscatedNonFatalsEnabled = z;
            }
        }

        /* compiled from: TracerCrashReportLite.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final Configuration build(izs<? super Builder, s3q0> izsVar) {
                Builder builder = new Builder();
                izsVar.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public /* synthetic */ Configuration(Builder builder, zcl zclVar) {
            this(builder);
        }

        public final int getMaxLogsLength$tracer_lite_crash_report_release() {
            return this.maxLogsLength;
        }

        public final boolean getNonFatalRateLimitEnabled$tracer_lite_crash_report_release() {
            return this.nonFatalRateLimitEnabled;
        }

        public final boolean getObfuscatedNonFatalsEnabled$tracer_lite_crash_report_release() {
            return this.obfuscatedNonFatalsEnabled;
        }

        private Configuration(Builder builder) {
            this.obfuscatedNonFatalsEnabled = builder.getObfuscatedNonFatalsEnabled();
            this.maxLogsLength = builder.getExperimentalMaxLogLength();
            this.nonFatalRateLimitEnabled = builder.getExperimentalNonFatalRateLimitEnabled();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TracerCrashReportLite(TracerLite tracerLite) {
        this(tracerLite, null, 2, 0 == true ? 1 : 0);
    }

    private final DropManager getDropManager() {
        return TracerDropHolder.Companion.get(this.tracer);
    }

    private final Executor getIoExecutor() {
        return TracerExecutorsHolder.Companion.get(this.tracer).getIoExecutor();
    }

    private final boolean getNonFatalsEnabled() {
        return ((Boolean) this.nonFatalsEnabled$delegate.getValue()).booleanValue();
    }

    private final TagsStorageLite getTagsStorage() {
        return TagsStorageLite.Companion.get(this.tracer);
    }

    public static /* synthetic */ void report$default(TracerCrashReportLite tracerCrashReportLite, Throwable th, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        tracerCrashReportLite.report(th, str);
    }

    private final void reportException(final String str, final Throwable th, final String str2) {
        if (!this.tracerIsDisabled && getNonFatalsEnabled()) {
            if (this.limits.isLimited(TracerCrashReportLiteKt.FEATURE_CRASH_REPORT, null)) {
                Log.e("Tracer", "Feature CRASH_REPORT limited");
            } else if (TokenBucket.allow$default(this.nonFatalBucket, 0, 1, null)) {
                getIoExecutor().execute(new Runnable() { // from class: xsna.bep0
                    @Override // java.lang.Runnable
                    public final void run() {
                        TracerCrashReportLite.reportException$lambda$2(TracerCrashReportLite.this, str, th, str2);
                    }
                });
            } else {
                this.nonFatalDropCount.incrementAndGet();
                getIoExecutor().execute(new id(this, 13));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportException$lambda$1(TracerCrashReportLite tracerCrashReportLite) {
        tracerCrashReportLite.getDropManager().drop("non_fatal", tracerCrashReportLite.configuration.getNonFatalRateLimitEnabled$tracer_lite_crash_report_release() ? "max_non_fatals_per_interval_reached" : "max_non_fatals_per_session_reached", tracerCrashReportLite.nonFatalDropCount.getAndSet(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportException$lambda$2(TracerCrashReportLite tracerCrashReportLite, String str, Throwable th, String str2) {
        String obj;
        if (tracerCrashReportLite.tracer.isDisabled()) {
            tracerCrashReportLite.tracerIsDisabled = true;
            return;
        }
        String str3 = null;
        if (tracerCrashReportLite.limits.isLimited(TracerCrashReportLiteKt.FEATURE_CRASH_REPORT, null)) {
            Log.e("Tracer", "Feature CRASH_REPORT limited");
            return;
        }
        CrashUploaderLite crashUploaderLite = tracerCrashReportLite.uploader;
        if (str2 != null && (obj = drm0.p0(str2).toString()) != null) {
            if (obj.length() <= 0) {
                obj = null;
            }
            if (obj != null) {
                str3 = erm0.D0(32, obj);
            }
        }
        crashUploaderLite.upload(str, th, str3, tracerCrashReportLite.logStorage.getLogs$tracer_lite_crash_report_release(), tracerCrashReportLite.getTagsStorage().getTags());
    }

    public final void log(String str) {
        if (this.tracerIsDisabled) {
            return;
        }
        this.logStorage.log(str);
    }

    public final void report(Throwable th) {
        report$default(this, th, null, 2, null);
    }

    public TracerCrashReportLite(TracerLite tracerLite, Configuration configuration) {
        this.tracer = tracerLite;
        this.configuration = configuration;
        this.logStorage = new LogStorageLite(configuration.getMaxLogsLength$tracer_lite_crash_report_release());
        TracerLiteLimits tracerLiteLimits = TracerLiteLimits.Companion.get(tracerLite);
        this.limits = tracerLiteLimits;
        this.uploader = new CrashUploaderLite(tracerLite, tracerLiteLimits);
        this.nonFatalsEnabled$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new gzs<Boolean>() { // from class: ru.ok.tracer.lite.crash.report.TracerCrashReportLite$nonFatalsEnabled$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // xsna.gzs
            public final Boolean invoke() {
                TracerCrashReportLite.Configuration configuration2;
                configuration2 = TracerCrashReportLite.this.configuration;
                return Boolean.valueOf(configuration2.getObfuscatedNonFatalsEnabled$tracer_lite_crash_report_release() || !ObfuscationUtils.isObfuscated() || ObfuscationUtils.hasTracer());
            }
        });
        ConcurrentHashMap<String, TokenBucket> concurrentHashMap = nonFatalBuckets;
        String libraryPackageName = tracerLite.getLibraryPackageName();
        TokenBucket tokenBucket = concurrentHashMap.get(libraryPackageName);
        if (tokenBucket == null) {
            TokenBucket tokenBucket2 = configuration.getNonFatalRateLimitEnabled$tracer_lite_crash_report_release() ? new TokenBucket(10, 3600000L, TimeUnit.MILLISECONDS) : TokenBucket.Companion.oneShot(8);
            TokenBucket putIfAbsent = concurrentHashMap.putIfAbsent(libraryPackageName, tokenBucket2);
            tokenBucket = putIfAbsent == null ? tokenBucket2 : putIfAbsent;
        }
        this.nonFatalBucket = tokenBucket;
        this.nonFatalDropCount = new AtomicInteger();
    }

    public static /* synthetic */ void report$default(TracerCrashReportLite tracerCrashReportLite, Severity severity, Throwable th, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        tracerCrashReportLite.report(severity, th, str);
    }

    public final void report(Severity severity, Throwable th) {
        report$default(this, severity, th, null, 4, null);
    }

    public final void report(Throwable th, String str) {
        reportException(CrashUploaderLiteKt.SEVERITY_NON_FATAL, th, str);
    }

    public final void report(Severity severity, Throwable th, String str) {
        reportException(CrashUploaderLiteKt.toApiString(severity), th, str);
    }

    public /* synthetic */ TracerCrashReportLite(TracerLite tracerLite, Configuration configuration, int i, zcl zclVar) {
        this(tracerLite, (i & 2) != 0 ? new Configuration.Builder().build() : configuration);
    }
}
