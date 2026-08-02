package ru.ok.tracer.utils;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import ru.ok.tracer.HasTracerLogger;
import ru.ok.tracer.startup.Initializer;

/* compiled from: LoggerInitializer.kt */
/* loaded from: classes11.dex */
public final class LoggerInitializer implements Initializer<Logger> {
    @Override // ru.ok.tracer.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ok.tracer.startup.Initializer
    public Logger create(Context context) {
        Logger logger = Logger.INSTANCE;
        try {
            if (context instanceof HasTracerLogger) {
                logger.setDelegate$tracer_commons_release(((HasTracerLogger) context).getTracerLoggerDelegate());
            }
            return logger;
        } catch (Exception unused) {
            Logger.d$default("Falling back to default logger delegate", null, 2, null);
            return logger;
        }
    }
}
