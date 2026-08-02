package com.yandex.passport.sloth.ui;

import defpackage.hs31;
import defpackage.y8f;
import defpackage.yr31;

/* loaded from: classes2.dex */
public final class p1 implements hs31 {
    public final com.yandex.passport.internal.ui.challenge.vpn.o a;

    public p1(com.yandex.passport.internal.ui.challenge.vpn.o oVar) {
        this.a = oVar;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls, y8f y8fVar) {
        q1 q1Var = new q1(0);
        com.yandex.passport.internal.ui.challenge.vpn.o oVar = this.a;
        return new z1(com.arkivanov.mvikotlin.main.store.a.a(q1Var, new i0((b1) oVar.a), new e0(0, oVar), n0.a));
    }
}
