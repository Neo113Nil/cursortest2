package com.yandex.go.chargers.discounts.activate;

import defpackage.avj0;
import defpackage.du9;
import defpackage.kyh0;
import defpackage.lt9;
import defpackage.pwy0;
import defpackage.tpr;
import defpackage.xt9;
import defpackage.yt11;
import defpackage.zuj0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final class d implements yt11 {
    public final pwy0 a;
    public final zuj0 b;
    public final xt9 c;

    public d(pwy0 pwy0Var, zuj0 zuj0Var, xt9 xt9Var) {
        this.a = pwy0Var;
        this.b = zuj0Var;
        this.c = xt9Var;
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return com.yandex.go.coroutines.b.d(new m0(this.a.a(), e.d(this.c.a), new ChargersDiscountsActivateUiStateInteractor$uiStateFlow$1(this, null)), new ChargersDiscountsActivateUiStateInteractor$special$$inlined$start$1(this, null));
    }

    public final du9 b() {
        return new du9(new lt9(null, "", null, ((avj0) this.b).h(kyh0.chargers_discounts_activate_promocode_button_text), 55), null, false);
    }
}
