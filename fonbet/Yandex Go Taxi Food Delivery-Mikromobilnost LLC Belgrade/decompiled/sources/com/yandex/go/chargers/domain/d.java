package com.yandex.go.chargers.domain;

import defpackage.hbp0;
import defpackage.jey;

/* loaded from: classes12.dex */
public final class d extends jey {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStart() {
        e eVar = this.a;
        hbp0 hbp0Var = eVar.g;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new ChargersUserStateInteractor$startObserveUserState$1(eVar, null), 3);
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStop() {
        this.a.g.b();
    }
}
