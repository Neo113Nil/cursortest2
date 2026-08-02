package com.yandex.go.drive.sdkintegration.domain.session.unified_polling;

import defpackage.eci0;
import defpackage.ffx;
import defpackage.h3y;
import defpackage.jqr;
import defpackage.ky11;
import defpackage.lqn;
import defpackage.shf;
import defpackage.t1r0;
import defpackage.tse;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.ym91;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes.dex */
public final class e implements t1r0 {
    public final tse a;
    public final h3y b;
    public final n0 c = ffx.b(1, 0, BufferOverflow.DROP_OLDEST);
    public final AtomicReference d = new AtomicReference();
    public final AtomicReference e = new AtomicReference();
    public final eci0 f;

    public e(tse tseVar, ky11 ky11Var, h3y h3yVar) {
        this.a = tseVar;
        this.b = h3yVar;
        this.f = kotlinx.coroutines.flow.e.O(new k(com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.t(new jqr(new d(ky11Var.d()), new UnifiedPollingSessionStateInteractor$sessionStateFlow$2(this, null), 3)), new UnifiedPollingSessionStateInteractor$sessionStateFlow$3(this, null)), new UnifiedPollingSessionStateInteractor$sessionStateFlow$4(this, null)), tseVar, wsr0.a(xsr0.a, 1), 0);
    }

    @Override // defpackage.t1r0
    public final shf a() {
        lqn lqnVar = (lqn) this.e.get();
        if (lqnVar != null) {
            return ym91.c(lqnVar);
        }
        return null;
    }

    @Override // defpackage.t1r0
    public final eci0 b() {
        return this.f;
    }
}
