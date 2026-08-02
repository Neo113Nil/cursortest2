package com.yandex.go.taxi.order.repositories;

import defpackage.jqr;
import defpackage.o2y0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes8.dex */
public final class c {
    public final com.yandex.go.taxi.order.performer.b a;

    public c(com.yandex.go.taxi.order.performer.b bVar) {
        this.a = bVar;
    }

    public final b a(o2y0 o2y0Var) {
        return new b(b(o2y0Var));
    }

    public final jqr b(o2y0 o2y0Var) {
        return new jqr(new kotlinx.coroutines.flow.n(new m0(o2y0Var.a(), this.a.a(o2y0Var.b()), new OrderDataRepositoryImpl$statusInfoFlow$1()), new OrderDataRepositoryImpl$statusInfoFlow$2(o2y0Var, null)), new OrderDataRepositoryImpl$statusInfoFlow$3(this, null), 3);
    }
}
