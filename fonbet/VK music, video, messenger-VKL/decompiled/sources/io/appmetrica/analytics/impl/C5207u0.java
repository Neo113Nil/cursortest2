package io.appmetrica.analytics.impl;

import android.app.Service;

/* renamed from: io.appmetrica.analytics.impl.u0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5207u0 implements A1 {
    public final Service a;

    public C5207u0(Service service) {
        this.a = service;
    }

    public final void a(int i) {
        this.a.stopSelf(i);
    }
}
