package com.yandex.passport.internal.network.mappers;

import com.yandex.passport.data.models.ParameterRule;
import com.yandex.passport.data.models.VersionRule$Sign;
import com.yandex.passport.data.models.u;
import com.yandex.passport.data.network.m6;
import com.yandex.passport.data.network.r5;
import com.yandex.passport.data.network.x5;
import defpackage.gw00;
import defpackage.tcc;
import defpackage.yhl;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final class e {
    public static com.yandex.passport.data.models.a a(List list) {
        ParameterRule parameterRule;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = ((r5) obj).a;
            if (str == null || str.equals(ConstantDeviceInfo.APP_PLATFORM)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r5 r5Var = (r5) it.next();
            m6 m6Var = r5Var.b;
            u b = m6Var != null ? b(m6Var) : null;
            m6 m6Var2 = r5Var.c;
            com.yandex.passport.data.models.b bVar = new com.yandex.passport.data.models.b(b, m6Var2 != null ? b(m6Var2) : null, r5Var.d);
            Map map = r5Var.e;
            LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                x5 x5Var = (x5) entry.getValue();
                Set set = x5Var.a;
                Set set2 = x5Var.b;
                if (set != null) {
                    parameterRule = new ParameterRule(ParameterRule.Sign.INCLUDE, x5Var.a);
                } else {
                    if (set2 == null) {
                        yhl.d(x5Var, "unknown rule for filter parameter ");
                        return null;
                    }
                    parameterRule = new ParameterRule(ParameterRule.Sign.EXCLUDE, set2);
                }
                linkedHashMap.put(key, parameterRule);
            }
            arrayList2.add(new com.yandex.passport.data.models.f(bVar, linkedHashMap));
        }
        return new com.yandex.passport.data.models.a(arrayList2);
    }

    public static u b(m6 m6Var) {
        String str = m6Var.b;
        if (str != null) {
            return new u(VersionRule$Sign.EQUAL, str);
        }
        String str2 = m6Var.a;
        if (str2 != null) {
            return new u(VersionRule$Sign.GREATER_OR_EQUAL, str2);
        }
        yhl.d(m6Var, "unknown rule for version ");
        return null;
    }
}
