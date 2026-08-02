package ru.ok.tracer.heap.dumps;

/* compiled from: OutOfMemoryErrors.kt */
/* loaded from: classes9.dex */
public final class OutOfMemoryErrors {
    public static final boolean isOom(Throwable th) {
        while (!(th instanceof OutOfMemoryError)) {
            Throwable cause = th.getCause();
            if (cause == null || cause == th) {
                return false;
            }
            th = cause;
        }
        return true;
    }
}
