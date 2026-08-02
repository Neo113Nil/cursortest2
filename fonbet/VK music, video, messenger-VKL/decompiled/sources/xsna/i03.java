package xsna;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ApiUsageLogger.java */
/* loaded from: classes8.dex */
public final class i03 {
    public static final Logger a = Logger.getLogger(i03.class.getName());

    public static void a() {
        Level level = Level.FINEST;
        Logger logger = a;
        if (logger.isLoggable(level)) {
            logger.log(level, "context is null", (Throwable) new AssertionError());
        }
    }
}
