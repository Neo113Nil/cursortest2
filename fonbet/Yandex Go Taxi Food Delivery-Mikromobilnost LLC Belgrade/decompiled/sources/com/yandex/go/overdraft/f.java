package com.yandex.go.overdraft;

import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uyj;

/* loaded from: classes13.dex */
public final /* synthetic */ class f implements tls {
    public final /* synthetic */ g a;

    public /* synthetic */ f(g gVar) {
        this.a = gVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        g gVar = this.a;
        if (str != null) {
            tse o = gVar.o();
            gVar.E.getClass();
            sjh sjhVar = uyj.a;
            tje.N(o, mdh.b, null, new OverdraftRouterImpl$OverdraftPaymentsNavigatorImpl$goToAddCard$1$1(gVar, null), 2);
        }
        gVar.F.g();
        return Boolean.TRUE;
    }
}
