package com.yandex.go.drive.superapp;

import com.yandex.go.coroutines.g;
import defpackage.pzt0;
import defpackage.t8j;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes12.dex */
public final class b {
    public final tse a;
    public final g b = new g();
    public pzt0 c;

    public b(tse tseVar) {
        this.a = tseVar;
    }

    public final void a(long j, t8j t8jVar) {
        b();
        this.b.a(j);
        this.c = tje.N(this.a, null, null, new TimerJob$restartTimer$1(this, t8jVar, null), 3);
    }

    public final void b() {
        pzt0 pzt0Var = this.c;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.c = null;
        this.b.b();
    }
}
