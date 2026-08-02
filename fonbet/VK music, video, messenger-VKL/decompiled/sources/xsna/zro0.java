package xsna;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ThrottlingLogger.java */
/* loaded from: classes8.dex */
public final class zro0 {
    public static final TimeUnit g = TimeUnit.MINUTES;
    public final Logger a;
    public final exe0 c;
    public final exe0 d;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final double e = 1.0d;
    public final TimeUnit f = g;

    public zro0(Logger logger) {
        this.a = logger;
        this.c = new exe0(5.0d / r10.toSeconds(1L), 5.0d);
        this.d = new exe0(1.0d / r10.toSeconds(1L), 1.0d);
    }

    public final void a(Level level, String str, Throwable th) {
        Logger logger = this.a;
        if (logger.isLoggable(level)) {
            AtomicBoolean atomicBoolean = this.b;
            boolean z = atomicBoolean.get();
            exe0 exe0Var = this.d;
            if (z) {
                if (exe0Var.a(1.0d)) {
                    if (th != null) {
                        logger.log(level, str, th);
                        return;
                    } else {
                        logger.log(level, str);
                        return;
                    }
                }
                return;
            }
            if (this.c.a(1.0d)) {
                if (th != null) {
                    logger.log(level, str, th);
                    return;
                } else {
                    logger.log(level, str);
                    return;
                }
            }
            if (atomicBoolean.compareAndSet(false, true)) {
                double d = this.e;
                exe0Var.a(d);
                String obj = this.f.toString();
                Locale locale = Locale.ROOT;
                logger.log(level, String.format(locale, "Too many log messages detected. Will only log %.0f time(s) per %s from now on.", Double.valueOf(d), qoy.c(1, 0, obj.toLowerCase(locale))));
                if (th != null) {
                    logger.log(level, str, th);
                } else {
                    logger.log(level, str);
                }
            }
        }
    }
}
