package com.yandex.go.analytics.realtime.service.batched;

import defpackage.ew2;
import defpackage.ffx;
import defpackage.hst;
import defpackage.jst;
import defpackage.lf5;
import defpackage.mei0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.wei0;
import java.util.Objects;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes.dex */
public final class a implements wei0 {
    public final lf5 a;
    public final ew2 b;
    public final tse c;
    public final n0 d = ffx.c(0, 0, null, 7);
    public pzt0 e;

    public a(lf5 lf5Var, ew2 ew2Var, tse tseVar) {
        this.a = lf5Var;
        this.b = ew2Var;
        this.c = tseVar;
    }

    @Override // defpackage.wei0
    public final void a(mei0 mei0Var) {
        pzt0 pzt0Var = this.e;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            jst.e.d("BatchedRealtimeSignalService", "Called postEvent without an active collector present. Have you forgotten to call RealtimeSignalService.start()?");
        }
        if (this.a.a) {
            hst hstVar = jst.e;
            Objects.toString(mei0Var.toMap());
            hstVar.getClass();
            tje.N(this.c, null, null, new BatchedRealtimeSignalService$postEvent$1(this, mei0Var, null), 3);
        }
    }

    @Override // defpackage.wei0
    public final void start() {
        hst hstVar = jst.e;
        Objects.toString(this.e);
        tse tseVar = this.c;
        Objects.toString(tseVar);
        hstVar.getClass();
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.e = tje.N(tseVar, null, null, new BatchedRealtimeSignalService$start$1(this, null), 3);
    }

    @Override // defpackage.wei0
    public final void stop() {
        jst.e.getClass();
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.e = null;
    }
}
