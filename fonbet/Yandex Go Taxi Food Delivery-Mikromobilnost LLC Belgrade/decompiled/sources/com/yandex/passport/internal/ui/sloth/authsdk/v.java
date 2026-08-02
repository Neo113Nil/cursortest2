package com.yandex.passport.internal.ui.sloth.authsdk;

import defpackage.hs31;
import defpackage.y8f;
import defpackage.yr31;

/* loaded from: classes2.dex */
public final class v implements hs31 {
    public final u a;

    public v(u uVar) {
        this.a = uVar;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls, y8f y8fVar) {
        u uVar = this.a;
        com.arkivanov.mvikotlin.main.store.a aVar = uVar.a;
        return new c0(com.arkivanov.mvikotlin.main.store.a.a(new w(null, null), null, new com.yandex.passport.internal.flags.experiments.h(23, uVar), c.a));
    }
}
