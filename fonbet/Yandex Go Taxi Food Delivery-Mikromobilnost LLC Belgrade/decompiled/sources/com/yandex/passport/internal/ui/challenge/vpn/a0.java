package com.yandex.passport.internal.ui.challenge.vpn;

import defpackage.ds31;
import defpackage.tig0;
import defpackage.tje;
import defpackage.wkh;
import defpackage.yr31;

/* loaded from: classes2.dex */
public final class a0 extends yr31 {
    public final wkh b;
    public final com.arkivanov.mvikotlin.extensions.coroutines.a c;

    public a0(o oVar, String str) {
        new com.arkivanov.mvikotlin.main.store.a();
        wkh a = com.arkivanov.mvikotlin.main.store.a.a(new s(0), new tig0(new g(str)), new com.yandex.passport.internal.flags.experiments.h(17, oVar), n.a);
        this.b = a;
        this.c = new com.arkivanov.mvikotlin.extensions.coroutines.a(a);
    }

    @Override // defpackage.yr31
    public final void V() {
        this.b.b();
    }

    public final void W(z zVar) {
        tje.N(ds31.a(this), null, null, new VpnChallengeViewModel$onWish$1(this, zVar, null), 3);
    }
}
