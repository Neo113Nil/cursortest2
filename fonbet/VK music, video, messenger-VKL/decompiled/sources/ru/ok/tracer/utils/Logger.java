package ru.ok.tracer.utils;

import java.util.Arrays;
import ru.ok.tracer.utils.DefaultTracerLoggerDelegate;
import ru.ok.tracer.utils.TracerLoggerDelegate;

/* compiled from: Logger.kt */
/* loaded from: classes11.dex */
public final class Logger {
    public static final Logger INSTANCE = new Logger();
    private static TracerLoggerDelegate delegate = DefaultTracerLoggerDelegate.Companion;
    private static volatile ThreadLocal<Boolean> recursionDetector;

    private Logger() {
    }

    public static final void d(String str, Throwable th) {
    }

    public static final void e() {
        e$default(null, 1, null);
    }

    public static /* synthetic */ void e$default(String str, Throwable th, int i, Object obj) {
    }

    public static final void i() {
        i$default(null, null, 3, null);
    }

    public static final void log(int i, String str) {
        log$default(i, str, null, 4, null);
    }

    public static final void v() {
        v$default(null, null, 3, null);
    }

    public static final void w() {
        w$default(null, null, 3, null);
    }

    public final TracerLoggerDelegate getDelegate$tracer_commons_release() {
        return delegate;
    }

    public final void setDelegate$tracer_commons_release(TracerLoggerDelegate tracerLoggerDelegate) {
        delegate = tracerLoggerDelegate;
    }

    public static final void d(String str, Object... objArr) {
        String str2;
        if (str != null) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            str2 = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
        } else {
            str2 = null;
        }
        log$default(3, str2, null, 4, null);
    }

    public static final void e(String str) {
        e$default(str, null, 2, null);
    }

    public static /* synthetic */ void e$default(Throwable th, int i, Object obj) {
    }

    public static final void i(String str) {
        i$default(str, null, 2, null);
    }

    public static final void log(int i, String str, Throwable th) {
        try {
            if (i < delegate.getMinLogPriority()) {
                return;
            }
            ThreadLocal<Boolean> threadLocal = recursionDetector;
            if (threadLocal == null) {
                synchronized (INSTANCE) {
                    threadLocal = recursionDetector;
                    if (threadLocal == null) {
                        threadLocal = new ThreadLocal<>();
                        recursionDetector = threadLocal;
                    }
                }
            }
            ThreadLocal<Boolean> threadLocal2 = threadLocal;
            Boolean bool = threadLocal2.get();
            if (bool == null ? false : bool.booleanValue()) {
                return;
            }
            try {
                threadLocal2.set(Boolean.TRUE);
                delegate.println(i, str, th);
            } finally {
                threadLocal2.set(Boolean.FALSE);
            }
        } catch (Exception e) {
            DefaultTracerLoggerDelegate.Companion companion = DefaultTracerLoggerDelegate.Companion;
            delegate = companion;
            companion.println(6, "Logger delegate threw an exception", e);
            TracerLoggerDelegate.DefaultImpls.println$default(delegate, 3, "Falling back to default logger delegate", null, 4, null);
        }
    }

    public static final void v(String str) {
        v$default(str, null, 2, null);
    }

    public static final void w(String str) {
        w$default(str, null, 2, null);
    }

    public static final void e(String str, Throwable th) {
    }

    public static final void i(String str, Throwable th) {
    }

    public static final void v(String str, Throwable th) {
    }

    public static final void w(String str, Throwable th) {
    }

    public static final void e(Throwable th) {
    }

    public static final void v(String str, Object... objArr) {
        String str2;
        if (str != null) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            str2 = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
        } else {
            str2 = null;
        }
        log$default(2, str2, null, 4, null);
    }

    public static /* synthetic */ void d$default(String str, Throwable th, int i, Object obj) {
    }

    public static /* synthetic */ void i$default(String str, Throwable th, int i, Object obj) {
    }

    public static /* synthetic */ void v$default(String str, Throwable th, int i, Object obj) {
    }

    public static /* synthetic */ void w$default(String str, Throwable th, int i, Object obj) {
    }

    public static /* synthetic */ void log$default(int i, String str, Throwable th, int i2, Object obj) {
    }
}
