package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.cvw;
import defpackage.ds31;
import defpackage.tje;
import defpackage.wkh;
import defpackage.yr31;

/* loaded from: classes2.dex */
public final class g0 extends yr31 {
    public final wkh b;
    public final com.arkivanov.mvikotlin.extensions.coroutines.a c;
    public final kotlinx.coroutines.flow.b w;

    public g0(wkh wkhVar) {
        this.b = wkhVar;
        this.c = new com.arkivanov.mvikotlin.extensions.coroutines.a(wkhVar);
        this.w = cvw.F(wkhVar);
    }

    @Override // defpackage.yr31
    public final void V() {
        this.b.b();
    }

    public final void W(f0 f0Var) {
        tje.N(ds31.a(this), null, null, new WebCardComposeViewModel$onWish$1(this, f0Var, null), 3);
    }
}
