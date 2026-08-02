package com.yandex.go.order.bundle.map.impl.data.repository;

import defpackage.bvf0;
import defpackage.j551;
import defpackage.lv6;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.x4r;
import defpackage.yaf0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class g {
    public final j551 a;
    public final tt2 b;
    public final f c;
    public final r0 d = bvf0.c(new x4r(yaf0.c));

    public g(lv6 lv6Var, j551 j551Var, tt2 tt2Var) {
        this.a = j551Var;
        this.b = tt2Var;
        this.c = new f(new b(lv6Var.a));
    }

    public final tpr a(tpr tprVar, PropertyReference1Impl propertyReference1Impl) {
        m0 m0Var = new m0(tprVar, kotlinx.coroutines.flow.e.X(this.d, new FilterOverlayOrderRepositoryImpl$getOrderIdsFlow$$inlined$flatMapLatest$1(null, this)), new FilterOverlayOrderRepositoryImpl$getFilteredOrdersFlow$1(propertyReference1Impl, null));
        this.b.getClass();
        return kotlinx.coroutines.flow.e.F(m0Var, uyj.a);
    }
}
