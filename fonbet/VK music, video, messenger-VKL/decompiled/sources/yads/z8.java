package yads;

import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.epx;

/* loaded from: classes10.dex */
public final class z8 {
    public static i8 a(f8 f8Var) {
        Object obj;
        int i = f8Var.e;
        boolean z = f8Var.a;
        boolean z2 = f8Var.f;
        Map map = f8Var.h;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            d8 d8Var = e8.c;
            String str = (String) entry.getKey();
            d8Var.getClass();
            Iterator<E> it = e8.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((e8) obj).b, str)) {
                    break;
                }
            }
            AdQualityVerifiableNetwork a = d8.a((e8) obj);
            if (a != null) {
                linkedHashMap.put(a, new x8(((h8) entry.getValue()).b, ((h8) entry.getValue()).a));
            }
        }
        return new i8(i, z, z2, linkedHashMap, f8Var.g);
    }
}
