package com.yandex.passport.internal.ui.challenge.changecurrent;

import defpackage.tig0;
import defpackage.wkh;
import defpackage.yr31;

/* loaded from: classes8.dex */
public final class s extends yr31 {
    public final wkh b;
    public final com.arkivanov.mvikotlin.extensions.coroutines.a c;

    public s(c0 c0Var) {
        q qVar = new q(0);
        g gVar = c0Var.d;
        wkh a = com.arkivanov.mvikotlin.main.store.a.a(qVar, new tig0(new t(gVar.a, gVar.c)), new com.yandex.passport.internal.d(8, c0Var), b0.a);
        this.b = a;
        this.c = new com.arkivanov.mvikotlin.extensions.coroutines.a(a);
    }

    @Override // defpackage.yr31
    public final void V() {
        this.b.b();
    }
}
