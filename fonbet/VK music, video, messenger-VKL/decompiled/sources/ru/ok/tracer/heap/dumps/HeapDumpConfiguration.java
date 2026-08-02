package ru.ok.tracer.heap.dumps;

import ru.ok.tracer.Tracer;
import ru.ok.tracer.TracerConfiguration;
import ru.ok.tracer.TracerFeature;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: HeapDumpConfiguration.kt */
/* loaded from: classes11.dex */
public final class HeapDumpConfiguration implements TracerConfiguration {
    public static final Companion Companion = new Companion(null);
    private final boolean enabled;

    /* compiled from: HeapDumpConfiguration.kt */
    public static final class Builder {
        private Boolean enabled;

        public final HeapDumpConfiguration build() {
            return new HeapDumpConfiguration(this, null);
        }

        public final Boolean getEnabled$tracer_heap_dumps_release() {
            return this.enabled;
        }

        public final Builder setEnabled(boolean z) {
            this.enabled = Boolean.valueOf(z);
            return this;
        }

        public final void setEnabled$tracer_heap_dumps_release(Boolean bool) {
            this.enabled = bool;
        }
    }

    /* compiled from: HeapDumpConfiguration.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final HeapDumpConfiguration get$tracer_heap_dumps_release() {
            TracerConfiguration tracerConfiguration = Tracer.INSTANCE.getRuntimeConfigs().get(FEATURE_HEAP_DUMPKt.getFEATURE_HEAP_DUMP());
            HeapDumpConfiguration heapDumpConfiguration = tracerConfiguration instanceof HeapDumpConfiguration ? (HeapDumpConfiguration) tracerConfiguration : null;
            return heapDumpConfiguration == null ? new Builder().build() : heapDumpConfiguration;
        }

        /* renamed from: private, reason: not valid java name */
        public final HeapDumpConfiguration m403private(izs<? super Builder, s3q0> izsVar) {
            Builder builder = new Builder();
            izsVar.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ HeapDumpConfiguration(Builder builder, zcl zclVar) {
        this(builder);
    }

    public final boolean getEnabled$tracer_heap_dumps_release() {
        return this.enabled;
    }

    @Override // ru.ok.tracer.TracerConfiguration
    public TracerFeature getFeature() {
        return FEATURE_HEAP_DUMPKt.getFEATURE_HEAP_DUMP();
    }

    private HeapDumpConfiguration(Builder builder) {
        Boolean enabled$tracer_heap_dumps_release = builder.getEnabled$tracer_heap_dumps_release();
        this.enabled = enabled$tracer_heap_dumps_release != null ? enabled$tracer_heap_dumps_release.booleanValue() : true;
    }
}
