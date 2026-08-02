package ru.ok.tracer.utils;

import androidx.annotation.NonNull;
import java.lang.Thread;

/* loaded from: classes9.dex */
public final class ChainedUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler handlerAfter;
    private final Thread.UncaughtExceptionHandler handlerBefore;

    public ChainedUncaughtExceptionHandler(@NonNull Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @NonNull Thread.UncaughtExceptionHandler uncaughtExceptionHandler2) {
        this.handlerBefore = uncaughtExceptionHandler;
        this.handlerAfter = uncaughtExceptionHandler2;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            this.handlerBefore.uncaughtException(thread, th);
        } finally {
            this.handlerAfter.uncaughtException(thread, th);
        }
    }
}
