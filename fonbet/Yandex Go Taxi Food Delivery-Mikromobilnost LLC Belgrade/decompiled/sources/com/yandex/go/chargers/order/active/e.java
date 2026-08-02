package com.yandex.go.chargers.order.active;

import defpackage.gei0;
import defpackage.nna;
import defpackage.wys;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class e {
    public static final void a(wys wysVar, Map map, nna nnaVar, gei0 gei0Var) {
        if (map == null || map.isEmpty()) {
            return;
        }
        wysVar.Z(new ChargersActiveOrderAdapterKt$bindPromoShown$1(gei0Var, nnaVar, map, null), "PROMO_SHOWN_TASK_KEY", true);
    }
}
