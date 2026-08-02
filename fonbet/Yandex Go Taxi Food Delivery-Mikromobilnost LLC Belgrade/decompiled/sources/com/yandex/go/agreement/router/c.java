package com.yandex.go.agreement.router;

import defpackage.idz;
import defpackage.qu;
import defpackage.tje;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes12.dex */
public final class c implements idz {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.idz
    public final void r0() {
        qu quVar = new qu(9);
        d dVar = this.a;
        dVar.r(quVar);
        tje.N(dVar.D, null, CoroutineStart.UNDISPATCHED, new AgreementRouterImpl$showLocationPermission$1$onContinue$1(dVar, null), 1);
    }
}
