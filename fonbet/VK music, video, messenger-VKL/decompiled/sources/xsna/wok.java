package xsna;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: CustomThreadFactory.java */
/* loaded from: classes.dex */
public final class wok implements ThreadFactory {
    public static final ThreadFactory f = Executors.defaultThreadFactory();
    public final AtomicLong b = new AtomicLong();
    public final String c;
    public final int d;
    public final StrictMode.ThreadPolicy e;

    public wok(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.c = str;
        this.d = i;
        this.e = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        Thread newThread = f.newThread(new Runnable() { // from class: xsna.vok
            @Override // java.lang.Runnable
            public final void run() {
                wok wokVar = wok.this;
                Process.setThreadPriority(wokVar.d);
                StrictMode.ThreadPolicy threadPolicy = wokVar.e;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
            }
        });
        Locale locale = Locale.ROOT;
        newThread.setName(this.c + " Thread #" + this.b.getAndIncrement());
        return newThread;
    }
}
