package com.yandex.passport.internal.ui.bouncer.chooser;

import defpackage.hs31;
import defpackage.tig0;
import defpackage.yr31;

/* loaded from: classes2.dex */
public final class w implements hs31 {
    public final v a;

    public w(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        a0 a0Var = new a0(null, null, null, null);
        v vVar = this.a;
        com.arkivanov.mvikotlin.main.store.a aVar = vVar.a;
        return new c0(com.arkivanov.mvikotlin.main.store.a.a(a0Var, new tig0(n.a), new com.yandex.passport.internal.flags.experiments.h(11, vVar), u.a));
    }
}
