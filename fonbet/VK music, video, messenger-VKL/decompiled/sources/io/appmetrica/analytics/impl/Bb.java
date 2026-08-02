package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final class Bb implements Runnable {
    public final WeakReference a;
    public final WeakReference b;

    public Bb(Handler handler, U2 u2) {
        this.a = new WeakReference(handler);
        this.b = new WeakReference(u2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.a.get();
        U2 u2 = (U2) this.b.get();
        if (handler == null || u2 == null) {
            return;
        }
        boolean f = u2.b.f();
        if (!f) {
            PublicLogger publicLogger = u2.c;
            Set set = I9.a;
            EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
            Y3 y3 = new Y3("", "", 3, 0, publicLogger);
            Gi gi = u2.h;
            Ph ph = u2.b;
            gi.getClass();
            gi.a(Gi.a(y3, ph), ph, 1, (Map) null);
        }
        if (f) {
            return;
        }
        Ab.a(handler, u2, this);
    }
}
