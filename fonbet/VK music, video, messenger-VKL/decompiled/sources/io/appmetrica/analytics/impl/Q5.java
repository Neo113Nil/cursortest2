package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

/* loaded from: classes8.dex */
public final class Q5 {
    public final C5051o a;
    public final IReporter b;
    public Context c;
    public final P5 d;

    public Q5(C5051o c5051o) {
        this(c5051o, 0);
    }

    public final synchronized void a(Context context) {
        if (this.c == null) {
            Context applicationContext = context.getApplicationContext();
            this.a.a(applicationContext);
            this.a.registerListener(this.d, ActivityEvent.RESUMED, ActivityEvent.PAUSED);
            this.c = applicationContext;
        }
    }

    public Q5(C5051o c5051o, IReporter iReporter) {
        this.a = c5051o;
        this.b = iReporter;
        this.d = new P5(this);
    }

    public /* synthetic */ Q5(C5051o c5051o, int i) {
        this(c5051o, AbstractC5308y1.a());
    }

    public final synchronized Context a() {
        return this.c;
    }
}
