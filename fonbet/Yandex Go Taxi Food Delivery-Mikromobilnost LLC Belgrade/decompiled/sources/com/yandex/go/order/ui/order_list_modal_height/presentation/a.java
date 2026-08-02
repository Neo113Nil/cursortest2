package com.yandex.go.order.ui.order_list_modal_height.presentation;

import com.yandex.go.order.ui.order_list_modal_height.data.OrderListModalRatioHeightExperiment;
import defpackage.bvf0;
import defpackage.czo0;
import defpackage.dvq0;
import defpackage.hbp0;
import defpackage.kz20;
import defpackage.nz20;
import defpackage.oy70;
import defpackage.t1b0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vy20;
import defpackage.w511;
import defpackage.wy20;
import defpackage.y8i0;
import defpackage.ymu;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.models.OrderRatioHeightType;
import ru.yandex.taxi.multiorder.tracked.c;

/* loaded from: classes12.dex */
public final class a {
    public final ymu a;
    public final tt2 b;
    public final c c;
    public final hbp0 d = new hbp0(new czo0(14), a.class.getName(), null);
    public final r0 e;
    public y8i0 f;
    public final r0 g;

    public a(ymu ymuVar, tt2 tt2Var, c cVar) {
        Float f;
        this.a = ymuVar;
        this.b = tt2Var;
        this.c = cVar;
        y8i0 y8i0Var = this.f;
        r0 c = bvf0.c(Float.valueOf((y8i0Var == null || (f = y8i0Var.b) == null) ? 0.5f : f.floatValue()));
        this.e = c;
        this.g = c;
    }

    public final void a(OrderRatioHeightType orderRatioHeightType) {
        List<nz20> list;
        Float f;
        hbp0 hbp0Var = this.d;
        hbp0Var.a();
        ymu ymuVar = this.a;
        oy70 oy70Var = (oy70) ymuVar.b;
        wy20 wy20Var = (wy20) ymuVar.c;
        wy20Var.getClass();
        int i = vy20.a[orderRatioHeightType.ordinal()];
        if (i == 1) {
            list = ((OrderListModalRatioHeightExperiment) ((t1b0) wy20Var.a.getValue()).c()).c;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            list = wy20.b;
        }
        oy70Var.getClass();
        ArrayList arrayList = new ArrayList();
        Float f2 = null;
        for (nz20 nz20Var : list) {
            String str = nz20Var.a;
            if (str != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (kz20 kz20Var : nz20Var.b) {
                    String str2 = kz20Var.a;
                    if (str2 != null && (f = kz20Var.b) != null && f.floatValue() >= 0.2f) {
                        if (str.equals("default") && str2.equals("default")) {
                            f2 = f;
                        } else {
                            linkedHashMap.put(str2, f);
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    arrayList.add(new dvq0(str, linkedHashMap));
                }
            }
        }
        this.f = new y8i0(arrayList, f2);
        tse c = hbp0Var.c();
        this.b.getClass();
        tje.N(c, uyj.a, null, new OrderListModalRatioHeightViewModelImpl$listenMultiOrderRepository$1(this, null), 2);
    }
}
