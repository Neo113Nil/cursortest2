package com.yandex.go.taxi.summary.rida_summary.repository;

import defpackage.bvf0;
import defpackage.gci0;
import defpackage.t6k0;
import defpackage.tpr;
import defpackage.wiq0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class i {
    public final wiq0 a;
    public final r0 b;
    public final tpr c;
    public final r0 d;
    public final gci0 e;

    public i(wiq0 wiq0Var) {
        this.a = wiq0Var;
        r0 c = bvf0.c(t6k0.c);
        this.b = c;
        this.c = kotlinx.coroutines.flow.e.t(new h(c));
        r0 c2 = bvf0.c(-1);
        this.d = c2;
        this.e = kotlinx.coroutines.flow.e.d(c2);
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(this.b, this.d, kotlinx.coroutines.flow.e.t(new f(((com.yandex.go.taxi.tariffs.internal.repository.k) this.a).j.b())), new RidaSelectedPriceRepositoryImpl$selectedPriceFlow$1(this, null)));
    }

    public final void b(int i) {
        r0 r0Var;
        Object value;
        int intValue;
        do {
            r0Var = this.d;
            value = r0Var.getValue();
            intValue = ((Number) value).intValue();
            int i2 = intValue + i;
            if (i2 >= 0 && i2 < ((t6k0) this.b.getValue()).b.size()) {
                intValue = i2;
            }
        } while (!r0Var.k(value, Integer.valueOf(intValue)));
    }
}
