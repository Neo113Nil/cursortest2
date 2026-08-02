package ru.ok.tracer;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import ru.ok.tracer.startup.Initializer;
import ru.ok.tracer.utils.LoggerInitializer;

/* compiled from: TracerInitializer.kt */
/* loaded from: classes11.dex */
public final class TracerInitializer implements Initializer<Tracer> {
    @Override // ru.ok.tracer.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.singletonList(LoggerInitializer.class);
    }

    @Override // ru.ok.tracer.startup.Initializer
    public Tracer create(Context context) {
        Tracer tracer = Tracer.INSTANCE;
        tracer.init$tracer_commons_release(context);
        return tracer;
    }
}
