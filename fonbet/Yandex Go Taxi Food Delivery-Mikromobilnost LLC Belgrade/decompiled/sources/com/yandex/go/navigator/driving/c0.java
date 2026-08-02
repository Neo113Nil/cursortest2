package com.yandex.go.navigator.driving;

import defpackage.ha2;
import defpackage.tpr;

/* loaded from: classes12.dex */
public final class c0 {
    public final com.yandex.go.navigator.domain.o a;
    public final com.yandex.go.navigator.domain.t b;

    public c0(com.yandex.go.navigator.domain.o oVar, com.yandex.go.navigator.domain.t tVar) {
        this.a = oVar;
        this.b = tVar;
    }

    public final ha2 a() {
        tpr t = kotlinx.coroutines.flow.e.t(new z(this.a.f));
        com.yandex.go.navigator.domain.t tVar = this.b;
        return kotlinx.coroutines.flow.e.n(t, kotlinx.coroutines.flow.e.t(new b0(tVar.Q)), kotlinx.coroutines.flow.e.t(tVar.R), new SpeedGroupUiStateMapper$map$3(4, null));
    }
}
