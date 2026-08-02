package com.yandex.passport.internal.filter;

import defpackage.evu0;
import defpackage.tcc;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class s {
    public static int a(String str, String str2) {
        com.yandex.passport.internal.core.accounts.p c = c(str);
        com.yandex.passport.internal.core.accounts.p c2 = c(str2);
        int b = b(c.e(), c2.e());
        if (b != 0) {
            return b;
        }
        if (c.d().isEmpty() && c2.d().isEmpty()) {
            return 0;
        }
        if (!c.d().isEmpty() && c2.d().isEmpty()) {
            return -1;
        }
        if (!c.d().isEmpty() || c2.d().isEmpty()) {
            return b(c.d(), c2.d());
        }
        return 1;
    }

    public static int b(List list, List list2) {
        int compareTo;
        int max = Math.max(list.size(), list2.size());
        if (max >= 0) {
            int i = 0;
            while (true) {
                Comparable comparable = (Comparable) kotlin.collections.a.S(i, list);
                Comparable comparable2 = (Comparable) kotlin.collections.a.S(i, list2);
                if (comparable != null && comparable2 != null && (compareTo = comparable.compareTo(comparable2)) != 0) {
                    return compareTo;
                }
                if (comparable != null && comparable2 == null) {
                    return 1;
                }
                if (comparable == null && comparable2 != null) {
                    return -1;
                }
                if (i == max) {
                    break;
                }
                i++;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    public static com.yandex.passport.internal.core.accounts.p c(String str) {
        List W;
        List W2;
        List W3;
        Object obj;
        List W4;
        Object a;
        W = evu0.W(str, new String[]{"+"}, (r2 & 4) != 0 ? 0 : 2);
        W2 = evu0.W((String) W.get(0), new String[]{"-"}, (r2 & 4) != 0 ? 0 : 2);
        W3 = evu0.W((String) W2.get(0), new String[]{Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
        List list = W3;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            w511.q();
            return null;
        }
        if (W2.size() <= 1) {
            W2 = null;
        }
        if (W2 != null) {
            W4 = evu0.W((String) W2.get(1), new String[]{Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
            List<String> list2 = W4;
            obj = new ArrayList(tcc.n(list2, 10));
            for (String str2 : list2) {
                try {
                    a = p.a(Integer.parseInt(str2));
                } catch (Exception unused) {
                    a = q.a(str2);
                }
                obj.add(a);
            }
        } else {
            obj = EmptyList.a;
        }
        return new com.yandex.passport.internal.core.accounts.p(arrayList, obj);
    }
}
