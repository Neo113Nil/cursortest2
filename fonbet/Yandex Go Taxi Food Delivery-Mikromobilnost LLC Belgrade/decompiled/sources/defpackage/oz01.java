package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.a;
import kotlin.collections.b;
import ru.yandex.taxi.translations.mapper.CommonStringsMapping;
import ru.yandex.taxi.translations.mapper.OrderChainMapping;

/* loaded from: classes10.dex */
public final class oz01 {
    public static final HashMap f;
    public final zuj0 a;
    public final z2b0 b;
    public volatile HashMap d;
    public Map c = b.f();
    public final i3y e = a.a(new oay0(6, this));

    static {
        HashMap hashMap = new HashMap();
        CommonStringsMapping commonStringsMapping = new CommonStringsMapping();
        int size = hashMap.size();
        hashMap.putAll(commonStringsMapping);
        if (hashMap.size() < commonStringsMapping.size() + size) {
            unr0.z(jst.e, "duplicated string resources not allowed");
        }
        OrderChainMapping orderChainMapping = new OrderChainMapping();
        int size2 = hashMap.size();
        hashMap.putAll(orderChainMapping);
        if (hashMap.size() < orderChainMapping.size() + size2) {
            unr0.z(jst.e, "duplicated string resources not allowed");
        }
        f = hashMap;
    }

    public oz01(zuj0 zuj0Var, z2b0 z2b0Var) {
        this.a = zuj0Var;
        this.b = z2b0Var;
    }

    public static HashMap b(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : f.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            dz01 dz01Var = (dz01) entry.getValue();
            String str = dz01Var.b;
            Map map2 = (Map) map.get(dz01Var.a);
            String str2 = map2 != null ? (String) map2.get(str) : null;
            if (str2 != null) {
                hashMap.put(Integer.valueOf(intValue), str2);
            }
        }
        return hashMap;
    }

    public final String a(int i) {
        Map map = null;
        String str = null;
        if (f.containsKey(Integer.valueOf(i))) {
            if (this.d != null) {
                HashMap hashMap = this.d;
                if (hashMap != null) {
                    map = hashMap;
                }
            } else {
                map = (Map) this.e.getValue();
            }
            str = (String) map.get(Integer.valueOf(i));
        } else {
            unr0.z(jst.e, "translation mapping for this resource not specified");
        }
        return str == null ? ((avj0) this.a).h(i) : str;
    }
}
