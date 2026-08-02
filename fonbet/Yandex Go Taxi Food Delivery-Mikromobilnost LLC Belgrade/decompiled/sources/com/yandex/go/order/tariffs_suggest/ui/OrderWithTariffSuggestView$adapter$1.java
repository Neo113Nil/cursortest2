package com.yandex.go.order.tariffs_suggest.ui;

import defpackage.kb80;
import defpackage.tse0;
import defpackage.v4r0;
import defpackage.yj70;
import defpackage.yxx0;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* synthetic */ class OrderWithTariffSuggestView$adapter$1 extends FunctionReferenceImpl implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object value;
        Set set;
        String str = (String) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        a aVar = (a) this.receiver;
        yj70 yj70Var = aVar.B;
        r0 r0Var = aVar.x.e;
        do {
            value = r0Var.getValue();
            set = (Set) value;
        } while (!r0Var.k(value, (booleanValue2 || !booleanValue) ? (booleanValue2 && booleanValue) ? v4r0.i(set, str) : v4r0.f(set, str) : Collections.singleton(str)));
        if (booleanValue) {
            kb80 Mg = aVar.Mg(str);
            if (Mg != null) {
                yxx0 yxx0Var = (yxx0) yj70Var.a;
                String str2 = Mg.a;
                String str3 = Mg.c;
                String str4 = Mg.b;
                yxx0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("order_id", str2);
                hashMap.put("selected_tariff", str4);
                yxx0Var.a.a("TaxiOrder.TariffsSuggest.TariffSelected", hashMap, 1, tse0.r("suggest_id", hashMap, str3));
            }
        } else {
            kb80 Mg2 = aVar.Mg(str);
            if (Mg2 != null) {
                yxx0 yxx0Var2 = (yxx0) yj70Var.a;
                String str5 = Mg2.a;
                String str6 = Mg2.c;
                String str7 = Mg2.b;
                yxx0Var2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("order_id", str5);
                hashMap2.put("unselected_tariff", str7);
                yxx0Var2.a.a("TaxiOrder.TariffsSuggest.TariffUnselected", hashMap2, 1, tse0.r("suggest_id", hashMap2, str6));
            }
        }
        return zy11.a;
    }
}
