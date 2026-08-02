package ru.ok.tracer.utils;

/* compiled from: TracerLoggerDelegate.kt */
/* loaded from: classes11.dex */
public interface TracerLoggerDelegate {

    /* compiled from: TracerLoggerDelegate.kt */
    /* loaded from: classes9.dex */
    public static final class DefaultImpls {
        public static int getMinLogPriority(TracerLoggerDelegate tracerLoggerDelegate) {
            return 3;
        }

        public static /* synthetic */ void println$default(TracerLoggerDelegate tracerLoggerDelegate, int i, String str, Throwable th, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: println");
            }
            if ((i2 & 4) != 0) {
                th = null;
            }
            tracerLoggerDelegate.println(i, str, th);
        }
    }

    int getMinLogPriority();

    void println(int i, String str, Throwable th);
}
