package com.yandex.go.chargers.discounts.list.ui;

import com.yandex.go.chargers.discounts.api.ChargersDiscountsListEntryPoint;
import com.yandex.go.chargers.discounts.api.data.model.ChargersProgressImageParamsDto;
import com.yandex.go.chargers.discounts.data.models.ChargersProgressDiscountDetailsDto;
import defpackage.as9;
import defpackage.av9;
import defpackage.cw9;
import defpackage.em9;
import defpackage.hh5;
import defpackage.ir9;
import defpackage.kgq0;
import defpackage.mth;
import defpackage.pwy0;
import defpackage.rpa;
import defpackage.spa;
import defpackage.tsa;
import java.util.HashMap;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class h {
    public final em9 a;
    public final pwy0 b;
    public final com.yandex.go.chargers.discounts.data.mappers.b c;
    public final com.yandex.go.chargers.discounts.data.mappers.a d;
    public final hh5 e;
    public final com.yandex.go.chargers.discounts.list.data.a f;
    public final i g;
    public final rpa h;
    public final spa i;
    public final av9 j;
    public final com.yandex.go.chargers.payments.data.a k;

    public h(em9 em9Var, pwy0 pwy0Var, com.yandex.go.chargers.discounts.data.mappers.b bVar, com.yandex.go.chargers.discounts.data.mappers.a aVar, hh5 hh5Var, com.yandex.go.chargers.discounts.list.data.a aVar2, i iVar, rpa rpaVar, spa spaVar, av9 av9Var, com.yandex.go.chargers.payments.data.a aVar3) {
        this.a = em9Var;
        this.b = pwy0Var;
        this.c = bVar;
        this.d = aVar;
        this.e = hh5Var;
        this.f = aVar2;
        this.g = iVar;
        this.h = rpaVar;
        this.i = spaVar;
        this.j = av9Var;
        this.k = aVar3;
    }

    public final m0 a(ChargersDiscountsListEntryPoint chargersDiscountsListEntryPoint, String str, String str2, tsa tsaVar) {
        return new m0(com.yandex.go.coroutines.b.d(new e(new mth(new j0(null, kotlinx.coroutines.flow.e.m(this.b.a(), new c(this.k.e(), this, str2, tsaVar), kotlinx.coroutines.flow.e.d(this.h.y), this.i.b, new ChargersDiscountsListUiStateInteractor$getListUiStateFlow$2(this, chargersDiscountsListEntryPoint, str, null)), new ChargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$withPreviousEmit$1(3, null)), 6), this, chargersDiscountsListEntryPoint, str), new ChargersDiscountsListUiStateInteractor$getListUiStateFlow$$inlined$start$1(cw9.a, null)), kotlinx.coroutines.flow.e.X(this.j.b, new ChargersDiscountsListUiStateInteractor$getUiStateFlow$$inlined$flatMapLatest$1(null, this)), new ChargersDiscountsListUiStateInteractor$getUiStateFlow$1(3, null));
    }

    public final void b(as9 as9Var, ir9 ir9Var, boolean z) {
        String str;
        kgq0 kgq0Var = new kgq0(as9Var, ir9Var, z);
        r0 r0Var = this.j.a;
        r0Var.getClass();
        r0Var.m(null, kgq0Var);
        boolean z2 = as9Var instanceof ChargersProgressDiscountDetailsDto;
        em9 em9Var = this.a;
        if (!z2) {
            String str2 = ir9Var.b;
            em9Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("discount_id", str2);
            em9Var.a.a("Chargers.DiscountDetails.Shown", hashMap, 1, new HashMap());
            return;
        }
        ChargersProgressImageParamsDto chargersProgressImageParamsDto = ((ChargersProgressDiscountDetailsDto) as9Var).e;
        if (chargersProgressImageParamsDto == null || (str = chargersProgressImageParamsDto.a) == null) {
            str = "";
        }
        em9Var.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("cumulative_discount", str);
        em9Var.a.a("Chargers.CumulativeDiscountDetails.Shown", hashMap2, 1, new HashMap());
    }
}
