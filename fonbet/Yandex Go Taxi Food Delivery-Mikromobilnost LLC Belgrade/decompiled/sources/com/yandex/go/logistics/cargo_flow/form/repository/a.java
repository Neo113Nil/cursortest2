package com.yandex.go.logistics.cargo_flow.form.repository;

import com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c;
import defpackage.bvf0;
import defpackage.jqr;
import defpackage.p1f;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a implements p1f {
    public final c a;
    public final r0 b = bvf0.c(Boolean.FALSE);

    public a(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.p1f
    public final tpr a() {
        return e.K((tpr[]) Arrays.copyOf(new tpr[]{new jqr(this.a.c(), new DeliveryCouponRepositoryImpl$couponFlow$1(this, null), 3), new rol0(new DeliveryCouponRepositoryImpl$couponFlow$$inlined$transform$1(this.b, null))}, 2));
    }

    @Override // defpackage.p1f
    public final Object b(Continuation continuation) {
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.b;
        r0Var.getClass();
        r0Var.m(null, bool);
        return zy11.a;
    }
}
