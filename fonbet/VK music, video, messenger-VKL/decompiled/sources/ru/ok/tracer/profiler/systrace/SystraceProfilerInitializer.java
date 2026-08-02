package ru.ok.tracer.profiler.systrace;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import ru.ok.tracer.TracerInitializer;
import ru.ok.tracer.startup.Initializer;
import xsna.ozl;

/* compiled from: SystraceProfilerInitializer.kt */
@ozl
/* loaded from: classes9.dex */
public final class SystraceProfilerInitializer implements Initializer<SystraceProfiler> {
    @Override // ru.ok.tracer.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.singletonList(TracerInitializer.class);
    }

    @Override // ru.ok.tracer.startup.Initializer
    public SystraceProfiler create(Context context) {
        return SystraceProfiler.INSTANCE;
    }
}
