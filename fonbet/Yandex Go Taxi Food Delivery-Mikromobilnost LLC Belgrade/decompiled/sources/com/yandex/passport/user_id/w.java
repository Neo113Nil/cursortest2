package com.yandex.passport.user_id;

import androidx.core.app.d1;
import defpackage.cvw;
import defpackage.ds31;
import defpackage.tig0;
import defpackage.tje;
import defpackage.wkh;
import defpackage.yr31;

/* loaded from: classes2.dex */
public final class w extends yr31 {
    public final wkh b;
    public final com.lightside.cookies.coroutines.c c;
    public final kotlinx.coroutines.flow.b w;

    public w(d1 d1Var) {
        wkh a = com.arkivanov.mvikotlin.main.store.a.a(new com.yandex.passport.user_id.models.e(0), new tig0(q.a), new com.yandex.passport.internal.ui.sloth.plusdevices.w(11, d1Var), t.a);
        this.b = a;
        com.arkivanov.mvikotlin.extensions.coroutines.a aVar = new com.arkivanov.mvikotlin.extensions.coroutines.a(a);
        this.c = new com.lightside.cookies.coroutines.c(new com.yandex.passport.common.mvi.c(aVar, aVar, 14), new com.yandex.passport.internal.ui.sloth.menu.d(3, aVar));
        this.w = cvw.F(a);
    }

    @Override // defpackage.yr31
    public final void V() {
        this.b.b();
    }

    public final void W(com.yandex.passport.user_id.models.k kVar) {
        tje.N(ds31.a(this), null, null, new UserIdViewModel$onNewWish$1(this, kVar, null), 3);
    }
}
