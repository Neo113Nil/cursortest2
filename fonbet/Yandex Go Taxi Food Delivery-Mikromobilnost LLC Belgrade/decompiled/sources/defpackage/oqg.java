package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes11.dex */
public final class oqg {
    public final String a;
    public final int b;
    public HandlerThread c;
    public Handler d;
    public j9f e;
    public nqg f;

    public oqg(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final synchronized void a(j9f j9fVar) {
        HandlerThread handlerThread = new HandlerThread(this.a, this.b);
        this.c = handlerThread;
        handlerThread.start();
        this.d = new Handler(this.c.getLooper());
        this.e = j9fVar;
    }
}
