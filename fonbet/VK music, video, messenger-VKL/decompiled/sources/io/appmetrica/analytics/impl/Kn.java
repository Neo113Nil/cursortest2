package io.appmetrica.analytics.impl;

import android.os.Looper;
import java.util.Map;

/* loaded from: classes8.dex */
public final class Kn implements Mn {
    @Override // io.appmetrica.analytics.impl.Mn
    public final Thread a() {
        return Looper.getMainLooper().getThread();
    }

    @Override // io.appmetrica.analytics.impl.Mn
    public final StackTraceElement[] b() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Mn
    public final Map c() {
        return Thread.getAllStackTraces();
    }
}
