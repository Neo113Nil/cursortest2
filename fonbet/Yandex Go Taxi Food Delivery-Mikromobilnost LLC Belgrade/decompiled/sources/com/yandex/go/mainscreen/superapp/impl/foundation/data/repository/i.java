package com.yandex.go.mainscreen.superapp.impl.foundation.data.repository;

import defpackage.ajr;
import defpackage.bvf0;
import defpackage.ezw;
import defpackage.ffx;
import defpackage.gci0;
import defpackage.ha2;
import defpackage.lhw0;
import defpackage.mth;
import defpackage.rdw0;
import defpackage.sdw0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.ydw0;
import defpackage.zir;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class i {
    public final ezw a;
    public final ajr b;
    public final gci0 c;
    public final n0 d;
    public final n0 e;

    public i(tse tseVar, boolean z, com.yandex.go.flex.main_screen.presentation.feed.e eVar, ezw ezwVar, ajr ajrVar, lhw0 lhw0Var) {
        zir b;
        this.a = ezwVar;
        this.b = ajrVar;
        ha2 n = kotlinx.coroutines.flow.e.n(new f(eVar.a()), kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(new d(new mth(ajrVar.b, 6), ezwVar), new SuperappMainSearchbarInteropRepository$isSupportedZoneFlow$$inlined$start$1(null, this))), kotlinx.coroutines.flow.e.t(new com.yandex.go.flex.main_screen.api.data.b((tpr) lhw0Var.b.getValue())), new SuperappMainSearchbarInteropRepository$isSearchbarVisibleFlow$2(4, null));
        gci0 gci0Var = eVar.e;
        this.c = kotlinx.coroutines.flow.e.R(new m0(n, new h(gci0Var, this), new SuperappMainSearchbarInteropRepository$searchbarStateFlow$2(3, this, i.class, "createSearchbarState", "createSearchbarState(ZLcom/yandex/go/superapp/searchbar/api/SuperappSearchbarMode;)Lcom/yandex/go/superapp/searchbar/api/SuperappSearchbarState;", 4)), tseVar, wsr0.a(xsr0.a, 3), new ydw0(!z && ((b = com.yandex.go.flex.common.api.c.b(ajrVar)) == null || bvf0.G(ezwVar, b)), ((Boolean) gci0Var.a.getValue()).booleanValue() ? rdw0.a : sdw0.a));
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.d = ffx.b(0, 1, bufferOverflow);
        this.e = ffx.b(0, 1, bufferOverflow);
    }
}
