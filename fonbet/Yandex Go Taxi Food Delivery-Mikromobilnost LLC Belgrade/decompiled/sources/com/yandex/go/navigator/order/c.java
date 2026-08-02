package com.yandex.go.navigator.order;

import defpackage.r341;
import defpackage.tpr;
import defpackage.vd50;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes8.dex */
public final class c {
    public final vd50 a;
    public final r341 b;

    public c(vd50 vd50Var, r341 r341Var) {
        this.a = vd50Var;
        this.b = r341Var;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new m0(this.a.b, new b(this.b.b), new NavigationOrdersRepositoryImpl$ordersFlow$1(3, null)));
    }
}
