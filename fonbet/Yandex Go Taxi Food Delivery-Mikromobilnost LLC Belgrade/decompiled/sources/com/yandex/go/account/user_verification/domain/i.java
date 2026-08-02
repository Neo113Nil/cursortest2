package com.yandex.go.account.user_verification.domain;

import defpackage.cda0;
import defpackage.i3y;
import defpackage.kyl0;
import defpackage.mth;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.zf2;
import defpackage.zy11;

/* loaded from: classes.dex */
public final class i {
    public final kyl0 a;
    public final cda0 b;
    public final i3y c;

    public i(rqo rqoVar, kyl0 kyl0Var, cda0 cda0Var) {
        this.a = kyl0Var;
        this.b = cda0Var;
        this.c = kotlin.a.a(new zf2(rqoVar, 13));
    }

    public final h a() {
        return new h(new mth(new b(kotlinx.coroutines.flow.e.n(com.yandex.go.coroutines.b.d(this.a.c, new SafetyUserVerificationUpdatesInteractorImpl$special$$inlined$start$1(zy11.a, null)), new f(kotlinx.coroutines.flow.e.t(new d(((com.yandex.go.payments.paymentlist.data.c) this.b).u))), ((qqo) this.c.getValue()).a(), new SafetyUserVerificationUpdatesInteractorImpl$updatesFlow$1(4, null))), 4));
    }

    public final void b() {
        kyl0 kyl0Var = this.a;
        kyl0Var.b.g(zy11.a);
        if (((Boolean) ((qqo) this.c.getValue()).b()).booleanValue()) {
            kyl0Var.a.set(true);
        }
    }
}
