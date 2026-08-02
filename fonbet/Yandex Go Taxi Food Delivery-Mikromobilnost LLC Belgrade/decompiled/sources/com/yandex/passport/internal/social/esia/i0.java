package com.yandex.passport.internal.social.esia;

import com.yandex.passport.data.network.k3;
import defpackage.v1m0;
import defpackage.wkh;
import defpackage.yr31;

/* loaded from: classes2.dex */
public final class i0 extends yr31 {
    public final wkh b;
    public final v1m0 c;
    public final com.lightside.cookies.coroutines.c w;

    public i0(wkh wkhVar, v1m0 v1m0Var) {
        this.b = wkhVar;
        this.c = v1m0Var;
        com.arkivanov.mvikotlin.extensions.coroutines.a aVar = new com.arkivanov.mvikotlin.extensions.coroutines.a(wkhVar);
        this.w = new com.lightside.cookies.coroutines.c(new h0(aVar, aVar, this, 0), new k3(2, aVar, this));
    }

    @Override // defpackage.yr31
    public final void V() {
        this.b.b();
    }
}
