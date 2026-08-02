package defpackage;

import java.lang.Thread;

/* loaded from: classes8.dex */
public final class lx11 implements Thread.UncaughtExceptionHandler {
    public static sls a;
    public static final Thread.UncaughtExceptionHandler b;

    static {
        lx11 lx11Var = new lx11();
        a = qqr.A;
        b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(lx11Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r0.reportUnhandledException(r9);
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = b;
        try {
            w8o w8oVar = (w8o) a.invoke();
            if (w8oVar != null) {
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (cvu0.x(stackTrace[i].getClassName(), "com.yandex.plus.pay", false)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } finally {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
