package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import ru.yandex.taxi.costcenters.api.CostCenterField;

/* loaded from: classes5.dex */
public final class kwe {
    public final lx4 a;
    public final b1 b;
    public final hwe c;
    public final List d;
    public final ArrayList e;

    public kwe(lx4 lx4Var, b1 b1Var, jve jveVar, hwe hweVar) {
        this.a = lx4Var;
        this.b = b1Var;
        this.c = hweVar;
        List list = jveVar.e;
        this.d = list;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            CostCenterField costCenterField = (CostCenterField) obj;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("index", Integer.valueOf(i));
            linkedHashMap.put("title", costCenterField.b);
            linkedHashMap.put("type", dwe.a(costCenterField.e));
            linkedHashMap.put("is_required", Boolean.valueOf(costCenterField.d));
            arrayList.add(linkedHashMap);
            i = i2;
        }
        this.e = arrayList;
    }

    public static LinkedHashMap a(jwe jweVar, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("index", Integer.valueOf(i));
        linkedHashMap.put("title", jweVar.b);
        linkedHashMap.put("type", dwe.a(jweVar.d));
        linkedHashMap.put("is_required", Boolean.valueOf(jweVar.f));
        String str = jweVar.e;
        if (!(str == null || evu0.J(str)) && str != null) {
            linkedHashMap.put("error_text", str);
        }
        return linkedHashMap;
    }
}
