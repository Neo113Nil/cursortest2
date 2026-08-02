package com.yandex.go.payments.yape.navigation;

import defpackage.kg0;
import defpackage.qu;
import defpackage.tje;
import defpackage.uh0;

/* loaded from: classes13.dex */
public final class b implements kg0 {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.kg0
    public final void D0(uh0 uh0Var) {
        c cVar = this.a;
        cVar.getClass();
        tje.N(cVar.o(), null, null, new AddYapeTokenBaseRouter$withSpinner$1(uh0Var, cVar, new AddYapeTokenBaseRouter$startBindYapeToken$1(cVar, null), null), 3);
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }
}
