package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;

/* loaded from: classes8.dex */
public final class Q3 extends SimpleThreadSafeToggle {
    public final C4937jf a;

    public Q3(C4937jf c4937jf) {
        super(c4937jf.e(), "[ClientApiTrackingStatusToggle]");
        this.a = c4937jf;
    }

    public final void a(boolean z) {
        updateState(z);
        this.a.f(z);
    }
}
