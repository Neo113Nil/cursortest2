package ru.ok.tracer.crash.report;

import ru.ok.tracer.Tracer;
import ru.ok.tracer.TracerConfiguration;
import ru.ok.tracer.TracerFeature;
import xsna.izs;
import xsna.ozl;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: CrashReportConfiguration.kt */
/* loaded from: classes11.dex */
public final class CrashReportConfiguration implements TracerConfiguration {
    public static final Companion Companion = new Companion(null);
    private final long anrSnapshotsDelayMs;
    private final boolean anrSnapshotsEnabled;
    private final long anrSnapshotsIntervalMs;
    private final int anrSnapshotsMaxCount;
    private final boolean enabled;
    private final int maxLogsLength;
    private final boolean nativeEnabled;
    private final boolean nonFatalRateLimitEnabled;
    private final boolean preservePrevLogs;
    private final boolean sendAnr;

    /* compiled from: CrashReportConfiguration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final CrashReportConfiguration get$tracer_crash_report_release() {
            TracerConfiguration tracerConfiguration = Tracer.INSTANCE.getRuntimeConfigs().get(FEATURE_CRASH_REPORTKt.getFEATURE_CRASH_REPORT());
            CrashReportConfiguration crashReportConfiguration = tracerConfiguration instanceof CrashReportConfiguration ? (CrashReportConfiguration) tracerConfiguration : null;
            return crashReportConfiguration == null ? new Builder().build() : crashReportConfiguration;
        }

        /* renamed from: private, reason: not valid java name */
        public final CrashReportConfiguration m402private(izs<? super Builder, s3q0> izsVar) {
            Builder builder = new Builder();
            izsVar.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CrashReportConfiguration(Builder builder, zcl zclVar) {
        this(builder);
    }

    public final long getAnrSnapshotsDelayMs$tracer_crash_report_release() {
        return this.anrSnapshotsDelayMs;
    }

    public final boolean getAnrSnapshotsEnabled$tracer_crash_report_release() {
        return this.anrSnapshotsEnabled;
    }

    public final long getAnrSnapshotsIntervalMs$tracer_crash_report_release() {
        return this.anrSnapshotsIntervalMs;
    }

    public final int getAnrSnapshotsMaxCount$tracer_crash_report_release() {
        return this.anrSnapshotsMaxCount;
    }

    public final boolean getEnabled$tracer_crash_report_release() {
        return this.enabled;
    }

    @Override // ru.ok.tracer.TracerConfiguration
    public TracerFeature getFeature() {
        return FEATURE_CRASH_REPORTKt.getFEATURE_CRASH_REPORT();
    }

    public final int getMaxLogsLength$tracer_crash_report_release() {
        return this.maxLogsLength;
    }

    public final boolean getNativeEnabled$tracer_crash_report_release() {
        return this.nativeEnabled;
    }

    public final boolean getNonFatalRateLimitEnabled$tracer_crash_report_release() {
        return this.nonFatalRateLimitEnabled;
    }

    public final boolean getPreservePrevLogs$tracer_crash_report_release() {
        return this.preservePrevLogs;
    }

    public final boolean getSendAnr$tracer_crash_report_release() {
        return this.sendAnr;
    }

    private CrashReportConfiguration(Builder builder) {
        Boolean enabled$tracer_crash_report_release = builder.getEnabled$tracer_crash_report_release();
        this.enabled = enabled$tracer_crash_report_release != null ? enabled$tracer_crash_report_release.booleanValue() : true;
        this.nativeEnabled = TracerNativeCrashReport.INSTANCE.calculateEnabled$tracer_crash_report_release(builder.getNativeEnabled$tracer_crash_report_release());
        Boolean sendAnr$tracer_crash_report_release = builder.getSendAnr$tracer_crash_report_release();
        this.sendAnr = sendAnr$tracer_crash_report_release != null ? sendAnr$tracer_crash_report_release.booleanValue() : true;
        Boolean preservePrevLogs$tracer_crash_report_release = builder.getPreservePrevLogs$tracer_crash_report_release();
        this.preservePrevLogs = preservePrevLogs$tracer_crash_report_release != null ? preservePrevLogs$tracer_crash_report_release.booleanValue() : false;
        Boolean anrSnapshotsEnabled$tracer_crash_report_release = builder.getAnrSnapshotsEnabled$tracer_crash_report_release();
        this.anrSnapshotsEnabled = anrSnapshotsEnabled$tracer_crash_report_release != null ? anrSnapshotsEnabled$tracer_crash_report_release.booleanValue() : false;
        Integer anrSnapshotsMaxCount$tracer_crash_report_release = builder.getAnrSnapshotsMaxCount$tracer_crash_report_release();
        this.anrSnapshotsMaxCount = anrSnapshotsMaxCount$tracer_crash_report_release != null ? anrSnapshotsMaxCount$tracer_crash_report_release.intValue() : 10;
        Long anrSnapshotsDelayMs$tracer_crash_report_release = builder.getAnrSnapshotsDelayMs$tracer_crash_report_release();
        this.anrSnapshotsDelayMs = anrSnapshotsDelayMs$tracer_crash_report_release != null ? anrSnapshotsDelayMs$tracer_crash_report_release.longValue() : 3000L;
        Long anrSnapshotsIntervalMs$tracer_crash_report_release = builder.getAnrSnapshotsIntervalMs$tracer_crash_report_release();
        this.anrSnapshotsIntervalMs = anrSnapshotsIntervalMs$tracer_crash_report_release != null ? anrSnapshotsIntervalMs$tracer_crash_report_release.longValue() : 500L;
        Integer maxLogsLength$tracer_crash_report_release = builder.getMaxLogsLength$tracer_crash_report_release();
        this.maxLogsLength = maxLogsLength$tracer_crash_report_release != null ? maxLogsLength$tracer_crash_report_release.intValue() : 65536;
        Boolean nonFatalRateLimitEnabled$tracer_crash_report_release = builder.getNonFatalRateLimitEnabled$tracer_crash_report_release();
        this.nonFatalRateLimitEnabled = nonFatalRateLimitEnabled$tracer_crash_report_release != null ? nonFatalRateLimitEnabled$tracer_crash_report_release.booleanValue() : false;
    }

    /* compiled from: CrashReportConfiguration.kt */
    public static final class Builder {
        private Long anrSnapshotsDelayMs;
        private Boolean anrSnapshotsEnabled;
        private Long anrSnapshotsIntervalMs;
        private Integer anrSnapshotsMaxCount;
        private Boolean enabled;
        private Integer maxLogsLength;
        private Boolean nativeEnabled;
        private Boolean nonFatalRateLimitEnabled;
        private Boolean preservePrevLogs;
        private Boolean sendAnr;

        public final CrashReportConfiguration build() {
            return new CrashReportConfiguration(this, null);
        }

        public final Long getAnrSnapshotsDelayMs$tracer_crash_report_release() {
            return this.anrSnapshotsDelayMs;
        }

        public final Boolean getAnrSnapshotsEnabled$tracer_crash_report_release() {
            return this.anrSnapshotsEnabled;
        }

        public final Long getAnrSnapshotsIntervalMs$tracer_crash_report_release() {
            return this.anrSnapshotsIntervalMs;
        }

        public final Integer getAnrSnapshotsMaxCount$tracer_crash_report_release() {
            return this.anrSnapshotsMaxCount;
        }

        public final Boolean getEnabled$tracer_crash_report_release() {
            return this.enabled;
        }

        public final Integer getMaxLogsLength$tracer_crash_report_release() {
            return this.maxLogsLength;
        }

        public final Boolean getNativeEnabled$tracer_crash_report_release() {
            return this.nativeEnabled;
        }

        public final Boolean getNonFatalRateLimitEnabled$tracer_crash_report_release() {
            return this.nonFatalRateLimitEnabled;
        }

        public final Boolean getPreservePrevLogs$tracer_crash_report_release() {
            return this.preservePrevLogs;
        }

        public final Boolean getSendAnr$tracer_crash_report_release() {
            return this.sendAnr;
        }

        public final void setAnrSnapshotsDelayMs$tracer_crash_report_release(Long l) {
            this.anrSnapshotsDelayMs = l;
        }

        public final void setAnrSnapshotsEnabled$tracer_crash_report_release(Boolean bool) {
            this.anrSnapshotsEnabled = bool;
        }

        public final void setAnrSnapshotsIntervalMs$tracer_crash_report_release(Long l) {
            this.anrSnapshotsIntervalMs = l;
        }

        public final void setAnrSnapshotsMaxCount$tracer_crash_report_release(Integer num) {
            this.anrSnapshotsMaxCount = num;
        }

        @ozl
        public final Builder setEnabled(boolean z) {
            this.enabled = Boolean.valueOf(z);
            return this;
        }

        public final void setEnabled$tracer_crash_report_release(Boolean bool) {
            this.enabled = bool;
        }

        public final Builder setExperimentalAnrSnapshotsDelayMs(long j) {
            this.anrSnapshotsDelayMs = Long.valueOf(j);
            return this;
        }

        public final Builder setExperimentalAnrSnapshotsEnabled(boolean z) {
            this.anrSnapshotsEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setExperimentalAnrSnapshotsIntervalMs(long j) {
            this.anrSnapshotsIntervalMs = Long.valueOf(j);
            return this;
        }

        public final Builder setExperimentalAnrSnapshotsMaxCount(int i) {
            this.anrSnapshotsMaxCount = Integer.valueOf(i);
            return this;
        }

        public final Builder setExperimentalMaxLogsLength(int i) {
            this.maxLogsLength = Integer.valueOf(i);
            return this;
        }

        public final Builder setExperimentalNonFatalRateLimitEnabled(Boolean bool) {
            this.nonFatalRateLimitEnabled = bool;
            return this;
        }

        public final void setMaxLogsLength$tracer_crash_report_release(Integer num) {
            this.maxLogsLength = num;
        }

        public final Builder setNativeEnabled(boolean z) {
            this.nativeEnabled = Boolean.valueOf(z);
            return this;
        }

        public final void setNativeEnabled$tracer_crash_report_release(Boolean bool) {
            this.nativeEnabled = bool;
        }

        public final void setNonFatalRateLimitEnabled$tracer_crash_report_release(Boolean bool) {
            this.nonFatalRateLimitEnabled = bool;
        }

        public final Builder setPreserveLogsFromPrevSession(Boolean bool) {
            this.preservePrevLogs = bool;
            return this;
        }

        public final void setPreservePrevLogs$tracer_crash_report_release(Boolean bool) {
            this.preservePrevLogs = bool;
        }

        public final Builder setSendAnr(boolean z) {
            this.sendAnr = Boolean.valueOf(z);
            return this;
        }

        public final void setSendAnr$tracer_crash_report_release(Boolean bool) {
            this.sendAnr = bool;
        }

        @ozl
        public final Builder setExperimentalMaxCrashReportTtlSeconds(int i) {
            return this;
        }

        @ozl
        public final Builder setExperimentalMaxCrashReportsStored(int i) {
            return this;
        }
    }
}
