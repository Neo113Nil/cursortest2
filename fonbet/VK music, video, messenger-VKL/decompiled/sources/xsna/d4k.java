package xsna;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: CrashHandler.kt */
/* loaded from: classes18.dex */
public final class d4k {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static final void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (a.compareAndSet(false, true)) {
            wui wuiVar = wui.a;
            wui.c = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(wuiVar);
        }
        wui wuiVar2 = wui.a;
        wui.b.addFirst(uncaughtExceptionHandler);
    }
}
