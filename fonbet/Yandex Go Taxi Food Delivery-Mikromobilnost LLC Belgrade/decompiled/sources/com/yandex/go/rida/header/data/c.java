package com.yandex.go.rida.header.data;

import defpackage.s5k0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes8.dex */
public final class c implements s5k0 {
    public final tt2 a;
    public final com.yandex.go.navigation.screen.c b;

    public c(tt2 tt2Var, com.yandex.go.navigation.screen.c cVar) {
        this.a = tt2Var;
        this.b = cVar;
    }

    @Override // defpackage.s5k0
    public final tpr a() {
        g X = kotlinx.coroutines.flow.e.X(new b(kotlinx.coroutines.flow.e.r(this.b.c(), new DefaultRidaHeaderStateInteractor$uiStateFlow$1(this)), this), new DefaultRidaHeaderStateInteractor$special$$inlined$flatMapLatest$1());
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(X, uyj.a);
    }
}
