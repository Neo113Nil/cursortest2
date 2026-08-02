package com.yandex.go.chargers.debt.notification.domain;

import defpackage.b2k;
import defpackage.bq9;
import defpackage.dn7;
import defpackage.dq9;
import defpackage.em9;
import defpackage.mq5;
import defpackage.vp9;
import defpackage.xdf;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class a {
    public final em9 a;
    public final xdf b;
    public final e c;
    public final bq9 d;
    public final dq9 e;
    public final vp9 f;
    public final dn7 g = new dn7(25, this);

    public a(em9 em9Var, xdf xdfVar, e eVar, bq9 bq9Var, dq9 dq9Var, vp9 vp9Var) {
        this.a = em9Var;
        this.b = xdfVar;
        this.c = eVar;
        this.d = bq9Var;
        this.e = dq9Var;
        this.f = vp9Var;
    }

    public final b2k a() {
        return kotlinx.coroutines.flow.e.s(new m0(this.d.a(), this.f.a, new ChargersDebtStateBarUiStateInteractor$listenToUiState$1(this, null)), new mq5(16));
    }
}
