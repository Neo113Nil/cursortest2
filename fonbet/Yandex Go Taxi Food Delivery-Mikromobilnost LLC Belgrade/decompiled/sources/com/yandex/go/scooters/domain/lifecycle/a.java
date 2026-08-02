package com.yandex.go.scooters.domain.lifecycle;

import defpackage.cwn0;
import defpackage.l8x;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;

/* loaded from: classes13.dex */
public final class a implements cwn0 {
    public final tse a;
    public final tt2 b;
    public final com.yandex.go.scooters.payments.domain.a c;
    public pzt0 d;

    public a(tse tseVar, tt2 tt2Var, com.yandex.go.scooters.payments.domain.a aVar) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = aVar;
    }

    @Override // defpackage.cwn0
    public final void b() {
        ScootersPaymentMethodsPreloadInteractor$onLaunch$1 scootersPaymentMethodsPreloadInteractor$onLaunch$1 = new ScootersPaymentMethodsPreloadInteractor$onLaunch$1(this, a.class, "job", "getJob()Lkotlinx/coroutines/Job;", 0);
        l8x l8xVar = (l8x) scootersPaymentMethodsPreloadInteractor$onLaunch$1.get();
        scootersPaymentMethodsPreloadInteractor$onLaunch$1.i(null);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.b.getClass();
        this.d = tje.N(this.a, uyj.a, null, new ScootersPaymentMethodsPreloadInteractor$onLaunch$2(this, null), 2);
    }

    @Override // defpackage.cwn0
    public final void onDismiss() {
        ScootersPaymentMethodsPreloadInteractor$onDismiss$1 scootersPaymentMethodsPreloadInteractor$onDismiss$1 = new ScootersPaymentMethodsPreloadInteractor$onDismiss$1(this, a.class, "job", "getJob()Lkotlinx/coroutines/Job;", 0);
        l8x l8xVar = (l8x) scootersPaymentMethodsPreloadInteractor$onDismiss$1.get();
        scootersPaymentMethodsPreloadInteractor$onDismiss$1.i(null);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        this.c.b.b().a();
    }
}
