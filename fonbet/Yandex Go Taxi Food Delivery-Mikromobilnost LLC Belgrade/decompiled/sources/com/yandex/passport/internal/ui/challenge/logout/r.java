package com.yandex.passport.internal.ui.challenge.logout;

import defpackage.tig0;
import defpackage.wkh;
import defpackage.yr31;

/* loaded from: classes2.dex */
public final class r extends yr31 {
    public final wkh b;
    public final com.arkivanov.mvikotlin.extensions.coroutines.a c;

    public r(f0 f0Var) {
        wkh a = com.arkivanov.mvikotlin.main.store.a.a(new p(null, null, null, null), new tig0(new w(f0Var.e, f0Var.f, f0Var.g)), new com.yandex.passport.internal.flags.experiments.h(16, f0Var), e0.a);
        this.b = a;
        this.c = new com.arkivanov.mvikotlin.extensions.coroutines.a(a);
    }

    @Override // defpackage.yr31
    public final void V() {
        this.b.b();
    }
}
