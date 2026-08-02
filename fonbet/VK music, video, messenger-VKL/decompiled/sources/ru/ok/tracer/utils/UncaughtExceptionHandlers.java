package ru.ok.tracer.utils;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.d4k;
import xsna.y370;

/* loaded from: classes9.dex */
public final class UncaughtExceptionHandlers {
    private static final Object LOCK = new Object();

    private UncaughtExceptionHandlers() {
    }

    private static Thread.UncaughtExceptionHandler chain(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2) {
        return uncaughtExceptionHandler == null ? uncaughtExceptionHandler2 : uncaughtExceptionHandler2 == null ? uncaughtExceptionHandler : new ChainedUncaughtExceptionHandler(uncaughtExceptionHandler, uncaughtExceptionHandler2);
    }

    public static void prependDefault(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        synchronized (LOCK) {
            AtomicBoolean atomicBoolean = d4k.a;
            d4k.a(chain(uncaughtExceptionHandler, y370.a));
        }
    }
}
