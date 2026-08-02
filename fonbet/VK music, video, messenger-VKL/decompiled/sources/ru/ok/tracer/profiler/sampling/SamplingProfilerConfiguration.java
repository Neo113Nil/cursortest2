package ru.ok.tracer.profiler.sampling;

import ru.ok.tracer.Tracer;
import ru.ok.tracer.TracerConfiguration;
import ru.ok.tracer.TracerFeature;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: SamplingProfilerConfiguration.kt */
/* loaded from: classes11.dex */
public final class SamplingProfilerConfiguration implements TracerConfiguration {
    public static final Companion Companion = new Companion(null);
    private final int bufferSizeMb;
    private final boolean enabled;
    private final int samplingIntervalUs;

    /* compiled from: SamplingProfilerConfiguration.kt */
    public static final class Builder {
        private Integer bufferSizeMb;
        private Boolean enabled;
        private Integer samplingIntervalUs;

        public final SamplingProfilerConfiguration build() {
            return new SamplingProfilerConfiguration(this, null);
        }

        public final Integer getBufferSizeMb$tracer_profiler_sampling_release() {
            return this.bufferSizeMb;
        }

        public final Boolean getEnabled$tracer_profiler_sampling_release() {
            return this.enabled;
        }

        public final Integer getSamplingIntervalUs$tracer_profiler_sampling_release() {
            return this.samplingIntervalUs;
        }

        public final Builder setBufferSizeMb(int i) {
            this.bufferSizeMb = Integer.valueOf(i);
            return this;
        }

        public final void setBufferSizeMb$tracer_profiler_sampling_release(Integer num) {
            this.bufferSizeMb = num;
        }

        public final Builder setEnabled(boolean z) {
            this.enabled = Boolean.valueOf(z);
            return this;
        }

        public final void setEnabled$tracer_profiler_sampling_release(Boolean bool) {
            this.enabled = bool;
        }

        public final Builder setSamplingIntervalUs(int i) {
            this.samplingIntervalUs = Integer.valueOf(i);
            return this;
        }

        public final void setSamplingIntervalUs$tracer_profiler_sampling_release(Integer num) {
            this.samplingIntervalUs = num;
        }
    }

    /* compiled from: SamplingProfilerConfiguration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final SamplingProfilerConfiguration get$tracer_profiler_sampling_release() {
            TracerConfiguration tracerConfiguration = Tracer.INSTANCE.getRuntimeConfigs().get(FEATURE_SAMPLED_TRACEKt.getFEATURE_SAMPLED_TRACE());
            SamplingProfilerConfiguration samplingProfilerConfiguration = tracerConfiguration instanceof SamplingProfilerConfiguration ? (SamplingProfilerConfiguration) tracerConfiguration : null;
            return samplingProfilerConfiguration == null ? new Builder().build() : samplingProfilerConfiguration;
        }

        /* renamed from: private, reason: not valid java name */
        public final SamplingProfilerConfiguration m404private(izs<? super Builder, s3q0> izsVar) {
            Builder builder = new Builder();
            izsVar.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SamplingProfilerConfiguration(Builder builder, zcl zclVar) {
        this(builder);
    }

    public final int getBufferSizeMb() {
        return this.bufferSizeMb;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // ru.ok.tracer.TracerConfiguration
    public TracerFeature getFeature() {
        return FEATURE_SAMPLED_TRACEKt.getFEATURE_SAMPLED_TRACE();
    }

    public final int getSamplingIntervalUs() {
        return this.samplingIntervalUs;
    }

    private SamplingProfilerConfiguration(Builder builder) {
        Boolean enabled$tracer_profiler_sampling_release = builder.getEnabled$tracer_profiler_sampling_release();
        this.enabled = enabled$tracer_profiler_sampling_release != null ? enabled$tracer_profiler_sampling_release.booleanValue() : true;
        Integer bufferSizeMb$tracer_profiler_sampling_release = builder.getBufferSizeMb$tracer_profiler_sampling_release();
        this.bufferSizeMb = bufferSizeMb$tracer_profiler_sampling_release != null ? bufferSizeMb$tracer_profiler_sampling_release.intValue() : 0;
        Integer samplingIntervalUs$tracer_profiler_sampling_release = builder.getSamplingIntervalUs$tracer_profiler_sampling_release();
        this.samplingIntervalUs = samplingIntervalUs$tracer_profiler_sampling_release != null ? samplingIntervalUs$tracer_profiler_sampling_release.intValue() : 5000;
    }
}
