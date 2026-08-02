package com.yandex.go.superapp.order.multi.old;

import defpackage.d380;
import defpackage.gw00;
import defpackage.hc80;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.taxi.order.analytics.model.ListOpenReason;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class OrdersListViewPresenter$onResume$4 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ArrayList arrayList;
        hc80 hc80Var = (hc80) this.receiver;
        ArrayList a = hc80Var.a((List) obj);
        hc80Var.j = a;
        if (!a.isEmpty() && hc80Var.i && (arrayList = hc80Var.j) != null) {
            int d = gw00.d(tcc.n(arrayList, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d380 d380Var = (d380) it.next();
                Pair pair = new Pair(d380Var.a, d380Var.c);
                linkedHashMap.put(pair.c(), pair.f());
            }
            if (hc80Var.d.a(linkedHashMap) != ListOpenReason.NONE) {
                hc80Var.e();
            }
        }
        return zy11.a;
    }
}
