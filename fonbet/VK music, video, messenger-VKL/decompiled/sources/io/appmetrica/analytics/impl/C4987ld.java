package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.impl.C4987ld;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* renamed from: io.appmetrica.analytics.impl.ld, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4987ld implements ModuleServiceLifecycleController {
    public final V1 a;

    public C4987ld(V1 v1) {
        this.a = v1;
    }

    public static final void a(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onFirstClientConnected();
    }

    public static final void b(ModuleServiceLifecycleObserver moduleServiceLifecycleObserver, Intent intent) {
        moduleServiceLifecycleObserver.onAllClientsDisconnected();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController
    public final void registerObserver(final ModuleServiceLifecycleObserver moduleServiceLifecycleObserver) {
        this.a.b(new U1() { // from class: xsna.y4z0
            @Override // io.appmetrica.analytics.impl.U1
            public final void a(Intent intent) {
                C4987ld.a(ModuleServiceLifecycleObserver.this, intent);
            }
        });
        this.a.a(new U1() { // from class: xsna.z4z0
            @Override // io.appmetrica.analytics.impl.U1
            public final void a(Intent intent) {
                C4987ld.b(ModuleServiceLifecycleObserver.this, intent);
            }
        });
    }
}
