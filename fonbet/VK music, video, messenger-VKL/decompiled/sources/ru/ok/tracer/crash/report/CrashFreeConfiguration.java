package ru.ok.tracer.crash.report;

import ru.ok.tracer.Tracer;
import ru.ok.tracer.TracerConfiguration;
import ru.ok.tracer.TracerFeature;
import xsna.izs;
import xsna.ozl;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: CrashFreeConfiguration.kt */
/* loaded from: classes11.dex */
public final class CrashFreeConfiguration implements TracerConfiguration {
    public static final Companion Companion = new Companion(null);
    private final boolean enabled;

    /* compiled from: CrashFreeConfiguration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final CrashFreeConfiguration get$tracer_crash_report_release() {
            TracerConfiguration tracerConfiguration = Tracer.INSTANCE.getRuntimeConfigs().get(FEATURE_CRASH_FREEKt.getFEATURE_CRASH_FREE());
            CrashFreeConfiguration crashFreeConfiguration = tracerConfiguration instanceof CrashFreeConfiguration ? (CrashFreeConfiguration) tracerConfiguration : null;
            return crashFreeConfiguration == null ? new Builder().build() : crashFreeConfiguration;
        }

        /* renamed from: private, reason: not valid java name */
        public final CrashFreeConfiguration m401private(izs<? super Builder, s3q0> izsVar) {
            Builder builder = new Builder();
            izsVar.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ CrashFreeConfiguration(Builder builder, zcl zclVar) {
        this(builder);
    }

    public final boolean getEnabled$tracer_crash_report_release() {
        return this.enabled;
    }

    @Override // ru.ok.tracer.TracerConfiguration
    public TracerFeature getFeature() {
        return FEATURE_CRASH_FREEKt.getFEATURE_CRASH_FREE();
    }

    private CrashFreeConfiguration(Builder builder) {
        Boolean enabled$tracer_crash_report_release = builder.getEnabled$tracer_crash_report_release();
        this.enabled = enabled$tracer_crash_report_release != null ? enabled$tracer_crash_report_release.booleanValue() : true;
    }

    /* compiled from: CrashFreeConfiguration.kt */
    public static final class Builder {
        private Boolean enabled;

        public final CrashFreeConfiguration build() {
            return new CrashFreeConfiguration(this, null);
        }

        public final Boolean getEnabled$tracer_crash_report_release() {
            return this.enabled;
        }

        public final Builder setEnabled(boolean z) {
            this.enabled = Boolean.valueOf(z);
            return this;
        }

        public final void setEnabled$tracer_crash_report_release(Boolean bool) {
            this.enabled = bool;
        }

        @ozl
        public final Builder setExperimentalMaxSessionTimeSpanToUpload(long j) {
            return this;
        }

        @ozl
        public final Builder setExperimentalMaxSessionsToUpload(int i) {
            return this;
        }
    }
}
