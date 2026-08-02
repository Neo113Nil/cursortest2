package com.yandex.go.chargers.payments.domain;

import com.yandex.go.payments.domain.l0;
import defpackage.by90;
import defpackage.cxq0;
import defpackage.dy90;
import defpackage.l90;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.t32;
import defpackage.tje;
import defpackage.tla;
import defpackage.tse;
import defpackage.tt2;
import defpackage.u2a;
import defpackage.u32;
import defpackage.uba0;
import defpackage.uyj;

/* loaded from: classes.dex */
public final class d implements tla, u2a {
    public final tse a;
    public final tt2 b;
    public final com.yandex.go.payments.superapp.payment.b c;
    public final cxq0 d;
    public dy90 e;

    public d(tse tseVar, tt2 tt2Var, com.yandex.go.payments.superapp.payment.b bVar, cxq0 cxq0Var) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = bVar;
        this.d = cxq0Var;
    }

    public final synchronized by90 b() {
        dy90 dy90Var;
        dy90Var = this.e;
        if (dy90Var == null) {
            com.yandex.go.payments.superapp.payment.b bVar = this.c;
            u32.a.getClass();
            dy90Var = bVar.a("chargers", t32.b, new l90(), uba0.g);
            this.e = dy90Var;
            tse tseVar = this.a;
            this.b.getClass();
            sjh sjhVar = uyj.a;
            tje.N(tseVar, mdh.b, null, new ChargersPaymentComponentHolderImpl$migrateSelectedPaymentSource$1(this, null), 2);
        }
        return dy90Var;
    }

    public final l0 c() {
        return ((dy90) b()).a.b();
    }

    @Override // defpackage.u2a
    public final synchronized void onDetach() {
        try {
            dy90 dy90Var = this.e;
            if (dy90Var != null) {
                dy90Var.dispose();
            }
            this.e = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
