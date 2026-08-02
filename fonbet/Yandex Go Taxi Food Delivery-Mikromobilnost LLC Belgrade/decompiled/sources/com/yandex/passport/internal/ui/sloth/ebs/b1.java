package com.yandex.passport.internal.ui.sloth.ebs;

import com.yandex.passport.data.network.k3;
import defpackage.cvw;
import defpackage.ds31;
import defpackage.tje;
import defpackage.v1m0;
import defpackage.wkh;
import defpackage.yr31;

/* loaded from: classes2.dex */
public final class b1 extends yr31 {
    public final wkh b;
    public final com.yandex.passport.common.ebs.t c;
    public final v1m0 w;
    public final com.lightside.cookies.coroutines.c x;
    public final kotlinx.coroutines.flow.b y;

    public b1(wkh wkhVar, com.yandex.passport.common.ebs.t tVar, v1m0 v1m0Var) {
        this.b = wkhVar;
        this.c = tVar;
        this.w = v1m0Var;
        com.arkivanov.mvikotlin.extensions.coroutines.a aVar = new com.arkivanov.mvikotlin.extensions.coroutines.a(wkhVar);
        this.x = new com.lightside.cookies.coroutines.c(new com.yandex.passport.internal.social.esia.h0(aVar, aVar, this, 1), new k3(3, aVar, this));
        this.y = cvw.F(wkhVar);
    }

    @Override // defpackage.yr31
    public final void V() {
        this.c.d();
        this.b.b();
    }

    public final void W(z0 z0Var) {
        tje.N(ds31.a(this), null, null, new BiometricVerificationViewModel$onWish$1(this, z0Var, null), 3);
    }
}
