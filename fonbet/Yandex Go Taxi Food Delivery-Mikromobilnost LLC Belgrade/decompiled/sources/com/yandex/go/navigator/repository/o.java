package com.yandex.go.navigator.repository;

import defpackage.bvf0;
import defpackage.gci0;
import defpackage.ho21;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class o {
    public final ho21 a;
    public TimeOutMode b;
    public boolean c;
    public final r0 d;
    public final gci0 e;
    public final m0 f;

    public o(ho21 ho21Var) {
        this.a = ho21Var;
        TimeOutMode timeOutMode = TimeOutMode.LONG_TIMEOUT;
        this.b = timeOutMode;
        long timerTimeoutMs = timeOutMode.getTimerTimeoutMs();
        com.yandex.go.coroutines.g gVar = ho21Var.b;
        if (ho21Var.a) {
            gVar.b();
            gVar.a(timerTimeoutMs);
        }
        r0 c = bvf0.c(Boolean.FALSE);
        this.d = c;
        this.e = kotlinx.coroutines.flow.e.d(c);
        this.f = new m0(ho21Var.c, kotlinx.coroutines.flow.e.p(c, 300L), new UserInteractionsListener$isUserInteractionsExpiredFlow$1(3, null));
    }

    public final void a() {
        boolean z = this.c;
        ho21 ho21Var = this.a;
        if (z) {
            this.c = false;
            ho21Var.a = true;
        }
        com.yandex.go.coroutines.g gVar = ho21Var.b;
        if (ho21Var.a) {
            gVar.b();
            gVar.a(0L);
        }
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.d;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    public final void b() {
        ho21 ho21Var = this.a;
        ho21Var.b.b();
        Boolean bool = Boolean.FALSE;
        r0 r0Var = this.d;
        r0Var.getClass();
        r0Var.m(null, bool);
        long timerTimeoutMs = this.b.getTimerTimeoutMs();
        if (this.c) {
            this.c = false;
            ho21Var.a = true;
        }
        com.yandex.go.coroutines.g gVar = ho21Var.b;
        if (ho21Var.a) {
            gVar.b();
            gVar.a(timerTimeoutMs);
        }
        Boolean bool2 = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool2);
    }
}
