package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.hs31;
import defpackage.tig0;
import defpackage.y8f;
import defpackage.yr31;

/* loaded from: classes2.dex */
public final class t implements hs31 {
    public final o a;

    public t(o oVar) {
        this.a = oVar;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls, y8f y8fVar) {
        o oVar = this.a;
        com.arkivanov.mvikotlin.main.store.a aVar = oVar.a;
        return new e0(com.arkivanov.mvikotlin.main.store.a.a(new u(null, null), new tig0(h.a), new com.yandex.passport.internal.flags.experiments.h(14, oVar), n.a));
    }
}
