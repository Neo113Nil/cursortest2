package com.yandex.passport.sloth.ui;

import defpackage.cse;
import defpackage.ike;
import defpackage.jqr;

/* loaded from: classes2.dex */
public final class i0 extends cse {
    public final b1 c;

    public i0(b1 b1Var) {
        super(0);
        this.c = b1Var;
    }

    @Override // defpackage.la6
    public final void invoke() {
        com.yandex.passport.sloth.b1 b1Var = (com.yandex.passport.sloth.b1) this.c;
        jqr jqrVar = new jqr(b1Var.b(), new SlothStoreFactory$BootstrapperImpl$invoke$1(this, null), 3);
        ike ikeVar = this.b;
        kotlinx.coroutines.flow.e.H(ikeVar, jqrVar);
        kotlinx.coroutines.flow.e.H(ikeVar, new jqr(b1Var.b.c.b, new SlothStoreFactory$BootstrapperImpl$invoke$2(this, null), 3));
    }
}
