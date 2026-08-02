package com.yandex.messaging.analytics;

import android.os.SystemClock;
import defpackage.bvf0;
import defpackage.o5e;
import defpackage.rcz0;
import defpackage.tcz0;
import defpackage.tje;
import defpackage.w3c;
import defpackage.x22;

/* loaded from: classes15.dex */
public final class b {
    public final x22 a;
    public final o5e b;
    public final w3c c;
    public tcz0 d;
    public rcz0 e;

    public b(x22 x22Var, o5e o5eVar, w3c w3cVar) {
        this.a = x22Var;
        this.b = o5eVar;
        this.c = w3cVar;
    }

    public final tcz0 a(String str) {
        tcz0 tcz0Var = this.d;
        if (tcz0Var == null || !tcz0Var.a.equals(str)) {
            return null;
        }
        return tcz0Var;
    }

    public final void b(String str, boolean z) {
        this.c.getClass();
        tje.N(bvf0.b(), null, null, new TimelineOpenLogger$onGapFillFinished$1(this, str, z, SystemClock.elapsedRealtime(), null), 3);
    }

    public final void c(String str) {
        this.c.getClass();
        tje.N(bvf0.b(), null, null, new TimelineOpenLogger$onGapFillStarted$1(this, str, SystemClock.elapsedRealtime(), null), 3);
    }
}
