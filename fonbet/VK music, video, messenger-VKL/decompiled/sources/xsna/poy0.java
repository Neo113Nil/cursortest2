package xsna;

import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: HandlerThreadProvider.kt */
/* loaded from: classes2.dex */
public final class poy0 {
    public final String a;
    public volatile HandlerThread b;
    public final AtomicInteger c = new AtomicInteger();

    public poy0(String str) {
        this.a = str;
    }

    public final HandlerThread a() {
        HandlerThread handlerThread = this.b;
        if (handlerThread != null) {
            this.c.incrementAndGet();
            return handlerThread;
        }
        synchronized (this) {
            HandlerThread handlerThread2 = this.b;
            if (handlerThread2 != null) {
                this.c.incrementAndGet();
                return handlerThread2;
            }
            HandlerThread handlerThread3 = new HandlerThread(this.a);
            handlerThread3.start();
            this.b = handlerThread3;
            this.c.incrementAndGet();
            return handlerThread3;
        }
    }
}
