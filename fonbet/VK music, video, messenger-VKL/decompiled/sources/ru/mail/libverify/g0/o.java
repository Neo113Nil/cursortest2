package ru.mail.libverify.g0;

import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.Thread;
import java.util.Objects;
import ru.mail.verify.core.utils.FileLog;
import xsna.i5s;

/* loaded from: classes9.dex */
public final class o implements Thread.UncaughtExceptionHandler {

    @NonNull
    private final ru.mail.libverify.p0.f a;

    @NonNull
    private final Thread.UncaughtExceptionHandler b;

    @NonNull
    private final String c;

    @Nullable
    private volatile HandlerThread d;

    @Nullable
    private volatile ru.mail.libverify.p0.b e;
    private int f = 0;

    public o(@NonNull String str, @NonNull ru.mail.libverify.p0.f fVar, @NonNull Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.c = str;
        this.a = fVar;
        this.b = uncaughtExceptionHandler;
    }

    @NonNull
    public final ru.mail.libverify.p0.b a() {
        if (this.e == null) {
            synchronized (this) {
                try {
                    if (this.e == null) {
                        this.d = new HandlerThread(this.c);
                        HandlerThread handlerThread = this.d;
                        Objects.requireNonNull(handlerThread);
                        handlerThread.setUncaughtExceptionHandler(this);
                        HandlerThread handlerThread2 = this.d;
                        Objects.requireNonNull(handlerThread2);
                        handlerThread2.start();
                        HandlerThread handlerThread3 = this.d;
                        Objects.requireNonNull(handlerThread3);
                        this.e = new ru.mail.libverify.p0.b(handlerThread3.getLooper(), this.a);
                    }
                } finally {
                }
            }
        }
        ru.mail.libverify.p0.b bVar = this.e;
        Objects.requireNonNull(bVar);
        return bVar;
    }

    public final void b() {
        HandlerThread handlerThread = this.d;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    public final void c() {
        ru.mail.libverify.p0.b bVar = this.e;
        if (bVar != null) {
            bVar.removeCallbacksAndMessages(null);
        }
    }

    @NonNull
    public final String toString() {
        return i5s.a(new StringBuilder("ComponentDispatcher{name='"), this.c, "'}");
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
        FileLog.e("ComponentDispatcher", "Crashed thread %s(%d) for dispatcher %s with error: %s", thread, Long.valueOf(thread.getId()), this.e, th);
        synchronized (this) {
            try {
                if (this.f < 10) {
                    HandlerThread handlerThread = this.d;
                    if (handlerThread != null) {
                        handlerThread.quitSafely();
                    }
                    this.e = null;
                    this.d = null;
                    a();
                    FileLog.v("ComponentDispatcher", "Restored thread %s(%d) for dispatcher %s (restart count: %d)", this.d, null, this.e, Integer.valueOf(this.f));
                    this.f++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.b.uncaughtException(thread, th);
    }
}
