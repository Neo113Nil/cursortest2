package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* renamed from: io.appmetrica.analytics.impl.q4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5108q4 {
    public final SystemTimeProvider a;

    public C5108q4() {
        this(new SystemTimeProvider());
    }

    public final void a() {
        this.a.elapsedRealtime();
    }

    public C5108q4(SystemTimeProvider systemTimeProvider) {
        this.a = systemTimeProvider;
    }
}
