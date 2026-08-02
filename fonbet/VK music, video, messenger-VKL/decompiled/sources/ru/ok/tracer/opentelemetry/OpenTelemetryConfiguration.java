package ru.ok.tracer.opentelemetry;

import java.util.concurrent.TimeUnit;
import ru.ok.tracer.Tracer;
import ru.ok.tracer.TracerConfiguration;
import ru.ok.tracer.TracerFeature;
import ru.ok.tracer.opentelemetry.OpenTelemetryConfiguration;
import xsna.izs;
import xsna.l000;
import xsna.n0h0;
import xsna.ozl;
import xsna.s3q0;
import xsna.uv1;
import xsna.zcl;
import xsna.zhk0;

/* compiled from: OpenTelemetryConfiguration.kt */
/* loaded from: classes11.dex */
public final class OpenTelemetryConfiguration implements TracerConfiguration {
    public static final Companion Companion = new Companion(null);
    private final boolean autoStartCollect;
    private final boolean collectCpuEnabled;
    private final long collectIntervalMillis;
    private final boolean collectNetworkEnabled;
    private final boolean completeTracesToUpload;
    private final boolean enabled;
    private final boolean installGlobal;
    private final long logsScheduleDelayMillis;
    private int maxAttributeValueLength;
    private final int maxLogCountToUpload;
    private int maxNumberOfAttributesPerEvent;
    private int maxNumberOfAttributesPerLink;
    private int maxNumberOfAttributesPerLog;
    private int maxNumberOfAttributesPerSpan;
    private int maxNumberOfEventsPerSpan;
    private int maxNumberOfLinksPerSpan;
    private final int maxSpanCountToUpload;
    private final long metricsUploadIntervalMillis;
    private final n0h0 sampler;
    private final String serviceName;

    /* compiled from: OpenTelemetryConfiguration.kt */
    public static final class Builder {
        private Boolean autoStartCollect;
        private Boolean collectCpuEnabled;
        private Long collectIntervalMillis;
        private Boolean collectNetworkEnabled;
        private Boolean completeTracesToUpload;
        private Boolean enabled;
        private Boolean installGlobal;
        private Long logsScheduleDelayMillis;
        private Integer maxAttributeValueLength;
        private Integer maxLogCountToUpload;
        private Integer maxNumberOfAttributesPerEvent;
        private Integer maxNumberOfAttributesPerLink;
        private Integer maxNumberOfAttributesPerLog;
        private Integer maxNumberOfAttributesPerSpan;
        private Integer maxNumberOfEventsPerSpan;
        private Integer maxNumberOfLinksPerSpan;
        private Integer maxSpanCountToUpload;
        private Long metricsUploadIntervalMillis;
        private n0h0 sampler = uv1.INSTANCE;
        private String serviceName;

        public final OpenTelemetryConfiguration build() {
            return new OpenTelemetryConfiguration(this);
        }

        public final Boolean getAutoStartCollect$tracer_opentelemetry_release() {
            return this.autoStartCollect;
        }

        public final Boolean getCollectCpuEnabled$tracer_opentelemetry_release() {
            return this.collectCpuEnabled;
        }

        public final Long getCollectIntervalMillis$tracer_opentelemetry_release() {
            return this.collectIntervalMillis;
        }

        public final Boolean getCollectNetworkEnabled$tracer_opentelemetry_release() {
            return this.collectNetworkEnabled;
        }

        public final Boolean getCompleteTracesToUpload$tracer_opentelemetry_release() {
            return this.completeTracesToUpload;
        }

        public final Boolean getEnabled$tracer_opentelemetry_release() {
            return this.enabled;
        }

        public final Boolean getInstallGlobal$tracer_opentelemetry_release() {
            return this.installGlobal;
        }

        public final Long getLogsScheduleDelayMillis$tracer_opentelemetry_release() {
            return this.logsScheduleDelayMillis;
        }

        public final Integer getMaxAttributeValueLength$tracer_opentelemetry_release() {
            return this.maxAttributeValueLength;
        }

        public final Integer getMaxLogCountToUpload$tracer_opentelemetry_release() {
            return this.maxLogCountToUpload;
        }

        public final Integer getMaxNumberOfAttributesPerEvent$tracer_opentelemetry_release() {
            return this.maxNumberOfAttributesPerEvent;
        }

        public final Integer getMaxNumberOfAttributesPerLink$tracer_opentelemetry_release() {
            return this.maxNumberOfAttributesPerLink;
        }

        public final Integer getMaxNumberOfAttributesPerLog$tracer_opentelemetry_release() {
            return this.maxNumberOfAttributesPerLog;
        }

        public final Integer getMaxNumberOfAttributesPerSpan$tracer_opentelemetry_release() {
            return this.maxNumberOfAttributesPerSpan;
        }

        public final Integer getMaxNumberOfEventsPerSpan$tracer_opentelemetry_release() {
            return this.maxNumberOfEventsPerSpan;
        }

        public final Integer getMaxNumberOfLinksPerSpan$tracer_opentelemetry_release() {
            return this.maxNumberOfLinksPerSpan;
        }

        public final Integer getMaxSpanCountToUpload$tracer_opentelemetry_release() {
            return this.maxSpanCountToUpload;
        }

        public final Long getMetricsUploadIntervalMillis$tracer_opentelemetry_release() {
            return this.metricsUploadIntervalMillis;
        }

        public final n0h0 getSampler$tracer_opentelemetry_release() {
            return this.sampler;
        }

        public final String getServiceName$tracer_opentelemetry_release() {
            return this.serviceName;
        }

        public final void setAutoStartCollect$tracer_opentelemetry_release(Boolean bool) {
            this.autoStartCollect = bool;
        }

        public final void setCollectCpuEnabled$tracer_opentelemetry_release(Boolean bool) {
            this.collectCpuEnabled = bool;
        }

        public final void setCollectIntervalMillis$tracer_opentelemetry_release(Long l) {
            this.collectIntervalMillis = l;
        }

        public final void setCollectNetworkEnabled$tracer_opentelemetry_release(Boolean bool) {
            this.collectNetworkEnabled = bool;
        }

        public final void setCompleteTracesToUpload$tracer_opentelemetry_release(Boolean bool) {
            this.completeTracesToUpload = bool;
        }

        public final Builder setEnabled(boolean z) {
            this.enabled = Boolean.valueOf(z);
            return this;
        }

        public final void setEnabled$tracer_opentelemetry_release(Boolean bool) {
            this.enabled = bool;
        }

        public final Builder setExperimentalAutoStartCollect(boolean z) {
            this.autoStartCollect = Boolean.valueOf(z);
            return this;
        }

        public final Builder setExperimentalCollectCpuEnabled(boolean z) {
            this.collectCpuEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setExperimentalCollectInterval(long j, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j);
            if (millis < 1) {
                millis = 1;
            }
            this.collectIntervalMillis = Long.valueOf(millis);
            return this;
        }

        public final Builder setExperimentalCollectNetworkEnabled(boolean z) {
            this.collectNetworkEnabled = Boolean.valueOf(z);
            return this;
        }

        public final Builder setExperimentalCompleteTracesToUpload(boolean z) {
            this.completeTracesToUpload = Boolean.valueOf(z);
            return this;
        }

        public final Builder setExperimentalLogsScheduleDelay(long j, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j);
            if (millis < 1) {
                throw new IllegalArgumentException("value < 1ms");
            }
            this.logsScheduleDelayMillis = Long.valueOf(millis);
            return this;
        }

        public final Builder setExperimentalMaxAttributeValueLength(int i) {
            this.maxAttributeValueLength = Integer.valueOf(i);
            return this;
        }

        public final Builder setExperimentalMaxLogCountToUpload(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("maxCountToUpload <= 0");
            }
            this.maxLogCountToUpload = Integer.valueOf(i);
            return this;
        }

        public final Builder setExperimentalMaxNumberOfAttributesPerEvent(int i) {
            this.maxNumberOfAttributesPerEvent = Integer.valueOf(i);
            return this;
        }

        public final Builder setExperimentalMaxNumberOfAttributesPerLink(int i) {
            this.maxNumberOfAttributesPerLink = Integer.valueOf(i);
            return this;
        }

        public final Builder setExperimentalMaxNumberOfAttributesPerLog(int i) {
            this.maxNumberOfAttributesPerLog = Integer.valueOf(i);
            return this;
        }

        public final Builder setExperimentalMaxNumberOfAttributesPerSpan(int i) {
            this.maxNumberOfAttributesPerSpan = Integer.valueOf(i);
            return this;
        }

        public final Builder setExperimentalMaxNumberOfEventsPerSpan(int i) {
            this.maxNumberOfEventsPerSpan = Integer.valueOf(i);
            return this;
        }

        public final Builder setExperimentalMaxNumberOfLinksPerSpan(int i) {
            this.maxNumberOfLinksPerSpan = Integer.valueOf(i);
            return this;
        }

        public final Builder setExperimentalMaxSpanCountToUpload(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("minCountToUpload <= 0");
            }
            this.maxSpanCountToUpload = Integer.valueOf(i);
            return this;
        }

        public final Builder setExperimentalMetricsUploadInterval(long j, TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j);
            if (millis < 1) {
                throw new IllegalArgumentException("value < 1ms");
            }
            this.metricsUploadIntervalMillis = Long.valueOf(millis);
            return this;
        }

        public final Builder setExperimentalSampler(n0h0 n0h0Var) {
            this.sampler = n0h0Var;
            return this;
        }

        @ozl
        public final Builder setInstallGlobal(boolean z) {
            this.installGlobal = Boolean.valueOf(z);
            return this;
        }

        public final void setInstallGlobal$tracer_opentelemetry_release(Boolean bool) {
            this.installGlobal = bool;
        }

        public final void setLogsScheduleDelayMillis$tracer_opentelemetry_release(Long l) {
            this.logsScheduleDelayMillis = l;
        }

        public final void setMaxAttributeValueLength$tracer_opentelemetry_release(Integer num) {
            this.maxAttributeValueLength = num;
        }

        public final void setMaxLogCountToUpload$tracer_opentelemetry_release(Integer num) {
            this.maxLogCountToUpload = num;
        }

        public final void setMaxNumberOfAttributesPerEvent$tracer_opentelemetry_release(Integer num) {
            this.maxNumberOfAttributesPerEvent = num;
        }

        public final void setMaxNumberOfAttributesPerLink$tracer_opentelemetry_release(Integer num) {
            this.maxNumberOfAttributesPerLink = num;
        }

        public final void setMaxNumberOfAttributesPerLog$tracer_opentelemetry_release(Integer num) {
            this.maxNumberOfAttributesPerLog = num;
        }

        public final void setMaxNumberOfAttributesPerSpan$tracer_opentelemetry_release(Integer num) {
            this.maxNumberOfAttributesPerSpan = num;
        }

        public final void setMaxNumberOfEventsPerSpan$tracer_opentelemetry_release(Integer num) {
            this.maxNumberOfEventsPerSpan = num;
        }

        public final void setMaxNumberOfLinksPerSpan$tracer_opentelemetry_release(Integer num) {
            this.maxNumberOfLinksPerSpan = num;
        }

        public final void setMaxSpanCountToUpload$tracer_opentelemetry_release(Integer num) {
            this.maxSpanCountToUpload = num;
        }

        public final void setMetricsUploadIntervalMillis$tracer_opentelemetry_release(Long l) {
            this.metricsUploadIntervalMillis = l;
        }

        public final void setSampler$tracer_opentelemetry_release(n0h0 n0h0Var) {
            this.sampler = n0h0Var;
        }

        public final Builder setServiceName(String str) {
            this.serviceName = str;
            return this;
        }

        public final void setServiceName$tracer_opentelemetry_release(String str) {
            this.serviceName = str;
        }
    }

    /* compiled from: OpenTelemetryConfiguration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final OpenTelemetryConfiguration build(izs<? super Builder, s3q0> izsVar) {
            Builder builder = new Builder();
            izsVar.invoke(builder);
            return builder.build();
        }

        public final OpenTelemetryConfiguration get() {
            TracerConfiguration tracerConfiguration = Tracer.INSTANCE.getRuntimeConfigs().get(FEATURE_OPEN_TELEMETRYKt.getFEATURE_OPEN_TELEMETRY());
            OpenTelemetryConfiguration openTelemetryConfiguration = tracerConfiguration instanceof OpenTelemetryConfiguration ? (OpenTelemetryConfiguration) tracerConfiguration : null;
            return openTelemetryConfiguration == null ? build(new izs<Builder, s3q0>() { // from class: ru.ok.tracer.opentelemetry.OpenTelemetryConfiguration$Companion$get$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(OpenTelemetryConfiguration.Builder builder) {
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(OpenTelemetryConfiguration.Builder builder) {
                    invoke2(builder);
                    return s3q0.a;
                }
            }) : openTelemetryConfiguration;
        }

        private Companion() {
        }
    }

    public OpenTelemetryConfiguration(Builder builder) {
        Boolean enabled$tracer_opentelemetry_release = builder.getEnabled$tracer_opentelemetry_release();
        this.enabled = enabled$tracer_opentelemetry_release != null ? enabled$tracer_opentelemetry_release.booleanValue() : true;
        this.serviceName = builder.getServiceName$tracer_opentelemetry_release();
        this.sampler = builder.getSampler$tracer_opentelemetry_release();
        Boolean installGlobal$tracer_opentelemetry_release = builder.getInstallGlobal$tracer_opentelemetry_release();
        this.installGlobal = installGlobal$tracer_opentelemetry_release != null ? installGlobal$tracer_opentelemetry_release.booleanValue() : false;
        Boolean autoStartCollect$tracer_opentelemetry_release = builder.getAutoStartCollect$tracer_opentelemetry_release();
        this.autoStartCollect = autoStartCollect$tracer_opentelemetry_release != null ? autoStartCollect$tracer_opentelemetry_release.booleanValue() : false;
        Boolean collectCpuEnabled$tracer_opentelemetry_release = builder.getCollectCpuEnabled$tracer_opentelemetry_release();
        this.collectCpuEnabled = collectCpuEnabled$tracer_opentelemetry_release != null ? collectCpuEnabled$tracer_opentelemetry_release.booleanValue() : false;
        Boolean collectNetworkEnabled$tracer_opentelemetry_release = builder.getCollectNetworkEnabled$tracer_opentelemetry_release();
        this.collectNetworkEnabled = collectNetworkEnabled$tracer_opentelemetry_release != null ? collectNetworkEnabled$tracer_opentelemetry_release.booleanValue() : false;
        Long collectIntervalMillis$tracer_opentelemetry_release = builder.getCollectIntervalMillis$tracer_opentelemetry_release();
        this.collectIntervalMillis = collectIntervalMillis$tracer_opentelemetry_release != null ? collectIntervalMillis$tracer_opentelemetry_release.longValue() : TimeUnit.SECONDS.toMillis(10L);
        Long logsScheduleDelayMillis$tracer_opentelemetry_release = builder.getLogsScheduleDelayMillis$tracer_opentelemetry_release();
        this.logsScheduleDelayMillis = logsScheduleDelayMillis$tracer_opentelemetry_release != null ? logsScheduleDelayMillis$tracer_opentelemetry_release.longValue() : TimeUnit.SECONDS.toMillis(1L);
        Integer maxLogCountToUpload$tracer_opentelemetry_release = builder.getMaxLogCountToUpload$tracer_opentelemetry_release();
        this.maxLogCountToUpload = maxLogCountToUpload$tracer_opentelemetry_release != null ? maxLogCountToUpload$tracer_opentelemetry_release.intValue() : 512;
        Long metricsUploadIntervalMillis$tracer_opentelemetry_release = builder.getMetricsUploadIntervalMillis$tracer_opentelemetry_release();
        this.metricsUploadIntervalMillis = metricsUploadIntervalMillis$tracer_opentelemetry_release != null ? metricsUploadIntervalMillis$tracer_opentelemetry_release.longValue() : TimeUnit.MINUTES.toMillis(1L);
        Integer maxSpanCountToUpload$tracer_opentelemetry_release = builder.getMaxSpanCountToUpload$tracer_opentelemetry_release();
        this.maxSpanCountToUpload = maxSpanCountToUpload$tracer_opentelemetry_release != null ? maxSpanCountToUpload$tracer_opentelemetry_release.intValue() : 512;
        Boolean completeTracesToUpload$tracer_opentelemetry_release = builder.getCompleteTracesToUpload$tracer_opentelemetry_release();
        this.completeTracesToUpload = completeTracesToUpload$tracer_opentelemetry_release != null ? completeTracesToUpload$tracer_opentelemetry_release.booleanValue() : true;
        Integer maxNumberOfEventsPerSpan$tracer_opentelemetry_release = builder.getMaxNumberOfEventsPerSpan$tracer_opentelemetry_release();
        this.maxNumberOfEventsPerSpan = maxNumberOfEventsPerSpan$tracer_opentelemetry_release != null ? maxNumberOfEventsPerSpan$tracer_opentelemetry_release.intValue() : zhk0.a.c;
        Integer maxNumberOfLinksPerSpan$tracer_opentelemetry_release = builder.getMaxNumberOfLinksPerSpan$tracer_opentelemetry_release();
        this.maxNumberOfLinksPerSpan = maxNumberOfLinksPerSpan$tracer_opentelemetry_release != null ? maxNumberOfLinksPerSpan$tracer_opentelemetry_release.intValue() : zhk0.a.d;
        Integer maxNumberOfAttributesPerSpan$tracer_opentelemetry_release = builder.getMaxNumberOfAttributesPerSpan$tracer_opentelemetry_release();
        this.maxNumberOfAttributesPerLog = maxNumberOfAttributesPerSpan$tracer_opentelemetry_release != null ? maxNumberOfAttributesPerSpan$tracer_opentelemetry_release.intValue() : l000.a.b;
        Integer maxNumberOfAttributesPerSpan$tracer_opentelemetry_release2 = builder.getMaxNumberOfAttributesPerSpan$tracer_opentelemetry_release();
        this.maxNumberOfAttributesPerSpan = maxNumberOfAttributesPerSpan$tracer_opentelemetry_release2 != null ? maxNumberOfAttributesPerSpan$tracer_opentelemetry_release2.intValue() : zhk0.a.b;
        Integer maxNumberOfAttributesPerEvent$tracer_opentelemetry_release = builder.getMaxNumberOfAttributesPerEvent$tracer_opentelemetry_release();
        this.maxNumberOfAttributesPerEvent = maxNumberOfAttributesPerEvent$tracer_opentelemetry_release != null ? maxNumberOfAttributesPerEvent$tracer_opentelemetry_release.intValue() : zhk0.a.e;
        Integer maxNumberOfAttributesPerLink$tracer_opentelemetry_release = builder.getMaxNumberOfAttributesPerLink$tracer_opentelemetry_release();
        this.maxNumberOfAttributesPerLink = maxNumberOfAttributesPerLink$tracer_opentelemetry_release != null ? maxNumberOfAttributesPerLink$tracer_opentelemetry_release.intValue() : zhk0.a.f;
        Integer maxAttributeValueLength$tracer_opentelemetry_release = builder.getMaxAttributeValueLength$tracer_opentelemetry_release();
        this.maxAttributeValueLength = maxAttributeValueLength$tracer_opentelemetry_release != null ? maxAttributeValueLength$tracer_opentelemetry_release.intValue() : zhk0.a.g;
    }

    public final boolean getAutoStartCollect$tracer_opentelemetry_release() {
        return this.autoStartCollect;
    }

    public final boolean getCollectCpuEnabled$tracer_opentelemetry_release() {
        return this.collectCpuEnabled;
    }

    public final long getCollectIntervalMillis$tracer_opentelemetry_release() {
        return this.collectIntervalMillis;
    }

    public final boolean getCollectNetworkEnabled$tracer_opentelemetry_release() {
        return this.collectNetworkEnabled;
    }

    public final boolean getCompleteTracesToUpload$tracer_opentelemetry_release() {
        return this.completeTracesToUpload;
    }

    public final boolean getEnabled$tracer_opentelemetry_release() {
        return this.enabled;
    }

    @Override // ru.ok.tracer.TracerConfiguration
    public TracerFeature getFeature() {
        return FEATURE_OPEN_TELEMETRYKt.getFEATURE_OPEN_TELEMETRY();
    }

    public final boolean getInstallGlobal$tracer_opentelemetry_release() {
        return this.installGlobal;
    }

    public final long getLogsScheduleDelayMillis$tracer_opentelemetry_release() {
        return this.logsScheduleDelayMillis;
    }

    public final int getMaxAttributeValueLength$tracer_opentelemetry_release() {
        return this.maxAttributeValueLength;
    }

    public final int getMaxLogCountToUpload$tracer_opentelemetry_release() {
        return this.maxLogCountToUpload;
    }

    public final int getMaxNumberOfAttributesPerEvent$tracer_opentelemetry_release() {
        return this.maxNumberOfAttributesPerEvent;
    }

    public final int getMaxNumberOfAttributesPerLink$tracer_opentelemetry_release() {
        return this.maxNumberOfAttributesPerLink;
    }

    public final int getMaxNumberOfAttributesPerLog$tracer_opentelemetry_release() {
        return this.maxNumberOfAttributesPerLog;
    }

    public final int getMaxNumberOfAttributesPerSpan$tracer_opentelemetry_release() {
        return this.maxNumberOfAttributesPerSpan;
    }

    public final int getMaxNumberOfEventsPerSpan$tracer_opentelemetry_release() {
        return this.maxNumberOfEventsPerSpan;
    }

    public final int getMaxNumberOfLinksPerSpan$tracer_opentelemetry_release() {
        return this.maxNumberOfLinksPerSpan;
    }

    public final int getMaxSpanCountToUpload$tracer_opentelemetry_release() {
        return this.maxSpanCountToUpload;
    }

    public final long getMetricsUploadIntervalMillis$tracer_opentelemetry_release() {
        return this.metricsUploadIntervalMillis;
    }

    public final n0h0 getSampler$tracer_opentelemetry_release() {
        return this.sampler;
    }

    public final String getServiceName$tracer_opentelemetry_release() {
        return this.serviceName;
    }

    public final void setMaxAttributeValueLength$tracer_opentelemetry_release(int i) {
        this.maxAttributeValueLength = i;
    }

    public final void setMaxNumberOfAttributesPerEvent$tracer_opentelemetry_release(int i) {
        this.maxNumberOfAttributesPerEvent = i;
    }

    public final void setMaxNumberOfAttributesPerLink$tracer_opentelemetry_release(int i) {
        this.maxNumberOfAttributesPerLink = i;
    }

    public final void setMaxNumberOfAttributesPerLog$tracer_opentelemetry_release(int i) {
        this.maxNumberOfAttributesPerLog = i;
    }

    public final void setMaxNumberOfAttributesPerSpan$tracer_opentelemetry_release(int i) {
        this.maxNumberOfAttributesPerSpan = i;
    }

    public final void setMaxNumberOfEventsPerSpan$tracer_opentelemetry_release(int i) {
        this.maxNumberOfEventsPerSpan = i;
    }

    public final void setMaxNumberOfLinksPerSpan$tracer_opentelemetry_release(int i) {
        this.maxNumberOfLinksPerSpan = i;
    }
}
