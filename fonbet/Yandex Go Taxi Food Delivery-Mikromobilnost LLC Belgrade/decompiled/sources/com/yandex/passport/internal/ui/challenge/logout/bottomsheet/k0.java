package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.hs31;
import defpackage.tig0;
import defpackage.yr31;

/* loaded from: classes2.dex */
public final class k0 implements hs31 {
    public final i0 a;

    public k0(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        l0 l0Var = new l0(null, null);
        i0 i0Var = this.a;
        com.arkivanov.mvikotlin.main.store.a aVar = i0Var.a;
        return new m0(com.arkivanov.mvikotlin.main.store.a.a(l0Var, new tig0(c0.a), new p(2, i0Var), h0.a));
    }
}
