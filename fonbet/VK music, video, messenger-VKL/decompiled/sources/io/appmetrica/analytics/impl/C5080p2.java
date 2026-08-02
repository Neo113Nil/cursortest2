package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import xsna.wc2;

/* renamed from: io.appmetrica.analytics.impl.p2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5080p2 {
    public final C5167sc a;
    public final ICommonExecutor b;
    public final long c;
    public boolean d = true;
    public final Runnable e = new wc2(this, 22);

    public C5080p2(C5167sc c5167sc, IHandlerExecutor iHandlerExecutor, long j) {
        this.a = c5167sc;
        this.b = iHandlerExecutor;
        this.c = j;
    }

    public static final void a(C5080p2 c5080p2) {
        C5193tc c5193tc = c5080p2.a.a;
        Gi gi = c5193tc.h;
        gi.c.a(c5193tc.b.a);
    }
}
