package ru.ok.android.webrtc.protocol.screenshare.send;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.CountDownLatch;
import xsna.df6;

/* loaded from: classes9.dex */
public class ControlThread {
    public final Handler a;
    public final HandlerThread b;
    public final CountDownLatch c = new CountDownLatch(1);
    public volatile boolean d;

    public ControlThread(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        this.b = handlerThread;
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
        this.d = true;
    }

    public final /* synthetic */ void a(Runnable runnable) {
        runnable.run();
        this.c.countDown();
    }

    public void awaitClose() {
        try {
            this.c.await();
        } catch (InterruptedException unused) {
        }
    }

    public void close(Runnable runnable) {
        if (this.d) {
            this.a.removeCallbacksAndMessages(null);
            if (runnable != null) {
                this.a.post(new df6(3, this, runnable));
            }
            this.b.quitSafely();
            this.d = false;
        }
    }

    public void remove(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    public void run(Runnable runnable) {
        this.a.post(runnable);
    }

    public void run(Runnable runnable, long j) {
        this.a.postDelayed(runnable, j);
    }
}
