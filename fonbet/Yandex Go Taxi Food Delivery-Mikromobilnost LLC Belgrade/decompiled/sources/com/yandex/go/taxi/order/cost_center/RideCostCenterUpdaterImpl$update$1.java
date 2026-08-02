package com.yandex.go.taxi.order.cost_center;

import defpackage.b1;
import defpackage.cta1;
import defpackage.dwe;
import defpackage.dxe;
import defpackage.exe;
import defpackage.jve;
import defpackage.scc;
import defpackage.sk7;
import defpackage.tcc;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.costcenters.api.CostCenterField;
import ru.yandex.taxi.costcenters.ride.c;
import ru.yandex.taxi.object.DriveState;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class RideCostCenterUpdaterImpl$update$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        exe exeVar = (exe) this.receiver;
        sk7 sk7Var = exeVar.a;
        n0 n0Var = ((c) sk7Var.c).c;
        zy11 zy11Var = zy11.a;
        n0Var.g(zy11Var);
        dxe dxeVar = (dxe) sk7Var.w;
        String str2 = exeVar.b;
        jve jveVar = exeVar.c;
        DriveState c = exeVar.d.c();
        b1 b1Var = dxeVar.a;
        String d = cta1.d(c);
        List list = jveVar.e;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            CostCenterField costCenterField = (CostCenterField) obj2;
            HashMap hashMap = new HashMap();
            hashMap.put("index", Integer.valueOf(i));
            hashMap.put("title", costCenterField.b);
            hashMap.put("type", dwe.a(costCenterField.e));
            hashMap.put("is_required", Boolean.valueOf(costCenterField.d));
            arrayList.add(hashMap);
            i = i2;
        }
        Integer valueOf = Integer.valueOf(list.size());
        b1Var.getClass();
        HashMap hashMap2 = new HashMap();
        if (str2 != null) {
            hashMap2.put("done_text", str2);
        }
        if (str != null) {
            hashMap2.put("error_message", str);
        }
        hashMap2.put("order_status", d);
        hashMap2.put("fields", arrayList);
        hashMap2.put("total_fields", valueOf);
        b1Var.a.a("CostCenterCard.Error", hashMap2, 1, new HashMap());
        return zy11Var;
    }
}
