package xsna;

import com.vk.log.L;
import java.lang.Thread;

/* compiled from: LoggingUncaughtExceptionHandler.kt */
/* loaded from: classes.dex */
public class j200 implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        L.j(th, "FATAL EXCEPTION");
    }
}
