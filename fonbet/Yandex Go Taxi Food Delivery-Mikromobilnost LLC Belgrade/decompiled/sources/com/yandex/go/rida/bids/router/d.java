package com.yandex.go.rida.bids.router;

import defpackage.avj0;
import defpackage.kyh0;
import defpackage.m950;
import defpackage.mej;
import defpackage.tls;
import defpackage.xq5;
import defpackage.zuj0;

/* loaded from: classes13.dex */
public final class d implements xq5 {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    public final void a() {
        zuj0 zuj0Var = this.a.G;
        b(new mej(((avj0) zuj0Var).h(kyh0.order_cancel_fail), null, null, ((avj0) zuj0Var).h(kyh0.common_ok)), new BidsModalRouter$InnerNavigator$showCancelFailedDialog$1(1, null), new BidsModalRouter$InnerNavigator$showCancelFailedDialog$2(1, null));
    }

    public final void b(mej mejVar, tls tlsVar, tls tlsVar2) {
        e eVar = this.a;
        eVar.A((m950) eVar.M.get(), mejVar, new c(eVar, tlsVar2, tlsVar, 0));
    }
}
