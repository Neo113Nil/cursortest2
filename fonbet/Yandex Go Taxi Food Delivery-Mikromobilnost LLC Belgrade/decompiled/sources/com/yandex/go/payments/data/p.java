package com.yandex.go.payments.data;

import defpackage.fga0;
import defpackage.tpr;

/* loaded from: classes8.dex */
public final class p {
    public final fga0 a;
    public final ru.yandex.taxi.preorder.repositories.g b;

    public p(fga0 fga0Var, ru.yandex.taxi.preorder.repositories.g gVar) {
        this.a = fga0Var;
        this.b = gVar;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.n(new o(this.b.c, this), new SelectedPaymentRepositoryImpl$compositePaymentFlow$2(this, null)));
    }

    public final tpr b() {
        fga0 fga0Var = this.a;
        return kotlinx.coroutines.flow.e.t(new m(fga0Var.C, fga0Var));
    }
}
