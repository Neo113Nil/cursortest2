package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.cse;
import defpackage.jqr;

/* loaded from: classes2.dex */
public final class o extends cse {
    public final com.yandex.passport.internal.sloth.performers.webcard.g c;

    public o(com.yandex.passport.internal.sloth.performers.webcard.g gVar) {
        super(0);
        this.c = gVar;
    }

    @Override // defpackage.la6
    public final void invoke() {
        a(l.a);
        kotlinx.coroutines.flow.e.H(this.b, new jqr(this.c.a, new WebCardComposeStoreFactory$BootstrapperImpl$invoke$1(this, null), 3));
    }
}
