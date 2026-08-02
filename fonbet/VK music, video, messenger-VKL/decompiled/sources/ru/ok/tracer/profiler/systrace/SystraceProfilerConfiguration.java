package ru.ok.tracer.profiler.systrace;

import ru.ok.tracer.Tracer;
import ru.ok.tracer.TracerConfiguration;
import ru.ok.tracer.TracerFeature;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: SystraceProfilerConfiguration.kt */
/* loaded from: classes11.dex */
public final class SystraceProfilerConfiguration implements TracerConfiguration {
    public static final Companion Companion = new Companion(null);
    private final boolean enabled;

    /* compiled from: SystraceProfilerConfiguration.kt */
    public static final class Builder {
        private Boolean enabled;

        public final SystraceProfilerConfiguration build() {
            return new SystraceProfilerConfiguration(this, null);
        }

        public final Boolean getEnabled$tracer_profiler_systrace_release() {
            return this.enabled;
        }

        public final Builder setEnabled(boolean z) {
            this.enabled = Boolean.valueOf(z);
            return this;
        }

        public final void setEnabled$tracer_profiler_systrace_release(Boolean bool) {
            this.enabled = bool;
        }
    }

    /* compiled from: SystraceProfilerConfiguration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final SystraceProfilerConfiguration get$tracer_profiler_systrace_release() {
            TracerConfiguration tracerConfiguration = Tracer.INSTANCE.getRuntimeConfigs().get(FEATURE_SYSTRACEKt.getFEATURE_SYSTRACE());
            SystraceProfilerConfiguration systraceProfilerConfiguration = tracerConfiguration instanceof SystraceProfilerConfiguration ? (SystraceProfilerConfiguration) tracerConfiguration : null;
            return systraceProfilerConfiguration == null ? new Builder().build() : systraceProfilerConfiguration;
        }

        /* renamed from: private, reason: not valid java name */
        public final SystraceProfilerConfiguration m405private(izs<? super Builder, s3q0> izsVar) {
            Builder builder = new Builder();
            izsVar.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ SystraceProfilerConfiguration(Builder builder, zcl zclVar) {
        this(builder);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // ru.ok.tracer.TracerConfiguration
    public TracerFeature getFeature() {
        return FEATURE_SYSTRACEKt.getFEATURE_SYSTRACE();
    }

    private SystraceProfilerConfiguration(Builder builder) {
        Boolean enabled$tracer_profiler_systrace_release = builder.getEnabled$tracer_profiler_systrace_release();
        this.enabled = enabled$tracer_profiler_systrace_release != null ? enabled$tracer_profiler_systrace_release.booleanValue() : true;
    }
}
