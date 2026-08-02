package com.yandex.go.overdraft;

import defpackage.nsd0;
import defpackage.tje;
import defpackage.wqw;
import defpackage.z80;

/* loaded from: classes13.dex */
public final class b implements nsd0 {
    public final /* synthetic */ e a;

    public b(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.nsd0
    public final void d(wqw wqwVar) {
        boolean z = ((z80) wqwVar).b;
        e eVar = this.a;
        if (z) {
            tje.N(eVar.L, null, null, new OverdraftPaymentMethodsRouter$PmlRouterEventsListenerImpl$addCardDone$1(eVar, null), 3);
        }
        eVar.G.g();
    }
}
