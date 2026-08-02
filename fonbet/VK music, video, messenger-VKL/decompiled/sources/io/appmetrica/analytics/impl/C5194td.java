package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.td, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5194td extends SafeRunnable {
    public final /* synthetic */ C5320yd a;
    public final /* synthetic */ ModuleEvent b;

    public C5194td(C5320yd c5320yd, ModuleEvent moduleEvent) {
        this.a = c5320yd;
        this.b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5320yd.a(this.a).reportEvent(this.b);
    }
}
