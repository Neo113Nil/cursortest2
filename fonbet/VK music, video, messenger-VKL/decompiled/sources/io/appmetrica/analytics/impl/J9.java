package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes8.dex */
public final class J9 {
    public final ReentrantLock a;
    public final C4958ka b;

    public J9(Context context, String str) {
        this(new ReentrantLock(), new C4958ka(context, str));
    }

    public final void a() {
        this.a.lock();
        this.b.a();
    }

    public final void b() {
        this.b.b();
        this.a.unlock();
    }

    public final void c() {
        C4958ka c4958ka = this.b;
        synchronized (c4958ka) {
            c4958ka.b();
            c4958ka.a.delete();
        }
        this.a.unlock();
    }

    public J9(ReentrantLock reentrantLock, C4958ka c4958ka) {
        this.a = reentrantLock;
        this.b = c4958ka;
    }
}
