package com.yandex.payment.sdk.utils.dtotransporter;

import com.yandex.payment.sdk.utils.dtotransporter.FTDtoTransporterError;
import defpackage.c6p;
import defpackage.cvu0;
import defpackage.dhr;
import defpackage.g8e;
import defpackage.k6x;
import defpackage.m5p;
import defpackage.mja1;
import defpackage.nja1;
import defpackage.s5p;
import defpackage.scc;
import defpackage.tcc;
import defpackage.u5p;
import defpackage.v5p;
import defpackage.v6p;
import defpackage.w511;
import defpackage.y5p;
import defpackage.z5p;
import defpackage.z6p;
import defpackage.zrm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class a implements u5p {
    public final zrm a;
    public final String b;

    public a(zrm zrmVar, String str) {
        this.a = zrmVar;
        this.b = str;
    }

    public static void e(String str, Object obj, s5p s5pVar, z5p z5pVar) {
        v6p v6pVar = s5pVar.a;
        int i = 0;
        if (v6pVar != null) {
            int i2 = v5p.a[v6pVar.a.ordinal()];
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    return;
                }
                w511.b();
                return;
            }
            z6p z6pVar = v6pVar.b;
            if (z6pVar != null) {
                if (obj == null) {
                    Boolean bool = z6pVar.b;
                    if (!(bool != null ? bool.booleanValue() : false)) {
                        throw new FTDtoTransporterError.ValueNodeNotFound(str);
                    }
                    m5p m5pVar = z6pVar.c;
                    obj = m5pVar != null ? m5pVar.a : null;
                }
                if (obj != null) {
                    nja1.f(z5pVar.a, z6pVar.a, obj);
                    return;
                }
                return;
            }
            return;
        }
        Map map = s5pVar.b;
        if (map != null) {
            if (obj == null) {
                throw new FTDtoTransporterError.ValueNodeNotFound(str);
            }
            Map map2 = obj instanceof Map ? (Map) obj : null;
            if (map2 == null) {
                throw new FTDtoTransporterError.ValueNodeIsNotMap(str);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                e(g8e.p(str, Extension.DOT_CHAR, str2), map2.get(str2), (s5p) entry.getValue(), z5pVar);
            }
            return;
        }
        List list = s5pVar.c;
        if (list != null) {
            if (obj == null) {
                throw new FTDtoTransporterError.ValueNodeNotFound(str);
            }
            List list2 = obj instanceof List ? (List) obj : null;
            if (list2 == null) {
                throw new FTDtoTransporterError.ValueNodeIsNotArray(str);
            }
            for (Object obj2 : list) {
                int i3 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                s5p s5pVar2 = (s5p) obj2;
                String str3 = str + "[" + i + "]";
                if (i >= list2.size()) {
                    throw new FTDtoTransporterError.ValueNodeNotFound(str3);
                }
                e(str3, list2.get(i), s5pVar2, z5pVar);
                i = i3;
            }
        }
    }

    public final LinkedHashMap a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object b = b((s5p) entry.getValue());
            if (b != null) {
                linkedHashMap.put(str, b);
            }
        }
        return linkedHashMap;
    }

    public final Object b(s5p s5pVar) {
        v6p v6pVar = s5pVar.a;
        if (v6pVar != null) {
            return c(v6pVar);
        }
        Map map = s5pVar.b;
        if (map != null) {
            return a(map);
        }
        List list = s5pVar.c;
        if (list == null) {
            m5p m5pVar = s5pVar.d;
            if (m5pVar != null) {
                return m5pVar.a;
            }
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(b((s5p) it.next()));
        }
        return arrayList;
    }

    public final Object c(v6p v6pVar) {
        String str;
        z6p z6pVar = v6pVar.b;
        if (z6pVar != null) {
            List list = z6pVar.a;
            Object f = mja1.f(((k6x) this.a.b).b.a.a, list);
            if (f != null) {
                return f;
            }
            throw new FTDtoTransporterError.JasonPathNotFound(kotlin.collections.a.X(list, Extension.DOT_CHAR, null, null, null, 62));
        }
        c6p c6pVar = v6pVar.c;
        if (c6pVar != null && (str = this.b) != null) {
            return cvu0.v(c6pVar.a, c6pVar.b, str, false);
        }
        y5p y5pVar = v6pVar.d;
        if (y5pVar != null) {
            return cvu0.v(y5pVar.a, y5pVar.b, UUID.randomUUID().toString(), false);
        }
        return null;
    }

    public final void d(Map map, Map map2) {
        z5p z5pVar = new z5p();
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            e(str, map.get(str), (s5p) entry.getValue(), z5pVar);
        }
        LinkedHashMap linkedHashMap = z5pVar.a;
        if (linkedHashMap == null) {
            linkedHashMap = null;
        }
        if (linkedHashMap != null) {
            ((dhr) this.a.c).invoke(linkedHashMap);
        }
    }
}
