package com.yandex.passport.internal.ui.sloth.plusdevices;

import defpackage.cvw;
import defpackage.ds31;
import defpackage.tje;
import defpackage.wkh;
import defpackage.yr31;

/* loaded from: classes2.dex */
public final class q0 extends yr31 {
    public final wkh b;
    public final com.arkivanov.mvikotlin.extensions.coroutines.a c;
    public final kotlinx.coroutines.flow.b w;

    public q0(wkh wkhVar) {
        this.b = wkhVar;
        this.c = new com.arkivanov.mvikotlin.extensions.coroutines.a(wkhVar);
        this.w = cvw.F(wkhVar);
    }

    @Override // defpackage.yr31
    public final void V() {
        this.b.b();
    }

    public final void W(p0 p0Var) {
        tje.N(ds31.a(this), null, null, new ManagingPlusDevicesViewModel$onWish$1(this, p0Var, null), 3);
    }
}
