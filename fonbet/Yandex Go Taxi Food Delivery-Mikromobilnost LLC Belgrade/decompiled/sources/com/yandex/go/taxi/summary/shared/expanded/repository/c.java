package com.yandex.go.taxi.summary.shared.expanded.repository;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.b8r;
import defpackage.bvf0;
import defpackage.ck31;
import defpackage.kb5;
import defpackage.mth;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class c {
    public final ck31 a;
    public final b8r b;
    public final r0 c = bvf0.c(kb5.g);

    public c(ck31 ck31Var, b8r b8rVar) {
        this.a = ck31Var;
        this.b = b8rVar;
    }

    public final mth a() {
        return new mth(new m0(new b(this.c), ((k) this.a).j.d, new TariffPageInfoHolder$verticalTariffFlow$1(this, null)), 6);
    }
}
