package com.yandex.go.ultima_mode.profile.mvp;

import defpackage.ad5;
import defpackage.nqs0;
import defpackage.o7r0;
import defpackage.pwy0;
import defpackage.tje;
import defpackage.tv11;
import defpackage.vu11;
import defpackage.wgf0;

/* loaded from: classes14.dex */
public final class a extends ad5 {
    public final tv11 A;
    public final com.yandex.go.ultima_mode.preferences.a B;
    public final o7r0 C;
    public final pwy0 x;
    public final com.yandex.go.ultima_mode.action.a y;
    public final com.yandex.go.ultima_mode.profile.state.a z;

    public a(pwy0 pwy0Var, com.yandex.go.ultima_mode.action.a aVar, com.yandex.go.ultima_mode.profile.state.a aVar2, tv11 tv11Var, com.yandex.go.ultima_mode.preferences.a aVar3, o7r0 o7r0Var) {
        super(wgf0.class);
        this.x = pwy0Var;
        this.y = aVar;
        this.z = aVar2;
        this.A = tv11Var;
        this.B = aVar3;
        this.C = o7r0Var;
    }

    public final void Kg(nqs0 nqs0Var) {
        vu11 vu11Var = nqs0Var instanceof vu11 ? (vu11) nqs0Var : null;
        if (vu11Var == null) {
            return;
        }
        tje.N(Jg(), null, null, new ProfileUltimaModeViewPresenter$handleAction$1(this, vu11Var, null), 3);
    }
}
