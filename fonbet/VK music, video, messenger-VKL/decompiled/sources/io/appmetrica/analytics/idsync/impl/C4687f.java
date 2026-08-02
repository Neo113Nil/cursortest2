package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.idsync.impl.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4687f extends SafeRunnable {
    public final /* synthetic */ h a;

    public C4687f(h hVar) {
        this.a = hVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        IdSyncConfig idSyncConfig;
        if (this.a.f && (idSyncConfig = this.a.e) != null) {
            this.a.getClass();
            if (h.a(idSyncConfig)) {
                List<RequestConfig> requests = idSyncConfig.getRequests();
                h hVar = this.a;
                Iterator<T> it = requests.iterator();
                while (it.hasNext()) {
                    hVar.d.a((RequestConfig) it.next());
                }
                h hVar2 = this.a;
                IHandlerExecutor iHandlerExecutor = hVar2.c;
                C4687f c4687f = hVar2.g;
                if (c4687f == null) {
                    c4687f = null;
                }
                iHandlerExecutor.executeDelayed(c4687f, hVar2.b);
            }
        }
    }
}
