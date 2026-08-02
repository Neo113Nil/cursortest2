package com.yandex.go.coroutines;

import defpackage.bvf0;
import defpackage.czo0;
import defpackage.ffx;
import defpackage.hbp0;
import defpackage.tje;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class g {
    public final hbp0 a = new hbp0(new czo0(14), "", null);
    public final n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public final r0 c = bvf0.c(0L);
    public boolean d;

    public final void a(long j) {
        if (j < 0) {
            return;
        }
        if (this.d) {
            this.b.g(Long.valueOf(j));
            return;
        }
        this.d = true;
        hbp0 hbp0Var = this.a;
        hbp0Var.a();
        tje.N(hbp0Var.c(), null, null, new ExpiredTimer$start$1(this, j, null), 3);
    }

    public final void b() {
        if (this.d) {
            this.d = false;
            this.a.b();
        }
    }
}
