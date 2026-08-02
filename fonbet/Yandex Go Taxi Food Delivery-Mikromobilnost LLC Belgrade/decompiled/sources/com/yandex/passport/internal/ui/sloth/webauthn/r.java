package com.yandex.passport.internal.ui.sloth.webauthn;

import defpackage.hs31;
import defpackage.tig0;
import defpackage.y8f;
import defpackage.yr31;

/* loaded from: classes2.dex */
public final class r implements hs31 {
    public final p a;

    public r(p pVar) {
        this.a = pVar;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls, y8f y8fVar) {
        p pVar = this.a;
        com.arkivanov.mvikotlin.main.store.a aVar = pVar.a;
        return new w(com.arkivanov.mvikotlin.main.store.a.a(new RegisterWebAuthNViewModel$State(null, null, null, 7, null), new tig0(i.a), new com.yandex.passport.internal.ui.sloth.plusdevices.w(2, pVar), o.a));
    }
}
