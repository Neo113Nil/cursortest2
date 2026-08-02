package ru.ok.tracer.profiler.sampling;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import ru.ok.tracer.TracerInitializer;
import ru.ok.tracer.startup.Initializer;
import xsna.ozl;

/* compiled from: SamplingProfilerInitializer.kt */
@ozl
/* loaded from: classes9.dex */
public final class SamplingProfilerInitializer implements Initializer<SamplingProfiler> {
    @Override // ru.ok.tracer.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.singletonList(TracerInitializer.class);
    }

    @Override // ru.ok.tracer.startup.Initializer
    public SamplingProfiler create(Context context) {
        return SamplingProfiler.INSTANCE;
    }
}
