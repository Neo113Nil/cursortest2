package com.yandex.go.walking.navigation.impl.overview.interactor;

import defpackage.a3l0;
import defpackage.ah00;
import defpackage.dib1;
import defpackage.ha2;
import defpackage.n441;
import defpackage.v541;
import defpackage.vmn0;
import java.util.List;

/* loaded from: classes14.dex */
public final class j {
    public final vmn0 a;
    public final v541 b;
    public final ah00 c;
    public final n441 d;
    public final a3l0 e;

    public j(vmn0 vmn0Var, v541 v541Var, ah00 ah00Var, n441 n441Var, a3l0 a3l0Var) {
        this.a = vmn0Var;
        this.b = v541Var;
        this.c = ah00Var;
        this.d = n441Var;
        this.e = a3l0Var;
    }

    public final ha2 a(List list) {
        v541 v541Var = this.b;
        return kotlinx.coroutines.flow.e.n(new g(new i(new com.yandex.go.walking.navigation.impl.navigation_core.repository.b(v541Var.b.b, v541Var)), this, list), kotlinx.coroutines.flow.e.t(new e(com.yandex.go.coroutines.b.d(new c(dib1.c(this.c)), new WalkNavOverviewUiStateInteractor$compassFabStateFlow$$inlined$start$1(this, null)))), kotlinx.coroutines.flow.e.d(this.d.a), new WalkNavOverviewUiStateInteractor$uiStateFlow$1(this, null));
    }
}
