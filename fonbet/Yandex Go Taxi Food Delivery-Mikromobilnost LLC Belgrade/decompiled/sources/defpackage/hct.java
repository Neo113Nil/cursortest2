package defpackage;

import com.yandex.go.zone.dto.objects.RequirementOverrideDto;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class hct {
    public final dxf0 a;

    public hct(dxf0 dxf0Var) {
        this.a = dxf0Var;
    }

    public final ArrayList a(String str, String str2, List list) {
        Map map;
        String str3;
        fmx0 fmx0Var = (fmx0) ((gmx0) this.a.a).a.b();
        if (fmx0Var.b) {
            Map map2 = (Map) fmx0Var.d.a.get(str);
            if (map2 == null) {
                map = b.f();
            } else {
                Map map3 = (Map) map2.get(str2);
                if (map3 == null) {
                    map = b.f();
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map3.entrySet()) {
                        cmx0 cmx0Var = (cmx0) entry.getValue();
                        if (cmx0Var.getA() == null && cmx0Var.getB() == null) {
                            String c = cmx0Var.getC();
                            if (c == null) {
                                c = "";
                            }
                            if (!d6z.Z(fmx0Var, c) && cmx0Var.getD() == null) {
                            }
                        }
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(linkedHashMap.size()));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        Object key = entry2.getKey();
                        String str4 = (String) entry2.getKey();
                        cmx0 cmx0Var2 = (cmx0) entry2.getValue();
                        String c2 = cmx0Var2.getC();
                        if (c2 != null) {
                            String Y = d6z.Y(fmx0Var, c2);
                            if (!evu0.J(Y)) {
                                str3 = Y;
                                linkedHashMap2.put(key, new RequirementOverrideDto(str4, cmx0Var2.getA(), cmx0Var2.getB(), str3, cmx0Var2.getD(), EmptyList.a));
                            }
                        }
                        str3 = null;
                        linkedHashMap2.put(key, new RequirementOverrideDto(str4, cmx0Var2.getA(), cmx0Var2.getB(), str3, cmx0Var2.getD(), EmptyList.a));
                    }
                    map = linkedHashMap2;
                }
            }
        } else {
            map = b.f();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!map.keySet().contains(((RequirementOverrideDto) obj).a)) {
                arrayList.add(obj);
            }
        }
        return a.m0(map.values(), arrayList);
    }
}
